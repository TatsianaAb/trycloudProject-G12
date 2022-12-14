package com.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/tryCloud/step_definitions",
        dryRun = false, //true --> will give all unimplemented snippets, false --> will run step definitions
        tags = "@searchanything",
        publish = false

)
public class CukesRunner {
}

