package com.paraBank.pages;

import org.openqa.selenium.By;

public class LoginPage {
	
	By username = By.name("username");
	By password = By.name("password");
	By top_panel = By.id("topPanel");
	By welcome_text = By.xpath("//*[@id=\"topPanel\"]/p");
	By header_menu_solution = By.linkText("Solutions");
	By header_menu_about_us = By.linkText("About Us");
	By header_menu_services = By.linkText("Services");
	By header_menu_products = By.linkText("Products");
	By header_menu_locations = By.linkText("Locations");
	By header_menu_admin_page = By.linkText("Admin Page");

}
