package com.selenide;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
@Test
public void userCanLoginByUsername() {
  open("http://localhost:8080/travelocity.com/index.jsp");
  $(By.name("username")).setValue("johny");
  $(By.name("password")).setValue("test123");
  $(By.xpath("/html/body/div/div[2]/div[2]/form/input[3]")).click();
  $(".loading_progress").should(disappear); // Waits until element disappears
}

}
