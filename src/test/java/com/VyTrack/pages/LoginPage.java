package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement  userNameInput;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginBttnClick;



            public void LoginMethod(String username, String  password){

                userNameInput.sendKeys(username);
                passwordInput.sendKeys(password);
                loginBttnClick.click();

            }

}
