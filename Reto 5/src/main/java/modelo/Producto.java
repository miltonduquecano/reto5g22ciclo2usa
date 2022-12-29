package modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Esta clase representa a un registro de la tabla producto, cuenta con las debidas anotaciones para relaciona
 * a la tabla productos con la clase Producto, asi como a cada una de las columnas de la tabla 'productos' con
 * los atributos de la clase 'Producto'. Esto se conoce como mapeo objeto/relacional
 * @author desaextremo
 */
@Table("productos")
public class Producto {
    //Atributos
    @Id
    @Column("codigo")
    private Long codigo;
    @Column("nombre")
    private String nombre;
    @Column("precio")
    private double precio;
    @Column("inventario")
    private Long inventario;

    //get + set: 8 metodos publicos get/set
    
    /**
     * Accesor para el atributo codigo
     * @return referencia al atributo codigo
     */
    public Long getCodigo() {
        return codigo;
    }
    
    /**
     * Modificador para el atributo codigo
     * @param codigo valor parametrico para asignar al atributo 'codigo'
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Accesor para el atributo nombre
     * @return referencia al atributo nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Modificador para el atributo nombre
     * @param codigo valor parametrico para asignar al atributo 'nombre'
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Accesor para el atributo precio
     * @return referencia al atributo precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Modificador para el atributo precio
     * @param codigo valor parametrico para asignar al atributo 'precio'
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Accesor para el atributo inventario
     * @return referencia al atributo inventario
     */
    public Long getInventario() {
        return inventario;
    }
    
    /**
     * Modificador para el atributo inventario
     * @param codigo valor parametrico para asignar al atributo 'inventario'
     */
    public void setInventario(Long inventario) {
        this.inventario = inventario;
    }

    //Constructores
    //constructor x defecto
    public Producto() {
    }
    
    /**
     * Constructor sobrecargado
     * @param codigo valor parametrico para asignar al atributo 'codigo'
     * @param nombre valor parametrico para asignar al atributo 'nombre'
     * @param precio valor parametrico para asignar al atributo 'precio'
     * @param inventario  valor parametrico para asignar al atributo 'inventario'
     */
    public Producto(Long codigo, String nombre, double precio, Long inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    @Override
    /**
     * Sobrecargado de la superclase Object para imprimit el estado del objeto
     */
    public String toString() {
        return this.codigo + " " + this.nombre + " " + this.precio + " " + this.inventario; 
    }
}
