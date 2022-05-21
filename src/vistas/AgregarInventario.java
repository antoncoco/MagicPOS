package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MagicPOS
 */
public class AgregarInventario extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public AgregarInventario() {
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
    campoFolio = new RoundJTextField(7);
    botonIngresar = new RoundJButton(7);
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaFolio = new javax.swing.JLabel();
    etiquetaProducto = new javax.swing.JLabel();
    campoCantidad = new RoundJTextField(7);
    etiquetaCantidad = new javax.swing.JLabel();
    etiquetaFechaReg = new javax.swing.JLabel();
    campoFechaReg = new RoundJTextField(7);
    etiquetaCaducidad = new javax.swing.JLabel();
    campoCaducidad = new RoundJTextField(7);
    comboProducto = new javax.swing.JComboBox<>();
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
    etiquetaTitulo.setText("Agregar inventario");

    campoFolio.setBackground(new java.awt.Color(208, 208, 208));
    campoFolio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoFolio.setForeground(new java.awt.Color(150, 150, 150));
    campoFolio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoFolio.setBorder(null);

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

    etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoHorizontal.png"))); // NOI18N

    etiquetaFolio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaFolio.setText("Folio:");

    etiquetaProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaProducto.setText("Producto");

    campoCantidad.setBackground(new java.awt.Color(208, 208, 208));
    campoCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCantidad.setForeground(new java.awt.Color(150, 150, 150));
    campoCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCantidad.setBorder(null);

    etiquetaCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCantidad.setText("Cantidad:");

    etiquetaFechaReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaFechaReg.setText("Fecha de registro:");

    campoFechaReg.setBackground(new java.awt.Color(208, 208, 208));
    campoFechaReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoFechaReg.setForeground(new java.awt.Color(150, 150, 150));
    campoFechaReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoFechaReg.setBorder(null);

    etiquetaCaducidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaCaducidad.setText("Caducidad");

    campoCaducidad.setBackground(new java.awt.Color(208, 208, 208));
    campoCaducidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoCaducidad.setForeground(new java.awt.Color(150, 150, 150));
    campoCaducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoCaducidad.setBorder(null);

    comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    botonRegresar.setBackground(new java.awt.Color(255, 255, 255));
    botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonRegresar.setBorder(null);
    botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
    panelContenedor.setLayout(panelContenedorLayout);
    panelContenedorLayout.setHorizontalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGap(240, 617, Short.MAX_VALUE)
            .addComponent(botonRegresar))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(etiquetaFolio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(etiquetaProducto)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(etiquetaCantidad)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(etiquetaFechaReg)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addComponent(etiquetaCaducidad)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(231, 231, 231))
    );
    panelContenedorLayout.setVerticalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(etiquetaTitulo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaFolio))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(etiquetaProducto)
              .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(etiquetaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaFechaReg))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(campoCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(etiquetaCaducidad))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 30, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(botonRegresar)))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(73, 73, 73)
        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(74, Short.MAX_VALUE))
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

  private void botonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseEntered
    botonIngresar.setBackground(new Color(255, 109, 0));
  }//GEN-LAST:event_botonIngresarMouseEntered

  private void botonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseExited
    botonIngresar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonIngresarMouseExited

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
  private javax.swing.JTextField campoCaducidad;
  private javax.swing.JTextField campoCantidad;
  private javax.swing.JTextField campoFechaReg;
  private javax.swing.JTextField campoFolio;
  private javax.swing.JComboBox<String> comboProducto;
  private javax.swing.JLabel etiquetaCaducidad;
  private javax.swing.JLabel etiquetaCantidad;
  private javax.swing.JLabel etiquetaFechaReg;
  private javax.swing.JLabel etiquetaFolio;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaProducto;
  private javax.swing.JLabel etiquetaTitulo;
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
