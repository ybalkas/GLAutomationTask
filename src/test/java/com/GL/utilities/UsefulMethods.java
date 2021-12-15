package com.GL.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class UsefulMethods {

        /**
         * Waits for provided element to be clickable
         *
         * @param element
         * @param timeout
         * @return
         */
        public static WebElement waitForClickablility(WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        }


        public static void verifyElementEnabled(WebElement element) {
            try {
                Assert.assertTrue("Element not enabled: " + element, element.isEnabled());
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                Assert.fail("Element not found: " + element);

            }
        }
    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}