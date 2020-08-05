package axisbank;

import org.openqa.selenium.By;

public class pageobjectmodel extends DriverSetup
{

       static By TypeofCustmor = By.xpath("//label[@class='flRight' and text() = 'Senior Citizen']");
       static By TypeofFixedDeposit = By.id("FdepType");
       static By AmountDeposit = By.name("mnthsavings");
       static By RandomClick = By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]");
       static By RateofInterest = By.xpath("//div//span[@class='idRate pull-right' and @id='matIntRate' ]");


}
