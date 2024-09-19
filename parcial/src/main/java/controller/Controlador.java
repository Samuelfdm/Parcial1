package controller;

import model.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parcial")
public class Controlador {

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return producto;
    }

    @PutMapping("/{cantidad}")
    public void actualizar(@PathVariable( "cantidad" ) int cantidad, @RequestBody Producto producto) {
    }
}
