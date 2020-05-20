@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @EscenarioPrueba
  Scenario: Comprar un televisor en la pagina de exito
    Given Abrir pagina exito
    And Buscar "Televisor"
    And Filtrar
	    | Marca	|	Resolucion	| Pulgadas		|
	    |	LG		| UHD-4K			| 50 pulgadas |
	    When Agregar televisor al carrito
	    Then Verificar carrito
