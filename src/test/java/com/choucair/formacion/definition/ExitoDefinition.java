package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ExitoSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExitoDefinition {
	@Steps
	ExitoSteps pruebaSteps;

	@Given("^Abrir pagina exito$")
	public void abrir_pagina_exito() {
		pruebaSteps.abrirPaginaExito();

	}
	
	@Given("^Buscar \"([^\"]*)\"$")
	public void buscar(String arg1) {
		pruebaSteps.buscar(arg1);
	}

	@Given("^Filtrar$")
	public void filtrar(DataTable arg1) {
			pruebaSteps.filtrar();
	}

	@When("^Agregar televisor al carrito$")
	public void agregar_televisor_al_carrito() {
		pruebaSteps.agregarAlCarrito();
	}

	@Then("^Verificar carrito$")
	public void verificar_carrito() {
		pruebaSteps.verificarCarrito();
	}

}
