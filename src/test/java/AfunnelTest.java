import PageTypes.ToolsChooser;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

//import org.openqa.selenium.remote.DesiredCapabilities;

public class AfunnelTest {

    //public RemoteWebDriver driver;
    public WebDriver driver;


   // Variables var;
    ToolsChooser toolsChooser;



    @Test
    public void testPageTitleInChrome() throws InterruptedException {

        String appURL[] = {

                "https://staging.1800option.com/30daychange/",

        };

        String appTitle[] = {

                "30DayChange",

        };

        int i = -1;
        int j = appURL.length-1;
        int m = j+1;


        while (i != j)
        {
           i++;
            int k = i+1;
//            driver = new RemoteWebDriver (DesiredCapabilities.chrome ());
            driver = new ChromeDriver();

            {
                @Override
                public void get(String s) {

                }

                @Override
                public String getCurrentUrl() {
                    return null;
                }

                @Override
                public String getTitle() {
                    return null;
                }

                @Override
                public List<WebElement> findElements(By by) {
                    return null;
                }

                @Override
                public WebElement findElement(By by) {
                    return null;
                }

                @Override
                public String getPageSource() {
                    return null;
                }

                @Override
                public void close() {

                }

                @Override
                public void quit() {

                }

                @Override
                public Set<String> getWindowHandles() {
                    return null;
                }

                @Override
                public String getWindowHandle() {
                    return null;
                }

                @Override
                public TargetLocator switchTo() {
                    return null;
                }

                @Override
                public Navigation navigate() {
                    return null;
                }

                @Override
                public Options manage() {
                    return null;
                }
            };
     //     розгорнуто
     //       driver.manage ().window ().maximize ();
     //     сховано
            driver.manage ().window ().setPosition(new Point (-2000,0));


            toolsChooser = new ToolsChooser (driver);

//Йдемо на потрібну сторінку
            driver.navigate ( ).to ( appURL[i] );
            //зачистка куків
            ToolsChooser.tools.deleteAllCookiesTool (appURL[i]);
            Thread.sleep ( 500 );
            String strPageTitle = driver.getTitle ( );
            String writeSomethingIntoLogFile = "";
            ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
            if (strPageTitle.equals ( appTitle[i] )) {
                writeSomethingIntoLogFile = "";
                ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
                writeSomethingIntoLogFile = "The " + appURL[i] + " is available online";
                ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
                writeSomethingIntoLogFile = "(" + appTitle[i] + ")";
                ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
            }
//Якщо всі 3 перевірки не пройшли - надсилаємо емаіл/смс
                    else {
                        writeSomethingIntoLogFile =                             "Can't access: " + appURL[i] ;
                        ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
                        //String sendEmailText = "Can't access the " + appURL[i];
                        ToolsChooser.sendEmail ();

//Чекаємо 5 хвилин і повторюємо перевірку
        //                Thread.sleep ( 300000 );

                    }

            writeSomethingIntoLogFile = "";
            ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);
            writeSomethingIntoLogFile = "-------------------------------------------";
            ToolsChooser.tools.protocolirenTool (writeSomethingIntoLogFile);


   //         Thread.sleep ( 200 );


            // Закриваємо браузер
            if(driver!=null) {
                System.out.println("Closing browser");
                driver.quit();
            }
        }

    }



}