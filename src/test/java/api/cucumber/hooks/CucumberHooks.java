package api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("----Before hook");
    }
    @After
    public void tearDown(){
        System.out.println("----After hook----");
    }
    @BeforeStep
    public void setUpSteps(){
        System.out.println("----BeforeStep hook----");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("----AfterStep hook----");
    }
}
