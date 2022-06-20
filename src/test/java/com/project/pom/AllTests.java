package com.project.pom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Scenario_Test.class, Scenario_Test_Firefox.class })
public class AllTests {

}
