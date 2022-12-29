package modelo;

import org.springframework.data.repository.CrudRepository;

/**
 * Interfaz para hacer uso de los métodos definidos en la interfaz 'CrudRepository', y poder administrar
 * instancias u objetos de tipo 'Producto'
 * @author desaextremo
 */
public interface ProductoRepositorio extends CrudRepository<Producto, Long>{
    
}
