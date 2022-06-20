package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity9_Sourabh extends HRM_Base {

    @BeforeMethod
    public void setUp() {
        driver = myDriver();
    }

    @Test
    public void getEmergencyContacts() throws InterruptedException {
        getContacts();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
