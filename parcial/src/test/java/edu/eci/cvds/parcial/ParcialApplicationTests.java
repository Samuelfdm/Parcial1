package edu.eci.cvds.parcial;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import model.LogAgent;
import model.Producto;
import model.WarningAgent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import repository.ProductoRepository;
import service.ProductoService;

class ParcialApplicationTests {
	@InjectMocks
	private ProductoService productoService;

	@Mock
	private ProductoRepository productoRepository;

	@Mock
	private LogAgent agenteLog;

	@Mock
	private WarningAgent agenteAdvertencia;

	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testUpdateStock() {
		Producto producto = new Producto("xbox one s", 299.99, 10, "consolas");
		when(productoRepository.getProducto("xbox one s")).thenReturn(producto);

		productoService.updateStock("xbox one s", 4);

		verify(agenteLog).update(producto);
		verify(agenteAdvertencia).update(producto);
	}
}
