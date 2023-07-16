package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Obtiene los datos de un cliente según su ID.
     *
     * @param idCliente el ID del cliente a buscar.
     * @return un objeto Cliente con los datos del cliente encontrado.
     */
    public Cliente listarID(int idCliente) {
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE ID_CLIENTE = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDireccion(rs.getString(3));
                c.setTelefono(rs.getString(4));
            }

        } catch (Exception e) {

        }
        return c;
    }

    /**
     * Obtiene una lista de todos los clientes almacenados en la base de datos.
     *
     * @return una lista de objetos Cliente con los datos de los clientes.
     */
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDireccion(rs.getString(3));
                c.setTelefono(rs.getString(4));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN LISTAR LOS DATOS EN LA TABLA");
        }
        return lista;
    }

    /**
     * Agrega un nuevo cliente a la base de datos.
     *
     * @param o un arreglo de objetos que contiene los datos del cliente a
     * agregar.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into cliente (ID_CLIENTE, NOMBRE, DIRECCION, TELEFONO)"
                + "VALUES(?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN INGRESAR DATOS");
        }
        return r;
    }

    /**
     * Actualiza los datos de un cliente existente en la base de datos.
     *
     * @param o un arreglo de objetos que contiene los nuevos datos del cliente.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update cliente set ID_CLIENTE = ?, NOMBRE = ?, DIRECCION = ?, TELEFONO = ? WHERE ID_CLIENTE = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUDIERON ACTUALIZAR LOS DATOS");
        }
        return r;
    }

    /**
     * Elimina un cliente de la base de datos según su ID.
     *
     * @param id el ID del cliente a eliminar.
     */
    @Override
    public void eliminar(int id) {
        String sql = "delete from cliente where ID_CLIENTE = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN ELIMINAR LOS DATOS");
        }
    }
}
