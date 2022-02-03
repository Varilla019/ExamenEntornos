package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta per1;
	static Cuenta per2;
	
	@BeforeEach
	void setUp() throws Exception {
		per1 = new Cuenta("12345678A", "Sergio Varilla");
	}

	@Test
	void testIngresar() throws Exception {
		try {
		per1.ingresar("Ingreso para el fortnite", 10);
		assertEquals(10,per1.getSaldo());
		} catch (Exception IngresoNegativoException){
			fail("No Fallaria");
		}
	}
	
	//No se porque el Retirar no me funciona
	@Test
	void testRetirar() throws Exception{
		try {
			per1.retirar("Nada", 5);
			assertEquals(5,per1.getSaldo());
		} catch (Exception SaldoInsuficienteException) {
			fail("No Fallaria");
		}
	}
	//Sinceramente no se que es un vector y no me funciona.
	//@Test
	//void testAddMovimiento() {
		//per1.addMovimiento(null);
	//}
	
}
