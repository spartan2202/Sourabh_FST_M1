package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity8_Sourabh extends HRM_Base {

    @Test
    public void applyLeaveEmployee() throws InterruptedException {
        applyLeave("17");

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
