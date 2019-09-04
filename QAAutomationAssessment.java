/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qa.automation.assessment;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Lebogang
 */
public class QAAutomationAssessment
{
    /**
     * @param args the command line arguments
     */
    public static WebDriver driver = null;
    public static WebElement element;
    public static WebDriverWait wait;
     
    public static void main(String[] args) throws IOException, InterruptedException, IllegalArgumentException{
        // setting Chrome driver for the browser choice
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lebogang\\Documents\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        
        //navigating to the url and maximizing the window
        String url = "http://www.way2automation.com/angularjs-protractor/webtables/";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("[INFO] Successfully navigated to URL");
        
        //Validating that page is landed on the User List Table by locating an element on a page
        wait = new WebDriverWait(driver, 40);
        if(!findElementByXpath("//button[@type='add']//i")){
            System.err.println("[Error] Failed to locate element on page");
        }
//        element = driver.findElement(By.xpath("//button[@type='add']//i"));
        System.out.println("[INFO] Successfully landed on the User List Table page");
    
        //============================= Adding User1 =================================================================================//
        
        //Clicking the Add User Icon using web element xpath
        if(!findElementByXpath("//button[@type='add']//i")){
            System.err.println("[ERROR] Failed to locate add user button");
        }
        if(!clickElementByXpath("//button[@type='add']//i")){
            System.err.println("[ERROR] Failed to click add user button");
        }
        System.out.println("[INFO] Successfully located and clicked add user button");
        
        //Validating that Add User page is displayed
        wait = new WebDriverWait(driver, 10);
        element = driver.findElement(By.xpath("//div/h3[text()='Add User']"));
        System.out.println("[INFO] Successfully opened the Add User page");
        
        //Locating first name text field
        if(!findElementByXpath("//td//input[(contains(@name,'First'))]")){
            System.err.println("[ERROR] Failed to find First name text field");
        }
        System.out.println("[INFO] First name located successfully");
       
        //Inserting first name
        if(!insertElementByXpath("//form//table//td//input[@name='FirstName']", "FName1")){
            System.err.println("[ERROR] Failed to inser first name");
        }
        System.out.println("[INFO] First name inserted successfully");

        //Insert Last name
        if(!insertElementByXpath("//input[(contains(@name,'Last'))]", "LName1")){
            System.err.println("[ERROR] Failed to insert last name");
        }
        System.out.println("[INFO] Last name inserted successfully");
        
        //Inserting username and validating uniqueness
        if(!insertElementByXpath("//input[(contains(@name,'UserName'))]", "User1")){
            System.err.println("[ERROR] Failed to insert username");
        }
        System.out.println("[INFO] Username inserted successfully");
        //calling the validate method
        validateUsername(driver, "User1");
        System.out.println("[INFO] Username validated successfully");
                
        //Inserting password
        if(!insertElementByXpath("//input[(contains(@name,'Password'))]", "Pass1")){
            System.err.println("[ERROR] Failed to insert Password");
        }
        System.out.println("[INFO] Password inserted successfully");
        
        //Selecting company option 1
        if(!clickElementByXpath("//label//input[@name='optionsRadios'][1]")){
            System.err.println("[ERROR] Failed to select Company AAA radio button option");
        }
        System.out.println("[INFO] Radio button option selected successfully");
        
        //Selecting an option from the dropdown
        if(!findElementByXpath("//td//select")){
            System.err.println("[INFO] Failed to locate roles dropown");
        }
        if(!clickElementByXpath("//td//select")){
            System.err.println("[ERROR] Failed to open dropdown");
        }
        if(!clickElementByXpath("//td//select//option[4]")){
            System.err.println("[ERROR] Failed to select option from dropdown");
        }
        System.out.println("[INFO] Select role from dropdown successsfully");
        
        //Inserting email address
        if(!findElementByXpath("//td//input[@name='Email']")){
            System.err.println("[ERROR] Failed to find email text field");
        }
        if(!insertElementByXpath("//td//input[@name='Email']", "admin@mail.com")){
            System.err.println("[ERROR] Failed to insert email address");
        }
        System.out.println("[INFO] Email address inserted successfully");
        
        //Inserting cell phone number
        if(!findElementByXpath("//td//input[@name='Mobilephone']")){
            System.err.println("[ERROR] Failed to find cell number text field");
        }
        if(!insertElementByXpath("//td//input[@name='Mobilephone']", "082555")){
            System.err.println("[ERROR] Failed to insert cell phone number");
        }
        System.out.println("[INFO] Cell phone number inserted successfully");
        
        //Clicking the save button 
        if(!clickElementByXpath("//button[@ng-click='save(user)']")){
            System.err.println("[ERROR] Failed to click save button");
        }
        System.out.println("[INFO] Save button clicked successfully");
        
        //============================= Validating That User was Saved To User Table ==================================================//
        
        Thread.sleep(20);
        
        if(!findElementByXpath("//tbody//td[contains(text(),'User1')]")){
            System.err.println("[ERROR] Failed to find user1 in the table");
        }
        System.out.println("[INFO] User added successfully");
        
        Thread.sleep(15);
        
        //============================= Adding User2 =================================================================================//
        
                //Clicking the Add User Icon using web element xpath
        if(!findElementByXpath("//button[@type='add']//i")){
            System.err.println("[ERROR] Failed to locate add user button");
        }
        if(!clickElementByXpath("//button[@type='add']//i")){
            System.err.println("[ERROR] Failed to click add user button");
        }
        System.out.println("[INFO] Successfully located and clicked add user button");
        
        //Validating that Add User page is displayed
        wait = new WebDriverWait(driver, 10);
        element = driver.findElement(By.xpath("//div/h3[text()='Add User']"));
        System.out.println("[INFO] Successfully opened the Add User page");
        
        //Locating first name text field
        if(!findElementByXpath("//td//input[(contains(@name,'First'))]")){
            System.err.println("[ERROR] Failed to find First name text field");
        }
        System.out.println("[INFO] First name located successfully");
       
        //Inserting first name
        if(!insertElementByXpath("//form//table//td//input[@name='FirstName']", "FName2")){
            System.err.println("[ERROR] Failed to inser first name");
        }
        System.out.println("[INFO] First name inserted successfully");

        //Insert Last name
        if(!insertElementByXpath("//input[(contains(@name,'Last'))]", "LName2")){
            System.err.println("[ERROR] Failed to insert last name");
        }
        System.out.println("[INFO] Last name inserted successfully");
        
        //Inserting username and validating uniqueness
        if(!insertElementByXpath("//input[(contains(@name,'UserName'))]", "User2")){
            System.err.println("[ERROR] Failed to insert username");
        }
        System.out.println("[INFO] Username inserted successfully");
        //calling the validate method
        validateUsername(driver, "User1");
        System.out.println("[INFO] Username validated successfully");
                
        //Inserting password
        if(!insertElementByXpath("//input[(contains(@name,'Password'))]", "Pass2")){
            System.err.println("[ERROR] Failed to insert Password");
        }
        System.out.println("[INFO] Password inserted successfully");
        
        //Selecting company option 
        if(!clickElementByXpath("//label//input[@value='16']")){
            System.err.println("[ERROR] Failed to select Company BBB radio button option");
        }
        System.out.println("[INFO] Radio button option selected successfully");
        
        //Selecting an option from the dropdown
        if(!findElementByXpath("//td//select")){
            System.err.println("[INFO] Failed to locate roles dropown");
        }
        if(!clickElementByXpath("//td//select")){
            System.err.println("[ERROR] Failed to open dropdown");
        }
        if(!clickElementByXpath("//td//select//option[3]")){
            System.err.println("[ERROR] Failed to select option from dropdown");
        }
        System.out.println("[INFO] Select role from dropdown successsfully");
        
        //Inserting email address
        if(!findElementByXpath("//td//input[@name='Email']")){
            System.err.println("[ERROR] Failed to find email text field");
        }
        if(!insertElementByXpath("//td//input[@name='Email']", "customer@mail.com")){
            System.err.println("[ERROR] Failed to insert email address");
        }
        System.out.println("[INFO] Email address inserted successfully");
        
        //Inserting cell phone number
        if(!findElementByXpath("//td//input[@name='Mobilephone']")){
            System.err.println("[ERROR] Failed to find cell number text field");
        }
        if(!insertElementByXpath("//td//input[@name='Mobilephone']", "083444")){
            System.err.println("[ERROR] Failed to insert cell phone number");
        }
        System.out.println("[INFO] Cell phone number inserted successfully");
        
        //Clicking the save button 
        if(!clickElementByXpath("//button[@ng-click='save(user)']")){
            System.err.println("[ERROR] Failed to click save button");
        }
        System.out.println("[INFO] Save button clicked successfully");
        
        //============================= Validating That User was Saved To User Table ==================================================//
        
        Thread.sleep(20);
        
        if(!findElementByXpath("//tbody//td[contains(text(),'User2')]")){
            System.err.println("[ERROR] Failed to find user2 in the table");
        }
        System.out.println("[INFO] User added successfully");
        
        Thread.sleep(15);
        
        //driver.close();
        
    }
    
    public static boolean findElementByXpath(String xpath){
        element = driver.findElement(By.xpath(xpath));
        wait = new WebDriverWait(driver, 15);
        return true;
    }
    public static boolean clickElementByXpath(String xpath){
        element = driver.findElement(By.xpath(xpath));
        wait = new WebDriverWait(driver, 15);
        element.click();
        return true;
    }
    public static boolean insertElementByXpath(String xpath, String text){
        element = driver.findElement(By.xpath(xpath));
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.clear();
        element.sendKeys(text);
        return true;
    }

    public static boolean validateUsername(WebDriver driver,String username){
        boolean value = false;
        List<WebElement> tblValue = driver.findElements(By.xpath("//table//tr//th//span[contains(text(),'User Name')]//..//..//..//..//tbody//td"));
        for(WebElement data:tblValue){
            if(data.findElement(By.xpath("//table//tr//th//span[contains(text(),'User Name')]//..//..//..//..//tbody//td")).getText().equals(username)){
                
                System.out.println("[WARNING] Username " + username +" already exists. Try another username");
                driver.findElement(By.xpath("//input[(contains(@name,'UserName'))]")).clear();
            }
            else{
                System.out.println("[INFO] Username is unique");
            }
        }
        return value;
    }
}
