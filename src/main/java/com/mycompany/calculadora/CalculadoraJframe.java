/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author kaue1
 */
public class CalculadoraJframe extends javax.swing.JFrame {

 
    public CalculadoraJframe() {
        initComponents();
    }
    double valor1,valor2;
    String operacao;

   
    
    //Componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        Bt2 = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        Btmais = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Btvirgula = new javax.swing.JButton();
        Btigual = new javax.swing.JButton();
        Btsubtracao = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt7 = new javax.swing.JButton();
        Bt9 = new javax.swing.JButton();
        BtDivisao = new javax.swing.JButton();
        BtMultiplicacao = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bton = new javax.swing.JButton();
        BtC = new javax.swing.JButton();
        JtResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(255, 255, 255));

        Bt2.setBackground(new java.awt.Color(216, 216, 191));
        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        Bt0.setBackground(new java.awt.Color(216, 216, 191));
        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });

        Bt1.setBackground(new java.awt.Color(216, 216, 191));
        Bt1.setText("1");
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });

        Btmais.setBackground(new java.awt.Color(0, 0, 0));
        Btmais.setForeground(new java.awt.Color(255, 255, 255));
        Btmais.setText("+");
        Btmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmaisActionPerformed(evt);
            }
        });

        Bt3.setBackground(new java.awt.Color(216, 216, 191));
        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Btvirgula.setBackground(new java.awt.Color(216, 216, 191));
        Btvirgula.setText(",");
        Btvirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtvirgulaActionPerformed(evt);
            }
        });

        Btigual.setBackground(new java.awt.Color(255, 165, 0));
        Btigual.setText("=");
        Btigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtigualActionPerformed(evt);
            }
        });

        Btsubtracao.setBackground(new java.awt.Color(0, 0, 0));
        Btsubtracao.setForeground(new java.awt.Color(255, 255, 255));
        Btsubtracao.setText("-");

        Bt8.setBackground(new java.awt.Color(216, 216, 191));
        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        Bt7.setBackground(new java.awt.Color(216, 216, 191));
        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        Bt9.setBackground(new java.awt.Color(216, 216, 191));
        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        BtDivisao.setBackground(new java.awt.Color(0, 0, 0));
        BtDivisao.setForeground(new java.awt.Color(255, 255, 255));
        BtDivisao.setText("/");
        BtDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDivisaoActionPerformed(evt);
            }
        });

        BtMultiplicacao.setBackground(new java.awt.Color(0, 0, 0));
        BtMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        BtMultiplicacao.setText("*");
        BtMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMultiplicacaoActionPerformed(evt);
            }
        });

        Bt6.setBackground(new java.awt.Color(216, 216, 191));
        Bt6.setText("6");
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });

        Bt5.setBackground(new java.awt.Color(216, 216, 191));
        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        Bt4.setBackground(new java.awt.Color(216, 216, 191));
        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bton.setBackground(new java.awt.Color(255, 165, 0));
        Bton.setText("ON");

        BtC.setBackground(new java.awt.Color(255, 165, 0));
        BtC.setText("C");

        JtResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JtResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtResultadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PainelLayout.createSequentialGroup()
                            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PainelLayout.createSequentialGroup()
                                    .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(Btvirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Btmais, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PainelLayout.createSequentialGroup()
                                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PainelLayout.createSequentialGroup()
                                            .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PainelLayout.createSequentialGroup()
                                            .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                            .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Btsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Btigual, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(BtC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PainelLayout.createSequentialGroup()
                            .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(BtDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addComponent(JtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(JtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btmais, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btvirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Btigual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDivisaoActionPerformed
           valor1 = Double.parseDouble(JtResultado.getText());
       JtResultado.setText("");
       operacao= "divisao";
    }//GEN-LAST:event_BtDivisaoActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "9");
    }//GEN-LAST:event_Bt9ActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
         JtResultado.setText(JtResultado.getText()+ "7");
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "8");
    }//GEN-LAST:event_Bt8ActionPerformed

    private void BtigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtigualActionPerformed
        valor2 = Double.parseDouble(JtResultado.getText());
        
        if(operacao == "soma"){
            JtResultado.setText(String.valueOf(valor1+ valor2));
        }else if(operacao == "subtracao" ){
            JtResultado.setText(String.valueOf(valor1 - valor2));
        }else if (operacao == "multiplicacao"){
            JtResultado.setText(String.valueOf(valor1 * valor2));
        }else if(operacao == "divisao"){
            JtResultado.setText(String.valueOf(valor1 / valor2));
        }
    }//GEN-LAST:event_BtigualActionPerformed

    private void BtvirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtvirgulaActionPerformed
          JtResultado.setText(JtResultado.getText()+ ",");
    }//GEN-LAST:event_BtvirgulaActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "3");
    }//GEN-LAST:event_Bt3ActionPerformed

    private void BtmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmaisActionPerformed
       valor1 = Double.parseDouble(JtResultado.getText());
       JtResultado.setText("");
       operacao= "soma";
    }//GEN-LAST:event_BtmaisActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        JtResultado.setText(JtResultado.getText()+ "1");
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
        // button zero
        //acionando o text fild nosso campo de resultado e logo em seguida seja acionado o retorno desse valor na tela
        
        JtResultado.setText(JtResultado.getText()+ "0");
        
       
    }//GEN-LAST:event_Bt0ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "2");
    }//GEN-LAST:event_Bt2ActionPerformed

    private void BtMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMultiplicacaoActionPerformed
         valor1 = Double.parseDouble(JtResultado.getText());
       JtResultado.setText("");
       operacao= "multiplicacao";
    }//GEN-LAST:event_BtMultiplicacaoActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "6");
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "5");
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
          JtResultado.setText(JtResultado.getText()+ "4");
    }//GEN-LAST:event_Bt4ActionPerformed

    private void JtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtResultadoActionPerformed
        
    }//GEN-LAST:event_JtResultadoActionPerformed

 
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton BtC;
    private javax.swing.JButton BtDivisao;
    private javax.swing.JButton BtMultiplicacao;
    private javax.swing.JButton Btigual;
    private javax.swing.JButton Btmais;
    private javax.swing.JButton Bton;
    private javax.swing.JButton Btsubtracao;
    private javax.swing.JButton Btvirgula;
    private javax.swing.JTextField JtResultado;
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
