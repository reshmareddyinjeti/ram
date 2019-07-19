package onlineshoping.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import onlineshoping.com.driver.DriverFactory;

public class Hooks {

private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.maximize();
        driverFactory.waits();
    }
    @After
    public void teardown(){
     //   driverFactory.closeBrowser();
    }
}
