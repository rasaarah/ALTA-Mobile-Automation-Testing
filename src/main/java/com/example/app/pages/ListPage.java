package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;
//import static com.sun.xml.internal.ws.model.ExternalMetadataReader.Util.findElements;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class ListPage extends BasePageObject {
  By elementListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");

  public void swipeList() {
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void longPressInTheSecondMenu() {
    longPressObject(findElements(elementListOfText).get(4));
  }

  public void tapMultipleTimesInTheSecondMenu() {
    tapMultipleTimes(findElements(elementListOfText).get(5));
  }

}
