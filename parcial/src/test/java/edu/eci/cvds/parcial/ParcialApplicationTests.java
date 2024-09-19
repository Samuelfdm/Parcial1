package edu.eci.cvds.parcial;

import model.LogAgent;
import model.Producto;
import model.WarningAgent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgentTest {

	@Test
	void testLogAgent() {
		// Crear un producto
		Producto producto = new Producto("xbox one s", 299.99, 10, "consolas");
		LogAgent logAgent = new LogAgent();
		String expectedOutput = "Producto: xbox one s -> 10 unidades disponibles\n";

		// Ejecutar la actualización
		logAgent.update(producto);

		assertEquals("xbox one s", producto.getNombre());
		assertEquals(10, producto.getCantidad());
	}

	@Test
	void testWarningAgent() {
		// Crear un producto con bajo stock
		Producto producto = new Producto("xbox one s", 299.99, 4, "consolas");
		WarningAgent warningAgent = new WarningAgent();
		String expectedOutput = "ALERTA!!! El stock del Producto: xbox one s es muy bajo, solo quedan 4 unidades.\n";

		warningAgent.update(producto);

		assertEquals("xbox one s", producto.getNombre());
		assertEquals(4, producto.getCantidad());
	}
}
