package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    XSSFWorkbook wb;
    XSSFSheet sheet;

    public ExcelDataReader() {

        try {

            File src = new File("./TestData/TestData.xlsx");

            FileInputStream fis = new FileInputStream(src);

            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {

            System.out.println("Unable to load Excel File");
            e.printStackTrace();
        }
    }

    public String getData(String sheetName, int row, int column) {

        sheet = wb.getSheet(sheetName);

        DataFormatter formatter = new DataFormatter();

        return formatter.formatCellValue(sheet.getRow(row).getCell(column));
    }

}