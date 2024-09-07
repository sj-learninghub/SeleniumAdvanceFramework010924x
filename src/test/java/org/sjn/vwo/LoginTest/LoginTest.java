package org.sjn.vwo.LoginTest;

import org.assertj.core.api.Assertions;
import org.sjn.basetest.CommonToAllTest;
import org.sjn.pages.POM.DashboardPage_POM;
import org.sjn.pages.POM.LoginPage_POM;
import org.testng.annotations.Test;
import org.sjn.utils.PropertyReader;



public class LoginTest extends CommonToAllTest  {
    @Test(priority = 1)
    public void testLoginNegative() throws Exception {
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURL(PropertyReader.readKey("url"));
        String error_message=pagePom.loginToVWONegative();
        Assertions.assertThat(error_message)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("error_message"));



    }
    @Test(priority = 2)
    public void testLoginPositive() throws Exception {
        //who will start the webdriver?
        //who will provide the test data?
        //who will perform the action?
        //who will verify the result?
        //who will close the browser?
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURL(PropertyReader.readKey("url"));
        //pagePom.loginToVWOPositive() ;
        DashboardPage_POM dashboardPagePom = pagePom.loginToVWOPositive().afterLogin();
        String expected_username=dashboardPagePom.loggedInUserName();
        Assertions.assertThat(expected_username)
        .isNotNull()
        .isNotBlank()
        .contains(PropertyReader.readKey("expected_username"));


    }



}
