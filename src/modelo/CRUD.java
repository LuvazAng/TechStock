package modelo;

import java.util.List;

public interface CRUD {

    /**
     * Obtiene una lista de elementos.
     *
     * @return una lista con los elementos existentes en el sistema.
     */
    public List listar();

    /**
     * Agrega un nuevo elemento al sistema.
     *
     * @param o arreglo de objetos que representa los datos del elemento a
     * agregar.
     * @return el resultado de la operación, representado como un entero.
     */
    public int add(Object[] o);

    /**
     * Actualiza los datos de un elemento existente en el sistema.
     *
     * @param o un arreglo de objetos que representa los nuevos datos del
     * elemento.
     * @return el resultado de la operación, representado como un entero.
     */
    public int actualizar(Object[] o);

    /**
     * Elimina un elemento del sistema.
     *
     * @param id el identificador del elemento a eliminar.
     */
    public void eliminar(int id);
}
