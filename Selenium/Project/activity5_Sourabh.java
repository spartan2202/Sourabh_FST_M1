package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity5_Sourabh extends HRM_Base {

    @Test
    public void editEmployeeDetails() throws InterruptedException {
        editEmployeeApp();
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
