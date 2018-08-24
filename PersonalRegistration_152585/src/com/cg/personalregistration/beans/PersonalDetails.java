package com.cg.personalregistration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Name of class: PersonalDetails
 * 
 * Variable Type: WebElement
 * variables:
 * 		firstName
 * 		lastName
 * 		email
 * 		phoneNumber
 * 		addressLine1
 * 		addressLine2
 * 		city
 * 		state
 * 		next
 * 
 * Number of Methods: Setter Methods of the elements.
 * 
 * Author: Deepraj Adhikary
 * Date of Creation: August 24, 2018
 * Date of Last Modification: August 24, 2018
 *
 */

public class PersonalDetails {
	@FindBy(how = How.ID, id = "txtFirstName")
	private WebElement firstName;

	@FindBy(how = How.ID, id = "txtLastName")
	private WebElement lastName;

	@FindBy(how = How.ID, id = "txtEmail")
	private WebElement email;

	@FindBy(how = How.ID, id = "txtPhone")
	private WebElement phoneNumber;

	@FindBy(how = How.ID, id = "txtAddress1")
	private WebElement addressLine1;

	@FindBy(how = How.ID, id = "txtAddress2")
	private WebElement addressLine2;

	@FindBy(name = "city")
	public List<WebElement> city;
	
	@FindBy(name = "state")
	public List<WebElement> state;
		
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[11]/td/a")
	public WebElement next;

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}

	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
		select.selectByVisibleText(city);
	}

	public void setState(String state) {
		Select select = new Select(this.state.get(0));
		select.selectByVisibleText(state);
	}
	
	public void clickNext() {
		next.click();
	}
	
	
	
}
