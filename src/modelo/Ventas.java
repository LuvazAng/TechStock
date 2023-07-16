package modelo;

public class Ventas {

    int id;
    int idCliente;
    int idVendedor;
    String serie;
    String fecha;
    double monto;

    /**
     * Constructor vacío de la clase Ventas.
     */
    public Ventas() {
    }

    /**
     * Constructor de la clase Ventas.
     *
     * @param id el identificador de la venta.
     * @param idCliente el identificador del cliente asociado a la venta.
     * @param idVendedor el identificador del vendedor asociado a la venta.
     * @param serie la serie de la venta.
     * @param fecha la fecha de la venta.
     * @param monto el monto de la venta.
     */
    public Ventas(int id, int idCliente, int idVendedor, String serie, String fecha, double monto) {
        this.id = id;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.serie = serie;
        this.fecha = fecha;
        this.monto = monto;
    }

    /**
     * Obtiene el identificador de la venta.
     *
     * @return el identificador de la venta.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la venta.
     *
     * @param id el identificador de la venta.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el identificador del cliente asociado a la venta.
     *
     * @return el identificador del cliente asociado a la venta.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el identificador del cliente asociado a la venta.
     *
     * @param idCliente el identificador del cliente asociado a la venta.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene el identificador del vendedor asociado a la venta.
     *
     * @return el identificador del vendedor asociado a la venta.
     */
    public int getIdVendedor() {
        return idVendedor;
    }

    /**
     * Establece el identificador del vendedor asociado a la venta.
     *
     * @param idVendedor el identificador del vendedor asociado a la venta.
     */
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    /**
     * Obtiene la serie de la venta.
     *
     * @return la serie de la venta.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece la serie de la venta.
     *
     * @param serie la serie de la venta.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la fecha de la venta.
     *
     * @return la fecha de la venta.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la venta.
     *
     * @param fecha la fecha de la venta.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de la venta.
     *
     * @return el monto de la venta.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Establece el monto de la venta.
     *
     * @param monto el monto de la venta.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

}
