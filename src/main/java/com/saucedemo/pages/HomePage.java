package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item']")
    WebElement listOfProduct;


    public String successfulLoginMessage() {
       log.info("Successfully Login " + productMessage + "Login messages" + productMessage.toString());
        return getTextFromElement(productMessage);
    }

    public int productlist() {
       log.info("Product List " + listOfProduct.toString());
        List<WebElement> product = driver.findElements((By) listOfProduct);
        return product.size();
    }

}


