public class driver {


    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
          
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com.br");

    }
    
}
