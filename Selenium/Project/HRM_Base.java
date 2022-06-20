package LiveProject_Sourabh_FST;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class HRM_Base {

    public WebDriver driver;

    String url = "http://alchemy.hguy.co/orangehrm";
    String ExpectedTitle = "OrangeHRM";
    String username = "orange";
    String password = "orangepassword123";

    String usernameElement = "//input[@id='txtUsername']";
    String passwordElement = "//input[@id='txtPassword']";
    String loginElement = "//input[@id='btnLogin']";

    String hPTitle = "OrangeHRM";
    ;
    String pimElement = "//a[@id='menu_pim_viewPimModule']";
    String addEmpElement = "//*[@id='btnAdd']";
    String empFirstNameElement = "//input[@id='firstName']";
    String empLastNameElement = "//input[@id='lastName']";
    String frstName = "Sourabh";
    String lstName = "Test";
    String saveButtonElement = "//input[@id='btnSave']";
    String empListElement = "//*[@id='menu_pim_viewEmployeeList']";
    String searchEmpElement = "//*[@id='empsearch_employee_name_empName']";
    String listElement = "//*[contains(text(),'Sourabh')]";

    String myInfoElement = "//*[@id='menu_pim_viewMyDetails']";
    String editbuttonElement = "//*[@id='btnSave']";
    String editFirstEmployeeElement = "//*[@id='personal_txtEmpFirstName']";
    String editLastEmployeeElement = "//*[@id='personal_txtEmpLastName']";
    String editRadioFemaleElement = "//*[@id='personal_optGender_2']";
    String editSaveButton = "//*[@id='btnSave']";

    String directoryElement = "//*[@id='menu_directory_viewDirectory']";
    String searchDirectoryText = "//*[contains(text(),'Search Directory')]";

    String qualiElement = "//ul[@id='sidenav']//*[contains(text(),'Qualifications')]";
    String addWorkElement = "//*[@id='addWorkExperience']";
    String companyElement = "//*[@id='experience_employer']";
    String jobElement = "//*[@id='experience_jobtitle']";
    String saveQualli = "//*[@id='btnWorkExpSave']";
    String companyElementDetails = "IBMTEST";
    String JobDetails = "QA";
    String dashboardEle = "//*[@id='menu_dashboard_index']";
    String applyLeaveElelemt = "//*[contains(text(),'Apply Leave')]";

    String fromDate = "//*[@id='applyleave_txtFromDate']";
    // String toDate = "//*[@id='applyleave_txtToDate']";
    String commentsElement = "//*[@id='applyleave_txtComment']";
    String comments = "I am on Sick Leave";
    String applyLeaveButton = "//*[@id='applyBtn']";
    String clickOnMyLeave = "//*[@id='menu_leave_viewMyLeaveList']";
    String LeaveStatus = "//*[@class='odd']/td[6]/a";
    String expectedStatus = "Cancelled(3.00)";

    String emergencyContacts = "//ul[@id='sidenav']//*[contains(text(),'Emergency')]";
    String rows = "//*[@id='emgcontact_list']/tbody/tr";
    String column = "//*[@id='emgcontact_list']/tbody/tr/td";


    public WebDriver myDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public void openAndMatchTitle() throws InterruptedException {
        driver.get(url);
        String ActualTitle = driver.getTitle();
        if (ExpectedTitle.contentEquals(ActualTitle)) {
            Thread.sleep(5000);

        }
    }

    public void getUrlOfHeaderImage() {
        driver.get(url);
        WebElement headerImage = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
        System.out.println("URL is: " + headerImage.getAttribute("src"));
    }

    public void loginVerifyClose() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        String ActualTitle = driver.getTitle();
        if (hPTitle.contentEquals(ActualTitle)) {
        }
    }

    public void addEmployeeToApp() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(pimElement)).click();
        driver.findElement(By.xpath(addEmpElement)).click();
        driver.findElement(By.xpath(empFirstNameElement)).sendKeys(frstName);
        driver.findElement(By.xpath(empLastNameElement)).sendKeys(lstName);
        driver.findElement(By.xpath(saveButtonElement)).click();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.xpath(empListElement)).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath(searchEmpElement)).click();
        driver.findElement(By.xpath(searchEmpElement)).clear();
        driver.findElement(By.xpath(searchEmpElement)).sendKeys("Sourabh");
        Thread.sleep(5000);
        driver.findElement(By.xpath(listElement)).isDisplayed();

    }

    public void editEmployeeApp() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(myInfoElement)).click();
        driver.findElement(By.xpath(editbuttonElement)).click();

        driver.findElement(By.xpath(editFirstEmployeeElement)).clear();
        driver.findElement(By.xpath(editFirstEmployeeElement)).sendKeys(frstName);

        driver.findElement(By.xpath(editLastEmployeeElement)).clear();
        driver.findElement(By.xpath(editLastEmployeeElement)).sendKeys(lstName);

        driver.findElement(By.xpath(editRadioFemaleElement)).click();

        WebElement mySelectElement = driver.findElement(By.xpath("//*[@id='personal_cmbNation']"));
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByVisibleText("Afghan");
        driver.findElement(By.xpath(editSaveButton)).click();

    }

    public void launchDirectory() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(directoryElement)).isDisplayed();
        driver.findElement(By.xpath(directoryElement)).isEnabled();
        driver.findElement(By.xpath(directoryElement)).click();
        driver.findElement(By.xpath(searchDirectoryText)).isDisplayed();

    }

    public void addQualifications() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(myInfoElement)).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath(qualiElement)).click();
        driver.findElement(By.xpath(addWorkElement)).click();
        driver.findElement(By.xpath(companyElement)).sendKeys(companyElementDetails);

        driver.findElement(By.xpath(jobElement)).sendKeys(JobDetails);
        Thread.sleep(5000);
        driver.findElement(By.xpath(saveQualli)).click();

    }

    public void applyLeave(String Date) throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(dashboardEle)).click();
        driver.findElement(By.xpath(applyLeaveElelemt)).click();

        WebElement mySelectElement = driver.findElement(By.xpath("//*[@id='applyleave_txtLeaveType']"));
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByVisibleText("DayOff");
        driver.findElement(By.xpath(fromDate)).click();
        Thread.sleep(5000);
        selectDateAndMonth(Date);
        driver.findElement(By.xpath(commentsElement)).sendKeys(comments);
        driver.findElement(By.xpath(applyLeaveButton)).click();
        driver.findElement(By.xpath(clickOnMyLeave)).click();
        String currentStatus = driver.findElement(By.xpath(LeaveStatus)).getText();
        Thread.sleep(5000);
        Assert.assertEquals(currentStatus, expectedStatus, "Unexepected Status");

    }

    public void getContacts() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(usernameElement)).sendKeys(username);
        driver.findElement(By.xpath(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(myInfoElement)).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath(emergencyContacts)).click();

        System.out.println("Get Rows and Column");
        List<WebElement> totalRows = driver.findElements(By.xpath(rows));

        List<WebElement> totalcolumn = driver.findElements(By.xpath(column));

        for (int rows = 1; rows <= totalRows.size(); rows++) {
            for (int cols = 1; cols <= 6; cols++) {
                System.out.print(driver.findElement(By.xpath("//*[@id='emgcontact_list']/tbody/tr[" + rows + "]/td[" + cols + "]")).getText() + "   ");
            }
            System.out.println();
        }

    }

    public void selectDateAndMonth(String Date) throws InterruptedException {


        List<WebElement> myDate = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        int count = myDate.size();

        for (int i = 0; i < count; i++) {
            String clickDate = myDate.get(i).getText();
            if (clickDate.equalsIgnoreCase(Date)) {
                myDate.get(i).click();
                break;
            }
        }
    }
}


