package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginBasePage {
    By elementInputUsername = MobileBy.id("com.isl.simpleapp:id/username");
    By elementInputPassword = MobileBy.id("com.isl.simpleapp:id/password");
    By elementButtonSignInRegister = MobileBy.id("com.isl.simpleapp:id/login");

    public LoginBasePage inputUsername(){
        AndroidElement inputUsername = AndroidDriverInit.driver.findElement(elementInputUsername);
        inputUsername.sendKeys("admin");
        return this;
    }

    public LoginBasePage inputPassword(){
        AndroidElement inputPassword = AndroidDriverInit.driver.findElement(elementInputPassword);
        inputPassword.sendKeys("admin");
        return this;
    }

    public void andClickButtonRegister(){
        AndroidElement btnSignInRegister = AndroidDriverInit.driver.findElement(elementButtonSignInRegister);
        btnSignInRegister.click();
    }

    public boolean isButtonRegisterDisplayed(){
        AndroidElement btnSignInRegister = AndroidDriverInit.driver.findElement(elementButtonSignInRegister);
        return btnSignInRegister.isDisplayed();
    }

}















