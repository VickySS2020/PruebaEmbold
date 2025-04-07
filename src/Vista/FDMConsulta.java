/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author campv
 */
public class FDMConsulta extends javax.swing.JFrame {

    /**
     * Creates new form FDMConsulta
     */
    public FDMConsulta() {
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

        lbTitulo = new javax.swing.JLabel();
        lbNombreCompletoCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoPcliente = new javax.swing.JTextField();
        lbApellidoPcliente = new javax.swing.JLabel();
        lbApellidoMcliente = new javax.swing.JLabel();
        txtApellidoMcliente = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        lbTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lbDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lbVeterinario = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        txtNombreVeterinario = new javax.swing.JTextField();
        txtApellidoPveterinario = new javax.swing.JTextField();
        lbApellidoPvet = new javax.swing.JLabel();
        lbApellidoMvet = new javax.swing.JLabel();
        txtApellidoMveterinario = new javax.swing.JTextField();
        lbNombreVet = new javax.swing.JLabel();
        lbTelefonoVet = new javax.swing.JLabel();
        txtTelefonoVeterinario = new javax.swing.JTextField();
        lbClaveEmp = new javax.swing.JLabel();
        lbNombreCompletoVeterinario = new javax.swing.JLabel();
        txtClaveEmp = new javax.swing.JTextField();
        lbSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lbCita = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lbSlash1 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lbSlash2 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lbHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lbDosPuntos = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JTextField();
        lbDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lbCostoBase = new javax.swing.JLabel();
        txtCostoBase = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitulo.setText("Datos de consulta");

        lbNombreCompletoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreCompletoCliente.setText("Nombre completo:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lbApellidoPcliente.setText("Apellido paterno");

        lbApellidoMcliente.setText("Apellido materno");

        lbCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbCliente.setText("Cliente:");

        lbTelefonoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelefonoCliente.setText("Núm. de telefono:");

        lbDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDomicilio.setText("Domicilio:");

        lbVeterinario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbVeterinario.setText("Veterinario atendiendo:");

        lbNombreCliente.setText("Nombre");

        txtNombreVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVeterinarioActionPerformed(evt);
            }
        });

        lbApellidoPvet.setText("Apellido paterno");

        lbApellidoMvet.setText("Apellido materno");

        lbNombreVet.setText("Nombre");

        lbTelefonoVet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelefonoVet.setText("Núm. de telefono:");

        lbClaveEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbClaveEmp.setText("Clave de empleado:");

        lbNombreCompletoVeterinario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreCompletoVeterinario.setText("Nombre completo:");

        lbSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSaldo.setText("Saldo:");

        lbCita.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbCita.setText("Cita:");

        lbFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFecha.setText("Fecha(dd/mm/aaaa):");

        lbSlash1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSlash1.setText("/");

        lbSlash2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSlash2.setText("/");

        lbHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHora.setText("Hora de cita:");

        lbDosPuntos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbDosPuntos.setText(":");

        lbDuracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDuracion.setText("Duración(horas):");

        lbCostoBase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCostoBase.setText("Costo base:");

        txtCostoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoBaseActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNombreCompletoCliente)
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApellidoPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApellidoMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSalir)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbTelefonoCliente)
                                                .addComponent(lbDomicilio)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lbNombreCompletoVeterinario)
                                                    .addGap(22, 22, 22)
                                                    .addComponent(txtNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtApellidoPveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtApellidoMveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbSaldo)
                                            .addComponent(lbClaveEmp)
                                            .addComponent(lbTelefonoVet))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtSaldo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtClaveEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbFecha)
                                            .addComponent(lbHora)
                                            .addComponent(lbDuracion)
                                            .addComponent(lbCostoBase))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCostoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbSlash1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbSlash2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbCita)
                                                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnGuardar)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lbDosPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lbNombreCliente)
                        .addGap(51, 51, 51)
                        .addComponent(lbApellidoPcliente)
                        .addGap(35, 35, 35)
                        .addComponent(lbApellidoMcliente)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbVeterinario)
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCliente)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbNombreVet)
                        .addGap(50, 50, 50)
                        .addComponent(lbApellidoPvet)
                        .addGap(37, 37, 37)
                        .addComponent(lbApellidoMvet)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCompletoCliente)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellidoPcliente)
                    .addComponent(lbNombreCliente)
                    .addComponent(lbApellidoMcliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefonoCliente)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbVeterinario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCompletoVeterinario)
                    .addComponent(txtNombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellidoPvet)
                    .addComponent(lbApellidoMvet)
                    .addComponent(lbNombreVet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefonoVet)
                    .addComponent(txtTelefonoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClaveEmp)
                    .addComponent(txtClaveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSaldo))
                .addGap(18, 18, 18)
                .addComponent(lbCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSlash1)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSlash2)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDosPuntos)
                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuracion)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCostoBase)
                    .addComponent(txtCostoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtNombreVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVeterinarioActionPerformed

    private void txtCostoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoBaseActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbApellidoMcliente;
    private javax.swing.JLabel lbApellidoMvet;
    private javax.swing.JLabel lbApellidoPcliente;
    private javax.swing.JLabel lbApellidoPvet;
    private javax.swing.JLabel lbCita;
    private javax.swing.JLabel lbClaveEmp;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCostoBase;
    private javax.swing.JLabel lbDomicilio;
    private javax.swing.JLabel lbDosPuntos;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbNombreCompletoCliente;
    private javax.swing.JLabel lbNombreCompletoVeterinario;
    private javax.swing.JLabel lbNombreVet;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSlash1;
    private javax.swing.JLabel lbSlash2;
    private javax.swing.JLabel lbTelefonoCliente;
    private javax.swing.JLabel lbTelefonoVet;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVeterinario;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidoMcliente;
    private javax.swing.JTextField txtApellidoMveterinario;
    private javax.swing.JTextField txtApellidoPcliente;
    private javax.swing.JTextField txtApellidoPveterinario;
    private javax.swing.JTextField txtClaveEmp;
    private javax.swing.JTextField txtCostoBase;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreVeterinario;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoVeterinario;
    // End of variables declaration//GEN-END:variables
}
