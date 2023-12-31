package General;

/**
 *
 * @author Lenovo
 */
import General.MetosAlumnos.*;
import Personal.*;
import General.*;
import static General.MetosAlumnos.cabeza;
import static General.MetosAlumnos.randi;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class menuMatricula extends javax.swing.JFrame {

    private Object model;
    private Object nameIngre;
    private Object apellidoIngre1;

    /**
     * Creates new form menuMatricula
     */
    public menuMatricula() {
        setUndecorated(true);
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
    MetosAlumnos metodos = new MetosAlumnos();
    agregarM agregar = new agregarM();
    public pilas pila = new pilas();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ListaAlum = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnConsultas = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();
        BtnNotaMinima = new javax.swing.JButton();
        BtnDesviacion = new javax.swing.JButton();
        BtnNotaMaxima = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jButton10.setText("Menu");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 100, 40));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Salir");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 80, 30));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrarEst.png"))); // NOI18N
        jButton14.setText("Eliminar alumno");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 40));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadirEst.png"))); // NOI18N
        jButton15.setText("Agregar alumno");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 40));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personal Administrativo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 211, -1));

        ListaAlum.setBackground(new java.awt.Color(255, 255, 255));
        ListaAlum.setForeground(new java.awt.Color(0, 0, 0));
        ListaAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaEst.png"))); // NOI18N
        ListaAlum.setText("Ver lista de alumnos");
        ListaAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaAlumActionPerformed(evt);
            }
        });
        jPanel3.add(ListaAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 50));

        jTabbedPane1.addTab("Ingreso", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 0, 102));

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grades.png"))); // NOI18N
        btnConsultas.setText("Consultar nota de alumno");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnPromedio.setBackground(new java.awt.Color(255, 255, 255));
        btnPromedio.setForeground(new java.awt.Color(0, 0, 0));
        btnPromedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/promedio.png"))); // NOI18N
        btnPromedio.setText(" Promedio de notas ");
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        BtnNotaMinima.setBackground(new java.awt.Color(255, 255, 255));
        BtnNotaMinima.setForeground(new java.awt.Color(0, 0, 0));
        BtnNotaMinima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minmas.png"))); // NOI18N
        BtnNotaMinima.setText("Nota Mínima");
        BtnNotaMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotaMinimaActionPerformed(evt);
            }
        });

        BtnDesviacion.setBackground(new java.awt.Color(255, 255, 255));
        BtnDesviacion.setForeground(new java.awt.Color(0, 0, 0));
        BtnDesviacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desviacion.png"))); // NOI18N
        BtnDesviacion.setText("Desviación estándar de notas ");
        BtnDesviacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDesviacionActionPerformed(evt);
            }
        });

        BtnNotaMaxima.setBackground(new java.awt.Color(255, 255, 255));
        BtnNotaMaxima.setForeground(new java.awt.Color(0, 0, 0));
        BtnNotaMaxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Note256_25041.png"))); // NOI18N
        BtnNotaMaxima.setText("Nota Máxima ");
        BtnNotaMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotaMaximaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/data_backup_storage_database_icon_189203.png"))); // NOI18N
        jButton1.setText("Backup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultas)
                    .addComponent(BtnDesviacion)
                    .addComponent(btnPromedio)
                    .addComponent(BtnNotaMaxima)
                    .addComponent(BtnNotaMinima))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnConsultas)
                .addGap(18, 18, 18)
                .addComponent(btnPromedio)
                .addGap(32, 32, 32)
                .addComponent(BtnNotaMaxima)
                .addGap(29, 29, 29)
                .addComponent(BtnNotaMinima)
                .addGap(27, 27, 27)
                .addComponent(BtnDesviacion)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        menu menuu = new menu();
        dispose();
        menuu.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        int desicion = JOptionPane.YES_NO_OPTION;
        int n;
        n = JOptionPane.showConfirmDialog(null, "Seguro que desea salir?", "Salida", desicion);

        if (n == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void BtnNotaMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotaMaximaActionPerformed
        // Nota maxima :
        //int maximo = b.maximo();

        pila.imprimir();
        metodos.maximo();

    }//GEN-LAST:event_BtnNotaMaximaActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        borrarNotas eliminar = new borrarNotas();
        eliminar.setVisible(true);

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        //dispose();
        this.setVisible(false);
        agregar.setVisible(true);


    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
        // promedios
        metodos.calcularPromedio();


    }//GEN-LAST:event_btnPromedioActionPerformed

    private void BtnNotaMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotaMinimaActionPerformed
        // Nota Minima
        metodos.minimo();
    }//GEN-LAST:event_BtnNotaMinimaActionPerformed

    private void BtnDesviacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDesviacionActionPerformed
        // Desviacion estandar
        metodos.calcularDesviacionEstandar();

    }//GEN-LAST:event_BtnDesviacionActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // consultar nota
        consultarNota cons = new consultarNota();
        dispose();
        cons.setVisible(true);

    }//GEN-LAST:event_btnConsultasActionPerformed

    private void ListaAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaAlumActionPerformed

        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Nombre", "Nota"});

        Nodo puntero = cabeza;
        while (puntero != null) {
            Object[] fila = {puntero.id, puntero.alumno, puntero.nota};
            modelo.addRow(fila);
            puntero = puntero.siguiente;
        }

        JTable tabla = new JTable(modelo);

        tabla.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollPane = new JScrollPane(tabla);

        JPanel panel = new JPanel();

        panel.add(scrollPane);

        JFrame frame = new JFrame("Lista de alumnos");

        frame.add(panel);

        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        frame.setVisible(true);


    }//GEN-LAST:event_ListaAlumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        metodos.backup();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //ArrayList<Double> note = new ArrayList<Double>();
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
            java.util.logging.Logger.getLogger(menuMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuMatricula().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDesviacion;
    private javax.swing.JButton BtnNotaMaxima;
    private javax.swing.JButton BtnNotaMinima;
    private javax.swing.JButton ListaAlum;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
