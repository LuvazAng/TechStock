package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    /**
     * Actualiza el stock de un producto en la base de datos.
     *
     * @param cant la nueva cantidad de stock del producto.
     * @param idp el ID del producto a actualizar.
     * @return el resultado de la operación, representado como un entero.
     */
    public int actualizarStock(int cant, int idp) {
        String sql = "update productos set STOCK=? where ID_PRODUCTO=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    /**
     * Obtiene los datos de un producto según su ID.
     *
     * @param idProducto el ID del producto a buscar.
     * @return un objeto Producto con los datos del producto encontrado.
     */
    public Producto listarID(int idProducto) {
        Producto p = new Producto();
        String sql = "SELECT * from productos WHERE ID_PRODUCTO = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getString(3));
                p.setDescrpcion(rs.getString(4));
                p.setStock(rs.getInt(5));
            }

        } catch (Exception e) {

        }
        return p;
    }

    /**
     * Obtiene una lista de todos los productos almacenados en la base de datos.
     *
     * @return una lista de objetos Producto con los datos de los productos.
     */
    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getString(3));
                p.setDescrpcion(rs.getString(4));
                p.setStock(rs.getInt(5));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN LISTAR LOS DATOS EN LA TABLA");
        }
        return lista;
    }

    /**
     * Agrega un nuevo producto a la base de datos.
     *
     * @param o un arreglo de objetos que contiene los datos del producto a
     * agregar.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO productos (ID_PRODUCTO, NOMBRE, PRECIO, DESCRIPCION, STOCK)"
                + "VALUES(?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUEDEN INGRESAR DATOS");
        }
        return r;
    }

    /**
     * Actualiza los datos de un producto existente en la base de datos.
     *
     * @param o un arreglo de objetos que contiene los nuevos datos del
     * producto.
     * @return el resultado de la operación, representado como un entero.
     */
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE productos SET ID_PRODUCTO= ?, NOMBRE = ?, PRECIO = ?, DESCRIPCION = ?, STOCK = ? WHERE ID_PRODUCTO = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("NO SE PUDIERON ACTUALIZAR LOS DATOS");
        }
        return r;
    }

    /**
     * Elimina un producto de la base de datos según su ID.
     *
     * @param id el ID del producto a eliminar.
     */
    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE ID_PRODUCTO = ?";
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
