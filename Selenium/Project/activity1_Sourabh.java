package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity1_Sourabh extends HRM_Base {

    @BeforeMethod
    public void setUp() {
        driver = myDriver();
    }

    @Test
    public void navigateToLogin() throws InterruptedException {
        openAndMatchTitle();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
