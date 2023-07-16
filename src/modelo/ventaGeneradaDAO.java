package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ventaGeneradaDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Obtiene una lista de todas las ventas generadas.
     *
     * @return la lista de ventas generadas.
     */
    public List listar() {
        List<ventaGenerada> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ventaGenerada vg = new ventaGenerada();
                vg.setId_ventas(rs.getInt(1));
                vg.setId_cliente(rs.getInt(2));
                vg.setId_vendedor(rs.getInt(3));
                vg.setNum_venta(rs.getString(4));
                vg.setFecha(rs.getString(5));
                vg.setMonto(rs.getInt(6));

                lista.add(vg);
            }

        } catch (SQLException e) {
            System.out.println("NO SE PUEDEN LISTAR LOS DATOS EN LA TABLA");
        }
        return lista;
    }

    /**
     * Obtiene una lista de ventas generadas filtradas por año.
     *
     * @param year el año para filtrar las ventas generadas.
     * @return la lista de ventas generadas filtradas por año.
     */
    public List listarAño(String year) {
        List<ventaGenerada> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas WHERE YEAR(FECHA_VENTA) = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                ventaGenerada vg = new ventaGenerada();
                vg.setId_ventas(rs.getInt(1));
                vg.setId_cliente(rs.getInt(2));
                vg.setId_vendedor(rs.getInt(3));
                vg.setNum_venta(rs.getString(4));
                vg.setFecha(rs.getString(5));
                vg.setMonto(rs.getInt(6));

                lista.add(vg);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS CON ESOS PARAMETROS");
        }
        return lista;
    }

    /**
     * Obtiene una lista de ventas generadas filtradas por mes.
     *
     * @param month el mes para filtrar las ventas generadas.
     * @return la lista de ventas generadas filtradas por mes.
     */
    public List listarMonth(int month) {
        List<ventaGenerada> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas WHERE MONTH(FECHA_VENTA) = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, month);
            rs = ps.executeQuery();
            while (rs.next()) {
                ventaGenerada vg = new ventaGenerada();
                vg.setId_ventas(rs.getInt(1));
                vg.setId_cliente(rs.getInt(2));
                vg.setId_vendedor(rs.getInt(3));
                vg.setNum_venta(rs.getString(4));
                vg.setFecha(rs.getString(5));
                vg.setMonto(rs.getInt(6));

                lista.add(vg);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS CON ESOS PARAMETROS");
        }
        return lista;
    }

    /**
     * Obtiene una lista de ventas generadas filtradas por día.
     *
     * @param day el día para filtrar las ventas generadas.
     * @return la lista de ventas generadas filtradas por día.
     */
    public List listarDay(String day) {
        List<ventaGenerada> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas WHERE DAY(FECHA_VENTA) = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, day);
            rs = ps.executeQuery();
            while (rs.next()) {
                ventaGenerada vg = new ventaGenerada();
                vg.setId_ventas(rs.getInt(1));
                vg.setId_cliente(rs.getInt(2));
                vg.setId_vendedor(rs.getInt(3));
                vg.setNum_venta(rs.getString(4));
                vg.setFecha(rs.getString(5));
                vg.setMonto(rs.getInt(6));

                lista.add(vg);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS CON ESOS PARAMETROS");
        }
        return lista;
    }

    /**
     * Obtiene una lista de ventas generadas filtradas por una fecha exacta.
     *
     * @param year el año de la fecha.
     * @param month el mes de la fecha.
     * @param day el día de la fecha.
     * @return la lista de ventas generadas filtradas por la fecha exacta.
     */
    public List listarFechaExacta(String year, int month, String day) {
        String fecha = year + "-" + month + "-" + day;
        List<ventaGenerada> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas WHERE DATE(FECHA_VENTA) = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
            rs = ps.executeQuery();
            while (rs.next()) {
                ventaGenerada vg = new ventaGenerada();
                vg.setId_ventas(rs.getInt(1));
                vg.setId_cliente(rs.getInt(2));
                vg.setId_vendedor(rs.getInt(3));
                vg.setNum_venta(rs.getString(4));
                vg.setFecha(rs.getString(5));
                vg.setMonto(rs.getInt(6));

                lista.add(vg);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS CON ESOS PARAMETROS");
        }
        return lista;
    }
}
