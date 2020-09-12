//Imagine um software de estoque de produtos de um pequeno comércio. Neste
//software é possível criar produtos (ex: Pão de forma da marca Fofinho ou
//Margarina da marca Salgadinha) e itens de um produto (do lote 1234x e o preço de
//compra e venda). Desenvolva um programa para cadastrar, remover, atualizar e
//listar produtos e itens de produtos.

//@author:Lia mariana Brito

package cadastromercadinho_q10;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Tabela_De_Produtos extends javax.swing.JFrame {
    
    ArrayList<relatorio_produto> ListPro;
    String modo;
    
    public void loadTablePro (){
       
        DefaultTableModel modelo = new DefaultTableModel (new Object[] {"Produto","R$ Venda","R$ Compra","Lote"},0);

        for (int i = 0; i < ListPro.size() ;i++){
           Object linha[] = new Object[] {ListPro.get(i).getproduto(),ListPro.get(i).getvalor_de_venda(),ListPro.get(i).getvalor_de_compra(),ListPro.get(i).getlote()};
           modelo.addRow(linha);
        }
        
        tabela_produtos.setModel(modelo);
        tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(50);
    }

    public Tabela_De_Produtos() {
        initComponents();
        setLocationRelativeTo(null);//centralizarTela
        ListPro = new ArrayList();
        modo = "navegar";
        ManipulaInteface();
    }
    
    public void ManipulaInteface(){
        switch(modo){
            //manipulando os botões de edição(PRESTAR ATENÇÃO NESSA PARTE !!!)
            case "navegar":
                
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                
                btn_novo.setEnabled(true);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                
                c_pro_produto.setEnabled(false);
                c_pro_lote.setEnabled(false);
                c_pro_compra.setEnabled(false);
                c_pro_venda.setEnabled(false);
                break;
                
            case "novo":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                
                btn_novo.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                
                c_pro_produto.setEnabled(true);
                c_pro_lote.setEnabled(true);
                c_pro_compra.setEnabled(true);
                c_pro_venda.setEnabled(true);
                break;
                
            case "editar":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                
                btn_novo.setEnabled(true);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                
                c_pro_produto.setEnabled(true);
                c_pro_lote.setEnabled(true);
                c_pro_compra.setEnabled(true);
                c_pro_venda.setEnabled(true);
                break;
                
            case "excluir":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                
                btn_novo.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                
                c_pro_produto.setEnabled(false);
                c_pro_lote.setEnabled(false);
                c_pro_compra.setEnabled(false);
                c_pro_venda.setEnabled(false);
                break;
               
            case "selecionar":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                
                btn_novo.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_editar.setEnabled(true);
                
                c_pro_produto.setEnabled(false);
                c_pro_lote.setEnabled(false);
                c_pro_compra.setEnabled(false);
                c_pro_venda.setEnabled(false);
                break;    
                
            default:System.out.println("OPÇÃO INVÁLIDO!!!");    
                
                        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        titulo_mercadinhodoicev = new javax.swing.JLabel();
        tbl_produtos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_pro_produto = new javax.swing.JTextField();
        c_pro_venda = new javax.swing.JTextField();
        c_pro_compra = new javax.swing.JTextField();
        c_pro_lote = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo_mercadinhodoicev.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo_mercadinhodoicev.setText("                  Mercadinho do Icev");
        titulo_mercadinhodoicev.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faça seu cadastro e seja feliz!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        tbl_produtos.setForeground(new java.awt.Color(102, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabela_produtos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "R$ Venda", "R$ Compra", "Lote"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_produtos.getTableHeader().setReorderingAllowed(false);
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_produtos);
        if (tabela_produtos.getColumnModel().getColumnCount() > 0) {
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("EDITAR CADASTRO"));

        jLabel1.setText("Produto: ");

        jLabel2.setText("R$ Venda = ");

        jLabel3.setText("R$ Compra = ");

        jLabel4.setText("Lote :");

        c_pro_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_produtoActionPerformed(evt);
            }
        });

        c_pro_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_pro_loteActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_pro_produto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_pro_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c_pro_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_pro_lote))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_pro_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(c_pro_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_pro_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(c_pro_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        btn_excluir.setText("EXCLUIR");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_novo.setText("NOVO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbl_produtos.addTab("BEM VINDO AO SISTEMA DE CADASTR DE PRODUTO!", jPanel2);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("ENGENHARIA DE SOFTWARE -- LIA MARIANA NASCIMENTO BRITO");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Cadastre seu(s) produto(s) e no painel inferior você pode modifila-lo .");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(tbl_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(titulo_mercadinhodoicev, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel5)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo_mercadinhodoicev, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(tbl_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        c_pro_produto.setText("");
        c_pro_lote.setText("");
        c_pro_compra.setText("");
        c_pro_venda.setText("");

        modo = "novo";
        ManipulaInteface();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        modo = "editar";
        ManipulaInteface();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int index = tabela_produtos.getSelectedRow();

        if (index >= 0 && index<ListPro.size()){
            relatorio_produto P = ListPro.get(index);
            ListPro.remove(index);
        }

        loadTablePro();
        modo = "navegar";
        ManipulaInteface();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        c_pro_produto.setText("");
        c_pro_lote.setText("");
        c_pro_compra.setText("");
        c_pro_venda.setText("");

        modo = "navegar";
        ManipulaInteface();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        int varLote = Integer.parseInt(c_pro_lote.getText());
        long varVenda = Integer.parseInt(c_pro_venda.getText());
        long varCompra = Integer.parseInt(c_pro_compra.getText());
        String varProduto = c_pro_produto.getText();

        if(modo.equals("novo")){
            relatorio_produto P = new relatorio_produto(varProduto,varLote,varCompra,varVenda);
            ListPro.add(P);
        }else if(modo.equals("editar")){
            int index = tabela_produtos.getSelectedRow();
            ListPro.get(index).setproduto(varProduto);
            ListPro.get(index).setlote(varLote);
            ListPro.get(index).setvalor_de_compra(varCompra);
            ListPro.get(index).setvalor_de_venda(varVenda);
        }

        loadTablePro();

        modo = "navegar";
        ManipulaInteface();

        c_pro_produto.setText("");
        c_pro_lote.setText("");
        c_pro_compra.setText("");
        c_pro_venda.setText("");
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void c_pro_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_loteActionPerformed

    private void c_pro_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_pro_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_pro_produtoActionPerformed

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        int index = tabela_produtos.getSelectedRow();

        if (index >= 0 && index<ListPro.size()){
            relatorio_produto P = ListPro.get(index);

            c_pro_produto.setText(String.valueOf(P.getproduto()));
            c_pro_lote.setText(String.valueOf(P.getlote()));
            c_pro_compra.setText(String.valueOf(P.getvalor_de_venda()));
            c_pro_venda.setText(String.valueOf(P.getvalor_de_venda()));

            modo = "selecionar";
            ManipulaInteface();
        }
    }//GEN-LAST:event_tabela_produtosMouseClicked

    
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabela_De_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela_De_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela_De_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela_De_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela_De_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField c_pro_compra;
    private javax.swing.JTextField c_pro_lote;
    private javax.swing.JTextField c_pro_produto;
    private javax.swing.JTextField c_pro_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JTabbedPane tbl_produtos;
    private javax.swing.JLabel titulo_mercadinhodoicev;
    // End of variables declaration//GEN-END:variables
}
