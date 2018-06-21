/*
 * El objetivo de la interfaz será para establecer los métodos para insertar, eliminar, buscar y actualizar.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author LN710Q
 */
public interface metodos <Generic>{
    public boolean create(Generic g);
    public boolean delete (Object key);
    public boolean update (Generic c);
    
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
    
}
