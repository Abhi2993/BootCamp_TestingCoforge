package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Feature",

        glue = "StepDefinition",

        plugin = {

                "pretty",

                "html:target/CucumberReport.html",

                "json:target/CucumberReport.json"

        },

        monochrome = true,

        publish = true

)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}