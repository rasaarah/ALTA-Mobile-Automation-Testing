package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public void inputTextArea1(String angka1) {
    type(MobileBy.id("com.isl.simpleapp:id/et_1"), angka1);
  }

  public void inputTextArea2(String angka2) {
    type(MobileBy.id("com.isl.simpleapp:id/et_2"), angka2);
  }

  public void clickDropDownBtn() {
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }

  public void clickResultBtn(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }

  public String getHasil(){
    return getText(MobileBy.id("com.isl.simpleapp:id/tv_result"));
  }

  public void plusBtn(){
    click(MobileBy.xpath("//android.widget.TextView[1]"));
  }

  public void minusBtn(){
    click(MobileBy.xpath("//android.widget.TextView[2]"));
  }

  public void divideBtn(){
    click(MobileBy.xpath("//android.widget.TextView[3]"));
  }

  public void multipleBtn(){
    click(MobileBy.xpath("//android.widget.TextView[4]"));
  }

  public String ResultString(){
    return getText(MobileBy.id("com.isl.simpleapp:id/tv_result"));
  }

  public String getTitle() {
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

}
