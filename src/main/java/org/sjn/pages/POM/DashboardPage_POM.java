package org.sjn.pages.POM;

import org.openqa.selenium.By;
import org.sjn.base.CommonToAllPage;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM() {
        super();
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
