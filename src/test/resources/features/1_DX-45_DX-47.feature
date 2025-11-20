@DX-48
@REQ_DX-45
Feature: HU-6 Automatización sitio DemoQA

	Background:
		#@PRECOND_DX-47
		Given "Edwin" abre el sitio web de pruebas
		And navega hasta el modulo de elementos

	#Yo como Edwin
	#Quiero realizar una prueba de abrir la web de test
	#Para probar de forma aleatoria los componentes disponibles de la funcion de elementos y validar su correcto cargue
	@TEST_DX-46 @Serenity
	Scenario: Validacion en la funcion del ID Card Elements
		When selecciona aleatoriamente alguna de las subfunciones
		Then visualizara en la cabecera el nombre de la opción elegida
		
