/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Panel;

import Controlador.CNTRL_MantenimientoUsuarios;

/**
 *
 * @author sqdan
 */
public class PNL_UsuarioBotones extends javax.swing.JPanel {

    /**
     * Creates new form PNL_UsuarioBotones
     */
    public PNL_UsuarioBotones() {
        initComponents();
    }
    
    public void agregarControlador(CNTRL_MantenimientoUsuarios controlador)
    {
        jbtn_Agregar.addActionListener(controlador);
        jbtn_Buscar.addActionListener(controlador);
        jbtn_Modificar.addActionListener(controlador);
        jbtn_Eliminar.addActionListener(controlador);
    }
    
    public void normalConfig()
    {
        jbtn_Buscar.setEnabled(true);
        jbtn_Modificar.setEnabled(true);
        jbtn_Eliminar.setEnabled(true);
    }
    
    public void primerUsuarioConfig()
    {
        jbtn_Buscar.setEnabled(false);
        jbtn_Modificar.setEnabled(false);
        jbtn_Eliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_Agregar = new javax.swing.JButton();
        jbtn_Buscar = new javax.swing.JButton();
        jbtn_Modificar = new javax.swing.JButton();
        jbtn_Eliminar = new javax.swing.JButton();

        jbtn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jbtn_Agregar.setActionCommand("Agregar");

        jbtn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtn_Buscar.setActionCommand("Buscar");

        jbtn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        jbtn_Modificar.setActionCommand("Modificar");

        jbtn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jbtn_Eliminar.setActionCommand("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_Buscar)
                    .addComponent(jbtn_Modificar)
                    .addComponent(jbtn_Eliminar)
                    .addComponent(jbtn_Agregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Agregar;
    private javax.swing.JButton jbtn_Buscar;
    private javax.swing.JButton jbtn_Eliminar;
    private javax.swing.JButton jbtn_Modificar;
    // End of variables declaration//GEN-END:variables
}
