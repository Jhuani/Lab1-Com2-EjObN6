
package Lab1BCom2EjO6;

/**
 *
 * @author juani
 */
public class Productos implements Comparable<Productos> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Rubro categoria;

    public Productos() {
        
        this.codigo = 0; 
        this.descripcion = "";
        this.precio = 0.0; 
        this.stock = 0; 
        this.categoria = null; 
    }
    
    public Productos(int codigo, String descripcion, double precio, int stock, Rubro categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getCategoria() {
        return categoria;
    }

    public void setCategoria(Rubro categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Productos t) {
        if (codigo == t.codigo){
            return 0;
        }else if(codigo > t.codigo){
            return 1;
        }else{
            return -1;
        }
    }

    void setCategoria(String r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
