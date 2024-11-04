/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade05.view;

import javax.swing.DefaultListModel;

/**
 *
 * @author valdo
 */
public class RepeticaoSlider extends javax.swing.JFrame {

    /**
     * Creates new form RepeticaoSlider
     */
    public RepeticaoSlider() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldInicio = new javax.swing.JSlider();
        sldFim = new javax.swing.JSlider();
        sldSalto = new javax.swing.JSlider();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblSalto = new javax.swing.JLabel();
        btnContagem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstContagem = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Início");

        jLabel2.setText("Fim");

        jLabel3.setText("Salto");

        sldInicio.setMaximum(5);
        sldInicio.setValue(0);
        sldInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldInicioStateChanged(evt);
            }
        });

        sldFim.setMaximum(20);
        sldFim.setMinimum(6);
        sldFim.setToolTipText("");
        sldFim.setValue(6);
        sldFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFimStateChanged(evt);
            }
        });

        sldSalto.setMaximum(4);
        sldSalto.setMinimum(1);
        sldSalto.setToolTipText("");
        sldSalto.setValue(1);
        sldSalto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSaltoStateChanged(evt);
            }
        });

        lblInicio.setText("0");

        lblFim.setText("6");

        lblSalto.setText("1");

        btnContagem.setText("Contar");
        btnContagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContagemActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstContagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldSalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContagem)
                        .addGap(128, 128, 128)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sldFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sldSalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalto))
                .addGap(31, 31, 31)
                .addComponent(btnContagem)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldInicioStateChanged
        int inicio = sldInicio.getValue();//Pega o valor informado no "sldInicio" e armazena na variável "inicio".
        lblInicio.setText(Integer.toString(inicio));//Mostra o valor armazenado na variável "início" no "lblInicio".
    }//GEN-LAST:event_sldInicioStateChanged

    private void sldFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFimStateChanged
        int fim = sldFim.getValue();//Pega o valor informado no "sldFim" e armazena na variável "fim".
        lblFim.setText(Integer.toString(fim));//Mostra o valor armazenado na variável "fim" no "lblFim".
    }//GEN-LAST:event_sldFimStateChanged

    private void sldSaltoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSaltoStateChanged
        int salto = sldSalto.getValue();//Pega o valor informado no "sldSalto" e armazena na variável "salto".
        lblSalto.setText(Integer.toString(salto));//Mostra o valor armazenado na variável "salto" no "lblSalto".
    }//GEN-LAST:event_sldSaltoStateChanged

    private void btnContagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContagemActionPerformed
        int inicio = sldInicio.getValue();//Pega o valor informado em "sldInicio" e armazena na variável "início".
        int fim = sldFim.getValue();//Pega o valor informado em "sldFim" e armazena na variável "fim".
        int salto = sldSalto.getValue();//Pega o valor informado em "sldSalto" e armazena na variável "salto".
        
        DefaultListModel lista = new DefaultListModel();//A lista onde serão armazenados os valores contados.
        
        for(int contador = inicio; contador <= fim; contador += salto){//A partir do valor inicial informado no "sldInicio", é realizada a contagem saltando de x em x quantidade informada pelo usuário no "sldSalto", até atingir um valor igual ou menor que o informado no "sldFinal".
            lista.addElement(contador);//Armazena os valores contados pelo contador na "lista".
        }
        
        lstContagem.setModel(lista);//Mostra os valores inseridos na "lista" em "lstContagem".
    }//GEN-LAST:event_btnContagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RepeticaoSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepeticaoSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepeticaoSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepeticaoSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepeticaoSlider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblSalto;
    private javax.swing.JList<String> lstContagem;
    private javax.swing.JSlider sldFim;
    private javax.swing.JSlider sldInicio;
    private javax.swing.JSlider sldSalto;
    // End of variables declaration//GEN-END:variables
}
