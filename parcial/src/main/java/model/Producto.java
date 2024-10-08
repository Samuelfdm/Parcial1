package model;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Producto {
    private List<Agent> agents = new ArrayList<>();
    private String nombre;
    private double precio;
    private int cantidad;
    private String categoria;

    public Producto(String nombre, double precio, int cantidad, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public void addAgent(Agent agent) {
        this.agents.add(agent);
    }

    public void removeAgent(Agent agent) {
        this.agents.remove(agent);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
        for (Agent agent : this.agents) {
            agent.update(this);
        }
    }

    public List<Agent> getAgents() {
        return agents;
    }
}
