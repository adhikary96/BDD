package com.cg.personalregistration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"}, glue= {"com.cg.personalregistration.stepdefinitions"})
public class TestRunner {

}
