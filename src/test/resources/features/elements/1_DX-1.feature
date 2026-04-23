Feature: Verificar la funcionalidad del formulario TextBox del módulo Elements

	Background:
		#@PRECOND_DX-2
		Given "Edwin" abre el sitio web de pruebas
		And navega hasta el modulo de elementos

	#Yo como Edwin
	#Quiero diligenciar el formulario del componente "Text Box"
	#Para verificar que los datos ingresados se muestren correctamente en el panel de resultados
	@TEST_DX-1
	Scenario: Verificar la funcionalidad del formulario TextBox del módulo Elements
		When selecciona el componente Text Box
		And diligencia el formulario con información válida
		Then debera visualizar en el panel de resultados con los datos ingresados
		
