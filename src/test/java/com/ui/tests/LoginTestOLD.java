package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOLD {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		BrowserUtility browserUtility = new BrowserUtility(driver);
		browserUtility.goToWebsite("http://www.automationpractice.pl");
		browserUtility.maximizeWindow();

		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		browserUtility.clickOn(signInLinkLocator);

		By emailTextBoxLocater = By.id("email");
		browserUtility.enterText(emailTextBoxLocater, "bakomam596@skrak.com");

		By passwordTextBoxLocater = By.id("passwd");
		browserUtility.enterText(passwordTextBoxLocater, "password");

		
		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserUtility.clickOn(submitLoginButtonLocator);
		
	}

}
