package axisbank;


import java.io.File;

import java.io.IOException;

 

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

 

public class Applicationflow extends pageobjectmodel {
           public static void code(){
                                driver.findElement(TypeofCustmor).click();
                                File Shot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                
                                try {

                                                FileUtils.copyFile(Shot1,new File("C:\\seleniumscreenshots\\Shot1.png"));

                                } catch (IOException e) {

                                                // TODO Auto-generated catch block
                                                e.printStackTrace();

                                }
                                Select Td = new Select (driver.findElement(TypeofFixedDeposit));
                                Td.selectByVisibleText("Monthly Payout");                        
                                File Shot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                               
                    			try {

                                                FileUtils.copyFile(Shot2,new File( "C:\\seleniumscreenshots\\Shot2.png"));
                                } catch (IOException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                	}
                                JavascriptExecutor js = (JavascriptExecutor)driver;
                                js.executeScript("window.scrollBy(0,250)");
                                try {
                                                Thread.sleep(3000);
                                } catch (InterruptedException e1) {
                                                // TODO Auto-generated catch block
                                                e1.printStackTrace();
                                }
                                WebElement Ad = driver.findElement(AmountDeposit);
                                Ad.click();
                                Ad.clear();
                                Ad.sendKeys(sendingexcel.getCellValue("Excel", 0, 0));
                                driver.findElement(RandomClick).click();
                                File Shot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                    try {
                                                  FileUtils.copyFile(Shot3,new File( "C:\\seleniumscreenshots\\Shot3.png"));
                                       } catch (IOException e) {
                                                                // TODO Auto-generated catch block
                                                                e.printStackTrace();
                                                }
                                String RoI = driver.findElement(RateofInterest).getText();
                                System.out.println(RoI);
                                savingdata.getCellValue("Excel", 0, 0, RoI);
                                File Shot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                             
                                try {
                                           FileUtils.copyFile(Shot4,new File("C:\\seleniumscreenshots\\Shot4.png"));
                                } catch (IOException e) {
                                                 // TODO Auto-generated catch block
                                                e.printStackTrace();
                                }
                                driver.close();   
                }

}

