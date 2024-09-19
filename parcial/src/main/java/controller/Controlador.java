package controller;

import model.Producto;
import service.ProductoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class Controlador {

    @Autowired
    private ProductoService service;

    @PostMapping
    public void addProducto(@RequestBody Producto producto) {
        service.addProducto(producto);
    }

    @PutMapping("/{cantidad}")
    public void actualizar(@PathVariable( "cantidad" ) int cantidad, @RequestBody Producto producto) {
    }

    @PatchMapping("/{nombre}/stock")
    public void updateStock(@PathVariable String nombre, @RequestParam int cantidad) {
        service.updateStock(nombre, cantidad);
    }
}
