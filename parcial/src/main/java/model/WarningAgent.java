package model;

public class WarningAgent implements Agent{

    @Override
    public void update(Producto p) {
        if(p.getCantidad()<5) {
            System.out.println("ALERTA!!! El stock del Producto: " + p.getNombre() + " es muy bajo, solo quedan " + p.getCantidad() + " unidades.");
        }
    }
}