package vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;

/**
 *
 * @author Luis Angel Vazquez Carrillo
 * @author Roberto Carlos Hernandez
 */

public class ProductoForm extends javax.swing.JInternalFrame {

    ProductoDAO dao = new ProductoDAO(); // Crear una instancia de ProductoDAO
    Producto p = new Producto(); // Crear una instancia de Producto
    DefaultTableModel modelo = new DefaultTableModel(); // Crear una instancia de DefaultTableModel
    int id; // Declarar una variable entera llamada 'id'

    public ProductoForm() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Producto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventory.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 40, 300, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 77, 300, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 114, 300, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 150, 300, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 190, 300, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("IDENTIFICADOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 59, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("PRECIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 101, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("DESCRIPCION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 133, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("STOCK");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 170, -1, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setBorder(null);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 16, 300, 25));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 54, 300, 25));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setBorder(null);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 91, 300, 25));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripcion.setBorder(null);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 128, 300, 25));

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStock.setBorder(null);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 165, 300, 25));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 132, 28));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 132, 28));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 132, 28));

        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush.png"))); // NOI18N
        btnNuevo.setText("LIMPIAR");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 132, 28));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 6, -1, 184));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 580, -1));

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "DESCRIPCION", "STOCK"
            }
        ));
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProducto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * Método que se ejecuta al hacer clic en una fila de la tabla de productos.
     *
     * @param evt El evento de clic del mouse.
     */
    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        // Obtener la fila seleccionada en la tabla
        int fila = tableProducto.getSelectedRow();

        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila");
        } else {
            // Establecer el color de fondo de la fila seleccionada
            tableProducto.setSelectionBackground(new Color(0, 141, 54));

            // Obtener los valores de las celdas seleccionadas en la fila
            id = Integer.parseInt(tableProducto.getValueAt(fila, 0).toString());
            String nombre = tableProducto.getValueAt(fila, 1).toString();
            String precio = tableProducto.getValueAt(fila, 2).toString();
            String descripcion = tableProducto.getValueAt(fila, 3).toString();
            int stock = Integer.parseInt(tableProducto.getValueAt(fila, 4).toString());

            // Establecer los valores en los campos de texto correspondientes
            txtID.setText(Integer.toString(id));
            txtNombre.setText(nombre);
            txtPrecio.setText(precio);
            txtDescripcion.setText(descripcion);
            txtStock.setText(Integer.toString(stock));

        }
    }//GEN-LAST:event_tableProductoMouseClicked

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/add-hover.png"));
        btnAgregar.setIcon(iconHover);
        btnAgregar.setBackground(new Color(0, 141, 54));
        btnAgregar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/add.png"));
        btnAgregar.setIcon(iconNormal);
        btnAgregar.setBackground(new Color(255, 255, 255));
        btnAgregar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/update-hover.png"));
        btnActualizar.setIcon(iconHover);
        btnActualizar.setBackground(new Color(0, 141, 54));
        btnActualizar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/update.png"));
        btnActualizar.setIcon(iconNormal);
        btnActualizar.setBackground(new Color(255, 255, 255));
        btnActualizar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/delete-hover.png"));
        btnEliminar.setIcon(iconHover);
        btnEliminar.setBackground(new Color(0, 141, 54));
        btnEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/delete.png"));
        btnEliminar.setIcon(iconNormal);
        btnEliminar.setBackground(new Color(255, 255, 255));
        btnEliminar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/brush-hover.png"));
        btnNuevo.setIcon(iconHover);
        btnNuevo.setBackground(new Color(0, 141, 54));
        btnNuevo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/brush.png"));
        btnNuevo.setIcon(iconNormal);
        btnNuevo.setBackground(new Color(255, 255, 255));
        btnNuevo.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnNuevoMouseExited

    /**
     * Método para listar los productos y mostrarlos en una tabla.
     */
    void listar() {
        // Obtener la lista de productos desde el DAO
        List<Producto> lista = dao.listar();
        // Obtener el modelo de la tabla actual
        modelo = (DefaultTableModel) tableProducto.getModel();
        // Crear un arreglo de objetos para almacenar los datos de cada producto
        Object[] ob = new Object[5];
        // Recorrer la lista de productos y agregar sus datos al modelo de la tabla
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecio();
            ob[3] = lista.get(i).getDescrpcion();
            ob[4] = lista.get(i).getStock();
            modelo.addRow(ob);
        }
        // Establecer el modelo actualizado en la tabla
        tableProducto.setModel(modelo);
    }

    /**
     * Método para agregar un nuevo registro de producto.
     */
    void agregar() {
        // Mostrar un cuadro de diálogo de confirmación
        int resp = JOptionPane.showConfirmDialog(this, "Deseas crear un nuevo registro de producto ?");
        // Si la respuesta es afirmativa (0 representa "Sí")
        if (resp == 0) {
            // Verificar si alguno de los campos está vacío
            if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtStock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.");
            } else {
                // Obtener los valores de los campos de texto
                id = Integer.parseInt(txtID.getText());
                String nombre = txtNombre.getText();
                String precio = txtPrecio.getText();
                String descripcion = txtDescripcion.getText();
                int stock = Integer.parseInt(txtStock.getText());

                // Crear un arreglo de objetos para almacenar los datos del nuevo producto
                Object[] ob = new Object[5];
                ob[0] = id;
                ob[1] = nombre;
                ob[2] = precio;
                ob[3] = descripcion;
                ob[4] = stock;
                // Agregar el nuevo producto al DAO
                dao.add(ob);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operacion Cancelada");
        }
    }

    /**
     * Método para actualizar un registro de producto.
     */
    void actualizar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableProducto.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación
            int resp = JOptionPane.showConfirmDialog(this, "Deseas actualizar el registro del producto ?");
            // Si la respuesta es afirmativa (0 representa "Sí")        
            if (resp == 0) {
                // Verificar si alguno de los campos está vacío
                if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtStock.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor completa todos los campos");
                } else {
                    // Obtener los valores de los campos de texto
                    id = Integer.parseInt(txtID.getText());
                    String nombre = txtNombre.getText();
                    String precio = txtPrecio.getText();
                    String descripcion = txtDescripcion.getText();
                    int stock = Integer.parseInt(txtStock.getText());
                    // Crear un arreglo de objetos para almacenar los datos actualizados del producto
                    Object[] obj = new Object[5];
                    obj[0] = id;
                    obj[1] = nombre;
                    obj[2] = precio;
                    obj[3] = descripcion;
                    obj[4] = stock;
                    // Actualizar el producto en el DAO
                    dao.actualizar(obj);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operacion Cancelada");
            }
        }
    }

    /**
     * Método para eliminar un registro de producto.
     */
    void eliminar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableProducto.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación con el nombre del producto a eliminar
            int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar el registro del producto \n" + txtNombre.getText() + "?");
            // Si la respuesta es afirmativa (0 representa "Sí")
            if (resp == 0) {
                dao.eliminar(id);
            } else {
                JOptionPane.showMessageDialog(this, "Operacion Cancelada");
            }
        }
    }

    /**
     * Método para restablecer los campos de entrada a sus valores
     * predeterminados.
     */
    void nuevo() {
        // Limpiar los campos de texto
        txtID.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        txtStock.setText("");
        // Establecer el enfoque en el campo de ID
        txtID.requestFocus();
    }

    /**
     * Método para limpiar todos los datos de la tabla.
     */
    void limpiarTabla() {
        // Recorrer las filas de la tabla
        for (int i = 0; i < modelo.getRowCount(); i++) {
            // Eliminar la fila actual
            modelo.removeRow(i);
            // Disminuir el índice 'i' para compensar la eliminación de la fila
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
