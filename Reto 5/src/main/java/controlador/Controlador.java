package controlador;

import modelo.InformeProducto;
import modelo.Producto;
import modelo.ProductoRepositorio;
import modelo.TablaModelo;
import vista.ActualizarProducto;
import vista.VentanaProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Implementa la capa Controlador de la aplicación, se encarga de gestionar los
 * oyentes de eventos que ocurren sobre los componentes de la ventana
 * 'VentanaProducto' y dialogo 'ActualizarProducto'
 *
 * @author desaextremo
 */
public class Controlador implements ActionListener {

    /**
     * Para tener acceso a la ventana principal 'VentanaProducto', a sus
     * componentes y poder interactuar con estos
     */
    private VentanaProducto vista;

    /**
     * Para tener acceso al cuadro de dialogo encargado de permitir modificar
     * los datos del producto, a sus componentes y poder interactuar con estos
     */
    private ActualizarProducto dialogo;

    /**
     * Para tener acceso a la capa de Modelo 'ProductoRepositorio' y poder
     * gestionar operaciones Crud sobre la tabla 'productos'
     */
    private ProductoRepositorio modelo;

    /**
     * Para gestionar instancia de la clase Producto, y usarla en la operacione
     * Crud enviando parametros a los métods del Crud
     */
    private Producto producto;

    /**
     * Constructor de la clase Recibe referencia a objetos para inicializar sus
     * atributos de relacion
     *
     * @param vista referencia a la capa de vista
     * @param modelo
     */
    public Controlador(VentanaProducto vista, ProductoRepositorio modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.dialogo = new ActualizarProducto(vista, true);
        this.producto = null;
        agregarOyentesventos();
        this.vista.getCajaNombre().requestFocus();
    }

    /**
     * Accesor para el atributo vista
     *
     * @return referencia a la vista
     */
    public VentanaProducto getVista() {
        return vista;
    }

    /**
     * Registra oyentes de eventos para los controles o componentes de la capa
     * de vista ventana 'VentanaProducto'
     */
    private void agregarOyentesventos() {
        vista.getBotonActualizarProducto().addActionListener(this);
        vista.getBotonAgregarProducto().addActionListener(this);
        vista.getBotonBorrarProducto().addActionListener(this);
        vista.getBotonInformes().addActionListener(this);
        vista.getTablaDatos().addMouseListener(new MouseAdapter() {
            /*
			Provienen de MouseListener y se utilizan para gestionar eventos de clic
			sobre la tabla de datos o JTable
             */
            public void mouseClicked(MouseEvent e) {
                //que se permita la selección de la fila
                vista.getTablaDatos().setRowSelectionAllowed(true);
                //obtengo un producto a partir de la fila seleccionada
                producto = ((TablaModelo) vista.getTablaDatos().getModel()).detalle(vista.getTablaDatos().getSelectedRow());
            }
        });
    }

    /**
     * Metodo privado encargado de limpiar variables y texto en las cajas de
     * texto
     */
    private void limpiarCampos() {
        vista.getCajaCodigo().setText("");
        vista.getCajaNombre().setText("");
        vista.getCajaPrecio().setText("");
        vista.getCajaInventario().setText("");
        vista.getCajaNombre().requestFocus();
        producto = null;
        vista.getTablaDatos().setRowSelectionAllowed(false);
    }

    /**
     * Se ejecuta cuando se hace clic sobre el botón 'botonActualizarProducto'
     */
    private void actualizarProducto() {
        boolean estado = true;
        long codigo = 0;
        String nombre = null;
        double precio = 0.0;
        long inventario = 0;

        if (producto == null) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un producto", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        } else {

            //si no se presento error
            if (estado) {
                dialogo = new ActualizarProducto(vista, true);
                //registra oyyentes de eventos sobre el cuadro de dialogo
                agregarOyentesEventosDialogo();
                dialogo.getCajaCodigo().setText(String.valueOf(producto.getCodigo()));
                dialogo.getCajaNombre().setText(producto.getNombre());
                dialogo.getCajaPrecio().setText(String.valueOf(producto.getPrecio()));
                dialogo.getCajaInventario().setText(String.valueOf(producto.getInventario()));
                dialogo.setLocationRelativeTo(vista);
                dialogo.setVisible(true);

                //lee los datos ingerados en el cuadro de dialogo
                codigo = Integer.parseInt(dialogo.getCajaCodigo().getText());
                nombre = dialogo.getCajaNombre().getText();
                precio = Double.parseDouble(dialogo.getCajaPrecio().getText());
                inventario = Integer.parseInt(dialogo.getCajaInventario().getText());

                //valida si el dialogo '' se cerro correctamente y no desde el botón X
                if (dialogo.getCerroVentana()) {
                    JOptionPane.showMessageDialog(vista, "El usuario cerro el dialogo haciendo clic en el icono 'X'", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
                } else {
                    producto = new Producto();
                    producto = modelo.findById(codigo).get();
                    producto.setNombre(nombre);
                    producto.setPrecio(precio);
                    producto.setInventario(inventario);

                    modelo.save(producto);
                    JOptionPane.showMessageDialog(vista, "Producto registrado correctamente\n" + producto.toString(), "Actualizar Producto", JOptionPane.INFORMATION_MESSAGE);
                    vista.asigarModelo((List<Producto>) modelo.findAll());
                    limpiarCampos();
                }
            }
        }
        producto = null;
    }

    /**
     * Se ejecuta cuando se hace clic sobre el botón 'botonAgregarProducto'
     */
    private void agregarProducto() {
        boolean estado = true;
        String nombre = null;
        double precio = 0.0;
        long inventario = 0;
        String ciudad = null;

        //obtener datos de la longerfaz, convertir datos
        try {
            nombre = vista.getCajaNombre().getText();
            precio = Double.parseDouble(vista.getCajaPrecio().getText());
            inventario = Integer.parseInt(vista.getCajaInventario().getText());

            if (nombre.equals("") || (nombre.trim().length() == 0)) {
                JOptionPane.showMessageDialog(vista, "Debe ingresar un valor para el campo Nombre", "Ingresar Producto", JOptionPane.ERROR_MESSAGE);
                vista.getCajaNombre().requestFocus();
                estado = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un valor numérico para los campos Código, Precio e inventario", "Ingresar Producto", JOptionPane.ERROR_MESSAGE);
            vista.getCajaPrecio().requestFocus();
            estado = false;
        }

        //si no se presento error
        if (estado) {
            producto = new Producto();

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setInventario(inventario);

            modelo.save(producto);
            JOptionPane.showMessageDialog(vista, "Producto registrado correctamente\n" + producto.toString(), "Ingresar Producto", JOptionPane.INFORMATION_MESSAGE);
            vista.asigarModelo((List<Producto>) modelo.findAll());
            limpiarCampos();
        }
        producto = null;
    }

    /**
     * Se ejecuta cuando se hace clic sobre el botón 'botonBorrarProducto'
     */
    private void borrarProducto() {
        if (producto == null) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un producto", "Eliminar Producto", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        } else {
            long valorRetorno = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el producto: " + producto.toString(), "Eliminar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (valorRetorno == JOptionPane.YES_OPTION) {
                modelo.delete(producto);
                JOptionPane.showMessageDialog(vista, "Producto eliminado correctamente\n" + producto.toString(), "Eliminar Producto", JOptionPane.INFORMATION_MESSAGE);
                vista.asigarModelo((List<Producto>) modelo.findAll());
            } else {
                JOptionPane.showMessageDialog(vista, "El usuario selecciono cancelar", "Eliminar Producto", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        limpiarCampos();
        producto = null;
    }

    /**
     * Para la generación de informes
     */
    private void generarInforme() {
        List<Producto> productos = (List<Producto>) modelo.findAll();

        if (productos.size() > 0) {
            String productoPrecioMayor = InformeProducto.productoMayorPrecio(productos);
            String productoPrecioMenor = InformeProducto.productoMenorPrecio(productos);
            double promedioPrecios = InformeProducto.promedioPrecios(productos);
            double valorInventario = InformeProducto.valorInventario(productos);

            String datosInforme = "Producto precio mayor: " + productoPrecioMayor + "\nProducto precio menor: " + productoPrecioMenor + "\nPromedio de precios: " + String.format("%.1f", promedioPrecios) + "\nValor del inventario: " + String.format("%.1f", valorInventario);
            JOptionPane.showMessageDialog(vista, datosInforme, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Se ejecuta cuando se hace clic sobre el botón 'botonActualizar' del
     * Cuadro de dialogo 'ActualizarProducto'.
     *
     * Se encarga de validar los datos y cerrar el dialogo, una vez superadas
     * las valdiaciones
     */
    private void validarDatosDialogo() {
        boolean estado = false;
        long codigo = 0;
        String nombre = null;
        double precio = 0.0;
        long inventario = 0;

        //obtener datos de la longerfaz, convertir datos
        try {
            codigo = Integer.parseInt(dialogo.getCajaCodigo().getText());
            nombre = dialogo.getCajaNombre().getText();
            precio = Double.parseDouble(dialogo.getCajaPrecio().getText());
            inventario = Integer.parseInt(dialogo.getCajaInventario().getText());

            if (nombre.equals("") || (nombre.trim().length() == 0)) {
                JOptionPane.showMessageDialog(vista, "Debe ingresar un valor para el campo Nombre", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
                dialogo.getCajaNombre().requestFocus();
                estado = false;
            } else {
                estado = true;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un valor numérico para los campos Código, Precio e inventario", "Actualizar Producto", JOptionPane.ERROR_MESSAGE);
            vista.getCajaCodigo().requestFocus();
            estado = false;
        }

        //cierra el dialogo, una vez superadas las validaciones
        if (estado) {
            dialogo.dispose();
            dialogo.setVisible(false);
        }
    }

    /**
     * Registra oyentes de eventos para los controles o componentes de la capa
     * de vista dialogo 'ActualizarProducto'
     */
    public void agregarOyentesEventosDialogo() {
        /**
         * Controla el evento de cierre de ventana, utiliza una clase
         * WindowAdapter para no implementar la totalidad de los métodos
         * definidos en la interfaz WindowListener
         */
        dialogo.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dialogo.setCerroVentana(true);
                limpiarCampos();
            }
        });
        dialogo.getBotonActualizar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBotonActualizarProducto()) {
            actualizarProducto();
        } else if (e.getSource() == vista.getBotonAgregarProducto()) {
            agregarProducto();
        } else if (e.getSource() == vista.getBotonBorrarProducto()) {
            borrarProducto();
        } else if (e.getSource() == vista.getBotonInformes()) {
            generarInforme();
        } else if (e.getSource() == dialogo.getBotonActualizar()) {
            validarDatosDialogo();
        }
    }
}
