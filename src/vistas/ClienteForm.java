package vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;

/**
 *
 * @author Luis Angel Vazquez Carrillo
 * @author Roberto Carlos Hernandez
 */
public class ClienteForm extends javax.swing.JInternalFrame {

    ClienteDAO dao = new ClienteDAO(); // Crear una instancia de ClienteDAO
    Cliente cl = new Cliente(); // Crear una instancia de Cliente
    DefaultTableModel modelo = new DefaultTableModel(); // Crear una instancia de DefaultTableModel
    int id; // Declarar una variable entera llamada 'id'

    public ClienteForm() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-icon.png"))); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 34, 300, 2));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 72, 300, 2));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 115, 300, 2));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 300, 2));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("IDENTIFICACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE/S");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setBorder(null);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 11, 300, 26));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 49, 300, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("DIRECCIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 300, 25));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setPreferredSize(new java.awt.Dimension(85, 25));
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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 132, 28));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setPreferredSize(new java.awt.Dimension(103, 22));
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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 132, 28));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 132, 28));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush.png"))); // NOI18N
        btnNuevo.setText("LIMPIAR");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 132, 28));

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "DIRECCION", "TELEFONO"
            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

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
     * Método que se ejecuta al hacer clic en una fila de la tabla de clientes.
     *
     * @param evt El evento de clic del mouse.
     */
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        // Obtener la fila seleccionada en la tabla
        int fila = tableClientes.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila");
        } else {
            // Establecer el color de fondo de la fila seleccionada
            tableClientes.setSelectionBackground(new Color(0, 141, 54));
            
            // Obtener los valores de las celdas seleccionadas en la fila
            id = Integer.parseInt(tableClientes.getValueAt(fila, 0).toString());
            String nombre = tableClientes.getValueAt(fila, 1).toString();;
            String direccion = tableClientes.getValueAt(fila, 2).toString();;
            String telefono = tableClientes.getValueAt(fila, 3).toString();;
            
            // Establecer los valores en los campos de texto correspondientes
            txtID.setText(Integer.toString(id));
            txtNombre.setText(nombre);
            txtDireccion.setText(direccion);
            txtTelefono.setText(telefono);
        }
    }//GEN-LAST:event_tableClientesMouseClicked

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
     * Método para listar los clientes y mostrarlos en una tabla.
     */
    void listar() {
        // Obtener la lista de clientes desde el DAO
        List<Cliente> lista = dao.listar();
        // Obtener el modelo de la tabla actual
        modelo = (DefaultTableModel) tableClientes.getModel();
        // Crear un arreglo de objetos para almacenar los datos de cada cliente
        Object[] ob = new Object[4];
        // Recorrer la lista de clientes y agregar sus datos al modelo de la tabla
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getDireccion();
            ob[3] = lista.get(i).getTelefono();
            modelo.addRow(ob);
        }
        // Establecer el modelo actualizado en la tabla
        tableClientes.setModel(modelo);
    }

    /**
     * Método para agregar un nuevo registro de cliente.
     */
    void agregar() {
        // Mostrar un cuadro de diálogo de confirmación
        int resp = JOptionPane.showConfirmDialog(this, "Deseas crear un nuevo registro de cliente?");
        // Si la respuesta es afirmativa (0 representa "Sí")
        if (resp == 0) {
            // Obtener los valores de los campos de texto
            String idString = txtID.getText();
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();
            // Verificar si alguno de los campos está vacío
            if (idString.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor completa todos los campos");
            } else {
                // Convertir el ID a un entero
                int id = Integer.parseInt(idString);
                // Crear un arreglo de objetos para almacenar los datos del nuevo cliente
                Object[] ob = new Object[4];
                ob[0] = id;
                ob[1] = nombre;
                ob[2] = direccion;
                ob[3] = telefono;
                // Agregar el nuevo cliente al DAO
                dao.add(ob);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operacion Cancelada");
        }
    }

    /**
     * Método para actualizar un registro de cliente.
     */
    void actualizar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableClientes.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación con el nombre del cliente a actualizar
            int resp = JOptionPane.showConfirmDialog(this, "Deseas actualizar el registro del cliente \n" + txtNombre.getText() + "?");
            // Si la respuesta es afirmativa (0 representa "Sí")
            if (resp == 0) {
                // Obtener los valores de los campos de texto
                String idString = txtID.getText();
                String nombre = txtNombre.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                // Verificar si alguno de los campos está vacío
                if (idString.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor completa todos los campos");
                } else {
                    // Convertir el ID a un entero
                    int id = Integer.parseInt(idString);
                    // Crear un arreglo de objetos para almacenar los datos actualizados del cliente
                    Object[] obj = new Object[4];
                    obj[0] = id;
                    obj[1] = nombre;
                    obj[2] = direccion;
                    obj[3] = telefono;
                    // Actualizar el cliente en el DAO
                    dao.actualizar(obj);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operacion Cancelada");
            }
        }
    }

    /**
     * Método para eliminar un registro de cliente.
     */
    void eliminar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableClientes.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación con el nombre del cliente a eliminar
            int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar el registro del empleado \n" + txtNombre.getText() + "?");
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
        txtDireccion.setText("");
        txtTelefono.setText("");

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
