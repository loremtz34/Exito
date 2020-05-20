package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ExitoPage;

public class ExitoSteps {
	ExitoPage pruebaPage;

	public void abrirPaginaExito() {
		pruebaPage.open();
	}

	public void buscar(String arg1) {
		pruebaPage.buscar(arg1);
	}

	public void filtrar() {
		pruebaPage.marca();
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
		pruebaPage.resolucion();
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
		pruebaPage.pulgadas();		
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
		pruebaPage.imprimirtv();
	}

	public void agregarAlCarrito() {
		pruebaPage.primerTv();
		pruebaPage.agregarAlCarrito();
	}

	public void verificarCarrito() {
		pruebaPage.verCarrito();
		pruebaPage.verificarTv();
	}

}
