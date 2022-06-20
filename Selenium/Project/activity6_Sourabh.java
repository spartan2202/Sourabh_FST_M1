package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity6_Sourabh extends HRM_Base {

    @Test
    public void verifyDirectory() throws InterruptedException {
        launchDirectory();
    }
    @BeforeMethod
    public void setUp() {
        driver = myDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
