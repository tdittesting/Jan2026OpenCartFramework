package com.qa.Trading.pages;

import org.openqa.selenium.By;

public class AddCart {
 private By cart = By.id("cart");
 
 public void addCart() {
	 System.out.println("Adding to the cart method"+cart);
 }
}
