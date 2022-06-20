package LiveProject_Sourabh_FST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity7_Sourabh extends HRM_Base {

    @Test
    public void addEmployeeQualifications() throws InterruptedException {
        addQualifications();
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
