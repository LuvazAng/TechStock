package modelo;

public class Vendedor {

    int id;
    String nombre;
    String apaterno;
    String amaterno;
    String tel;
    String usuario;
    String clave;

    /**
     * Constructor vacío de la clase Vendedor.
     */
    public Vendedor() {

    }

    /**
     * Constructor de la clase Vendedor.
     *
     * @param id el identificador del vendedor.
     * @param nombre el nombre del vendedor.
     * @param apaterno el apellido paterno del vendedor.
     * @param amaterno el apellido materno del vendedor.
     * @param tel el número de teléfono del vendedor.
     * @param usuario el nombre de usuario del vendedor.
     * @param clave la contraseña del vendedor.
     */
    public Vendedor(int id, String nombre, String apaterno, String amaterno, String tel, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tel = tel;
        this.usuario = usuario;
        this.clave = clave;
    }

    /**
     * Obtiene el identificador del vendedor.
     *
     * @return el identificador del vendedor.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del vendedor.
     *
     * @param id el identificador del vendedor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del vendedor.
     *
     * @return el nombre del vendedor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del vendedor.
     *
     * @param nombre el nombre del vendedor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del vendedor.
     *
     * @return el apellido paterno del vendedor.
     */
    public String getApaterno() {
        return apaterno;
    }

    /**
     * Establece el apellido paterno del vendedor.
     *
     * @param apaterno el apellido paterno del vendedor.
     */
    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    /**
     * Obtiene el apellido materno del vendedor.
     *
     * @return el apellido materno del vendedor.
     */
    public String getAmaterno() {
        return amaterno;
    }

    /**
     * Establece el apellido materno del vendedor.
     *
     * @param amaterno el apellido materno del vendedor.
     */
    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    /**
     * Obtiene el número de teléfono del vendedor.
     *
     * @return el número de teléfono del vendedor.
     */
    public String getTel() {
        return tel;
    }

    /**
     * Establece el número de teléfono del vendedor.
     *
     * @param tel el número de teléfono del vendedor.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Obtiene el nombre de usuario del vendedor.
     *
     * @return el nombre de usuario del vendedor.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario del vendedor.
     *
     * @param usuario el nombre de usuario del vendedor.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del vendedor.
     *
     * @return la contraseña del vendedor.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la contraseña del vendedor.
     *
     * @param clave la contraseña del vendedor.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

}
