package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test {
    public static void main(String[] args){
         // Configurar el ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\juan\\Desktop\\Proyectos Selemiun\\Proyect\\SelemiunTest\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
        
        // Inicializar el WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navegar a la página de Demoblaze
            driver.get("https://www.demoblaze.com/");
            driver.manage().window().maximize(); // abrir y Maximizar la ventana del navegador

             // Esperar a que la página cargue completamente
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Paso 1: Iniciar sesión automáticamente
            WebElement loginButton = driver.findElement(By.id("login2"));
            loginButton.click();

            // Esperar a que el modal de inicio de sesión esté visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));

             // Ingresar las credenciales
            WebElement username = driver.findElement(By.id("loginusername"));
            WebElement password = driver.findElement(By.id("loginpassword"));
            WebElement LoginButton2 = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));

            username.sendKeys("hola@correo.com"); // Datos de usuario
            password.sendKeys("qwerty2024"); // Datos de contraseña
            LoginButton2.click();

            // Esperar a que la sesión se inicie correctamente
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));

            // Paso 2: Seleccionar la categoría "Phones"
            WebElement phonesCategory = driver.findElement(By.xpath("//a[contains(text(), 'Phones')]"));
            phonesCategory.click();

            // Esperar a que la página de "Phones" cargue
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Nokia lumia 1520')]")));

            // Paso 3: Hacer clic en el producto "Nokia lumia 1520"
            WebElement nokiaProduct = driver.findElement(By.xpath("//a[contains(text(), 'Nokia lumia 1520')]"));
            nokiaProduct.click();

            // Esperar a que la página del producto cargue
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Add to cart')]")));

            // Paso 4: Hacer clic en "Add to cart"
            WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(text(), 'Add to cart')]"));
            addToCartButton.click();

            // Esperar a que aparezca el mensaje "Product added"
            wait.until(ExpectedConditions.alertIsPresent());

            // Paso 5: Validar el mensaje "Product added"
            String alertMessage = driver.switchTo().alert().getText();

            if (alertMessage.equals("Product added")) {
                System.out.println("Prueba exitosa: El producto se agregó correctamente al carrito.");
            } else {
                System.out.println("Prueba fallida: El mensaje no coincide.");
            }

            // Aceptar la alerta
            driver.switchTo().alert();


        } catch (Exception e) {
            System.out.println("Ocurrió un error durante la ejecución de la prueba: " + e.getMessage()); 
        }
    }
}
