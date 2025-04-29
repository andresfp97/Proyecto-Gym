package VistaGym;

import ModeloDAO.ClienteDAO;
import ModeloDAO.LoginDAO;
import ModeloVO.ClienteVO;
import ModeloVO.Hash;
import ModeloVO.LoginVO;
import Servicios.Conexion;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

public final class Gym extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rss;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    int id;
    ClienteDAO c;
    fondo f = new fondo();
    fondo2 f2 = new fondo2();
    TableRowSorter trs ;

    public Gym() {

        this.setContentPane(f);
        this.setContentPane(f2);
        initComponents();
        setLocationRelativeTo(null);
        listar();
        listar2();
        bloquear();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipal = new javax.swing.JTabbedPane();
        jpInicio = new fondo();
        panelLogin = new fondo2();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jpRegistro = new fondo2();
        panelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jDateFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jpMembresias =  new fondo2();
        panelListaMembresia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMembresia = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jpBuscar = new fondo2();
        panelBuscar = new fondo2() ;
        jLabel9 = new javax.swing.JLabel();
        txtCedula3 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelModificar = new fondo2();
        jLabel4 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jDateFecha1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtCelular1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateFecha3 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jAreaDatos = new javax.swing.JTextArea();
        panelEliminar = new fondo2();
        btnModificar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel6 = new fondo3();
        jLabel2 = new javax.swing.JLabel();
        jpUsuarios = new fondo2();
        panelImagen = new fondo4();
        panelBuscar1 = new fondo2() ;
        jLabel18 = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        panelModificar1 = new fondo2();
        jLabel19 = new javax.swing.JLabel();
        txtModificarUsuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtModificarContra = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtModificarId = new javax.swing.JTextField();
        jComboModificarTipo = new javax.swing.JComboBox<>();
        panelEliminar1 = new fondo2();
        btnModificar2 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        panelEliminar2 = new fondo2();
        btnRegistrarUsuario = new javax.swing.JButton();
        panelModificar2 = new fondo2();
        jLabel23 = new javax.swing.JLabel();
        txtRegistroUsuario = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtRegistroContraseña = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jComboRegistroTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setLocation(new java.awt.Point(0, 0));

        jPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPrincipal.setPreferredSize(new java.awt.Dimension(704, 593));

        jpInicio.setBackground(new java.awt.Color(0, 0, 0));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("USUARIO:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTRASEÑA:");

        BtnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        BtnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("INGRESAR");
        BtnIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(36, 36, 36)
                        .addComponent(txtContra))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPrincipal.addTab("INICIO", jpInicio);

        jpRegistro.setBackground(new java.awt.Color(0, 0, 0));

        panelRegistro.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegistro.setForeground(new java.awt.Color(240, 240, 240));
        panelRegistro.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jDateFecha.setDateFormatString("y/MM/d");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha-Inicio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Celular");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cedula");

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jDateFecha2.setDateFormatString("y/MM/d");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha- fin");

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(txtNombre))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(41, 41, 41)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                                    .addComponent(txtCedula)
                                    .addComponent(jDateFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCedula.getAccessibleContext().setAccessibleName("");
        jDateFecha.getAccessibleContext().setAccessibleName("");

        panelLista.setBackground(new java.awt.Color(51, 51, 51));
        panelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tablaDatos.setBackground(new java.awt.Color(204, 204, 204));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CEDULA", "CELULAR", "FECHA INICIO", "FECHA FIN"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                        .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPrincipal.addTab("REGISTRO DE CLIENTES", jpRegistro);

        panelListaMembresia.setBackground(new java.awt.Color(51, 51, 51));
        panelListaMembresia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tablaMembresia.setBackground(new java.awt.Color(204, 204, 204));
        tablaMembresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CEDULA", "DIAS DE MEMBRESIA ACTIVA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMembresia);

        javax.swing.GroupLayout panelListaMembresiaLayout = new javax.swing.GroupLayout(panelListaMembresia);
        panelListaMembresia.setLayout(panelListaMembresiaLayout);
        panelListaMembresiaLayout.setHorizontalGroup(
            panelListaMembresiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        panelListaMembresiaLayout.setVerticalGroup(
            panelListaMembresiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese un menos \"-\" para filtrar clientes  con membresias caducadas: ");

        javax.swing.GroupLayout jpMembresiasLayout = new javax.swing.GroupLayout(jpMembresias);
        jpMembresias.setLayout(jpMembresiasLayout);
        jpMembresiasLayout.setHorizontalGroup(
            jpMembresiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMembresiasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(panelListaMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addGroup(jpMembresiasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro))
        );
        jpMembresiasLayout.setVerticalGroup(
            jpMembresiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMembresiasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpMembresiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListaMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPrincipal.addTab("MEMBRESIAS", jpMembresias);

        jpBuscar.setBackground(new java.awt.Color(0, 0, 0));

        panelBuscar.setBackground(new java.awt.Color(51, 51, 51));
        panelBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscar.setForeground(new java.awt.Color(240, 240, 240));
        panelBuscar.setToolTipText("");
        panelBuscar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelBuscarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cedula");

        txtCedula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula3ActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel9)
                .addGap(19, 19, 19)
                .addComponent(txtCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCedula3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelModificar.setBackground(new java.awt.Color(51, 51, 51));
        panelModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelModificar.setForeground(new java.awt.Color(240, 240, 240));
        panelModificar.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula:");

        txtCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula1ActionPerformed(evt);
            }
        });

        jDateFecha1.setDateFormatString("y/MM/d");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha inicio:");

        txtCelular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelular1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Celular:");

        txtId.setEditable(false);
        txtId.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha fin:");

        jDateFecha3.setDateFormatString("y/MM/d");

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtCelular1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFecha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre1))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula1))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCelular1))
                .addGap(21, 21, 21)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jDateFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jAreaDatos.setBackground(new java.awt.Color(204, 204, 204));
        jAreaDatos.setColumns(20);
        jAreaDatos.setRows(5);
        jAreaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS ENCONTRADOS"));
        jAreaDatos.setCaretColor(new java.awt.Color(255, 255, 255));
        jAreaDatos.setMaximumSize(new java.awt.Dimension(0, 0));
        jAreaDatos.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane3.setViewportView(jAreaDatos);

        panelEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnModificar1.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar1.setText("MODIFICAR");
        btnModificar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Derechos reservados  Andres Portilla");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBuscarLayout.createSequentialGroup()
                        .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPrincipal.addTab("BUSCAR, ELIMINAR CLIENTES", jpBuscar);

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        panelBuscar1.setBackground(new java.awt.Color(51, 51, 51));
        panelBuscar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscar1.setForeground(new java.awt.Color(240, 240, 240));
        panelBuscar1.setToolTipText("");
        panelBuscar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelBuscar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Usuario");

        txtBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUsuario.setText("BUSCAR");
        btnBuscarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscar1Layout = new javax.swing.GroupLayout(panelBuscar1);
        panelBuscar1.setLayout(panelBuscar1Layout);
        panelBuscar1Layout.setHorizontalGroup(
            panelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscar1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel18)
                .addGap(19, 19, 19)
                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        panelBuscar1Layout.setVerticalGroup(
            panelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelModificar1.setBackground(new java.awt.Color(51, 51, 51));
        panelModificar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelModificar1.setForeground(new java.awt.Color(240, 240, 240));
        panelModificar1.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Usuario");

        txtModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModificarUsuarioActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Contraseña");

        txtModificarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModificarContraActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo");

        txtModificarId.setEditable(false);
        txtModificarId.setBorder(null);

        jComboModificarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "admin" }));

        javax.swing.GroupLayout panelModificar1Layout = new javax.swing.GroupLayout(panelModificar1);
        panelModificar1.setLayout(panelModificar1Layout);
        panelModificar1Layout.setHorizontalGroup(
            panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModificarUsuario)
                    .addComponent(txtModificarContra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboModificarTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(panelModificar1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(txtModificarId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        panelModificar1Layout.setVerticalGroup(
            panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificar1Layout.createSequentialGroup()
                .addComponent(txtModificarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtModificarUsuario))
                .addGap(18, 18, 18)
                .addGroup(panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtModificarContra))
                .addGap(18, 18, 18)
                .addGroup(panelModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboModificarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEliminar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnModificar2.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar2.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar2.setText("MODIFICAR");
        btnModificar2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminar1Layout = new javax.swing.GroupLayout(panelEliminar1);
        panelEliminar1.setLayout(panelEliminar1Layout);
        panelEliminar1Layout.setHorizontalGroup(
            panelEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEliminar1Layout.setVerticalGroup(
            panelEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminar1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panelEliminar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegistrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setText("Registrar Nuevo");
        btnRegistrarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminar2Layout = new javax.swing.GroupLayout(panelEliminar2);
        panelEliminar2.setLayout(panelEliminar2Layout);
        panelEliminar2Layout.setHorizontalGroup(
            panelEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEliminar2Layout.setVerticalGroup(
            panelEliminar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminar2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelModificar2.setBackground(new java.awt.Color(51, 51, 51));
        panelModificar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelModificar2.setForeground(new java.awt.Color(240, 240, 240));
        panelModificar2.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Usuario");

        txtRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroUsuarioActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Contraseña");

        txtRegistroContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroContraseñaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Tipo");

        jComboRegistroTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "admin" }));
        jComboRegistroTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRegistroTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModificar2Layout = new javax.swing.GroupLayout(panelModificar2);
        panelModificar2.setLayout(panelModificar2Layout);
        panelModificar2Layout.setHorizontalGroup(
            panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(txtRegistroContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboRegistroTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelModificar2Layout.setVerticalGroup(
            panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificar2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtRegistroUsuario))
                .addGap(18, 18, 18)
                .addGroup(panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtRegistroContraseña))
                .addGap(18, 18, 18)
                .addGroup(panelModificar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jComboRegistroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addGroup(jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUsuariosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpUsuariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpUsuariosLayout.createSequentialGroup()
                                .addComponent(panelModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpUsuariosLayout.createSequentialGroup()
                                .addComponent(panelModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelEliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addGroup(jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelModificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPrincipal.addTab("REGISTRAR USUARIOS", jpUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtNombre.getText().contentEquals("") || txtCedula.getText().contentEquals("") || txtCelular.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
        } else {
            ClienteVO i = new ClienteVO();
            i.setNombre(txtNombre.getText());
            i.setCedula(txtCedula.getText());
            i.setCelular(txtCelular.getText());
            i.setFecha(((JTextField) jDateFecha.getDateEditor().getUiComponent()).getText());
            i.setFechafin(((JTextField) jDateFecha2.getDateEditor().getUiComponent()).getText());
            ClienteDAO.registrar(i);
            JOptionPane.showMessageDialog(null, "USUARIO AGREGADO");
            limpiarTabla();
            limpiarTablaMembresia();
            listar();
            listar2();
            limpiarCamposRegistroCliente();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

        LoginVO i = new LoginVO();
        String con = new String(txtContra.getPassword());
        if (!txtUsuario.getText().equals("") && !con.equals("")) {
            i.setUsuario(txtUsuario.getText());
            i.setContra(con);

            if (LoginDAO.login(i)) {
                String b = "admin";
                String c = "usuario";

                if (i.getTipo().equals(b)) {
                    JOptionPane.showMessageDialog(null, "BIENVENIDO  MODO ADMINISTRADOR");
                    desbloquearAdmin();
                    jPrincipal.setSelectedIndex(1);
                    txtUsuario.setText("");
                    txtContra.setText("");
                    for (Component a : panelLogin.getComponents()) {
                        a.setEnabled(false);
                    }
                } else if (i.getTipo().equals(c)) {

                    JOptionPane.showMessageDialog(null, "BIENVENIDO MODO USUARIO");
                    desbloquearUsuario();
                    jPrincipal.setSelectedIndex(1);
                    txtUsuario.setText("");
                    txtContra.setText("");
                    for (Component a : panelLogin.getComponents()) {
                        a.setEnabled(false);
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
            }
        } else {

            JOptionPane.showMessageDialog(null, "FALTAN DATOS");
        }

    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ClienteVO i = new ClienteVO();
        i.setCedula(txtCedula3.getText());
        if (c.existeCedula(i)) {
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA ESTA REGISTRADO");
            txtNombre1.setText(i.getNombre());
            txtCedula1.setText(i.getCedula());
            txtCelular1.setText(i.getCelular());
            txtId.setText(i.getId());
            java.sql.Date fecha = null;
            java.sql.Date fechafin = null;

            try {
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd", new Locale("es", "ES"));
                fecha = new java.sql.Date(sdf.parse(i.getFecha()).getTime());
                System.out.println("Fecha con el formato java.sql.Date: " + fecha);
                jDateFecha1.setDate(fecha);

                fechafin = new java.sql.Date(sdf.parse(i.getFechafin()).getTime());
                System.out.println("Fecha con el formato java.sql.Date: " + fechafin);
                jDateFecha3.setDate(fechafin);
                jAreaDatos.setText("Nombre:   " + i.getNombre() + "\nCedula:   " + i.getCedula() + "\nCelular:   " + i.getCelular() + "\nFecha de ingreso:   " + i.getFecha() + "\nFecha de salida :   " + i.getFechafin());

            } catch (Exception ex) {
                System.out.println("Error al obtener el formato de la fecha/hora: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL CLIENTE NO SE ENCUNETRA REGISTRADO");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCedula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula3ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedula1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        ClienteVO i = new ClienteVO();

        if (txtNombre1.getText().contentEquals("") || txtCedula1.getText().contentEquals("")
                || txtCelular1.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "ALGUNOA CAMPOS ESTAN VACIOS");

        } else {
            i.setNombre(txtNombre1.getText());
            i.setCedula(txtCedula1.getText());
            i.setCelular(txtCelular1.getText());
            i.setFecha(((JTextField) jDateFecha1.getDateEditor().getUiComponent()).getText());
            i.setFechafin(((JTextField) jDateFecha3.getDateEditor().getUiComponent()).getText());
            i.setId(txtId.getText());
            ClienteDAO.modificar(i);
            limpiarCamposModificar();
            limpiarTabla();
            limpiarTablaMembresia();
            listar();
            listar2();
            JOptionPane.showMessageDialog(null, "USUARIO MODIFICADO");

        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCelular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelular1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ClienteVO i = new ClienteVO();
        i.setCedula(txtCedula3.getText());
        ClienteDAO.Eliminar(i);
        limpiarCamposModificar();
        limpiarTabla();
        limpiarTablaMembresia();
        listar();
        listar2();
        JOptionPane.showMessageDialog(null, "Cliente eliminado");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void panelBuscarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelBuscarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBuscarAncestorAdded

    private void txtBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        LoginVO i = new LoginVO();
        i.setUsuario(txtBuscarUsuario.getText());
        if (LoginDAO.buscarUsuario(i)) {
            txtModificarUsuario.setText(i.getUsuario());
            txtModificarContra.setText(i.getContra());
            jComboModificarTipo.setSelectedItem(i.getTipo());
            txtModificarId.setText(i.getId());
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA ESTA REGISTRADO");
        } else {
            JOptionPane.showMessageDialog(null, "EL USUARIO NO SE ENCUNETRA REGISTRADO");
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void panelBuscar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelBuscar1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBuscar1AncestorAdded

    private void txtModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarUsuarioActionPerformed

    private void txtModificarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarContraActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
        LoginVO i = new LoginVO();
        if (txtModificarUsuario.getText().contentEquals("") || txtModificarContra.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");

        } else {
            i.setUsuario(txtModificarUsuario.getText());
            i.setContra(txtModificarContra.getText());
            i.setTipo(jComboModificarTipo.getSelectedItem().toString());
            i.setId(txtModificarId.getText());
            LoginDAO.modificarRegistro(i);

            JOptionPane.showMessageDialog(null, "USUARIO MODIFICADO");

            txtBuscarUsuario.setText("");
            txtModificarUsuario.setText("");
            txtModificarContra.setText("");
            txtModificarId.setText("");
            jComboModificarTipo.setSelectedIndex(0);

        }
    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        LoginVO i = new LoginVO();
        i.setUsuario(txtModificarUsuario.getText());
        LoginDAO.Eliminar(i);
        JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO");
        txtBuscarUsuario.setText("");
        txtModificarUsuario.setText("");
        txtModificarContra.setText("");
        txtModificarId.setText("");
        jComboModificarTipo.setSelectedIndex(0);
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        if (txtRegistroUsuario.getText().contentEquals("") || txtRegistroContraseña.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(null, " HAY CAMPOS VACIOS");
        } else if (rootPaneCheckingEnabled) {
            LoginVO i = new LoginVO();
            i.setUsuario(txtRegistroUsuario.getText());
            i.setContra(txtRegistroContraseña.getText());
            i.setTipo(jComboRegistroTipo.getSelectedItem().toString());
            LoginDAO.registrar(i);
            JOptionPane.showMessageDialog(null, "USUARIO AGREGADO");
            limpiarRegistroUsuario();
        }

    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void txtRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroUsuarioActionPerformed

    private void txtRegistroContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroContraseñaActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        
        
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
               trs.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), 2));
            }
        });
        
        trs = new TableRowSorter(modelo1);
        tablaMembresia.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void jComboRegistroTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRegistroTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRegistroTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JTextArea jAreaDatos;
    private javax.swing.JComboBox<String> jComboModificarTipo;
    private javax.swing.JComboBox<String> jComboRegistroTipo;
    public com.toedter.calendar.JDateChooser jDateFecha;
    public com.toedter.calendar.JDateChooser jDateFecha1;
    public com.toedter.calendar.JDateChooser jDateFecha2;
    public com.toedter.calendar.JDateChooser jDateFecha3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpMembresias;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelBuscar1;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelEliminar1;
    private javax.swing.JPanel panelEliminar2;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel panelListaMembresia;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelModificar1;
    private javax.swing.JPanel panelModificar2;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tablaMembresia;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedula3;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModificarContra;
    private javax.swing.JTextField txtModificarId;
    private javax.swing.JTextField txtModificarUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtRegistroContraseña;
    private javax.swing.JTextField txtRegistroUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
class fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/gym.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class fondo2 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/img2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    class fondo3 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/leon.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    class fondo4 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/hombre.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    void listar() {
        String sql = "select * from cliente";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rss = st.executeQuery(sql);
            Object[] persona = new Object[5];
            modelo = (DefaultTableModel) tablaDatos.getModel();
            while (rss.next()) {

                persona[0] = rss.getString("nombre");
                persona[1] = rss.getString("cedula");
                persona[2] = rss.getString("celular");
                persona[3] = rss.getDate("fecha");
                persona[4] = rss.getDate("fechafin");
                modelo.addRow(persona);
            }
            tablaDatos.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void listar2() {
        ClienteVO i = new ClienteVO();
        ArrayList<Object> listaMembresia = new ArrayList<Object>();

        String sql = "select * from cliente";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rss = st.executeQuery(sql);
            
            Date fechaInicial;
            fechaInicial = new Date();
            Date fechaFin;
            modelo1 = (DefaultTableModel) tablaMembresia.getModel();

            while (rss.next()) {
              
                i.setFechafin(rss.getString("fechafin"));
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd", new Locale("es", "ES"));
                sdf.setTimeZone(TimeZone.getDefault());

                String fecha = sdf.format(fechaInicial);
                fechaFin = new java.sql.Date(sdf.parse(i.getFechafin()).getTime());
                int dias = (int) ((fechaFin.getTime() - fechaInicial.getTime()) / 86400000);
                listaMembresia.add(rss.getString("nombre") + rss.getString("cedula") + dias);

                String datos[] = new String[3];

                datos[0] = rss.getString("nombre");
                datos[1] = rss.getString("cedula");
                datos[2] = Integer.toString(dias);
                modelo1.addRow(datos);

            }
            tablaMembresia.setModel(modelo1);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void limpiarTabla() {
        for (int i = 0; i < tablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
    
    void limpiarTablaMembresia() {
        for (int i = 0; i < tablaMembresia.getRowCount(); i++) {
            modelo1.removeRow(i);
            i = i - 1;
        }

    }

    void limpiarCamposModificar() {
        txtNombre1.setText(null);
        txtCedula1.setText(null);
        txtCelular1.setText(null);
        jDateFecha1.setDate(null);
        jDateFecha3.setDate(null);
        jAreaDatos.setText(null);

    }

    void limpiarCamposRegistroCliente() {
        txtNombre.setText(null);
        txtCedula.setText(null);
        txtCelular.setText(null);
        jDateFecha.setDate(null);
        jDateFecha2.setDate(null);
    }

    void limpiarRegistroUsuario() {
        txtRegistroUsuario.setText("");
        txtRegistroContraseña.setText("");

    }

    void bloquear() {

        for (Component a : jpBuscar.getComponents()) {

            a.setVisible(false);
        }

        for (Component a : jpRegistro.getComponents()) {

            a.setVisible(false);
        }

        for (Component a : jpUsuarios.getComponents()) {

            a.setVisible(false);
        }
        for (Component a : jpMembresias.getComponents()) {

            a.setVisible(false);
        }

    }

    void desbloquearAdmin() {

        for (Component a : jpBuscar.getComponents()) {

            a.setVisible(true);
        }

        for (Component a : jpRegistro.getComponents()) {

            a.setVisible(true);
        }
        for (Component a : jpUsuarios.getComponents()) {

            a.setVisible(true);
        }
        for (Component a : jpMembresias.getComponents()) {

            a.setVisible(true);
        }

    }

    void desbloquearUsuario() {

        for (Component a : jpBuscar.getComponents()) {

            a.setVisible(true);
        }

        for (Component a : jpRegistro.getComponents()) {

            a.setVisible(true);
        }
        
        for (Component a : jpMembresias.getComponents()) {

            a.setVisible(true);
        }
    }

}
