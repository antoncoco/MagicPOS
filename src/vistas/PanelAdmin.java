package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
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
public class PanelAdmin extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public PanelAdmin() {
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
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaTitulo = new javax.swing.JLabel();
    botonIngresar = new RoundJButton(7);
    etiquetaUsuario = new javax.swing.JLabel();
    botonInventario = new RoundJButton(7);
    etiquetaInventario = new javax.swing.JLabel();
    etiquetaReporte = new javax.swing.JLabel();
    botonReporte = new RoundJButton(7);
    botonregresar = new RoundJButton(7);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(800, 550));
    setResizable(false);
    setSize(new java.awt.Dimension(800, 550));

    panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
    panelContenedor.setMaximumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setMinimumSize(new java.awt.Dimension(653, 363));
    panelContenedor.setPreferredSize(new java.awt.Dimension(653, 363));

    etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoHorizontal.png"))); // NOI18N

    etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
    etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    etiquetaTitulo.setText("Menu de opciones");

    botonIngresar.setBackground(new java.awt.Color(255, 255, 255));
    botonIngresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
    botonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/usuarios.png"))); // NOI18N
    botonIngresar.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204,204,204)));
    botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonIngresarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonIngresarMouseExited(evt);
      }
    });

    etiquetaUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    etiquetaUsuario.setText("Usuarios");

    botonInventario.setBackground(new java.awt.Color(255, 255, 255));
    botonInventario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonInventario.setForeground(new java.awt.Color(255, 255, 255));
    botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/inventario.png"))); // NOI18N
    botonInventario.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204,204,204)));
    botonInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonInventario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonInventarioMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonInventarioMouseExited(evt);
      }
    });

    etiquetaInventario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    etiquetaInventario.setText("Inventario");

    etiquetaReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    etiquetaReporte.setText("Reporte");

    botonReporte.setBackground(new java.awt.Color(255, 255, 255));
    botonReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    botonReporte.setForeground(new java.awt.Color(255, 255, 255));
    botonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reporte.png"))); // NOI18N
    botonReporte.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204,204,204)));
    botonReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonReporte.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonReporteMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonReporteMouseExited(evt);
      }
    });

    botonregresar.setBackground(new java.awt.Color(255, 255, 255));
    botonregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonregresar.setBorder(null);
    botonregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonregresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonregresarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
    panelContenedor.setLayout(panelContenedorLayout);
    panelContenedorLayout.setHorizontalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelContenedorLayout.createSequentialGroup()
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(etiquetaUsuario)
                    .addGap(34, 34, 34)))
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(botonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(etiquetaInventario)))
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(panelContenedorLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(etiquetaReporte)))))
            .addGap(0, 82, Short.MAX_VALUE))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(botonregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    panelContenedorLayout.setVerticalGroup(
      panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
        .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(etiquetaTitulo)
        .addGap(36, 36, 36)
        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(etiquetaUsuario))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addComponent(botonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(etiquetaInventario))
          .addGroup(panelContenedorLayout.createSequentialGroup()
            .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(etiquetaReporte)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
        .addComponent(botonregresar)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(65, 65, 65)
        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(73, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(84, 84, 84)
        .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(94, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseEntered
    botonIngresar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonIngresarMouseEntered

  private void botonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseExited
    botonIngresar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonIngresarMouseExited

  private void botonInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInventarioMouseEntered
    botonInventario.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonInventarioMouseEntered

  private void botonInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInventarioMouseExited
    botonInventario.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonInventarioMouseExited

  private void botonReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReporteMouseEntered
    botonReporte.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonReporteMouseEntered

  private void botonReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReporteMouseExited
    botonReporte.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonReporteMouseExited

  private void botonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_botonregresarActionPerformed

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
  private javax.swing.JButton botonInventario;
  private javax.swing.JButton botonReporte;
  private javax.swing.JButton botonregresar;
  private javax.swing.JLabel etiquetaInventario;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaReporte;
  private javax.swing.JLabel etiquetaTitulo;
  private javax.swing.JLabel etiquetaUsuario;
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
