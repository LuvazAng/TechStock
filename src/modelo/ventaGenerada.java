package modelo;

public class ventaGenerada {

    int id_ventas;
    int id_cliente;
    int id_vendedor;
    String num_venta;
    String fecha;
    double monto;

    /**
     * Constructor vacío de la clase ventaGenerada.
     */
    public ventaGenerada() {
    }

    /**
     * Constructor de la clase ventaGenerada.
     *
     * @param id_ventas el identificador de las ventas generadas.
     * @param id_cliente el identificador del cliente asociado a las ventas
     * generadas.
     * @param id_vendedor el identificador del vendedor asociado a las ventas
     * generadas.
     * @param num_venta el número de venta.
     * @param fecha la fecha de la venta generada.
     * @param monto el monto de la venta generada.
     */
    public ventaGenerada(int id_ventas, int id_cliente, int id_vendedor, String num_venta, String fecha, double monto) {
        this.id_ventas = id_ventas;
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.num_venta = num_venta;
        this.fecha = fecha;
        this.monto = monto;
    }

    /**
     * Obtiene el identificador de las ventas generadas.
     *
     * @return el identificador de las ventas generadas.
     */
    public int getId_ventas() {
        return id_ventas;
    }

    /**
     * Establece el identificador de las ventas generadas.
     *
     * @param id_ventas el identificador de las ventas generadas.
     */
    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    /**
     * Obtiene el identificador del cliente asociado a las ventas generadas.
     *
     * @return el identificador del cliente asociado a las ventas generadas.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el identificador del cliente asociado a las ventas generadas.
     *
     * @param id_cliente el identificador del cliente asociado a las ventas
     * generadas.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Obtiene el identificador del vendedor asociado a las ventas generadas.
     *
     * @return el identificador del vendedor asociado a las ventas generadas.
     */
    public int getId_vendedor() {
        return id_vendedor;
    }

    /**
     * Establece el identificador del vendedor asociado a las ventas generadas.
     *
     * @param id_vendedor el identificador del vendedor asociado a las ventas
     * generadas.
     */
    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    /**
     * Obtiene el número de venta.
     *
     * @return el número de venta.
     */
    public String getNum_venta() {
        return num_venta;
    }

    /**
     * Establece el número de venta.
     *
     * @param num_venta el número de venta.
     */
    public void setNum_venta(String num_venta) {
        this.num_venta = num_venta;
    }

    /**
     * Obtiene la fecha de la venta generada.
     *
     * @return la fecha de la venta generada.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la venta generada.
     *
     * @param fecha la fecha de la venta generada.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de la venta generada.
     *
     * @return el monto de la venta generada.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Establece el monto de la venta generada.
     *
     * @param monto el monto de la venta generada.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

}
