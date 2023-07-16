package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetalleVentas;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Vendedor;
import modelo.VendedorDAO;
import modelo.Ventas;
import modelo.VentasDAO;

/**
 *
 * @author Luis Angel Vazquez Carrillo
 * @author Roberto Carlos Hernandez
 */
public class VentasForm extends javax.swing.JInternalFrame {

    VentasDAO vdao = new VentasDAO(); // Crear una instancia de VentasDAO
    ClienteDAO cdao = new ClienteDAO(); // Crear una instancia de ClienteDAO
    ProductoDAO pdao = new ProductoDAO(); // Crear una instancia de ProductoDAO
    Vendedor ev = new Vendedor(); // Crear una instancia de Vendedor
    VendedorDAO vddao = new VendedorDAO(); // Crear una instancia de VendedorDAO
    Producto p = new Producto(); // Crear una instancia de Producto
    Ventas v = new Ventas(); // Crear una instancia de Ventas
    DetalleVentas dv = new DetalleVentas(); // Crear una instancia de DetalleVentas
    Cliente cliente = new Cliente(); // Crear una instancia de Cliente
    LoginForm loginFrame = new LoginForm(); // Crear una instancia de LoginForm

    DefaultTableModel modelo = new DefaultTableModel(); // Crear una instancia de DefaultTableModel

    int idProducto; // Declarar una variable entera llamada 'idProducto'
    double totalPagar; // Declarar una variable double llamada 'totalPagar'
    double precio; // Declarar una variable double llamada 'precio'
    int cant; // Declarar una variable entera llamada 'cant'

    public VentasForm() {
        initComponents();
        generarSerie();
        Fecha();
        vendedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        btnBuscarC = new javax.swing.JButton();
        btnBuscarP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        txtFecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVenta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGenerarV = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ventas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/point_of_sale-intFrame.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE VENTA \"TechStock\"");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Venta de productos de Tecnologia ");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("NO. SERIE");

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerie.setBorder(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TechStock-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("ID CLIENTE");

        txtIdCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("CLIENTE");

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 141, 54));
        txtCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("ID PRODUCTO");

        txtIdProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        txtIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyPressed(evt);
            }
        });

        btnBuscarC.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscarC.setText("BUSCAR");
        btnBuscarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCMouseExited(evt);
            }
        });
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        btnBuscarP.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscarP.setText("BUSCAR");
        btnBuscarP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarPMouseExited(evt);
            }
        });
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("PRODUCTO");

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 141, 54));
        txtProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("PRECIO");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 141, 54));
        txtPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("STOCK");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(0, 141, 54));
        txtStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("CANTIDAD");

        txtCantidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txtCantidad.setBorder(null);

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 141, 54));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("VENDEDOR");

        txtVendedor.setEditable(false);
        txtVendedor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(0, 141, 54));
        txtVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCliente)
                    .addComponent(txtProducto)
                    .addComponent(txtStock)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarP)
                    .addComponent(jLabel8)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel10)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tableVenta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDEN", "ID_PROD", "PRODUCTO", "CANTIDAD", "PRECIO_UNIT", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tableVenta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL");

        btnGenerarV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGenerarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-shop.png"))); // NOI18N
        btnGenerarV.setText("GENERAR VENTA");
        btnGenerarV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenerarV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarVMouseExited(evt);
            }
        });
        btnGenerarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarV)
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarV)
                    .addComponent(btnCancelar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVActionPerformed
        if (txtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos.");
        } else {
            guardarVenta();
            guardarDetalle();
            actualizarStock();
            JOptionPane.showMessageDialog(this, "Se realizo con exito.");
            nuevo();
            generarSerie();
            limpiarTabla();
        }
    }//GEN-LAST:event_btnGenerarVActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Desea limpiar los campos?,");
        if (resp == 0) {
            nuevo();
            limpiarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Operacion Cancelada");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search-hover.png"));
        btnBuscarC.setIcon(iconHover);
        btnBuscarC.setBackground(new Color(0, 141, 54));
        btnBuscarC.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarCMouseEntered

    private void btnBuscarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/search.png"));
        btnBuscarC.setIcon(iconNormal);
        btnBuscarC.setBackground(new Color(255, 255, 255));
        btnBuscarC.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnBuscarCMouseExited

    private void btnBuscarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/search-hover.png"));
        btnBuscarP.setIcon(iconHover);
        btnBuscarP.setBackground(new Color(0, 141, 54));
        btnBuscarP.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarPMouseEntered

    private void btnBuscarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/search.png"));
        btnBuscarP.setIcon(iconNormal);
        btnBuscarP.setBackground(new Color(255, 255, 255));
        btnBuscarP.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnBuscarPMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/add.png"));
        btnAgregar.setIcon(iconNormal);
        btnAgregar.setBackground(new Color(255, 255, 255));
        btnAgregar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/add-hover.png"));
        btnAgregar.setIcon(iconHover);
        btnAgregar.setBackground(new Color(0, 141, 54));
        btnAgregar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnGenerarVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarVMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/add-shop-hover.png"));
        btnGenerarV.setIcon(iconHover);
        btnGenerarV.setBackground(new Color(0, 141, 54));
        btnGenerarV.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenerarVMouseEntered

    private void btnGenerarVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarVMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/add-shop.png"));
        btnGenerarV.setIcon(iconNormal);
        btnGenerarV.setBackground(new Color(255, 255, 255));
        btnGenerarV.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnGenerarVMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        ImageIcon iconHover = new ImageIcon(getClass().getResource("/img/cancel-hover.png"));
        btnCancelar.setIcon(iconHover);
        btnCancelar.setBackground(new Color(0, 141, 54));
        btnCancelar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        ImageIcon iconNormal = new ImageIcon(getClass().getResource("/img/cancel.png"));
        btnCancelar.setIcon(iconNormal);
        btnCancelar.setBackground(new Color(255, 255, 255));
        btnCancelar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void txtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
        }
    }//GEN-LAST:event_txtIdClienteKeyPressed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed

    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtIdProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarProducto();
        }
    }//GEN-LAST:event_txtIdProductoKeyPressed

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        vendedor();
    }//GEN-LAST:event_txtVendedorActionPerformed

    /**
     * Método para obtener la fecha actual y mostrarla en un campo de texto.
     */
    void Fecha() {
        // Obtener la fecha actual utilizando Calendar
        Calendar calendario = new GregorianCalendar();
        int Y = calendario.get(Calendar.YEAR);
        int M = calendario.get(Calendar.MONTH);
        M = M + 1;
        int D = calendario.get(Calendar.DAY_OF_MONTH);

        // Establecer la fecha en el campo de texto en el formato D-M-Y
        txtFecha.setText("" + D + "-" + M + "-" + Y);
    }

    /**
     * Método para generar el número de serie de ventas y mostrarlo en un campo
     * de texto.
     */
    void generarSerie() {
        // Obtener el número de serie de ventas desde el DAO
        String serie = vdao.NroSerieVentas();
        // Declarar una variable entera llamada 'Mas' e inicializarla en 1
        int Mas = 1;
        // Verificar si el número de serie no es nulo ni está vacío
        if (serie != null && !serie.isEmpty()) {
            try {
                // Intentar convertir el número de serie en un entero y agregar 1
                Mas = Integer.parseInt(serie) + 1;
            } catch (NumberFormatException e) {
                // Manejar la excepción en caso de que el número de serie no sea un valor numérico
            }
        }
        // Establecer el número de serie generado en el campo de texto con un formato específico
        txtSerie.setText(String.format("%05d", Mas));
    }

    void vendedor() {
        txtVendedor.setText("VENDEDOR DEFAULT");
    }

    /**
     * Método para restablecer los campos de entrada a sus valores
     * predeterminados.
     */
    void nuevo() {
        // Limpiar los campos de texto
        txtIdCliente.setText("");
        txtCliente.setText("");
        txtCantidad.setValue(1);
        txtIdProducto.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotal.setText("");
        // Establecer el enfoque en el campo de ID
        txtIdCliente.requestFocus();
    }

    /**
     * Método para limpiar todos los datos de la tabla.
     */
    void limpiarTabla() {
        // Recorrer las filas de la tabla
        for (int i = 0; i < tableVenta.getRowCount(); i++) {
            // Eliminar la fila actual
            modelo.removeRow(i);
            // Disminuir el índice 'i' para compensar la eliminación de la fila
            i = i - 1;
        }
    }

    /**
     * Método para actualizar el stock de productos en base a los datos de una
     * tabla de ventas.
     */
    void actualizarStock() {
        // Recorrer las filas de la tabla de ventas
        for (int i = 0; i < modelo.getRowCount(); i++) {
            // Crear una instancia de Producto
            Producto pr = new Producto();

            // Obtener el ID del producto y la cantidad vendida de la tabla de ventas
            idProducto = Integer.parseInt(tableVenta.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tableVenta.getValueAt(i, 3).toString());

            // Obtener el producto correspondiente al ID desde el ProductoDAO
            pr = pdao.listarID(idProducto);
            // Calcular el nuevo stock del producto
            int sa = pr.getStock() - cant;
            // Actualizar el stock del producto en el ProductoDAO
            pdao.actualizarStock(sa, idProducto);
        }
    }

    /**
     * Método para guardar una venta en la base de datos.
     */
    void guardarVenta() {
        // Declarar e inicializar variables con los datos necesarios para guardar la venta
        int idv = 1; // Identificador del vendedor (asumido como 1 en este caso)
        int idc = cliente.getId(); // Identificador del cliente obtenido desde el objeto 'cliente'
        String serie = txtSerie.getText(); // Número de serie de la venta obtenido desde el campo de texto 'txtSerie'
        String fecha = txtFecha.getText(); // Fecha de la venta obtenida desde el campo de texto 'txtFecha'
        double monto = totalPagar; // Monto total de la venta obtenido desde la variable 'totalPagar'

        // Establecer los valores de la venta en el objeto 'v'
        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);

        // Guardar la venta utilizando el objeto 'vdao' y el método 'GuardarVentas'
        vdao.GuardarVentas(v);
    }

    /**
     * Método para guardar los detalles de una venta en la base de datos.
     */
    void guardarDetalle() {
        // Obtener el ID de la venta desde el método 'IdVentas' del objeto 'vdao'
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);

        // Recorrer las filas de la tabla de ventas
        for (int i = 0; i < tableVenta.getRowCount(); i++) {
            // Obtener el ID del producto, la cantidad y el precio de venta de cada fila
            int idp = Integer.parseInt(tableVenta.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(tableVenta.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(tableVenta.getValueAt(i, 4).toString());

            // Establecer los valores del detalle de venta en el objeto 'dv'
            dv.setIdVentas(idve);
            dv.setIdProducto(idProducto);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);

            // Guardar el detalle de venta utilizando el objeto 'vdao' y el método 'GuardarDetalleVentas'
            vdao.GuardarDetalleVentas(dv);
        }
    }

    /**
     * Método para agregar un producto a la tabla de ventas.
     */
    void agregarProducto() {
        // Declarar e inicializar variables
        int orden = 0;
        double total;

        // Obtener el modelo de la tabla de ventas
        modelo = (DefaultTableModel) tableVenta.getModel();
        // Incrementar el número de orden en 1
        orden = orden + 1;
        //validar campos vacios
        if (txtIdProducto.getText().isEmpty() || txtProducto.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtCantidad.getValue().toString().isEmpty() || txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se pueden dejar campos vacíos");
            return;
        }

        // Obtener los valores de los campos de texto
        idProducto = Integer.parseInt(txtIdProducto.getText());
        String nomp = txtProducto.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());

        // Calcular el total
        total = cant * precio;

        // Crear una lista para almacenar los valores del producto
        ArrayList lista = new ArrayList();

        // Verificar si hay suficiente stock para la venta
        if (stock > 0) {
            if (stock >= cant) {
                lista.add(orden);
                //lista.add(Id_Producto);
                lista.add(idProducto);
                lista.add(nomp);
                lista.add(cant);
                lista.add(precio);
                lista.add(total);

                // Crear un arreglo de objetos para agregar a la tabla
                Object[] ob = new Object[6];
                ob[0] = lista.get(0);
                ob[1] = lista.get(1);
                ob[2] = lista.get(2);
                ob[3] = lista.get(3);
                ob[4] = lista.get(4);
                ob[5] = lista.get(5);

                // Agregar la fila a la tabla de ventas
                modelo.addRow(ob);
                tableVenta.setModel(modelo);

                // Calcular el total de la venta
                calcularTotal();
            } else {
                JOptionPane.showMessageDialog(this, "No hay Stock suficiente para la venta");
            }
        } else {
            JOptionPane.showMessageDialog(this, "STOCK NO DISPONIBLE");
        }
    }

    /**
     * Método para calcular el total a pagar en base a los productos en la tabla
     * de ventas.
     */
    void calcularTotal() {
        // Reiniciar el total a pagar
        totalPagar = 0;

        // Recorrer las filas de la tabla de ventas
        for (int i = 0; i < tableVenta.getRowCount(); i++) {
            // Obtener la cantidad y el precio de cada fila de la tabla de ventas
            cant = Integer.parseInt(tableVenta.getValueAt(i, 3).toString());
            precio = Double.parseDouble(tableVenta.getValueAt(i, 4).toString());
            // Calcular el subtotal y sumarlo al total a pagar
            totalPagar = totalPagar + cant * precio;
        }

        // Mostrar el total a pagar en el campo de texto 'txtTotal'
        txtTotal.setText("" + totalPagar);
    }

    /**
     * Método para buscar un cliente en base a su identificador.
     */
    void buscarCliente() {
        // Declarar una variable entera 'r'
        int r;
        // Obtener el identificador del cliente desde el campo de texto 'txtIdCliente'
        String id = txtIdCliente.getText();

        // Verificar si el campo de texto está vacío
        if (txtIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBES INGRESAR UN IDENTIFICADOR");
        } else {
            // Obtener el cliente correspondiente al identificador desde el ClienteDAO
            cliente = cdao.listarID(Integer.parseInt(id));
            // Verificar si se encontró un cliente con el identificador proporcionado
            if (cliente.getId() != 0) {
                // Mostrar el nombre del cliente en el campo de texto 'txtCliente'
                txtCliente.setText(cliente.getNombre());
                txtIdProducto.requestFocus();
            } else {
                // Mostrar un mensaje de confirmación para agregar un nuevo cliente
                r = JOptionPane.showConfirmDialog(this, "NO ESTA EN EL SISTEMA ¿DESEAS AGREGAR CLIENTE?");
                // Verificar la respuesta del usuario
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
    }

    /**
     * Método para buscar un producto en base a su identificador.
     */
    void buscarProducto() {
        // Declarar una variable entera 'r'
        int r;
        
        // Obtener el identificador del producto desde el campo de texto 'txtIdProducto'
        String id = txtIdProducto.getText();
        // Verificar si el campo de texto está vacío
        if (txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBES INGRESAR UN IDENTIFICADOR");
        } else {
            // Obtener el producto correspondiente al identificador desde el ProductoDAO
            Producto p = pdao.listarID(Integer.parseInt(id));
            // Verificar si se encontró un producto con el identificador proporcionado
            if (p.getId() != 0) {
                // Mostrar los detalles del producto en los campos de texto correspondientes
                txtProducto.setText(p.getNombre());
                txtPrecio.setText(p.getPrecio());
                txtStock.setText(Integer.toString(p.getStock()));
                txtPrecio.requestFocus();
            } else {
                // Mostrar un mensaje de confirmación para agregar un nuevo producto
                r = JOptionPane.showConfirmDialog(this, "NO ESTA EN EL SISTEMA ¿DESEAS AGREGAR CLIENTE?");
                // Verificar la respuesta del usuario
                if (r == 0) {
                    // Abrir el formulario de creación de producto
                    ProductoForm pf = new ProductoForm();
                    Principal.VentanaPrincipal.add(pf);
                    pf.setVisible(true);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarV;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tableVenta;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
