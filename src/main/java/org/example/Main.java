package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");



        WebElement input = driver.findElement(By.xpath("//*[@id='my-text-id']"));
        input.click();
        input.sendKeys("text");


        WebElement input_password = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
        input_password.sendKeys("passWord");
        input_password.click();

    }
}