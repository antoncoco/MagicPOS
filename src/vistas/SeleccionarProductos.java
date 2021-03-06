package vistas;

import controladores.DAOVentaImpl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MagicPOS
 */
public class SeleccionarProductos extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();
  JTable tablaVentas;
  JLabel ventaTotal;

  /**
   * Creates new form IniciarSesion
   * @param ventaTotal
   * @param tablaVentas
   */
  

  public SeleccionarProductos(JTable tablaVentas, JLabel ventaTotal) {
    this.tablaVentas = tablaVentas;
    this.ventaTotal = ventaTotal;
    this.setContentPane(fondo);
    initComponents();
    DAOVentaImpl selectVent = new DAOVentaImpl();
    tablaListaProd.setModel(selectVent.listarProd());
    tablaListaProd.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
    tablaListaProd.getTableHeader().setOpaque(false);
    tablaListaProd.getTableHeader().setBackground(Color.WHITE);
    
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
    etiquetaLista = new javax.swing.JLabel();
    etiquetaOpciones = new javax.swing.JLabel();
    botonBuscar = new RoundJButton(7);
    Separador = new javax.swing.JTextField();
    campoBuscar = new RoundJTextField(7);
    botonAgregarProd = new RoundJButton(7);
    etiquetaCantidad = new javax.swing.JLabel();
    botonRegresar = new RoundJButton(7);
    campoCantidad = new RoundJTextField(7);
    panelContenedor = new javax.swing.JPanel();
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaListaProd = new javax.swing.JTable();
    etiquetaNombreList = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(1080, 720));
    setResizable(false);
    setSize(new java.awt.Dimension(800, 550));

    panelOpciones.setBackground(new java.awt.Color(252, 168, 1));
    panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    etiquetaLista.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    etiquetaLista.setForeground(new java.awt.Color(255, 255, 255));
    etiquetaLista.setText("Lista de");
    panelOpciones.add(etiquetaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 170, -1));

    etiquetaOpciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    etiquetaOpciones.setForeground(new java.awt.Color(255, 255, 255));
    etiquetaOpciones.setText("opciones");
    panelOpciones.add(etiquetaOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 180, -1));

    botonBuscar.setBackground(new java.awt.Color(196, 196, 196));
    botonBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buscador.png"))); // NOI18N
    botonBuscar.setBorder(null);
    botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonBuscar.setPreferredSize(new java.awt.Dimension(71, 20));
    botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonBuscarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonBuscarMouseExited(evt);
      }
    });
    botonBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonBuscarActionPerformed(evt);
      }
    });
    panelOpciones.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 40, 40));

    Separador.setEditable(false);
    Separador.setBackground(new java.awt.Color(255, 212, 1));
    Separador.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
    Separador.setBorder(null);
    Separador.setMinimumSize(new java.awt.Dimension(0, 0));
    panelOpciones.add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 10));

    campoBuscar.setColumns(3);
    campoBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    campoBuscar.setForeground(new java.awt.Color(196, 196, 196));
    campoBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    campoBuscar.setText("Buscar producto");
    campoBuscar.setBorder(null);
    campoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        campoBuscarMousePressed(evt);
      }
    });
    panelOpciones.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 40));

    botonAgregarProd.setBackground(new java.awt.Color(174, 33, 0));
    botonAgregarProd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
    botonAgregarProd.setText("Agregar producto");
    botonAgregarProd.setBorder(null);
    botonAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonAgregarProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonAgregarProd.setPreferredSize(new java.awt.Dimension(71, 20));
    botonAgregarProd.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonAgregarProdMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonAgregarProdMouseExited(evt);
      }
    });
    botonAgregarProd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonAgregarProdActionPerformed(evt);
      }
    });
    panelOpciones.add(botonAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 300, 40));

    etiquetaCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    etiquetaCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    etiquetaCantidad.setText("Cantidad:");
    panelOpciones.add(etiquetaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 213, 90, 40));

    botonRegresar.setBackground(new java.awt.Color(252, 168, 1));
    botonRegresar.setForeground(new java.awt.Color(252, 168, 1));
    botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonRegresar.setBorder(null);
    botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonRegresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonRegresarActionPerformed(evt);
      }
    });
    panelOpciones.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

    campoCantidad.setBackground(new java.awt.Color(208, 208, 208));
    campoCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCantidad.setForeground(new java.awt.Color(150, 150, 150));
    campoCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCantidad.setBorder(null);
    panelOpciones.add(campoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, 30));

    panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
    panelContenedor.setMaximumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setMinimumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setPreferredSize(new java.awt.Dimension(653, 363));
    panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoHorizontal.png"))); // NOI18N
    panelContenedor.add(etiquetaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 44)); // NOI18N
    etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    etiquetaTitulo.setText("Seleccionar productos");
    panelContenedor.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

    tablaListaProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
    tablaListaProd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    tablaListaProd.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Folio", "Producto", "Cantidad", "Precio", "Fecha de registro", "Caducidad"
      }
    ));
    tablaListaProd.setFocusable(false);
    tablaListaProd.setGridColor(new java.awt.Color(150, 150, 150));
    tablaListaProd.setIntercellSpacing(new java.awt.Dimension(0, 0));
    tablaListaProd.setRowHeight(25);
    tablaListaProd.setSelectionBackground(new java.awt.Color(254, 163, 88));
    tablaListaProd.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tablaListaProd);

    panelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, 670, 490));

    etiquetaNombreList.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
    etiquetaNombreList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    etiquetaNombreList.setText("Lista de productos");
    etiquetaNombreList.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    panelContenedor.add(etiquetaNombreList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));

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

  private void botonAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProdActionPerformed
    // TODO add your handling code here:
    String cantidad = this.campoCantidad.getText();
    int filaSeleccionada = this.tablaListaProd.getSelectedRow();
    //    int cantidadProd = Integer.parseInt(cantidad);
    int aux = 1;
    
    
    if(filaSeleccionada == -1){
      JOptionPane.showMessageDialog(rootPane, "No se seleccion?? ning??n producto", "Alerta", JOptionPane.WARNING_MESSAGE);
    }else if(cantidad.length() == 0 || cantidad.equals("0")){
      JOptionPane.showMessageDialog(rootPane, "La cantidad no puede ser 0", "Alerta", JOptionPane.WARNING_MESSAGE);
    }else {
      String folioInv = this.tablaListaProd.getValueAt(filaSeleccionada, 0).toString();
      String prodNombre = this.tablaListaProd.getValueAt(filaSeleccionada, 1).toString();
      double precio = Double.parseDouble(this.tablaListaProd.getValueAt(filaSeleccionada, 3).toString());
      DefaultTableModel dftable =(DefaultTableModel) this.tablaVentas.getModel();
      int cantidadEntero = Integer.parseInt(cantidad);
      double totalTmp = cantidadEntero*precio;
      Object[] arr = {cantidadEntero, prodNombre,precio, 0.0, totalTmp};
      dftable.addRow(arr);
      double precioFinal = Double.parseDouble(this.ventaTotal.getText()) + totalTmp;
      this.ventaTotal.setText(String.valueOf(precioFinal));
      this.dispose();
    }
  }//GEN-LAST:event_botonAgregarProdActionPerformed

  private void botonAgregarProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarProdMouseExited
    botonAgregarProd.setBackground(new Color(174, 33, 0));
  }//GEN-LAST:event_botonAgregarProdMouseExited

  private void botonAgregarProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarProdMouseEntered
    botonAgregarProd.setBackground(new Color(208, 75, 42));
  }//GEN-LAST:event_botonAgregarProdMouseEntered

  private void campoBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoBuscarMousePressed
    if (campoBuscar.getText().equals("Buscar producto")) {
      campoBuscar.setText("");
      campoBuscar.setForeground(new Color(150, 150, 150));
    }
  }//GEN-LAST:event_campoBuscarMousePressed

  private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
    botonBuscar.setBackground(new Color(196, 196, 196));
  }//GEN-LAST:event_botonBuscarMouseExited

  private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
    botonBuscar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonBuscarMouseEntered

  private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
    // TODO add your handling code here:
    DAOVentaImpl ventaImpl = new DAOVentaImpl();
    String nombreMatch = this.campoBuscar.getText().trim();
    if(nombreMatch.length() > 0){
      this.tablaListaProd.setModel(ventaImpl.listarProd(nombreMatch));
      if(this.tablaListaProd.getModel().getRowCount() == 0){
        JOptionPane.showMessageDialog(this, "Se encontraron cero coincidencias", 
              "Upsi!", JOptionPane.WARNING_MESSAGE);
        this.tablaListaProd.setModel(ventaImpl.listarProd());
        this.campoBuscar.setText("");
      }
    }else{
      this.tablaListaProd.setModel(ventaImpl.listarProd());
    }
  }//GEN-LAST:event_botonBuscarActionPerformed

  private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
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
  private javax.swing.JTextField Separador;
  private javax.swing.JButton botonAgregarProd;
  private javax.swing.JButton botonBuscar;
  private javax.swing.JButton botonRegresar;
  private javax.swing.JTextField campoBuscar;
  private javax.swing.JTextField campoCantidad;
  private javax.swing.JLabel etiquetaCantidad;
  private javax.swing.JLabel etiquetaLista;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaNombreList;
  private javax.swing.JLabel etiquetaOpciones;
  private javax.swing.JLabel etiquetaTitulo;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel panelContenedor;
  private javax.swing.JPanel panelOpciones;
  private javax.swing.JTable tablaListaProd;
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
