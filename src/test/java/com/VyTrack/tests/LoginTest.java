package com.VyTrack.tests;

import com.VyTrack.pages.LoginPage;
import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {




    @Test
    public void t1(){
        Driver.getDriver().get(ConfigurationReader.get("qa3_url"));
        LoginPage login01 = new LoginPage();
        login01.LoginMethod(ConfigurationReader.get("driver_username"),ConfigurationReader.get("driver_password"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://qa3.vytrack.com/");

}






}
