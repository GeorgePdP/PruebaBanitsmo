import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ejecuccion {

    WebDriver driver;
    String url = "https://www.banistmo.com/wps/portal/banistmo/personas/";

    public Ejecuccion() {
        System.setProperty("webdriver.chrome.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void Pasos() throws InterruptedException {

        String acercaDe = "//*[@id=\"menu-top\"]/div/ul[1]/li[4]/a";
        String AvisoPrivacidad = "//*[@id=\"btn-aceptar-cookies\"]/strong";
        String InfoCorp = "//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a";
        String Proovedores = "";
        String DescargarDocumento = "";


        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(acercaDe)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(AvisoPrivacidad)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(InfoCorp)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        //driver.findElement(By.xpath(loginButton)).click();
        //Thread.sleep(2000);

    }}
