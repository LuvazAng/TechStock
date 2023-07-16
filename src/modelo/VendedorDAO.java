package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vistas.VentasForm;

public class VendedorDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;

    Vendedor ev = new Vendedor();
    Conexion con = new Conexion();
    Connection acceso;

    /**
     * Valida las credenciales de un vendedor.
     *
     * @param clave la contraseña del vendedor.
     * @param usuario el nombre de usuario del vendedor.
     * @return un objeto Vendedor con los datos del vendedor validado, o null si
     * las credenciales son incorrectas.
     */
    public Vendedor validarVendedor(String clave, String usuario) {
        String sql = "SELECT * FROM vendedor WHERE CLAVE = ? and usuario = ?";

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, clave);
            ps.setString(2, usuario);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setNombre(rs.getString(2));
                ev.setApaterno(rs.getString(3));
                ev.setAmaterno(rs.getString(4));
                ev.setTel(rs.getString(5));
                ev.setUsuario(rs.getString(6));
                ev.setClave(rs.getString(7));
            }
        } catch (Exception e) {
            System.out.println("NO SE VALIDAR LOS DATOS");
        }
        return ev;
    }

    /**
     * Obtiene una lista de todos los vendedores almacenados en la base de
     * datos.
     *
     * @return una lista de objetos Vendedor con los datos de los vendedores.
     */
    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setId(rs.getInt(1));
                v.setNombre(rs.getString(2));
                v.setApaterno(rs.getString(3));
                v.setAmaterno(rs.getString(4));
                v.setTel(rs.getString(5));
                v.setUsuario(rs.getString(6));
                v.setClave(rs.getString(7));
                lista.add(v);
            }
        } catch (Exception e) {
            System.out.println("NO SE PUDIERON LISTAR LOS DATOS");
        }
        return lista;
    }

    /**
     * Agrega un nuevo vendedor a la base de datos.
     *
     * @param o un arreglo de objetos que contiene los datos del vendedor a
     * agregar.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO vendedor (ID_VENDEDOR, NOMBRE, APELLIDO_P, APELLIDO_M, TELEFONO, USUARIO, CLAVE) VALUES(?,?,?,?,?,?,?)";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN INGRESAR DATOS");
        }
        return r;
    }

    /**
     * Actualiza los datos de un vendedor existente en la base de datos.
     *
     * @param o un arreglo de objetos que contiene los nuevos datos del
     * vendedor.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE vendedor SET ID_VENDEDOR = ?, NOMBRE = ?, APELLIDO_P = ?, APELLIDO_M = ?, TELEFONO = ?, USUARIO = ?, CLAVE = ? WHERE ID_VENDEDOR = ?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUDIERON ACTUALIZAR LOS DATOS");
        }
        return r;
    }

    /**
     * Elimina un vendedor de la base de datos según su ID.
     *
     * @param id el ID del vendedor a eliminar.
     */
    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM vendedor where ID_VENDEDOR = ?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN ELIMINAR LOS DATOS");
        }
    }

}
