package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/techstock";
    String usuario = "root";
    String contra = "root";

    /**
     * Establece una conexión con la base de datos.
     *
     * @return una instancia de Connection que representa la conexión
     * establecida.
     */
    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contra);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("NO SE PUDO CONECTAR");
        }
        return con;
    }
}
