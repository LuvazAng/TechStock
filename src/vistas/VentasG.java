package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ventaGenerada;
import modelo.ventaGeneradaDAO;

public class VentasG extends javax.swing.JInternalFrame {

    ventaGeneradaDAO dao = new ventaGeneradaDAO(); //Objeto de acceso a datos (DAO) para ventas generadas.
    ventaGenerada vg = new ventaGenerada(); //Objeto para representar una venta generada.
    DefaultTableModel modelo = new DefaultTableModel(); //Modelo de tabla por defecto para la visualización de datos.

    double totalPagar; //Variable para almacenar el total a pagar.  
    double total; //Variable para almacenar el total.

    public VentasG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentasG = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtVentasT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComboMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        btnYear = new javax.swing.JButton();
        btnMonth = new javax.swing.JButton();
        btnDay = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        btnFechaE = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas-icon.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("VENTAS REALIZADAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, -1, 30));

        tableVentasG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_VENTA", "ID CLIENTE", "ID_VENDEDOR", "NUMERO_VENTA", "FECHA", "MONTO"
            }
        ));
        jScrollPane1.setViewportView(tableVentasG);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("VENTAS REALIZADAS");

        txtVentasT.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVentasT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVentasT, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 330));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("POR MES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        jPanel2.add(txtComboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 70, 150, 28));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("POR AÑO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAñoKeyPressed(evt);
            }
        });
        jPanel2.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 30, 150, 27));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("POR DIA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
        });
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 110, 150, 27));

        btnYear.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnYear.setText("BUSCAR");
        btnYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnYear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnYearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnYearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnYearMouseExited(evt);
            }
        });
        jPanel2.add(btnYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        btnMonth.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnMonth.setText("BUSCAR");
        btnMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMonth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMonth.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMonthMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMonthMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMonthMouseExited(evt);
            }
        });
        jPanel2.add(btnMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        btnDay.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnDay.setText("BUSCAR");
        btnDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDay.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDayMouseExited(evt);
            }
        });
        jPanel2.add(btnDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        btnAll.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        btnAll.setText("VER TODAS LAS VENTAS");
        btnAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAll.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAllMouseExited(evt);
            }
        });
        jPanel2.add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 200, 30));

        btnFechaE.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnFechaE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        btnFechaE.setText("FECHA EXACTA");
        btnFechaE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechaE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFechaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFechaEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFechaEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFechaEMouseExited(evt);
            }
        });
        jPanel2.add(btnFechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 150, 30));

        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 580, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYearMouseClicked
        if (txtAño.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESA UN AÑO");
        } else {
            limpiarTabla();
            listarAnio();
        }


    }//GEN-LAST:event_btnYearMouseClicked

    private void btnMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonthMouseClicked
        if (txtComboMes.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "SELECCIONA UN MES");
        } else {
            limpiarTabla();
            listarMes();
        }
    }//GEN-LAST:event_btnMonthMouseClicked

    private void btnDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDayMouseClicked
        if (txtDia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESA UN DIA");
        } else {
            limpiarTabla();
            listarDia();
        }
    }//GEN-LAST:event_btnDayMouseClicked

    private void btnAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllMouseClicked
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnAllMouseClicked

    private void btnFechaEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaEMouseClicked
        limpiarTabla();
        listarFecha();
    }//GEN-LAST:event_btnFechaEMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void txtAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtAño.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "INGRESA UN AÑO");
            } else {
                limpiarTabla();
                listarAnio();
            }
        }
    }//GEN-LAST:event_txtAñoKeyPressed

    private void txtDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtDia.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "INGRESA UN DIA");
            } else {
                limpiarTabla();
                listarDia();
            }
        }
    }//GEN-LAST:event_txtDiaKeyPressed

    private void btnYearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYearMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search-hover.png"));
        btnYear.setIcon(iconHover);
        btnYear.setBackground(new Color(0, 141, 54));
        btnYear.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnYearMouseEntered

    private void btnYearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYearMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search.png"));
        btnYear.setIcon(iconHover);
        btnYear.setBackground(new Color(255, 255, 255));
        btnYear.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnYearMouseExited

    private void btnMonthMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonthMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search-hover.png"));
        btnMonth.setIcon(iconHover);
        btnMonth.setBackground(new Color(0, 141, 54));
        btnMonth.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMonthMouseEntered

    private void btnMonthMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonthMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search.png"));
        btnMonth.setIcon(iconHover);
        btnMonth.setBackground(new Color(255, 255, 255));
        btnMonth.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnMonthMouseExited

    private void btnDayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDayMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search-hover.png"));
        btnDay.setIcon(iconHover);
        btnDay.setBackground(new Color(0, 141, 54));
        btnDay.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDayMouseEntered

    private void btnDayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDayMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search.png"));
        btnDay.setIcon(iconHover);
        btnDay.setBackground(new Color(255, 255, 255));
        btnDay.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnDayMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/brush-hover.png"));
        btnLimpiar.setIcon(iconHover);
        btnLimpiar.setBackground(new Color(0, 141, 54));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/brush.png"));
        btnLimpiar.setIcon(iconHover);
        btnLimpiar.setBackground(new Color(255, 255, 255));
        btnLimpiar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/list-hover.png"));
        btnAll.setIcon(iconHover);
        btnAll.setBackground(new Color(0, 141, 54));
        btnAll.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAllMouseEntered

    private void btnAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/list.png"));
        btnAll.setIcon(iconHover);
        btnAll.setBackground(new Color(255, 255, 255));
        btnAll.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnAllMouseExited

    private void btnFechaEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaEMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/calendar-hover.png"));
        btnFechaE.setIcon(iconHover);
        btnFechaE.setBackground(new Color(0, 141, 54));
        btnFechaE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnFechaEMouseEntered

    private void btnFechaEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFechaEMouseExited
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/calendar.png"));
        btnFechaE.setIcon(iconHover);
        btnFechaE.setBackground(new Color(255, 255, 255));
        btnFechaE.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnFechaEMouseExited

    /**
     * Método para listar las ventas generadas y mostrarlas en una tabla.
     */
    private void listar() {
        // Obtener la lista de ventas generadas desde el ventaGeneradaDAO
        List<ventaGenerada> lista = dao.listar();
        // Establecer el modelo de la tabla como el DefaultTableModel
        modelo = (DefaultTableModel) tableVentasG.getModel();

        // Arreglo para almacenar los datos de cada venta generada
        Object[] ob = new Object[6];

        // Recorrer la lista de ventas generadas
        for (int i = 0; i < lista.size(); i++) {
            // Obtener los datos de cada venta generada
            ob[0] = lista.get(i).getId_ventas();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getId_vendedor();
            ob[3] = lista.get(i).getNum_venta();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getMonto();

            // Agregar los datos a la tabla
            modelo.addRow(ob);
        }

        // Establecer el modelo actualizado en la tabla
        tableVentasG.setModel(modelo);

        // Calcular el total a pagar
        calcularTotal();
    }

    /**
     * Método para listar las ventas generadas de un año específico y mostrarlas
     * en una tabla.
     */
    private void listarAnio() {
        // Obtener el año ingresado desde el campo de texto 'txtAño'
        String year = txtAño.getText();

        // Obtener la lista de ventas generadas del año especificado desde el ventaGeneradaDAO
        List<ventaGenerada> lista = dao.listarAño(year);

        // Establecer el modelo de la tabla como el DefaultTableModel
        modelo = (DefaultTableModel) tableVentasG.getModel();

        // Arreglo para almacenar los datos de cada venta generada
        Object[] ob = new Object[6];
        // Recorrer la lista de ventas generadas
        for (int i = 0; i < lista.size(); i++) {
            // Obtener los datos de cada venta generada
            ob[0] = lista.get(i).getId_ventas();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getId_vendedor();
            ob[3] = lista.get(i).getNum_venta();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getMonto();

            // Agregar los datos a la tabla
            modelo.addRow(ob);
        }

        // Verificar si la tabla está vacía
        if (tableVentasG.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS DE ESA FECHA");
            txtVentasT.setText("");
        } else {
            // Establecer el modelo actualizado en la tabla
            tableVentasG.setModel(modelo);
            // Calcular el total a pagar
            calcularTotal();
        }

    }

    /**
     * Método para listar las ventas generadas de un mes específico y mostrarlas
     * en una tabla.
     */
    private void listarMes() {
        // Obtener el índice del mes seleccionado desde el campo de texto 'txtComboMes'
        int month = txtComboMes.getSelectedIndex();
        // Obtener la lista de ventas generadas del mes especificado desde el ventaGeneradaDAO
        List<ventaGenerada> lista = dao.listarMonth(month);

        // Establecer el modelo de la tabla como el DefaultTableModel
        modelo = (DefaultTableModel) tableVentasG.getModel();
        // Arreglo para almacenar los datos de cada venta generada
        Object[] ob = new Object[6];

        // Recorrer la lista de ventas generadas
        for (int i = 0; i < lista.size(); i++) {
            // Obtener los datos de cada venta generada
            ob[0] = lista.get(i).getId_ventas();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getId_vendedor();
            ob[3] = lista.get(i).getNum_venta();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getMonto();
            // Agregar los datos a la tabla
            modelo.addRow(ob);
        }
        // Verificar si la tabla está vacía
        if (tableVentasG.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS DE ESA FECHA");
            txtVentasT.setText("");
        } else {
            // Establecer el modelo actualizado en la tabla
            tableVentasG.setModel(modelo);
            // Calcular el total a pagar
            calcularTotal();
        }
    }

    /**
     * Método para listar las ventas generadas de un día específico y mostrarlas
     * en una tabla.
     */
    private void listarDia() {
        // Obtener el día ingresado desde el campo de texto 'txtDia'
        String day = txtDia.getText();
        // Obtener la lista de ventas generadas del día especificado desde el ventaGeneradaDAO
        List<ventaGenerada> lista = dao.listarDay(day);
        // Establecer el modelo de la tabla como el DefaultTableModel
        modelo = (DefaultTableModel) tableVentasG.getModel();

        // Arreglo para almacenar los datos de cada venta generada
        Object[] ob = new Object[6];

        // Recorrer la lista de ventas generadas
        for (int i = 0; i < lista.size(); i++) {
            // Obtener los datos de cada venta generada
            ob[0] = lista.get(i).getId_ventas();
            ob[1] = lista.get(i).getId_cliente();
            ob[2] = lista.get(i).getId_vendedor();
            ob[3] = lista.get(i).getNum_venta();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getMonto();
            // Agregar los datos a la tabla
            modelo.addRow(ob);
        }
        // Verificar si la tabla está vacía
        if (tableVentasG.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS DE ESA FECHA");
            txtVentasT.setText("");
        } else {
            // Establecer el modelo actualizado en la tabla
            tableVentasG.setModel(modelo);
            // Calcular el total a pagar
            calcularTotal();
        }
    }

    /**
     * Método para listar las ventas generadas de una fecha específica y
     * mostrarlas en una tabla. La fecha puede ser ingresada por año, mes y día.
     */
    private void listarFecha() {
        // Obtener los valores de año, mes y día ingresados desde los campos de texto correspondientes
        String year = txtAño.getText();
        int month = txtComboMes.getSelectedIndex();
        String day = txtDia.getText();

        // Verificar si se han ingresado todos los valores de la fecha
        if (year.equals("") && month == 0 && day.equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESA LA FEHCA COMPLETA");
        } else {
            // Obtener la lista de ventas generadas de la fecha exacta especificada desde el ventaGeneradaDAO
            List<ventaGenerada> lista = dao.listarFechaExacta(year, month, day);
            // Establecer el modelo de la tabla como el DefaultTableModel
            modelo = (DefaultTableModel) tableVentasG.getModel();

            // Arreglo para almacenar los datos de cada venta generada
            Object[] ob = new Object[6];
            // Recorrer la lista de ventas generadas
            for (int i = 0; i < lista.size(); i++) {
                // Obtener los datos de cada venta generada
                ob[0] = lista.get(i).getId_ventas();
                ob[1] = lista.get(i).getId_cliente();
                ob[2] = lista.get(i).getId_vendedor();
                ob[3] = lista.get(i).getNum_venta();
                ob[4] = lista.get(i).getFecha();
                ob[5] = lista.get(i).getMonto();
                // Agregar los datos a la tabla
                modelo.addRow(ob);
            }
            // Verificar si la tabla está vacía
            if (tableVentasG.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "NO HAY DATOS DE ESA FECHA");
                txtVentasT.setText("");
            } else {
                // Establecer el modelo actualizado en la tabla
                tableVentasG.setModel(modelo);
                // Calcular el total a pagar
                calcularTotal();
            }
        }
    }

    /**
     * Método para limpiar los campos de fecha y el campo de total de ventas.
     */
    private void limpiar() {
        txtAño.setText("");
        txtComboMes.setSelectedIndex(0);
        txtDia.setText("");
        txtVentasT.setText("");
    }

    private void limpiarTabla() {
        modelo.setRowCount(0);
    }

    /**
     * Calcula el total de ventas sumando los montos de todas las ventas
     * registradas en la tabla de ventas. Actualiza el campo de total de ventas.
     */
    void calcularTotal() {
        totalPagar = 0;
        for (int i = 0; i < tableVentasG.getRowCount(); i++) {
            total = Double.parseDouble(tableVentasG.getValueAt(i, 5).toString());
            totalPagar = totalPagar + total;
        }
        txtVentasT.setText("$" + totalPagar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnFechaE;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMonth;
    private javax.swing.JButton btnYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableVentasG;
    private javax.swing.JTextField txtAño;
    private javax.swing.JComboBox<String> txtComboMes;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtVentasT;
    // End of variables declaration//GEN-END:variables
}
