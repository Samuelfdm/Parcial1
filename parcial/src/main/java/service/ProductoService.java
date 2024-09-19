package service;
import model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public void addProducto(Producto producto) {
        repository.addProducto(producto);
    }

    public void updateStock(String nombre, int cantidad) {
        Producto producto = repository.getProducto(nombre);
        if (producto != null) {
            producto.setCantidad(cantidad); // AQUI INICIA EL PROCESO DE LOS STDOUTS
            repository.updateProducto(producto);
        }
    }
}
