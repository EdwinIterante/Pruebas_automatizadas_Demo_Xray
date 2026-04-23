@DX-7
Feature: Caso de prueba 01 - HU1 - Element TextBox

	Background:
		#@PRECOND_DX-4
		Given "Edwin" abre el sitio web de pruebas
		And navega hasta el modulo de elementos

	#Validar que el formulario "Text Box" del módulo Elements permite ingresar información válida en todos sus campos y que, al realizar el envío, el sistema muestra correctamente los datos ingresados en la sección de resultados.
	#
	#*Resultado Esperado Final*
	#El sistema debe mostrar correctamente todos los datos ingresados en el formulario después de presionar el botón Submit, sin errores y con coincidencia exacta de la información.
	@TEST_DX-3 @web
	Scenario: Caso de prueba 01 - HU1 - Element TextBox
		When selecciona el componente Text Box
		And diligencia el formulario con información válida
		Then debera visualizar en el panel de resultados con los datos ingresados
