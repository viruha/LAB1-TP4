package view;

import java.util.HashSet;
import tp4.Alumno;
import tp4.Materia;

public class Colegio extends javax.swing.JFrame {

  public static final HashSet<Materia> materias = new HashSet();
  public static final HashSet<Alumno> alumnos = new HashSet();

    public Colegio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuAgregarMateria = new javax.swing.JMenuItem();
        menu_AgregarAlumno = new javax.swing.JMenuItem();
        menu_InscribirEnMateria = new javax.swing.JMenuItem();
        menu_ListadoAlumnosMateria = new javax.swing.JMenuItem();
        menu_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");

        desktopPane.setAutoscrolls(true);

        menu.setMnemonic('f');
        menu.setText("Menu");

        menuAgregarMateria.setMnemonic('o');
        menuAgregarMateria.setText("Agrega materia");
        menuAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarMateriaActionPerformed(evt);
            }
        });
        menu.add(menuAgregarMateria);

        menu_AgregarAlumno.setMnemonic('s');
        menu_AgregarAlumno.setText("Agregar alumno");
        menu_AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_AgregarAlumnoActionPerformed(evt);
            }
        });
        menu.add(menu_AgregarAlumno);

        menu_InscribirEnMateria.setMnemonic('a');
        menu_InscribirEnMateria.setText("Inscribir alumno en materia");
        menu_InscribirEnMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InscribirEnMateriaActionPerformed(evt);
            }
        });
        menu.add(menu_InscribirEnMateria);

        menu_ListadoAlumnosMateria.setText("Ver listado alumnos/materias");
        menu_ListadoAlumnosMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ListadoAlumnosMateriaActionPerformed(evt);
            }
        });
        menu.add(menu_ListadoAlumnosMateria);

        menu_Salir.setMnemonic('x');
        menu_Salir.setText("Salir");
        menu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SalirActionPerformed(evt);
            }
        });
        menu.add(menu_Salir);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_SalirActionPerformed

    private void menuAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarMateriaActionPerformed
        desktopPane.removeAll();
        desktopPane.repaint();
        Fr_MateriaAlta fr_MateriaAlta = new Fr_MateriaAlta();
        fr_MateriaAlta.setVisible(true);
        desktopPane.add(fr_MateriaAlta);
        desktopPane.moveToFront(fr_MateriaAlta);
    }//GEN-LAST:event_menuAgregarMateriaActionPerformed

    private void menu_AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_AgregarAlumnoActionPerformed
        desktopPane.removeAll();
        desktopPane.repaint();
        Fr_AlumnoAlta fr_AlumnoAlta = new Fr_AlumnoAlta();
        fr_AlumnoAlta.setVisible(true);
        desktopPane.add(fr_AlumnoAlta);
        desktopPane.moveToFront(fr_AlumnoAlta);
    }//GEN-LAST:event_menu_AgregarAlumnoActionPerformed

    private void menu_InscribirEnMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InscribirEnMateriaActionPerformed
        Fr_Inscribir fr_Inscribir = new Fr_Inscribir();
        fr_Inscribir.setVisible(true);
        desktopPane.add(fr_Inscribir);
        desktopPane.moveToFront(fr_Inscribir);    
    }//GEN-LAST:event_menu_InscribirEnMateriaActionPerformed

    private void menu_ListadoAlumnosMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ListadoAlumnosMateriaActionPerformed
        Fr_BusquedaMateriaAlumno fr_ListadoAlumnosMaterias = new Fr_BusquedaMateriaAlumno();
        fr_ListadoAlumnosMaterias.setVisible(true);
        desktopPane.add(fr_ListadoAlumnosMaterias);
        desktopPane.moveToFront(fr_ListadoAlumnosMaterias);
    }//GEN-LAST:event_menu_ListadoAlumnosMateriaActionPerformed

    public static void main(String args[]) {

      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JDesktopPane desktopPane;
    javax.swing.JMenu menu;
    javax.swing.JMenuItem menuAgregarMateria;
    javax.swing.JMenuBar menuBar;
    javax.swing.JMenuItem menu_AgregarAlumno;
    javax.swing.JMenuItem menu_InscribirEnMateria;
    javax.swing.JMenuItem menu_ListadoAlumnosMateria;
    javax.swing.JMenuItem menu_Salir;
    // End of variables declaration//GEN-END:variables

}
