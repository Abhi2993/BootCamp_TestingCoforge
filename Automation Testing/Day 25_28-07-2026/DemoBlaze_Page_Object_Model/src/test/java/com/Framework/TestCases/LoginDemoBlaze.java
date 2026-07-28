package com.Framework.TestCases;



import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

public class LoginDemoBlaze extends BaseClass {

    @Test
    public void DemoBlazeLoginTest() throws Exception {

        LoginPage login = new LoginPage(driver);

       
        String username = excel.getData("Login", 0, 0);
        String password = excel.getData("Login", 0, 1);

        
        login.login(username, password);

        Thread.sleep(3000);

      
        login.selectSamsungGalaxy();

        Thread.sleep(3000);

        
        login.addProductToCart();

        Thread.sleep(3000);

        
        login.openCart();

        Thread.sleep(3000);

        
        login.logout();

    }

}