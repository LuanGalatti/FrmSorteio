/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JFMsorteio extends javax.swing.JFrame {
 public JFMsorteio() {
        initComponents();
    }
ArrayList<Integer> listaNumeros= new ArrayList();
Random geradorNumero;
int quantidadeFaltante  = 0;
int ordem=0;
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFNumeroNovo = new javax.swing.JTextField();
        JBNovo = new javax.swing.JButton();
        JLNumeroSorteado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JANumerosjaSorteados = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        JBSortear = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quantidade de numeros a serem sorteados:");

        JTFNumeroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroNovoActionPerformed(evt);
            }
        });

        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        JLNumeroSorteado.setFont(new java.awt.Font("Segoe UI", 1, 144)); // NOI18N
        JLNumeroSorteado.setText("0");

        jLabel3.setText("NumeroSorteado");

        JANumerosjaSorteados.setColumns(20);
        JANumerosjaSorteados.setRows(5);
        jScrollPane1.setViewportView(JANumerosjaSorteados);

        jLabel4.setText("Lista dos numeros sorteados:");

        JBSortear.setText("Sortear");
        JBSortear.setEnabled(false);
        JBSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSortearActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.setEnabled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNumeroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNumeroSorteado)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNumeroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNumeroSorteado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JBSortear)
                    .addComponent(JBCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBFechar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumeroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroNovoActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
int quantidadeNumerosSorteados=Integer.parseInt(this.JTFNumeroNovo.getText());
JANumerosjaSorteados.setText("");
listaNumeros.clear();
JLNumeroSorteado.setText("0");
quantidadeFaltante=0;
ordem=0;
if(quantidadeNumerosSorteados>0){
    for(int i=1;i<quantidadeNumerosSorteados;i++){
        listaNumeros.add(i);
    }
quantidadeFaltante=quantidadeNumerosSorteados;
this.JBSortear.setEnabled(true);
this.JBCancelar.setEnabled(true);
this.JBNovo.setEnabled(false);
}else{
    JOptionPane.showMessageDialog(null,"Valor Deve ser maior que 0");
    
}


    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSortearActionPerformed
if(!listaNumeros.isEmpty()){
    geradorNumero= new Random();
    int indice=geradorNumero.nextInt(quantidadeFaltante);
    quantidadeFaltante--;
    ordem++;
    JANumerosjaSorteados.append(ordem+"º sorteado: "+listaNumeros.get(indice).toString()+"\n");
JLNumeroSorteado.setText(listaNumeros.get(indice).toString());
listaNumeros.remove(indice);

}else{
    JOptionPane.showMessageDialog(null, "Não Há números a serem sorteados \n inicie um novo Sorteio");
this.JBNovo.setEnabled(true);
this.JBSortear.setEnabled(false);
this.JBCancelar.setEnabled(false);
}
    }//GEN-LAST:event_JBSortearActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
System.exit(0);
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed

this.JBNovo.setEnabled(true);
this.JBSortear.setEnabled(false);
this.JBCancelar.setEnabled(false);
JLNumeroSorteado.setText("0");
JANumerosjaSorteados.setText("");

    }//GEN-LAST:event_JBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JFMsorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMsorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMsorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMsorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMsorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JANumerosjaSorteados;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBSortear;
    private javax.swing.JLabel JLNumeroSorteado;
    private javax.swing.JTextField JTFNumeroNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
