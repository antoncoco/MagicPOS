package vistas;

import controladores.DAOProveedorImpl;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelos.Proveedor;

/**
 *
 * @author MagicPOS
 */
public class AgregarProveedor extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public AgregarProveedor() {
    this.setContentPane(fondo);
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelContenedor = new javax.swing.JPanel();
    etiquetaTitulo = new javax.swing.JLabel();
    botonIngresar = new RoundJButton(7);
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaDescripCont = new javax.swing.JLabel();
    etiquetaCalle = new javax.swing.JLabel();
    etiquetaRFC = new javax.swing.JLabel();
    etiquetaNombreCont = new javax.swing.JLabel();
    campoDescripCont = new RoundJTextField(7);
    campoNombreCont = new RoundJTextField(7);
    campoRFC = new RoundJTextField(7);
    campoCalle = new RoundJTextField(7);
    campoNumExt = new RoundJTextField(7);
    etiquetaNumExt = new javax.swing.JLabel();
    campoNombre = new RoundJTextField(7);
    etiquetanNombre = new javax.swing.JLabel();
    campoCP = new RoundJTextField(7);
    campoCiudad = new RoundJTextField(7);
    etiquetaCiudad = new javax.swing.JLabel();
    etiquetaCP = new javax.swing.JLabel();
    campoCorreo = new RoundJTextField(7);
    etiquetaCorreo = new javax.swing.JLabel();
    etiquetaTelefono = new javax.swing.JLabel();
    campoTelefono = new RoundJTextField(7);
    campoEstado = new RoundJTextField(7);
    etiquetaEstado = new javax.swing.JLabel();
    campoNumInt = new RoundJTextField(7);
    etiquetaNumInt = new javax.swing.JLabel();
    campoSitioWeb = new RoundJTextField(7);
    etiquetaSitioWeb = new javax.swing.JLabel();
    botonRegresar = new RoundJButton(7);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(800, 550));
    setResizable(false);
    setSize(new java.awt.Dimension(800, 550));

    panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
    panelContenedor.setMaximumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setMinimumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setPreferredSize(new java.awt.Dimension(653, 363));

    etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
    etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    etiquetaTitulo.setText("Agregar proveedor");

    botonIngresar.setBackground(new java.awt.Color(254, 163, 88));
    botonIngresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
    botonIngresar.setBorder(null);
    botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonIngresar.setLabel("Ingresar");
    botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonIngresarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonIngresarMouseExited(evt);
      }
    });
    botonIngresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonIngresarActionPerformed(evt);
      }
    });

    etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoHorizontal.png"))); // NOI18N

    etiquetaDescripCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaDescripCont.setText("Descripci??n de contacto:");

    etiquetaCalle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCalle.setText("Calle:");

    etiquetaRFC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaRFC.setText("RFC:");

    etiquetaNombreCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaNombreCont.setText("Nombre de contacto:");

    campoDescripCont.setBackground(new java.awt.Color(208, 208, 208));
    campoDescripCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoDescripCont.setForeground(new java.awt.Color(150, 150, 150));
    campoDescripCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoDescripCont.setBorder(null);

    campoNombreCont.setBackground(new java.awt.Color(208, 208, 208));
    campoNombreCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoNombreCont.setForeground(new java.awt.Color(150, 150, 150));
    campoNombreCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoNombreCont.setBorder(null);

    campoRFC.setBackground(new java.awt.Color(208, 208, 208));
    campoRFC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoRFC.setForeground(new java.awt.Color(150, 150, 150));
    campoRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoRFC.setBorder(null);

    campoCalle.setBackground(new java.awt.Color(208, 208, 208));
    campoCalle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCalle.setForeground(new java.awt.Color(150, 150, 150));
    campoCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCalle.setBorder(null);

    campoNumExt.setBackground(new java.awt.Color(208, 208, 208));
    campoNumExt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoNumExt.setForeground(new java.awt.Color(150, 150, 150));
    campoNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoNumExt.setBorder(null);

    etiquetaNumExt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaNumExt.setText("N??mero exterior:");

    campoNombre.setBackground(new java.awt.Color(208, 208, 208));
    campoNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoNombre.setForeground(new java.awt.Color(150, 150, 150));
    campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoNombre.setBorder(null);

    etiquetanNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetanNombre.setText("Nombre:");

    campoCP.setBackground(new java.awt.Color(208, 208, 208));
    campoCP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCP.setForeground(new java.awt.Color(150, 150, 150));
    campoCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCP.setBorder(null);

    campoCiudad.setBackground(new java.awt.Color(208, 208, 208));
    campoCiudad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCiudad.setForeground(new java.awt.Color(150, 150, 150));
    campoCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCiudad.setBorder(null);

    etiquetaCiudad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCiudad.setText("Ciudad:");

    etiquetaCP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCP.setText("CP:");

    campoCorreo.setBackground(new java.awt.Color(208, 208, 208));
    campoCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCorreo.setForeground(new java.awt.Color(150, 150, 150));
    campoCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCorreo.setBorder(null);

    etiquetaCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCorreo.setText("Correo:");

    etiquetaTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaTelefono.setText("Telefono:");

    campoTelefono.setBackground(new java.awt.Color(208, 208, 208));
    campoTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoTelefono.setForeground(new java.awt.Color(150, 150, 150));
    campoTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoTelefono.setBorder(null);

    campoEstado.setBackground(new java.awt.Color(208, 208, 208));
    campoEstado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoEstado.setForeground(new java.awt.Color(150, 150, 150));
    campoEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoEstado.setBorder(null);

    etiquetaEstado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaEstado.setText("Estado:");

    campoNumInt.setBackground(new java.awt.Color(208, 208, 208));
    campoNumInt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoNumInt.setForeground(new java.awt.Color(150, 150, 150));
    campoNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoNumInt.setBorder(null);

    etiquetaNumInt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaNumInt.setText("N??mero interior:");

    campoSitioWeb.setBackground(new java.awt.Color(208, 208, 208));
    campoSitioWeb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoSitioWeb.setForeground(new java.awt.Color(150, 150, 150));
    campoSitioWeb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoSitioWeb.setBorder(null);

    etiquetaSitioWeb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaSitioWeb.setText("Sitio web:");

    botonRegresar.setBackground(new java.awt.Color(255, 255, 255));
    botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonRegresar.setBorder(null);
    botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonRegresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonRegresarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
    panelContenedor.setLayout(panelContenedorLayout);
    panelContenedorLayout.setHorizontalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(etiquetaNumExt, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(etiquetaCalle, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(etiquetanNombre, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(etiquetaRFC, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(etiquetaNombreCont, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(etiquetaDescripCont, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(campoDescripCont, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoCalle)
            .addComponent(campoNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNombreCont, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoRFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(29, 29, 29)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
            .addComponent(etiquetaNumInt)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(campoNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(etiquetaTelefono)
                .addComponent(etiquetaSitioWeb))
              .addComponent(etiquetaCP, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(etiquetaCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(etiquetaEstado, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(etiquetaCiudad, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(campoCorreo)
                .addComponent(campoTelefono)
                .addComponent(campoSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoEstado)
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(campoCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(38, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(169, 169, 169))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(187, 187, 187)
            .addComponent(botonRegresar)
            .addContainerGap())))
    );
    panelContenedorLayout.setVerticalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
        .addComponent(etiquetaTitulo)
        .addGap(18, 18, 18)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addComponent(etiquetaRFC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetanNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addComponent(campoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(campoNombreCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(etiquetaNombreCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(campoDescripCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(etiquetaDescripCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(etiquetaCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(campoNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(etiquetaNumExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(etiquetaNumInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(campoNumInt))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaEstado))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaCiudad))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaCP))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaCorreo))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(etiquetaTelefono)
              .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(etiquetaSitioWeb)
              .addComponent(campoSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(botonRegresar)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(73, 73, 73)
        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(89, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(82, 82, 82)
        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(105, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseExited
    botonIngresar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonIngresarMouseExited

  private void botonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseEntered
    botonIngresar.setBackground(new Color(255, 109, 0));
  }//GEN-LAST:event_botonIngresarMouseEntered

  private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
    String rfc = this.campoRFC.getText();
    String nombre = this.campoNombre.getText();
    String contNombre = this.campoNombreCont.getText();
    String contDescrip = this.campoDescripCont.getText();
    String calle = this.campoCalle.getText();
    String numExt = this.campoNumExt.getText();
    String numInt = this.campoNumInt.getText();
    String estado = this.campoEstado.getText();
    String ciudad = this.campoCiudad.getText();
    String cp = this.campoCP.getText();
    String correo = this.campoCorreo.getText();
    String telefono = this.campoTelefono.getText();
    String sitioW = this.campoSitioWeb.getText();

    DAOProveedorImpl provImpl = new DAOProveedorImpl();
    Proveedor prov = new Proveedor(rfc, nombre, contNombre,
      contDescrip, calle, numExt, numInt, estado, ciudad,
      cp, correo, telefono, sitioW);

    if (provImpl.insertar(prov)) {
      JOptionPane.showMessageDialog(this, "Usuario agragado con ??xito",
        "Eureka!", JOptionPane.INFORMATION_MESSAGE);
      this.campoCP.setText("");
      this.campoCalle.setText("");
      this.campoCiudad.setText("");
      this.campoCorreo.setText("");
      this.campoDescripCont.setText("");
      this.campoEstado.setText("");
      this.campoNombre.setText("");
      this.campoNombreCont.setText("");
      this.campoNumInt.setText("");
      this.campoNumExt.setText("");
      this.campoRFC.setText("");
      this.campoSitioWeb.setText("");
      this.campoTelefono.setText("");
    } else {
      JOptionPane.showMessageDialog(this, "Algo sali?? mal, intente m??s tarde",
        "Oh no!", JOptionPane.ERROR_MESSAGE);
    }


  }//GEN-LAST:event_botonIngresarActionPerformed

  private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    Inventario inventario = new Inventario();
    inventario.setLocationRelativeTo(this);
    inventario.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_botonRegresarActionPerformed

  /**
   * @param args the command line arguments
   */
  //  public static void main(String args[]) {
  //    /* Set the Nimbus look and feel */
  //    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
  //    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
  //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
  //     */
  //    try {
  //      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
  //        if ("Nimbus".equals(info.getName())) {
  //          javax.swing.UIManager.setLookAndFeel(info.getClassName());
  //          break;
  //        }
  //      }
  //    } catch (ClassNotFoundException ex) {
  //      java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //    } catch (InstantiationException ex) {
  //      java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //    } catch (IllegalAccessException ex) {
  //      java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
  //      java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //    }
  //    //</editor-fold>
  //
  //    /* Create and display the form */
  //    java.awt.EventQueue.invokeLater(new Runnable() {
  //      public void run() {
  //        new IniciarSesion().setVisible(true);
  //      }
  //    });
  //  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonIngresar;
  private javax.swing.JButton botonRegresar;
  private javax.swing.JTextField campoCP;
  private javax.swing.JTextField campoCalle;
  private javax.swing.JTextField campoCiudad;
  private javax.swing.JTextField campoCorreo;
  private javax.swing.JTextField campoDescripCont;
  private javax.swing.JTextField campoEstado;
  private javax.swing.JTextField campoNombre;
  private javax.swing.JTextField campoNombreCont;
  private javax.swing.JTextField campoNumExt;
  private javax.swing.JTextField campoNumInt;
  private javax.swing.JTextField campoRFC;
  private javax.swing.JTextField campoSitioWeb;
  private javax.swing.JTextField campoTelefono;
  private javax.swing.JLabel etiquetaCP;
  private javax.swing.JLabel etiquetaCalle;
  private javax.swing.JLabel etiquetaCiudad;
  private javax.swing.JLabel etiquetaCorreo;
  private javax.swing.JLabel etiquetaDescripCont;
  private javax.swing.JLabel etiquetaEstado;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaNombreCont;
  private javax.swing.JLabel etiquetaNumExt;
  private javax.swing.JLabel etiquetaNumInt;
  private javax.swing.JLabel etiquetaRFC;
  private javax.swing.JLabel etiquetaSitioWeb;
  private javax.swing.JLabel etiquetaTelefono;
  private javax.swing.JLabel etiquetaTitulo;
  private javax.swing.JLabel etiquetanNombre;
  private javax.swing.JPanel panelContenedor;
  // End of variables declaration//GEN-END:variables

  class FondoPanel extends JPanel {

    private Image imagen;

    public void paint(Graphics g) {
      imagen = new ImageIcon(getClass().getResource("/assets/fondoGeneral.jpg")).getImage();
      g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
      setOpaque(false);
      super.paint(g);
    }

  }

  class RoundJTextField extends JTextField {

    private Shape shape;

    public RoundJTextField(int size) {
      super(size);
      setOpaque(false); // As suggested by @AVD in comment.
    }

    protected void paintComponent(Graphics g) {
      g.setColor(getBackground());
      g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
      g.setColor(new Color(208, 208, 208));
      g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public boolean contains(int x, int y) {
      if (shape == null || !shape.getBounds().equals(getBounds())) {
        shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      }
      return shape.contains(x, y);
    }
  }

  class RoundJPasswordField extends JPasswordField {

    private Shape shape;

    public RoundJPasswordField(int size) {
      super(size);
      setOpaque(false); // As suggested by @AVD in comment.
    }

    protected void paintComponent(Graphics g) {
      g.setColor(getBackground());
      g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
      g.setColor(new Color(208, 208, 208));
      g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public boolean contains(int x, int y) {
      if (shape == null || !shape.getBounds().equals(getBounds())) {
        shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      }
      return shape.contains(x, y);
    }
  }

  class RoundJComboBox extends JComboBox {

    private Shape shape;

    public RoundJComboBox(int size) {
      super();
      setOpaque(false); // As suggested by @AVD in comment.
    }

    protected void paintComponent(Graphics g) {
      g.setColor(getBackground());
      g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
      g.setColor(new Color(208, 208, 208));
      g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public boolean contains(int x, int y) {
      if (shape == null || !shape.getBounds().equals(getBounds())) {
        shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      }
      return shape.contains(x, y);
    }
  }

  class RoundJButton extends JButton {

    private Shape shape;

    public RoundJButton(int size) {
      setOpaque(false); // As suggested by @AVD in comment.
    }

    protected void paintComponent(Graphics g) {
      g.setColor(getBackground());
      g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
      g.setColor(new Color(208, 208, 208));
      g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public boolean contains(int x, int y) {
      if (shape == null || !shape.getBounds().equals(getBounds())) {
        shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
      }
      return shape.contains(x, y);
    }
  }

}
