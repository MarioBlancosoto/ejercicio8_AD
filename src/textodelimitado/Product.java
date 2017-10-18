
package textodelimitado;

import java.text.NumberFormat;
import java.util.Locale;


public class Product {
    private String codigo;
    private String descripcion;
    private double prezo;

    public Product() {
        String codigo = null;
        String descripcion =null;
        float prezo =0;
    }

    public Product(String codigo, String descripcion, double prezo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Product{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", prezo=" + NumberFormat.getCurrencyInstance().format(prezo) + '}';
    }
    
    
    
    
}
