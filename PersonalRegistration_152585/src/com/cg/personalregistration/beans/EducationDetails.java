package com.cg.personalregistration.beans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Value;

/**
 * Name of class: EducationDetails
 * 
 * Variable Type: WebElement
 * variables:
 * 		graduation
 * 		percentage
 * 		passingYear
 * 		projectName
 * 		otherTechnologies
 * 		registerMe
 * 		
 * 		techNet
 * 		techJava
 * 		techPhp
 * 		techOther
 * 
 * Number of Methods: Setter Methods of the elements.
 * 
 * Author: Deepraj Adhikary
 * Date of Creation: August 24, 2018
 * Date of Last Modification: August 24, 2018
 *
 */

public class EducationDetails {

	@FindBy(name = "graduation")
	public List<WebElement> graduation;

	@FindBy(how = How.ID, id = "txtPercentage")
	private WebElement percentage;

	@FindBy(how = How.ID, id = "txtPassYear")
	private WebElement passingYear;

	@FindBy(how = How.ID, id = "txtProjectName")
	private WebElement projectName;

	@FindBy(how = How.ID, id = "txtOtherTechs")
	private WebElement otherTechnologies;

	@FindBy(how = How.ID, id = "btnRegister")
	private WebElement registerMe;

	public void setGraduation(String graduation) {
		Select select = new Select(this.graduation.get(0));
		select.selectByVisibleText(graduation);
	}

	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}

	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}

	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}

	public void setTechnologies(String technologies) {
		clickTechnology(technologies);
	}

	public void setOtherTechnologies(String otherTechnologies) {
		this.otherTechnologies.sendKeys(otherTechnologies);
	}

	public void clickRegisterMe() {
		registerMe.click();
	}

	@FindBy(how = How.CSS, css = "input[value='Other']")
	private WebElement techOther;

	@FindBy(how = How.CSS, css = "input[value='.Net']")
	private WebElement techNet;

	@FindBy(how = How.CSS, css = "input[value='PHP']")
	private WebElement techPhp;

	@FindBy(how = How.CSS, css = "input[value='Java']")
	private WebElement techJava;

	private void clickTechnology(String technology) {
		if (technology == ".Net") {
			this.techNet.click();
		} else if (technology == "Java") {
			this.techJava.click();
		} else if (technology == "PHP") {
			this.techPhp.click();
		} else {
			this.techOther.click();
		}
	}
}
