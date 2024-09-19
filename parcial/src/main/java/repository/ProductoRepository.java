package repository;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import model.Producto;
@Repository
public class ProductoRepository {
    private Map<String, Producto> productos = new HashMap<>();

    public void addProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    public void updateProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    public Producto getProducto(String nombre) {
        return productos.get(nombre);
    }
}
