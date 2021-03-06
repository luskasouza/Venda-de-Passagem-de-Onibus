/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cidade;
import model.bean.Cliente;
import model.bean.Passagem;
import model.dao.CidadeDAO;
import model.dao.ClienteDAO;
import model.dao.PassagemDAO;

/**
 *
 * @author Lukas Souza
 */
public class VerDadosCadastrados extends javax.swing.JFrame {

    private Menu veioDoMenor;
   
    /*
    public VerDadosCadastrados() {
        initComponents();
    }
    */

    public void enviarNome(Menu veioDo1, String nome){
        jLabelNome.setText(nome);
        this.veioDoMenor = veioDo1;
    }
    public void enviarCpf(Menu veioDo1, String cpf) {
        jLabelCPF.setText(cpf);
        this.veioDoMenor =  veioDo1;
    }
    public void enviarRg(Menu veioDo1, String rg){
        jLabelRg.setText(rg);
        this.veioDoMenor = veioDo1;
    }
    public void enviarCidadeAtual(Menu veioDo1, String cidadeAtual){
       jLabelCidadeAtual.setText(cidadeAtual);
       this.veioDoMenor = veioDo1;
    }
    public void enviarDestino(Menu veioDo1, String destino){
        jLabelDestino.setText(destino);
        this.veioDoMenor = veioDo1;
    }
    public void enviarQtPassagens(Menu veioDo1, String qtPassagens){
        jLabelPQtPassagens.setText(qtPassagens);
        this.veioDoMenor = veioDo1;
    }
    public void enviarDataViagem(Menu veioDo1, String data){
        jLabelDataViagem.setText(data);
        this.veioDoMenor = veioDo1;
    }
    public void enviarValorDaViagem(Menu veioDol,String preco){
        jLabelPreco.setText(preco);
        this.veioDoMenor = veioDol;
    }
    
    //OBS - Inteiro 
    /*
    public void enviarQuantidadeDePassagem(Menor veioDo1 ,String quantidadeDePassagem){
        jLabePassagem.setText(quantidadeDePassagem);
    }
   */ 
    
    public VerDadosCadastrados(){
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();
        jTableTabela.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();
        modelo.setNumRows(0);
        
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente cliente : cdao.read()) {

            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getRg()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        BttonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelCidadeAtual = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelPQtPassagens = new javax.swing.JLabel();
        jButtonConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelDataViagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Dados do Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        BttonCancelar.setBackground(java.awt.Color.red);
        BttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BttonCancelar.setText("Cancelar");
        BttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttonCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("RG:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Cidade Atual:");

        jLabelCPF.setBackground(java.awt.Color.white);
        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelRg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelCidadeAtual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Destino:");

        jLabelDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Passagem:");

        jLabelPQtPassagens.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButtonConfirm.setBackground(java.awt.Color.green);
        jButtonConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonConfirm.setText("Confirm");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jTableTabela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableTabela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "NOME", "CPF", "RG", "IdCidade", "CidadeAtual", "CidadeDestino", "idPassagens", "QUANTIDADE", "PREÇO", "DATA", "HORA"
            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        jButtonExcluir.setBackground(java.awt.Color.cyan);
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setBackground(new java.awt.Color(153, 102, 255));
        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Data da Viagem:");

        jLabelDataViagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Valor:");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelDataViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelPQtPassagens, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelCidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)))
                                .addGap(530, 530, 530)
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPQtPassagens, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDataViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(BttonCancelar)
                    .addComponent(jButtonConfirm)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttonCancelarActionPerformed
        if(veioDoMenor != null){
            veioDoMenor.retornarNome(jLabelNome.getText());
            veioDoMenor.retornarCPF(jLabelCPF.getText());
            veioDoMenor.retornarRg(jLabelRg.getText());
            veioDoMenor.retornarCidadeAtual(jLabelCidadeAtual.getText());
            veioDoMenor.retornarDestino(jLabelDestino.getText());
            veioDoMenor.retornarQtPassagens(jLabelPQtPassagens.getText());
            veioDoMenor.retornarDataViagem(jLabelDataViagem.getText());
            this.dispose();
        } 
    }//GEN-LAST:event_BttonCancelarActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        /*
            Classe Cliente
            Classe ClienteDAO
        */
        Cliente cliente = new Cliente();
        ClienteDAO clientedao =  new ClienteDAO();
        cliente.setNome(jLabelNome.getText());
        cliente.setCpf(jLabelCPF.getText());
        cliente.setRg(jLabelRg.getText());
        clientedao.create(cliente);
        //Limpar campo de texto
        jLabelNome.setText("");
        jLabelCPF.setText("");
        jLabelRg.setText("");
        readJTable();
        /*
            Classe Cidade
            Classe CidadeDAO
        */
        Cidade cidade = new Cidade();
        CidadeDAO cidadedao = new CidadeDAO();
        cidade.setCidadeAtual(jLabelCidadeAtual.getText());
        cidade.setCidadeDestino(jLabelDestino.getText());
        cidadedao.create(cidade);
        //Limpar Tela
        jLabelCidadeAtual.setText("");
        jLabelDestino.setText("");
        /*
            Classe Passagem
            Classe PassagemDAO
        */
        Passagem passagem = new Passagem();
        PassagemDAO passagemDAO = new PassagemDAO();
        passagem.setQuantidade(Integer.parseInt(jLabelPQtPassagens.getText()));
        passagem.setPreco(Double.parseDouble(jLabelPreco.getText()));
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(jLabelDataViagem.getText(), formatoData);
        passagem.setData(new Date(data.getYear(),data.getMonth().getValue(),data.getDayOfMonth()));
        passagemDAO.create(passagem);
        
        jLabelDataViagem.setText("");
        jLabelPQtPassagens.setText("");
        jLabelPreco.setText("");
        
        readJTable();
        //passagem.setPreco(Double.parseDouble(jLabelValor.getText()));
      
        /*
        cliente.setRg(Integer.parseInt(jLabelRg.getText()));
        cliente.setRg(Double.parseDouble(jLabelRg.getText()));
        */
        
        /*
        String nome = jLabelNome.getText().trim();
        String cpf = jLabelCPF.getText().trim();
        String rg = jLabelRg.getText().trim();
        String cidadeAtual = jLabelCidadeAtual.getText().trim();
        String destino = jLabelDestino.getText().trim();
        String passagem = jLabelPQtPassagens.getText().trim();
    
        DefaultTableModel val = (DefaultTableModel)jTableTabela.getModel();
        val.addRow(new String[]{cpf,nome,rg,cidadeAtual,destino,passagem});
        
        jLabelCPF.setText("");
        jLabelNome.setText("");
        jLabelRg.setText("");
        jLabelCidadeAtual.setText("");
        jLabelDestino.setText("");
        jLabelPQtPassagens.setText("");
        
        jLabelNome.requestFocus();
        */
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
            if (jTableTabela.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            ClienteDAO clientedao = new ClienteDAO();
            cliente.setIdCliente((int) jTableTabela.getValueAt(jTableTabela.getSelectedRow(), 0));
            clientedao.delete(cliente);

            jLabelNome.setText("");
            jLabelCPF.setText("");
            jLabelRg.setText("");

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }








//((DefaultTableModel)jTableTabela.getModel()).removeRow(jTableTabela.getSelectedRow());
       /*
       DefaultTableModel dtm = (DefaultTableModel)jTableTabela.getModel();
        if (jTableTabela.getSelectedRow() >= 0){
            dtm.removeRow(jTableTabela.getSelectedRow());
            jTableTabela.setModel(dtm);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
       */
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
         if (jTableTabela.getSelectedRow() != -1) {

            Cliente cliente = new Cliente();
            ClienteDAO clientedao = new ClienteDAO();

            cliente.setNome(jLabelNome.getText());
            cliente.setCpf(jLabelCPF.getText());
            cliente.setRg(jLabelRg.getText());
            cliente.setIdCliente((int) jTableTabela.getValueAt(jTableTabela.getSelectedRow(), 0));
            clientedao.update(cliente);

            jLabelNome.setText("");
            jLabelCPF.setText("");
            jLabelRg.setText("");

            readJTable();

        } 
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDadosCadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttonCancelar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidadeAtual;
    private javax.swing.JLabel jLabelDataViagem;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPQtPassagens;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    // End of variables declaration//GEN-END:variables
/*
    private String ConverterParaQS(String text) {
        return text.substring(6,10)+"-"+text.substring(3,5)+"-"+text.substring(0,2);

}
*/
 
}
