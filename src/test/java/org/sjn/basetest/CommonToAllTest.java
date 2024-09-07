package org.sjn.basetest;

import org.sjn.driver.DriverManagerTL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;

public class CommonToAllTest {
    //start the webdriver
    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DriverManagerTL.init();
    }

    // close the Webdriver
    @AfterMethod
    protected void tearDown(){

        DriverManagerTL.down();
    }
}
