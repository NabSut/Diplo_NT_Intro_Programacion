/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.gui;

import com.ejemplo.dominio.Empresa;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTIN
 */
public class JFPrincipal extends javax.swing.JFrame {
    private Empresa empresa;
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        setTitle("Principal");
        setLocationRelativeTo(null);
        empresa = new Empresa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaNomina = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jbMostrar = new javax.swing.JButton();
        jbNuevoEmpleado = new javax.swing.JButton();
        jbPresupuesto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtPorcentaje = new javax.swing.JTextField();
        jbIncrementar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtaNomina.setColumns(20);
        jtaNomina.setRows(5);
        jtaNomina.setEnabled(false);
        jScrollPane1.setViewportView(jtaNomina);

        jLabel1.setText("Nómina de empleados");

        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        jbNuevoEmpleado.setText("Nuevo Empreado");
        jbNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoEmpleadoActionPerformed(evt);
            }
        });

        jbPresupuesto.setText("Presupuesto");
        jbPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPresupuestoActionPerformed(evt);
            }
        });

        jLabel2.setText("Porcentaje:");

        jtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPorcentajeKeyTyped(evt);
            }
        });

        jbIncrementar.setText("Incrementar");
        jbIncrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncrementarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbIncrementar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jbPresupuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNuevoEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPresupuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIncrementar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoEmpleadoActionPerformed
       JDNuevoEmpleado nuevo = new JDNuevoEmpleado(this, true, empresa);
       nuevo.setVisible(true);
    }//GEN-LAST:event_jbNuevoEmpleadoActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
       jtaNomina.setText(empresa.mostrarNomina());
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPorcentajeKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_jtPorcentajeKeyTyped

    private void jbIncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncrementarActionPerformed
        if(jtPorcentaje.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'Porcentaje'");
        else{
            float porc = 0;
            try {
                porc = Float.parseFloat(jtPorcentaje.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor incorrecto para el campo 'Porcentaje'");
            }
            empresa.incrementarSueldo(porc);
            JOptionPane.showMessageDialog(this, "Sueldos actualizados!");
            jtPorcentaje.setText("");
        }
    }//GEN-LAST:event_jbIncrementarActionPerformed

    private void jbPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPresupuestoActionPerformed
        JOptionPane.showMessageDialog(this, "Presupuesto Mensual " + empresa.presupuestoMensual(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbPresupuestoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbIncrementar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbNuevoEmpleado;
    private javax.swing.JButton jbPresupuesto;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtPorcentaje;
    private javax.swing.JTextArea jtaNomina;
    // End of variables declaration//GEN-END:variables
}
