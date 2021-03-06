package vistas;

import controladores.DAOCategoriaImpl;
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
import modelos.Categoria;
import utils.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MagicPOS
 */
public class AgregarCategoria extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public AgregarCategoria() {
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
    etiquetaNombre = new javax.swing.JLabel();
    campoNombre = new RoundJTextField(7);
    campoDescripcion = new RoundJTextField(7);
    etiquetaDescripcion = new javax.swing.JLabel();
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
    etiquetaTitulo.setText("Agregar categoria");

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

    etiquetaNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaNombre.setText("Nombre:");

    campoNombre.setBackground(new java.awt.Color(208, 208, 208));
    campoNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoNombre.setForeground(new java.awt.Color(150, 150, 150));
    campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoNombre.setBorder(null);

    campoDescripcion.setBackground(new java.awt.Color(208, 208, 208));
    campoDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    campoDescripcion.setForeground(new java.awt.Color(150, 150, 150));
    campoDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campoDescripcion.setBorder(null);

    etiquetaDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    etiquetaDescripcion.setText("Descripci??n:");

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
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(191, 191, 191)
            .addComponent(botonRegresar))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGap(177, 177, 177)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(panelContenedorLayout.createSequentialGroup()
                  .addComponent(etiquetaNombre)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelContenedorLayout.createSequentialGroup()
                  .addComponent(etiquetaDescripcion)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(0, 171, Short.MAX_VALUE)))
        .addContainerGap())
    );
    panelContenedorLayout.setVerticalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(etiquetaTitulo)
        .addGap(47, 47, 47)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(etiquetaNombre))
        .addGap(18, 18, 18)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(etiquetaDescripcion))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(35, 35, 35))
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

  private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    Inventario inventario = new Inventario();
    inventario.setLocationRelativeTo(this);
    inventario.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_botonRegresarActionPerformed

  private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
    String nombre = this.campoNombre.getText();
    String descripcion = this.campoDescripcion.getText();

    DAOCategoriaImpl catImpl = new DAOCategoriaImpl();
    List<Categoria> lista = catImpl.listarTodos();
    int cantidadCategorias = lista.size();
    int siguiente = cantidadCategorias + 1;
    String folioCat = Util.generarFolio("CAT", String.valueOf(siguiente));
    Categoria cat = new Categoria(folioCat, nombre, descripcion);

    if (catImpl.insertar(cat)) {
      JOptionPane.showMessageDialog(this, "Categoria agregado con ??xito",
        "Eureka!", JOptionPane.INFORMATION_MESSAGE);
      this.campoDescripcion.setText("");
      this.campoNombre.setText("");
    } else {
      JOptionPane.showMessageDialog(this, "Algo sali?? mal, intente m??s tarde",
        "Oh no!", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_botonIngresarActionPerformed

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
  private javax.swing.JTextField campoDescripcion;
  private javax.swing.JTextField campoNombre;
  private javax.swing.JLabel etiquetaDescripcion;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaNombre;
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
