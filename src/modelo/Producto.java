package modelo;

public class Producto {

    int id;
    String nombre;
    String precio;
    String descrpcion;
    int stock;

    /**
     * Constructor vacío de la clase Producto.
     */
    public Producto() {
    }

    /**
     * Constructor de la clase Producto.
     *
     * @param id el identificador del producto.
     * @param nombre el nombre del producto.
     * @param precio el precio del producto.
     * @param descripcion la descripción del producto.
     * @param stock la cantidad de stock del producto.
     */
    public Producto(int id, String nombre, String precio, String descrpcion, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descrpcion = descrpcion;
        this.stock = stock;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return el identificador del producto.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     *
     * @param id el identificador del producto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return el precio del producto.
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio el precio del producto.
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return la descripción del producto.
     */
    public String getDescrpcion() {
        return descrpcion;
    }

    /**
     * Establece la descripción del producto.
     *
     * @param descripcion la descripción del producto.
     */
    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    /**
     * Obtiene la cantidad de stock del producto.
     *
     * @return la cantidad de stock del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la cantidad de stock del producto.
     *
     * @param stock la cantidad de stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
