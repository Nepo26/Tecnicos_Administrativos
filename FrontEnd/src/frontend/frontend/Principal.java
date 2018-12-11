/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.frontend;

/**
 *
 * @author Aluno
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Principal() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        painelInformacoes = new javax.swing.JPanel();
        Foto = new javax.swing.JPanel();
        trocaFoto = new javax.swing.JButton();
        matricula = new javax.swing.JFormattedTextField();
        sobrenome = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JFormattedTextField();
        emprego = new javax.swing.JFormattedTextField();
        regimeRemuneracao = new javax.swing.JFormattedTextField();
        unidade = new javax.swing.JFormattedTextField();
        departamento = new javax.swing.JFormattedTextField();
        cargaHorariaDiaria = new javax.swing.JFormattedTextField();
        cargaHorariaSemanal = new javax.swing.JFormattedTextField();
        cargaHorariaMensal = new javax.swing.JFormattedTextField();
        pesquisar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Pesquisa = new javax.swing.JTextField();
        comandosJanela = new javax.swing.JPanel();
        resultadoPesquisa = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.setPreferredSize(new java.awt.Dimension(640, 480));

        painelInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        painelInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelInformacoes.setPreferredSize(new java.awt.Dimension(408, 420));

        Foto.setBackground(new java.awt.Color(255, 255, 255));
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Foto.setPreferredSize(new java.awt.Dimension(408, 420));

        trocaFoto.setBackground(new java.awt.Color(255, 255, 255));
        trocaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/frontend/images/icons8-edit-image-30.png"))); // NOI18N
        trocaFoto.setBorderPainted(false);
        trocaFoto.setIconTextGap(0);
        trocaFoto.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout FotoLayout = new javax.swing.GroupLayout(Foto);
        Foto.setLayout(FotoLayout);
        FotoLayout.setHorizontalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotoLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(trocaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FotoLayout.setVerticalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(trocaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        matricula.setText("Matrícula");

        sobrenome.setText("Sobrenome");

        nome.setText("Nome");

        emprego.setText("Emprego");

        regimeRemuneracao.setText("Regime Remuneração");

        unidade.setText("Unidade");

        departamento.setText("Departamento");

        cargaHorariaDiaria.setText("Carga Horária Diária");

        cargaHorariaSemanal.setText("Semanal");
        cargaHorariaSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaHorariaSemanalActionPerformed(evt);
            }
        });

        cargaHorariaMensal.setText("Mensal");
        cargaHorariaMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaHorariaMensalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInformacoesLayout = new javax.swing.GroupLayout(painelInformacoes);
        painelInformacoes.setLayout(painelInformacoesLayout);
        painelInformacoesLayout.setHorizontalGroup(
            painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInformacoesLayout.createSequentialGroup()
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInformacoesLayout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                            .addComponent(emprego)
                            .addComponent(regimeRemuneracao)
                            .addComponent(unidade)
                            .addGroup(painelInformacoesLayout.createSequentialGroup()
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(departamento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelInformacoesLayout.createSequentialGroup()
                            .addComponent(cargaHorariaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cargaHorariaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4))
        );
        painelInformacoesLayout.setVerticalGroup(
            painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelInformacoesLayout.createSequentialGroup()
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emprego, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regimeRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargaHorariaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaHorariaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaHorariaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pesquisar.setPreferredSize(new java.awt.Dimension(100, 34));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/frontend/images/Engineering_30px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pesquisa.setText("Pesquisar");
        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisarLayout = new javax.swing.GroupLayout(pesquisar);
        pesquisar.setLayout(pesquisarLayout);
        pesquisarLayout.setHorizontalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisarLayout.createSequentialGroup()
                .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pesquisarLayout.setVerticalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(Pesquisa)
        );

        comandosJanela.setBackground(new java.awt.Color(255, 255, 255));
        comandosJanela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout comandosJanelaLayout = new javax.swing.GroupLayout(comandosJanela);
        comandosJanela.setLayout(comandosJanelaLayout);
        comandosJanelaLayout.setHorizontalGroup(
            comandosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        comandosJanelaLayout.setVerticalGroup(
            comandosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        resultadoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        resultadoPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setPreferredSize(new java.awt.Dimension(172, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/frontend/images/Delete_30px.png"))); // NOI18N
        jButton6.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 124, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout resultadoPesquisaLayout = new javax.swing.GroupLayout(resultadoPesquisa);
        resultadoPesquisa.setLayout(resultadoPesquisaLayout);
        resultadoPesquisaLayout.setHorizontalGroup(
            resultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultadoPesquisaLayout.setVerticalGroup(
            resultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comandosJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(resultadoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(comandosJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addContainerGap(504, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 680, 977));
        background.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaActionPerformed

    private void cargaHorariaSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaHorariaSemanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaHorariaSemanalActionPerformed

    private void cargaHorariaMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaHorariaMensalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaHorariaMensalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JPanel background;
    private javax.swing.JFormattedTextField cargaHorariaDiaria;
    private javax.swing.JFormattedTextField cargaHorariaMensal;
    private javax.swing.JFormattedTextField cargaHorariaSemanal;
    private javax.swing.JPanel comandosJanela;
    private javax.swing.JFormattedTextField departamento;
    private javax.swing.JFormattedTextField emprego;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField matricula;
    private javax.swing.JFormattedTextField nome;
    private javax.swing.JPanel painelInformacoes;
    private javax.swing.JPanel pesquisar;
    private javax.swing.JFormattedTextField regimeRemuneracao;
    private javax.swing.JPanel resultadoPesquisa;
    private javax.swing.JFormattedTextField sobrenome;
    private javax.swing.JButton trocaFoto;
    private javax.swing.JFormattedTextField unidade;
    // End of variables declaration//GEN-END:variables
}