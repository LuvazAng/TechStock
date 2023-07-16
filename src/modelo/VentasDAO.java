package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentasDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    /**
     * Obtiene el último número de serie de ventas registrado en la base de
     * datos.
     *
     * @return el último número de serie de ventas.
     */
    public String NroSerieVentas() {
        String serie = "";
        String sql = "select max(NUMERO_VENTA) from ventas";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return serie;
    }

    /**
     * Obtiene el último identificador de ventas registrado en la base de datos.
     *
     * @return el último identificador de ventas.
     */
    public String IdVentas() {
        String idv = "";
        String sql = "select max(ID_VENTAS) from ventas";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idv = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idv;
    }

    /**
     * Guarda una venta en la base de datos.
     *
     * @param v el objeto de tipo Ventas que representa la venta a guardar.
     * @return el número de filas afectadas por la operación de inserción.
     */
    public int GuardarVentas(Ventas v) {
        Ventas ventas = new Ventas();
        String sql = "insert into ventas(ID_CLIENTE,ID_VENDEDOR,NUMERO_VENTA,FECHA_VENTA,MONTO)values(?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    /**
     * Guarda un detalle de venta en la base de datos.
     *
     * @param dv el objeto de tipo DetalleVentas que representa el detalle de
     * venta a guardar.
     * @return el número de filas afectadas por la operación de inserción.
     */
    public int GuardarDetalleVentas(DetalleVentas dv) {
        String sql = "insert into detalles_venta(ID_VENTAS,ID_PRODUCTO,CANTIDAD,PRECIO_VENTA)values(?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPreVenta());
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
