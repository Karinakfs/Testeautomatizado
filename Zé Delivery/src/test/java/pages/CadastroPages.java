package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroPages {
	
	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
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
	
	WebElement nome = driver.findElement(By.name("name"));
	nome.sendKeys("Karina França");
	
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("karinaaraujokfs@gmail.com");
	
	WebElement senha = driver.findElement(By.name("password"));
	senha.sendKeys("129Ljfka");
	
	WebElement cpf = driver.findElement(By.name("document"));
	cpf.sendKeys("369.391.008-14");
	
	WebElement fone = driver.findElement(By.name("phone"));
	fone.sendKeys("11976085753");
	
	WebElement dia = driver.findElement(By.name("day"));
	dia.sendKeys("21");
	
	
	Select dropdown = new Select(driver.findElement(By.name("month")));
	dropdown.selectByVisibleText("Out");
	
	Select ano = new Select(driver.findElement(By.name("year")));
	ano.selectByVisibleText("1987");
	
	
	WebElement cadastrar = driver.findElement(By.xpath("(//div[contains(@class,'full-width')])[6]"));
	cadastrar.click();
	

	}

	
}


