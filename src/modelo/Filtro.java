/*
 * En esta clase se definen los nombres de las columnas a las que se harán consultas de la base de datos.
 * Para el caso hay una llave primaria id que se irá autoincrementando, y luego están el resto de columnas visuales.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;

    //Se crean los constructores, vacíos o con parámetros que permitirán la inicialización del programa con ciertos valores predeterminados...
    
    public Filtro() {
    }

    public Filtro(int id, String codigo, String marca, int stock, boolean existencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }
    
    public Filtro(String codigo, String marca, int stock, boolean existencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }
    
    public Filtro(String marca, int stock, boolean existencia) {
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    //Se definen todos los métodos getter...
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public int getStock() {
        return stock;
    }

    public boolean getExistencia() {
        return existencia;
    }

    //Se definen todos los métodos setter...
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    
    
    
}
