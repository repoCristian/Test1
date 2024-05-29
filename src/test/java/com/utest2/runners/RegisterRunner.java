package com.utest2.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com/utest2/stepdefinitions"},
        features = {"src/test/resources/features/register.feature"}
)
public class RegisterRunner {
}
