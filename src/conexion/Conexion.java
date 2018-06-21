/*
 * En esta clase estáran los métodos para establecer la conexión con la base de datos;
 * Referente a los parámetros que recibe DriverManager.getConnection():
	Url: Es el lugar donde está alojado nuestra base de datos, esta se escribe de la siguiente forma: jdbc:mysql://server/nombre_bd, en donde server es la dirección ip o hostname del servidor.
	User: Usuario de la bd.
	Pass: Es la contraseña del usuario de User.
 */
package conexion;

import com.mysql.jdbc.Connection;
//import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import sun.util.logging.PlatformLogger;

/**
 *
 * @author LN710Q
 */
public class Conexion {

    private String user, pass, driver, url;

    private Connection cnx; //Variable de tipo connection para recibir el objeto connection...

    public static Conexion instance;

    public synchronized static Conexion conectar() {
        if (instance == null) {
            return new Conexion();
        }
        return instance;
    }

    private Conexion() {
        cargarCredenciales();

        try {

            //Class.forName(“Driver”): Nos permite abrir un canal para poder establecer la comunicación con la base de datos.
            Class.forName(this.driver);
            //DriverManager.getConnection (): Devuelve un objeto Connection, el cual representa la conexión física a la base de datos.
            //Vamos a castear al tipo "connection" el valor de vuelto solo por cualquier cosa, que se almacenará en una variable que es de tipo connection...
            cnx = (Connection) DriverManager.getConnection(this.url, this.user, this.pass); //Estos son los parámetros que recibe.
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCredenciales() {
        user = "root"; //Usarios por default
        pass = ""; //Constraseña default
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost/filtros"; //Al final de la última pleca irá el nombre de la base de datos que queremos llamar.
    }

    public Connection getCnx() {
        return cnx;
    }

    public void cerrarConexion() {
        instance = null;
    }

} //Fin de la clase conexión.
