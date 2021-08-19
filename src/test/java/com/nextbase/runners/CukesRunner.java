package com.nextbase.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/nextbase/stepdefinitions",
        dryRun = false,
        tags = "@NEXTBASE-248"
)

public class CukesRunner {
}
