package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;


/**
 *
 * @author MagicPOS
 */
public class Venta extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public Venta() {
    this.setContentPane(fondo);
    initComponents();
    this.setExtendedState(this.MAXIMIZED_BOTH);
    
    tablaVenta.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
    tablaVenta.getTableHeader().setOpaque(false);
    tablaVenta.getTableHeader().setBackground(Color.WHITE);
    
//    tablaUsuario.setPreferredSize(new Dimension(panelContenedor.getSize()));
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelOpciones = new javax.swing.JPanel();
    Separador = new javax.swing.JTextField();
    botonSeleccionar = new RoundJButton(7);
    botonTerminarComp = new RoundJButton(7);
    etiquetaTotalPag = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    Separador1 = new javax.swing.JTextField();
    etiquetaTicket = new javax.swing.JLabel();
    etiquetaTotalTick = new javax.swing.JLabel();
    campoTotal = new RoundJPasswordField(7);
    etiquetaEfectivo = new javax.swing.JLabel();
    campoEfectivo = new RoundJPasswordField(7);
    etiquetaCambio = new javax.swing.JLabel();
    campoCambio = new RoundJPasswordField(7);
    etiquetaTotal = new javax.swing.JLabel();
    botonEliminar = new RoundJButton(7);
    botonRegresar = new RoundJButton(7);
    panelContenedor = new javax.swing.JPanel();
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaVenta = new javax.swing.JTable();
    etiquetaFolioVent = new javax.swing.JLabel();
    campoFolio = new RoundJPasswordField(7);
    etiquetaFechaReg = new javax.swing.JLabel();
    campoFechaReg = new RoundJPasswordField(7);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(1080, 720));
    setSize(new java.awt.Dimension(800, 550));

    panelOpciones.setBackground(new java.awt.Color(252, 168, 1));
    panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Separador.setEditable(false);
    Separador.setBackground(new java.awt.Color(255, 212, 1));
    Separador.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
    Separador.setBorder(null);
    Separador.setMinimumSize(new java.awt.Dimension(0, 0));
    panelOpciones.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 10));

    botonSeleccionar.setBackground(new java.awt.Color(255, 255, 255));
    botonSeleccionar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonSeleccionar.setText("Seleccionar producto");
    botonSeleccionar.setBorder(null);
    botonSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonSeleccionar.setPreferredSize(new java.awt.Dimension(71, 20));
    botonSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonSeleccionarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonSeleccionarMouseExited(evt);
      }
    });
    panelOpciones.add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 40));

    botonTerminarComp.setBackground(new java.awt.Color(174, 33, 0));
    botonTerminarComp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonTerminarComp.setForeground(new java.awt.Color(255, 255, 255));
    botonTerminarComp.setText("Terminar compra");
    botonTerminarComp.setBorder(null);
    botonTerminarComp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonTerminarComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonTerminarComp.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonTerminarCompMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonTerminarCompMouseExited(evt);
      }
    });
    panelOpciones.add(botonTerminarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 260, 30));

    etiquetaTotalPag.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    etiquetaTotalPag.setForeground(new java.awt.Color(255, 255, 255));
    etiquetaTotalPag.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaTotalPag.setText("0.0");
    panelOpciones.add(etiquetaTotalPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 250, -1));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    Separador1.setEditable(false);
    Separador1.setBackground(new java.awt.Color(0, 0, 0));
    Separador1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
    Separador1.setBorder(null);
    Separador1.setMinimumSize(new java.awt.Dimension(0, 0));

    etiquetaTicket.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
    etiquetaTicket.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    etiquetaTicket.setText("Ticket");
    etiquetaTicket.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

    etiquetaTotalTick.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
    etiquetaTotalTick.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaTotalTick.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaTotalTick.setText("Total MXN $:");
    etiquetaTotalTick.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

    campoTotal.setBackground(new java.awt.Color(208, 208, 208));
    campoTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoTotal.setForeground(new java.awt.Color(150, 150, 150));
    campoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoTotal.setBorder(null);

    etiquetaEfectivo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
    etiquetaEfectivo.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaEfectivo.setText("Efectivo:");
    etiquetaEfectivo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

    campoEfectivo.setBackground(new java.awt.Color(208, 208, 208));
    campoEfectivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoEfectivo.setForeground(new java.awt.Color(150, 150, 150));
    campoEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoEfectivo.setBorder(null);

    etiquetaCambio.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
    etiquetaCambio.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaCambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaCambio.setText("Cambio:");
    etiquetaCambio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

    campoCambio.setBackground(new java.awt.Color(208, 208, 208));
    campoCambio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCambio.setForeground(new java.awt.Color(150, 150, 150));
    campoCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCambio.setBorder(null);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(etiquetaTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(etiquetaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(etiquetaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(etiquetaTotalTick, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(etiquetaTicket)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(etiquetaTotalTick)
          .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(etiquetaEfectivo)
          .addComponent(campoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(etiquetaCambio)
          .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(23, Short.MAX_VALUE))
    );

    panelOpciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 300, 170));

    etiquetaTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    etiquetaTotal.setForeground(new java.awt.Color(255, 255, 255));
    etiquetaTotal.setText("Total MXN $:");
    panelOpciones.add(etiquetaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, -1));

    botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
    botonEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonEliminar.setText("Eliminar producto");
    botonEliminar.setBorder(null);
    botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonEliminar.setPreferredSize(new java.awt.Dimension(71, 20));
    botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonEliminarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonEliminarMouseExited(evt);
      }
    });
    panelOpciones.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 40));

    botonRegresar.setBackground(getBackground());
    botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonRegresar.setBorder(null);
    botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panelOpciones.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

    panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
    panelContenedor.setMaximumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setMinimumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setPreferredSize(new java.awt.Dimension(653, 363));
    panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoHorizontal.png"))); // NOI18N
    panelContenedor.add(etiquetaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 44)); // NOI18N
    etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    etiquetaTitulo.setText("Venta");
    panelContenedor.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

    tablaVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
    tablaVenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Cantidad", "Producto", "Precio unitario", "Descuento", "Importe"
      }
    ));
    tablaVenta.setFocusable(false);
    tablaVenta.setGridColor(new java.awt.Color(150, 150, 150));
    tablaVenta.setIntercellSpacing(new java.awt.Dimension(0, 0));
    tablaVenta.setRowHeight(25);
    tablaVenta.setSelectionBackground(new java.awt.Color(254, 163, 88));
    tablaVenta.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tablaVenta);

    panelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, 670, 490));

    etiquetaFolioVent.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
    etiquetaFolioVent.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaFolioVent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaFolioVent.setText("Folio de venta:");
    etiquetaFolioVent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    panelContenedor.add(etiquetaFolioVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, -1));

    campoFolio.setBackground(new java.awt.Color(208, 208, 208));
    campoFolio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoFolio.setForeground(new java.awt.Color(150, 150, 150));
    campoFolio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoFolio.setBorder(null);
    panelContenedor.add(campoFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 100, -1));

    etiquetaFechaReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
    etiquetaFechaReg.setForeground(new java.awt.Color(0, 0, 0));
    etiquetaFechaReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaFechaReg.setText("Fecha de registro:");
    etiquetaFechaReg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    panelContenedor.add(etiquetaFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 180, -1));

    campoFechaReg.setBackground(new java.awt.Color(208, 208, 208));
    campoFechaReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoFechaReg.setForeground(new java.awt.Color(150, 150, 150));
    campoFechaReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoFechaReg.setBorder(null);
    panelContenedor.add(campoFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 110, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botonSeleccionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarMouseEntered
    botonSeleccionar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonSeleccionarMouseEntered

  private void botonSeleccionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarMouseExited
    botonSeleccionar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonSeleccionarMouseExited

  private void botonTerminarCompMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTerminarCompMouseEntered
    botonTerminarComp.setBackground(new Color(208, 75, 42));
  }//GEN-LAST:event_botonTerminarCompMouseEntered

  private void botonTerminarCompMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTerminarCompMouseExited
    botonTerminarComp.setBackground(new Color(174, 33, 0));
  }//GEN-LAST:event_botonTerminarCompMouseExited

  private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
    botonEliminar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonEliminarMouseEntered

  private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
    botonEliminar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonEliminarMouseExited

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
  private javax.swing.JTextField Separador;
  private javax.swing.JTextField Separador1;
  private javax.swing.JButton botonEliminar;
  private javax.swing.JButton botonRegresar;
  private javax.swing.JButton botonSeleccionar;
  private javax.swing.JButton botonTerminarComp;
  private javax.swing.JPasswordField campoCambio;
  private javax.swing.JPasswordField campoEfectivo;
  private javax.swing.JPasswordField campoFechaReg;
  private javax.swing.JPasswordField campoFolio;
  private javax.swing.JPasswordField campoTotal;
  private javax.swing.JLabel etiquetaCambio;
  private javax.swing.JLabel etiquetaEfectivo;
  private javax.swing.JLabel etiquetaFechaReg;
  private javax.swing.JLabel etiquetaFolioVent;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaTicket;
  private javax.swing.JLabel etiquetaTitulo;
  private javax.swing.JLabel etiquetaTotal;
  private javax.swing.JLabel etiquetaTotalPag;
  private javax.swing.JLabel etiquetaTotalTick;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel panelContenedor;
  private javax.swing.JPanel panelOpciones;
  private javax.swing.JTable tablaVenta;
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
      g.setColor(Color.WHITE);
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
