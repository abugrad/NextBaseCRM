package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement warning;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }



}
