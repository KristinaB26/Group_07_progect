package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //type of file:location/fileName.extension
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-report.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@LibraryCT",
        publish=true
)
public class CukesRunner {

}
