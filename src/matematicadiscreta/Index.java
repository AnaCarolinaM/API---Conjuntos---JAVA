/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicadiscreta;

import Classes.Conjunto;
import java.util.ArrayList;

/**
 *
 * @author pedro.def
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    ArrayList<Conjunto> Conjuntos = new ArrayList();
    public Index() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Cbx(){
        for(Conjunto conj:Conjuntos ){
            cbxConjuntos.addItem(conj.getNome());
            cbxConjuntos1.addItem(conj.getNome());
            cbxConjuntos2.addItem(conj.getNome());          
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfElemento = new javax.swing.JTextField();
        cbxConjuntos = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfSaida = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbxConjuntos2 = new javax.swing.JComboBox<>();
        cbxConjuntos1 = new javax.swing.JComboBox<>();
        tfOperacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cria Conjunto"));

        jLabel1.setText("Nome");

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 210, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(tfElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 93, 89, -1));

        jPanel2.add(cbxConjuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 47, 89, -1));

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 53, -1, -1));

        jLabel2.setText("Nome");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel3.setText("Elemento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 73, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("SAIDA"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(tfSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 320, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 350, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cbxConjuntos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, -1));

        jPanel4.add(cbxConjuntos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));
        jPanel4.add(tfOperacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        jLabel4.setText("Elemento");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel5.setText("Conjunto 1 ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setText("Conjunto 2 ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton5.setText("Pertence");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jButton6.setText("Contem");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 370, 150));

        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conjunto Conj = new Conjunto(tfNome.getText());
        Conjuntos.add(Conj);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos.getSelectedItem().equals(conj.getNome())){
                   conj.inserir(tfElemento.getText());
               }
           }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                   tfSaida.setText(conj.imprimir());
               }
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cbxConjuntos.removeAll();
        cbxConjuntos1.removeAll();        
        cbxConjuntos2.removeAll();
        Cbx();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                   String elemento = tfOperacao.getText();
                   if (conj.pertence(tfOperacao.getText()).equals(true)){    
                       tfSaida.setText(elemento + " ∈ "+ conj.getNome());
                   }
                   else{
                        tfSaida.setText(elemento + " ∉ "+ conj.getNome());
                   }
                  
               }
           }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Conjunto conj1 = null;
        Conjunto conj2 = null;
        
        for(Conjunto conj:Conjuntos ){
            if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                conj1 = conj;
            }
            if(cbxConjuntos2.getSelectedItem().equals(conj.getNome())){
                conj2 = conj;
            } 
          }
        if(conj1.contem(conj2.getElementos()).equals(true)){
            tfSaida.setText("contem");
            
        }
        else{
            tfSaida.setText("não contem");
        }    
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxConjuntos;
    private javax.swing.JComboBox<String> cbxConjuntos1;
    private javax.swing.JComboBox<String> cbxConjuntos2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tfElemento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfOperacao;
    private javax.swing.JTextField tfSaida;
    // End of variables declaration//GEN-END:variables
}