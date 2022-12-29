package modelo;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 * Esta clase representa al modelo que se utiliza sobre un componente JTable.
 * componente como JTble, Jlist y otros , tienen tanto nivel de complejidad que
 * requieren de una clase modelo
 * @author desaextremo
 */
public class TablaModelo extends AbstractTableModel  {
    
    private String[] columnas = {"Codigo", "Nombre", "Precio","Inventario"};
    private List<Producto> producto=new ArrayList<>();

    public TablaModelo(List<Producto> prod) {
        this.producto=prod;
    }   

    @Override
    public int getRowCount() {
        return this.producto.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resp = null;
        
        switch(columna){
            case 0:
                resp=this.producto.get(fila).getCodigo();
                break;
            case 1:
                resp=this.producto.get(fila).getNombre();
                break;
            case 2: 
                resp=this.producto.get(fila).getPrecio();
                break;
            case 3: 
                resp=this.producto.get(fila).getInventario();
                break;
        }
        return resp;
    }
    
    public String getColumnName(int colum){
        return this.columnas[colum];
    }
    
    public void actualizarTabla(){
        fireTableDataChanged();
    }
    
    public Producto detalle(int fila){
        return this.producto.get(fila);
    }
}
