package model;

import org.springframework.stereotype.Component;

@Component
public class LogAgent implements Agent{

    @Override
    public void update(Producto p) {
        System.out.println("Producto:" + p.getNombre() + " -> " + p.getCantidad() + " unidades disponibles");
    }
}
