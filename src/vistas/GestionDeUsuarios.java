package vistas;

import controladores.DAOUsuarioImpl;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import modelos.RolUsuario;
import modelos.Usuario;


/**
 *
 * @author MagicPOS
 */
public class GestionDeUsuarios extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();

  /**
   * Creates new form IniciarSesion
   */
  public GestionDeUsuarios() {
    this.setContentPane(fondo);
    initComponents();
    DAOUsuarioImpl usuImpl = new DAOUsuarioImpl();
    tablaUsuario.setModel(usuImpl.listar());
    
    tablaUsuario.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
    tablaUsuario.getTableHeader().setOpaque(false);
    tablaUsuario.getTableHeader().setBackground(Color.WHITE);
    
    
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
    botonAgregar = new RoundJButton(7);
    botonEliminar = new RoundJButton(7);
    botonActualizar = new RoundJButton(7);
    botonRegresar = new RoundJButton(7);
    panelContenedor = new javax.swing.JPanel();
    etiquetaLogo = new javax.swing.JLabel();
    etiquetaTitulo = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaUsuario = new javax.swing.JTable();

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
    campoBuscar.setText("Buscar");
    campoBuscar.setBorder(null);
    campoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        campoBuscarMousePressed(evt);
      }
    });
    panelOpciones.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 40));

    botonAgregar.setBackground(new java.awt.Color(255, 255, 255));
    botonAgregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonAgregar.setText("Agregar usuario");
    botonAgregar.setBorder(null);
    botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonAgregar.setPreferredSize(new java.awt.Dimension(71, 20));
    botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonAgregarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonAgregarMouseExited(evt);
      }
    });
    botonAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonAgregarActionPerformed(evt);
      }
    });
    panelOpciones.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, 40));

    botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
    botonEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonEliminar.setText("Eliminar usuario");
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
    botonEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonEliminarActionPerformed(evt);
      }
    });
    panelOpciones.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 300, 40));

    botonActualizar.setBackground(new java.awt.Color(255, 255, 255));
    botonActualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
    botonActualizar.setText("Actualizar");
    botonActualizar.setBorder(null);
    botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    botonActualizar.setPreferredSize(new java.awt.Dimension(71, 20));
    botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        botonActualizarMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        botonActualizarMouseExited(evt);
      }
    });
    botonActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonActualizarActionPerformed(evt);
      }
    });
    panelOpciones.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 300, 40));

    botonRegresar.setBackground(new java.awt.Color(252, 168, 1));
    botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/regresar.png"))); // NOI18N
    botonRegresar.setBorder(null);
    botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    botonRegresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonRegresarActionPerformed(evt);
      }
    });
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
    etiquetaTitulo.setText("Gesti??n de usuarios");
    panelContenedor.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

    tablaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
    tablaUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
    tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null}
      },
      new String [] {
        "Usuario", "Rol", "Contrase??a"
      }
    ));
    tablaUsuario.setFocusable(false);
    tablaUsuario.setGridColor(new java.awt.Color(150, 150, 150));
    tablaUsuario.setIntercellSpacing(new java.awt.Dimension(0, 0));
    tablaUsuario.setRowHeight(25);
    tablaUsuario.setSelectionBackground(new java.awt.Color(254, 163, 88));
    tablaUsuario.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tablaUsuario);

    panelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, 670, 490));

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

  private void campoBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoBuscarMousePressed
    if (campoBuscar.getText().equals("Buscar")) {
      campoBuscar.setText("");
      campoBuscar.setForeground(new Color(150, 150, 150));
    }
  }//GEN-LAST:event_campoBuscarMousePressed

  private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
    botonBuscar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonBuscarMouseEntered

  private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
    botonBuscar.setBackground(new Color(196, 196, 196));
  }//GEN-LAST:event_botonBuscarMouseExited

  private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
    botonAgregar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonAgregarMouseEntered

  private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
    botonAgregar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonAgregarMouseExited

  private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
    botonEliminar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonEliminarMouseEntered

  private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
    botonEliminar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonEliminarMouseExited

  private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered
    botonActualizar.setBackground(new Color(254, 163, 88));
  }//GEN-LAST:event_botonActualizarMouseEntered

  private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited
    botonActualizar.setBackground(Color.WHITE);
  }//GEN-LAST:event_botonActualizarMouseExited

  private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
    // TODO add your handling code here:
    AgregarUsuario agregarUsu = new AgregarUsuario();
    agregarUsu.setLocationRelativeTo(this);
    agregarUsu.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_botonAgregarActionPerformed

  private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    // TODO add your handling code here:
    PanelAdmin panelAdmin = new PanelAdmin();
    panelAdmin.setLocationRelativeTo(this);
    panelAdmin.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_botonRegresarActionPerformed

  private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
    // TODO add your handling code here:
    int filaSeleccionada = this.tablaUsuario.getSelectedRow();
    if(filaSeleccionada == -1){
      JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operaci??n", 
              "Upsi!", JOptionPane.WARNING_MESSAGE);
    }else{
      String folioUsu = this.tablaUsuario.getValueAt(filaSeleccionada, 0).toString();
      DAOUsuarioImpl usuImpl = new DAOUsuarioImpl();
      if(usuImpl.eliminar(folioUsu)){
        DefaultTableModel dftable = (DefaultTableModel) this.tablaUsuario.getModel();
        dftable.removeRow(filaSeleccionada);
        JOptionPane.showMessageDialog(this, "Usuario eliminado con ??xito", 
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
      }else{
        JOptionPane.showMessageDialog(this, "Algo sali?? mal, intente m??s tarde", 
              "Oh no!", JOptionPane.ERROR_MESSAGE);
      }
    }
    
  }//GEN-LAST:event_botonEliminarActionPerformed

  private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
    // TODO add your handling code here:
    int filaSeleccionada = this.tablaUsuario.getSelectedRow();
    if(filaSeleccionada == -1){
      JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operaci??n", 
              "Upsi!", JOptionPane.WARNING_MESSAGE);
    }else{
      String folioUsu = this.tablaUsuario.getValueAt(filaSeleccionada, 0).toString();
      String nombreUsu = this.tablaUsuario.getValueAt(filaSeleccionada, 1).toString();
      String rolUsu = this.tablaUsuario.getValueAt(filaSeleccionada, 2).toString();
      String pwdUsu = this.tablaUsuario.getValueAt(filaSeleccionada, 3).toString();
      Usuario usu = new Usuario(folioUsu, nombreUsu, pwdUsu, new RolUsuario(rolUsu));
      DAOUsuarioImpl usuImpl = new DAOUsuarioImpl();
      if(usuImpl.actualizar(usu)){
        JOptionPane.showMessageDialog(this, "Usuario actualizado con ??xito", 
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
      }else{
        JOptionPane.showMessageDialog(this, "Algo sali?? mal, intente m??s tarde", 
              "Oh no!", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_botonActualizarActionPerformed

  private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
    // TODO add your handling code here:
    DAOUsuarioImpl usuImpl = new DAOUsuarioImpl();
    String nombreMatch = this.campoBuscar.getText().trim();
    if(nombreMatch.length() > 0){
      this.tablaUsuario.setModel(usuImpl.listar(nombreMatch));
      if(this.tablaUsuario.getModel().getRowCount() == 0){
        JOptionPane.showMessageDialog(this, "Se encontraron cero coincidencias", 
              "Upsi!", JOptionPane.WARNING_MESSAGE);
        this.tablaUsuario.setModel(usuImpl.listar());
        this.campoBuscar.setText("");
      }
    }else{
      this.tablaUsuario.setModel(usuImpl.listar());
    }
  }//GEN-LAST:event_botonBuscarActionPerformed

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
  private javax.swing.JButton botonActualizar;
  private javax.swing.JButton botonAgregar;
  private javax.swing.JButton botonBuscar;
  private javax.swing.JButton botonEliminar;
  private javax.swing.JButton botonRegresar;
  private javax.swing.JTextField campoBuscar;
  private javax.swing.JLabel etiquetaLista;
  private javax.swing.JLabel etiquetaLogo;
  private javax.swing.JLabel etiquetaOpciones;
  private javax.swing.JLabel etiquetaTitulo;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel panelContenedor;
  private javax.swing.JPanel panelOpciones;
  private javax.swing.JTable tablaUsuario;
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
