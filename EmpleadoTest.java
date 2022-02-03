package empleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmpleadoTest {
	
	static Empleado e1;
	static Empleado e2;
	@BeforeEach
	void setUp() throws Exception {
		e1 = new Empleado("Sergio","Varilla",21,1300);
		e2 = new Empleado("Fran","Moreno",45,1000);
	}

	@ParameterizedTest(name = "test sueldoPlus")
	@CsvSource({
			"Sergio,	Varilla,	21,		1330,	false",
			"Franciso,	Javier,		45,		1000,	true",
			"Alejandro,	Garcia,		19,		2000,	false"	
			
	})
	void testSueldoPlus(String nombre, String apellido, int edad, double salario, boolean expectedResult) {
		e1 = new Empleado(nombre,apellido,edad,salario);
		assertEquals(expectedResult,e1.plus(salario));
	

}
}