package modelo;

import java.util.List;

/**
 * Clase con métodos de utilidad para generar informes sobre los productor
 *
 * @author desaextremo
 */
public class InformeProducto {

    /**
     * calcula el promedio de precios recorriendo la lista de productos y
     * acumulando la sumatoria de los precios, posteriormente de divide esa
     * cantidad entre el total de productos
     *
     * @param productos referencia a lista de productos
     * @return
     */
    public static double promedioPrecios(List<Producto> productos) {
        double promedio = 0.0;

        for (Producto producto : productos) {
            promedio += producto.getPrecio();
        }
        promedio = promedio / productos.size();
        return promedio;
    }

    /**
     * Retorna el valor del inventario total inventario total: sumatoria precio
     * * cantidd del producto Recorre la coleccion realizando la suma de precio
     * * cantidd del producto
     */
    public static double valorInventario(List<Producto> productos) {
        double inventarioTotal = 0.0;

        for (Producto producto : productos) {
            inventarioTotal += producto.getPrecio() * producto.getInventario();
        }

        return inventarioTotal;
    }

    /**
     * recorre la coleccion comparando el precio de los productos para obtener
     * el de mayor precio
     *
     * @return nombre del producto con mayor precio
     */
    public static String productoMayorPrecio(List<Producto> productos) {
        //almaceno el nombre y precio del primer producto
        String nombreProducto = productos.get(0).getNombre();
        double precioProducto = productos.get(0).getPrecio();

        for (Producto producto : productos) {
            if (producto.getPrecio() > precioProducto) {
                nombreProducto = producto.getNombre();
                precioProducto = producto.getPrecio();
            }
        }

        return nombreProducto;
    }

    /**
     * recorre la coleccion comparando el precio de los productos para obtener
     * el de menor precio
     *
     * @return nombre del producto con menor precio
     */
    public static String productoMenorPrecio(List<Producto> productos) {
        //almaceno el nombre y precio del primer producto
        String nombreProducto = productos.get(0).getNombre();
        double precioProducto = productos.get(0).getPrecio();

        for (Producto producto : productos) {
            if (producto.getPrecio() < precioProducto) {
                nombreProducto = producto.getNombre();
                precioProducto = producto.getPrecio();
            }
        }

        return nombreProducto;
    }
}
