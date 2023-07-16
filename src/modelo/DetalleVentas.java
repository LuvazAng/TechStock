package modelo;

public class DetalleVentas {

    int id;
    int idVentas;
    int idProducto;
    int cantidad;
    double preVenta;

    /**
     * Constructor vacío de la clase DetalleVentas.
     */
    public DetalleVentas() {
    }

    /**
     * Constructor de la clase DetalleVentas.
     *
     * @param id el identificador del detalle de ventas.
     * @param idVentas el identificador de la venta asociada al detalle.
     * @param idProducto el identificador del producto vendido.
     * @param cantidad la cantidad de productos vendidos.
     * @param preVenta el precio de venta del producto.
     */
    public DetalleVentas(int id, int idVentas, int idProducto, int cantidad, double preVenta) {
        this.id = id;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.preVenta = preVenta;
    }

    /**
     * Obtiene el identificador del detalle de ventas.
     *
     * @return el identificador del detalle de ventas.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del detalle de ventas.
     *
     * @param id el identificador del detalle de ventas.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el identificador de la venta asociada al detalle.
     *
     * @return el identificador de la venta.
     */
    public int getIdVentas() {
        return idVentas;
    }

    /**
     * Establece el identificador de la venta asociada al detalle.
     *
     * @param idVentas el identificador de la venta.
     */
    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    /**
     * Obtiene el identificador del producto vendido.
     *
     * @return el identificador del producto vendido.
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el identificador del producto vendido.
     *
     * @param idProducto el identificador del producto vendido.
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene la cantidad de productos vendidos.
     *
     * @return la cantidad de productos vendidos.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos vendidos.
     *
     * @param cantidad la cantidad de productos vendidos.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio de venta del producto.
     *
     * @return el precio de venta del producto.
     */
    public double getPreVenta() {
        return preVenta;
    }

    /**
     * Establece el precio de venta del producto.
     *
     * @param preVenta el precio de venta del producto.
     */
    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }

}
