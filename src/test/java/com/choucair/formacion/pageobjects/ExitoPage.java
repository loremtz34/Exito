package com.choucair.formacion.pageobjects;

import org.openqa.selenium.Keys;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString; 

@DefaultUrl("https://www.exito.com/")
public class ExitoPage extends PageObject{
	
	//input del buscador
	@FindBy(id="downshift-0-input")
	public WebElementFacade campoBusqueda;
	
	//lbl pulgadas
	@FindBy(xpath= "/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[4]/div/div[1]/div/div[1]/div/div/div[9]/div[2]/div/div/div[5]/div/label")
	public WebElementFacade lblPulgadas;
	
	//lbl resolucion
	@FindBy(xpath= "/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[4]/div/div[1]/div/div[1]/div/div/div[7]/div[2]/div/div/div[1]/div/label")
	public WebElementFacade lblResolucion;
	
	//lblMarca
	@FindBy (xpath= "/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[4]/div/div[1]/div/div[1]/div/div/div[6]/div[2]/div/div/div[1]/div/label")
	public WebElementFacade lblMarca;
	
	//div de televisores
	@FindBy (xpath ="/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[4]/div/div[2]/div/div[2]/div[5]")
	public WebElementFacade divTv;
	
	//Primer tv
	@FindBy (xpath="/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[4]/div/div[2]/div/div[2]/div[5]/div/div/div[2]/div[1]/section/a/article/div[1]/div[2]/div/img")
	public WebElementFacade primerTv;
	
	//boton agregar al carrito
	@FindBy (xpath="/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[4]/div/section/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/button")
	public WebElementFacade btnAgregarAlCarrito;
	
	//boton carrito
	@FindBy (xpath="/html/body/div[2]/div/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div[4]")
	public WebElementFacade btnCarrito;
	
	//lbl tv en carrito
	@FindBy (xpath="//*[@id=\'product-name100341793\']")
	public WebElementFacade lblCarrito;
	
	
	public void buscar(String arg1)
	{
		campoBusqueda.click();
		campoBusqueda.clear();
		campoBusqueda.sendKeys(arg1);
		campoBusqueda.sendKeys(Keys.ENTER);
	}
	
	public void pulgadas() {
		lblPulgadas.click();
	}
	
	public void marca() {
		lblMarca.click();
	}
	
	public void resolucion() {
		lblResolucion.click();
	}
	
	public void primerTv() {
		primerTv.click();
	}
	
	public void agregarAlCarrito() {
		btnAgregarAlCarrito.click();
	}
	
	public void verCarrito() {
		btnCarrito.click();
	}
	
	public void verificarTv() {
		String labelv="Televisor LG 50 pulgadas UM7300 UHD Smart";
		String strTv = lblCarrito.getText();
		assertThat(strTv, containsString(labelv));
	}
	
	public void imprimirtv() {
		String tvs = divTv.getText();		
		System.out.print(tvs);
	}
}
