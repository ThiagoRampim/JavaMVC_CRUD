package VIEW;

import DAO.AlunoDAO;
import MODEL.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewAluno extends javax.swing.JFrame {

    public ViewAluno() {
        initComponents();
        listarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfRa = new javax.swing.JTextField();
        tfCurso = new javax.swing.JTextField();
        tfSigla = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("ID: ");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("RA: ");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Curso: ");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Sigla: ");

        tfId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfId.setName(""); // NOI18N

        tfNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        tfRa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        tfCurso.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        tfSigla.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Ra", "Curso", "Sigla"
            }
        ));
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome)
                            .addComponent(tfCurso)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfSigla)
                                            .addGap(4, 4, 4)))
                                    .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar)
                            .addComponent(btnPesquisar)
                            .addComponent(btnDeletar)
                            .addComponent(btnsalvar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Aluno aluno = new Aluno();
        aluno.setId(Integer.parseInt(tfId.getText()));
        aluno.setNome(tfNome.getText());
        aluno.setRa(Integer.parseInt(tfRa.getText()));
        aluno.setCurso(tfCurso.getText());
        aluno.setSigla(tfSigla.getText());
        
        AlunoDAO alunoDao = new AlunoDAO();
        alunoDao.alterar(aluno);
        JOptionPane.showMessageDialog(null, 
                "Atualizardo");
        clear();
        listarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        Aluno aluno = new Aluno();
        aluno.setId(Integer.parseInt(tfId.getText()));
        aluno.setNome(tfNome.getText());
        aluno.setRa(Integer.parseInt(tfRa.getText()));
        aluno.setCurso(tfCurso.getText());
        aluno.setSigla(tfSigla.getText());
        
        AlunoDAO alunoDao = new AlunoDAO();
        alunoDao.salvar(aluno);
        JOptionPane.showMessageDialog(null, 
                "Salvo");
        clear();
        listarTabela();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Aluno aluno = new Aluno();
        aluno.setId(Integer.parseInt(tfId.getText()));
        
        AlunoDAO alunoDao = new AlunoDAO();
        alunoDao.deletar(aluno);
        JOptionPane.showMessageDialog(null, 
                "Salvo");
        clear();
        listarTabela();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Aluno aluno = new Aluno();
        aluno.setId(Integer.parseInt(tfId.getText()));
        
        AlunoDAO alunoDao = new AlunoDAO();
        Aluno saluno = alunoDao.buscar(aluno);
        tfId.setText(String.valueOf(saluno.getId()));
        tfNome.setText(saluno.getNome());
        tfRa.setText(String.valueOf(saluno.getRa()));
        tfCurso.setText(saluno.getCurso());
        tfSigla.setText(saluno.getSigla());
        JOptionPane.showMessageDialog(null, 
                "Pesquisado");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked
        tfId.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0).toString());
        tfNome.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 1).toString());
        tfRa.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 2).toString());
        tfCurso.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 3).toString());
        tfSigla.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblAlunosMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAluno().setVisible(true);
            }
        });
    }
    
    public void clear() {
        tfId.setText("");
        tfNome.setText("");
        tfRa.setText("");
        tfCurso.setText("");
        tfSigla.setText("");
    }
    
    public void listarTabela() {
        DefaultTableModel tabela = (DefaultTableModel) tblAlunos.getModel();
        tabela.getDataVector().removeAllElements();
        AlunoDAO alunoDao = new AlunoDAO();
        List<Aluno> alunos = alunoDao.listarAlunos();
        int i = 0;
        while(alunos.size() > i) {
            tabela.addRow(new Object[]{
                String.valueOf(alunos.get(i).getId()),
                alunos.get(i).getNome(),
                String.valueOf(alunos.get(i).getRa()),
                alunos.get(i).getCurso(),
                alunos.get(i).getSigla()
            });
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRa;
    private javax.swing.JTextField tfSigla;
    // End of variables declaration//GEN-END:variables
}
