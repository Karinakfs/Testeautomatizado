package comprando;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Logarecomprar {
	
	static WebDriver driver;
	
	public Logarecomprar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherCampos() {
		
			
				
		WebElement maioridade = driver.findElement(By.id("btn-age-yes"));
		maioridade.click();
		
			
		WebElement entrar = driver.findElement(By.xpath("(//div[contains(.,'Entrar')])[9]"));
		entrar.click();
		
		
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement entre = driver.findElement(By.xpath("//span[contains(.,'Entre aqui')]"));
		entre.click();
		
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("karinaaraujokfs@gmail.com");
		
		WebElement senha = driver.findElement(By.xpath("//div/div/div/div[2]/form/div[2]/div/div/input"));
		senha.sendKeys("129Ljfka");
		
		WebElement clicar = driver.findElement(By.xpath("//button[@class='sc-fMiknA cshglJ'][contains(.,'ENTRAR E CONTINUAR')]"));
		clicar.click();
		
		
	
	
	}
	

}
