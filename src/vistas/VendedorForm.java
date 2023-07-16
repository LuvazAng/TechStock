package vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;
import modelo.VendedorDAO;

/**
 *
 * @author Luis Angel Vazquez Carrillo
 * @author Roberto Carlos Hernandez
 */

public class VendedorForm extends javax.swing.JInternalFrame {

    VendedorDAO dao = new VendedorDAO(); // Crear una instancia de VendedorDAO
    Vendedor v = new Vendedor(); // Crear una instancia de Vendedor
    DefaultTableModel modelo = new DefaultTableModel(); // Crear una instancia de DefaultTableModel
    int id; // Declarar una variable entera llamada 'id'

    public VendedorForm() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saleperson.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 33, 300, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 67, 300, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 101, 300, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 139, 300, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 174, 300, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 208, 300, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 242, 300, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 49, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 42, 300, 25));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 79, -1, -1));

        txtPaterno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPaterno.setBorder(null);
        jPanel1.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 76, 300, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 117, -1, -1));

        txtMaterno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMaterno.setBorder(null);
        jPanel1.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 114, 300, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 152, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 149, 300, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 186, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 183, 300, 25));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("IDENTIFICADOR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 15, -1, -1));

        txtID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtID.setBorder(null);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 8, 300, 25));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("CLAVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 217, -1, -1));

        txtClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtClave.setBorder(null);
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 217, 300, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 707, 914, -1));

        tableVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "AP_PATERNO", "AP_MATERNO", "TELEFONO", "USUARIO", "CLAVE"
            }
        ));
        tableVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVendedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 630, 213));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 132, 28));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 132, 28));

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
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 132, 28));

        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
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
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 132, 28));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 630, 463));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que se ejecuta al hacer clic en una fila de la tabla de
     * vendedores.
     *
     * @param evt El evento de clic del mouse.
     */
    private void tableVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVendedorMouseClicked
        // Obtener la fila seleccionada en la tabla
        int fila = tableVendedor.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "DEBES SELECCIONAR UNA FILA");
        } else {
            // Establecer el color de fondo de la fila seleccionada
            tableVendedor.setSelectionBackground(new Color(0, 141, 54));

            // Obtener los valores de las celdas seleccionadas en la fila
            id = Integer.parseInt(tableVendedor.getValueAt(fila, 0).toString());
            String nombre = tableVendedor.getValueAt(fila, 1).toString();;
            String apellido_p = tableVendedor.getValueAt(fila, 2).toString();;
            String apellido_m = tableVendedor.getValueAt(fila, 3).toString();;
            String telefono = tableVendedor.getValueAt(fila, 4).toString();;
            String usuario = tableVendedor.getValueAt(fila, 5).toString();
            String clave = tableVendedor.getValueAt(fila, 6).toString();

            // Establecer los valores en los campos de texto correspondientes
            txtID.setText(Integer.toString(id));
            txtNombre.setText(nombre);
            txtPaterno.setText(apellido_p);
            txtMaterno.setText(apellido_m);
            txtTelefono.setText(telefono);
            txtUsuario.setText(usuario);
            txtClave.setText(clave);
        }
    }//GEN-LAST:event_tableVendedorMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnAgregarActionPerformed

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
     * Método para listar los vendedores y mostrarlos en una tabla.
     */
    void listar() {
        // Obtener la lista de vendedores desde el DAO
        List<Vendedor> lista = dao.listar();
        // Obtener el modelo de la tabla actual
        modelo = (DefaultTableModel) tableVendedor.getModel();
        // Crear un arreglo de objetos para almacenar los datos de cada vendedor
        Object[] ob = new Object[7];
        // Recorrer la lista de vendedores y agregar sus datos al modelo de la tabla
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getApaterno();
            ob[3] = lista.get(i).getAmaterno();
            ob[4] = lista.get(i).getTel();
            ob[5] = lista.get(i).getUsuario();
            ob[6] = lista.get(i).getClave();
            modelo.addRow(ob);
        }
        // Establecer el modelo actualizado en la tabla
        tableVendedor.setModel(modelo);
    }

    /**
     * Método para agregar un nuevo registro de empleado.
     */
    void agregar() {
        // Mostrar un cuadro de diálogo de confirmación
        int resp = JOptionPane.showConfirmDialog(this, "Deseas crear un nuevo registro de empleado ?");

        // Si la respuesta es afirmativa (0 representa "Sí")
        if (resp == 0) {
            // Verificar si alguno de los campos está vacío
            if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor completa todos los campos");
            } else {
                // Obtener los valores de los campos de texto
                id = Integer.parseInt(txtID.getText());
                String nombre = txtNombre.getText();
                String apellido_p = txtPaterno.getText();
                String apellido_m = txtMaterno.getText();
                String telefono = txtTelefono.getText();
                String usuario = txtUsuario.getText();
                String clave = txtClave.getText();

                // Crear un arreglo de objetos para almacenar los datos del nuevo empleado
                Object[] ob = new Object[7];
                ob[0] = id;
                ob[1] = nombre;
                ob[2] = apellido_p;
                ob[3] = apellido_m;
                ob[4] = telefono;
                ob[5] = usuario;
                ob[6] = clave;

                // Agregar el nuevo empleado al DAO 
                dao.add(ob);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operacion Cancelada");
        }
    }

    /**
     * Método para actualizar un registro de empleado.
     */
    void actualizar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableVendedor.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación con el nombre del empleado a actualizar
            int resp = JOptionPane.showConfirmDialog(this, "Deseas actualizar el registro del empleado \n" + txtNombre.getText() + "?");

            // Si la respuesta es afirmativa (0 representa "Sí")
            if (resp == 0) {
                // Verificar si alguno de los campos está vacío
                if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor completa los campos");
                } else {
                    // Obtener los valores de los campos de texto
                    id = Integer.parseInt(txtID.getText());
                    String nombre = txtNombre.getText();
                    String apellido_p = txtPaterno.getText();
                    String apellido_m = txtMaterno.getText();
                    String telefono = txtTelefono.getText();
                    String usuario = txtUsuario.getText();
                    String clave = txtClave.getText();

                    // Crear un arreglo de objetos para almacenar los datos actualizados del empleado
                    Object[] obj = new Object[7];
                    obj[0] = id;
                    obj[1] = nombre;
                    obj[2] = apellido_p;
                    obj[3] = apellido_m;
                    obj[4] = telefono;
                    obj[5] = usuario;
                    obj[6] = clave;

                    // Actualizar el empleado en el DAO
                    dao.actualizar(obj);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operacion Cancelada");
            }
        }
    }

    /**
     * Método para eliminar un registro de empleado.
     */
    void eliminar() {
        // Obtener la fila seleccionada en la tabla
        int fila = tableVendedor.getSelectedRow();
        // Verificar si no se ha seleccionado ninguna fila (-1 representa ninguna selección)
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un dato");
        } else {
            // Mostrar un cuadro de diálogo de confirmación con el nombre del empleado a eliminar
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
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable tableVendedor;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
