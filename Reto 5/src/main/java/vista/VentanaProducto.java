package vista;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.TablaModelo;

/**
 *
 * @author desaextremo
 */
public class VentanaProducto extends javax.swing.JFrame {

    /**
     * Cconstructor de la clase VentanaProducto
     */
    public VentanaProducto() {
        initComponents();
        this.cajaCodigo.setEditable(false);
        this.setVisible(true);
    }

    /**
     * Asignar modelo de datos a la tabla
     *
     * @param productos
     */
    public void asigarModelo(List productos) {
        this.tablaDatos.setModel(new TablaModelo(productos));
    }

    /**
     * Accesor para el atributo cajaCodigo
     *
     * @return referencia al atributo cajaCodigo
     */
    public JTextField getCajaCodigo() {
        return cajaCodigo;
    }

    /**
     * Modificador para el atributo cajaCodigo
     *
     * @param cajaCodigo valor parametrico para asignar al atributo 'cajaCodigo'
     */
    public void setCajaCodigo(JTextField cajaCodigo) {
        this.cajaCodigo = cajaCodigo;
    }

    /**
     * Accesor para el atributo cajaNombre
     *
     * @return referencia al atributo cajaNombre
     */
    public JTextField getCajaNombre() {
        return cajaNombre;
    }

    /**
     * Modificador para el atributo cajaNombre
     *
     * @param cajaNombre valor parametrico para asignar al atributo 'cajaNombre'
     */
    public void setCajaNombre(JTextField cajaNombre) {
        this.cajaNombre = cajaNombre;
    }

    /**
     * Accesor para el atributo cajaPrecio
     *
     * @return referencia al atributo cajaPrecio
     */
    public JTextField getCajaPrecio() {
        return cajaPrecio;
    }

    /**
     * Modificador para el atributo cajaPrecio
     *
     * @param cajaPrecio valor parametrico para asignar al atributo 'cajaPrecio'
     */
    public void setCajaPrecio(JTextField cajaPrecio) {
        this.cajaPrecio = cajaPrecio;
    }

    /**
     * Accesor para el atributo cajaInventario
     *
     * @return referencia al atributo cajaInventario
     */
    public JTextField getCajaInventario() {
        return cajaInventario;
    }

    /**
     * Modificador para el atributo cajaInventario
     *
     * @param cajaInventario valor parametrico para asignar al atributo
     * 'cajaInventario'
     */
    public void setCajaInventario(JTextField cajaInventario) {
        this.cajaInventario = cajaInventario;
    }

    /**
     * Accesor para el atributo botonInformes
     *
     * @return referencia al atributo botonInformes
     */
    public JButton getBotonInformes() {
        return botonInformes;
    }

    /**
     * Modificador para el atributo botonInformes
     *
     * @param botonInformes valor parametrico para asignar al atributo
     * 'botonInformes'
     */
    public void setBotonInformes(JButton botonInformes) {
        this.botonInformes = botonInformes;
    }

    /**
     * Accesor para el atributo botonAgregarProducto
     *
     * @return referencia al atributo botonAgregarProducto
     */
    public JButton getBotonAgregarProducto() {
        return botonAgregarProducto;
    }

    /**
     * Modificador para el atributo botonAgregarProducto
     *
     * @param botonAgregarProducto valor parametrico para asignar al atributo
     * 'botonAgregarProducto'
     */
    public void setBotonAgregarProducto(JButton botonAgregarProducto) {
        this.botonAgregarProducto = botonAgregarProducto;
    }

    /**
     * Accesor para el atributo botonActualizarProducto
     *
     * @return referencia al atributo botonActualizarProducto
     */
    public JButton getBotonActualizarProducto() {
        return botonActualizarProducto;
    }

    /**
     * Modificador para el atributo botonActualizarProducto
     *
     * @param botonActualizarProducto valor parametrico para asignar al atributo
     * 'botonActualizarProducto'
     */
    public void setBotonActualizarProducto(JButton botonActualizarProducto) {
        this.botonActualizarProducto = botonActualizarProducto;
    }

    /**
     * Accesor para el atributo botonBorrarProducto
     *
     * @return referencia al atributo botonBorrarProducto
     */
    public JButton getBotonBorrarProducto() {
        return botonBorrarProducto;
    }

    /**
     * Modificador para el atributo botonBorrarProducto
     *
     * @param botonBorrarProducto valor parametrico para asignar al atributo
     * 'botonBorrarProducto'
     */
    public void setBotonBorrarProducto(JButton botonBorrarProducto) {
        this.botonBorrarProducto = botonBorrarProducto;
    }

    /**
     * Accesor para el atributo tablaDatos
     *
     * @return referencia al atributo tablaDatos
     */
    public JTable getTablaDatos() {
        return tablaDatos;
    }

    /**
     * Modificador para el atributo tablaDatos
     *
     * @param tablaDatos valor parametrico para asignar al atributo 'tablaDatos'
     */
    public void setTablaDatos(JTable tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        etiquetaCodigo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        botonAgregarProducto = new javax.swing.JButton();
        etiquetaPrecio = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        etiquetaInventario = new javax.swing.JLabel();
        cajaInventario = new javax.swing.JTextField();
        panelResultados = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        botonBorrarProducto = new javax.swing.JButton();
        botonActualizarProducto = new javax.swing.JButton();
        botonInformes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar Productos");

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto"));
        panelDatos.setForeground(new java.awt.Color(204, 204, 204));

        etiquetaCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaCodigo.setText("Código :");

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaNombre.setText("Nombre : ");

        botonAgregarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarProducto.setText("Agregar Producto");

        etiquetaPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaPrecio.setText("Precio : ");

        etiquetaInventario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaInventario.setText("Inventario :");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(botonAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiquetaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaInventario))))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodigo)
                    .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cajaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaInventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregarProducto)
                .addContainerGap())
        );

        panelDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cajaCodigo, cajaNombre, cajaPrecio});

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        panelResultados.setViewportView(tablaDatos);

        botonBorrarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrarProducto.setText("Borrar Producto");

        botonActualizarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarProducto.setText("Actualizar Producto");

        botonInformes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInformes.setText("Informes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelResultados)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(botonBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrarProducto)
                    .addComponent(botonActualizarProducto)
                    .addComponent(botonInformes))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarProducto;
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonBorrarProducto;
    private javax.swing.JButton botonInformes;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaInventario;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JLabel etiquetaCodigo;
    private javax.swing.JLabel etiquetaInventario;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JScrollPane panelResultados;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
