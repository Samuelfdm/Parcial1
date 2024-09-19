package edu.eci.cvds.parcial;

import model.LogAgent;
import model.Producto;
import model.WarningAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialApplication.class, args);

		Producto producto = new Producto();
		LogAgent agent1 = new LogAgent();
		WarningAgent agent2 = new WarningAgent();

		producto.setNombre("Xbox Serie S");

		producto.addAgent(agent1);
		producto.addAgent(agent2);

		producto.setCantidad(20);
		producto.setCantidad(4);
	}

}
