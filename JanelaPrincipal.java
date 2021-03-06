/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Usuario;
import dao.UsuarioDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    UsuarioDao usuarioDao = new UsuarioDao();
    /**
     * Creates new form Janela_principal
     */
    public JanelaPrincipal(String usuarioLogado) {
        initComponents();
        jLabelUser.setText(usuarioLogado);
    }

    private JanelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        desktop_Principal_Interno = new javax.swing.JDesktopPane();
        jLabelUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cadastro = new javax.swing.JMenu();
        menu_Cadastro_PF = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_Cadastro_PJ = new javax.swing.JMenuItem();
        jMenu_Consulta = new javax.swing.JMenu();
        menu_consulta_PF = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menu_consulta_PJ = new javax.swing.JMenuItem();
        jMenu_Contabil = new javax.swing.JMenu();
        menu_lancamentos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menu_contas = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_subcontas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISCONTA JG");

        jLabelUser.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("jLabel1");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário:");

        javax.swing.GroupLayout desktop_Principal_InternoLayout = new javax.swing.GroupLayout(desktop_Principal_Interno);
        desktop_Principal_Interno.setLayout(desktop_Principal_InternoLayout);
        desktop_Principal_InternoLayout.setHorizontalGroup(
            desktop_Principal_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop_Principal_InternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser)
                .addContainerGap(860, Short.MAX_VALUE))
        );
        desktop_Principal_InternoLayout.setVerticalGroup(
            desktop_Principal_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktop_Principal_InternoLayout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(desktop_Principal_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        desktop_Principal_Interno.setLayer(jLabelUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_Principal_Interno.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu_Cadastro.setText("Cadastro");
        jMenu_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_CadastroActionPerformed(evt);
            }
        });

        menu_Cadastro_PF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Office-Customer-Male-Light-icon.png"))); // NOI18N
        menu_Cadastro_PF.setText("Cadastra Usuário");
        menu_Cadastro_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Cadastro_PFActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(menu_Cadastro_PF);
        jMenu_Cadastro.add(jSeparator1);

        menu_Cadastro_PJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/entity-icon.png"))); // NOI18N
        menu_Cadastro_PJ.setText("Cadastra Entidade");
        menu_Cadastro_PJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Cadastro_PJActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(menu_Cadastro_PJ);

        jMenuBar1.add(jMenu_Cadastro);

        jMenu_Consulta.setText("Consulta/Altera");
        jMenu_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ConsultaActionPerformed(evt);
            }
        });

        menu_consulta_PF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Zoom-icon.png"))); // NOI18N
        menu_consulta_PF.setText("Consulta Usuários PF");
        menu_consulta_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consulta_PFActionPerformed(evt);
            }
        });
        jMenu_Consulta.add(menu_consulta_PF);
        jMenu_Consulta.add(jSeparator2);

        menu_consulta_PJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Search-icon.png"))); // NOI18N
        menu_consulta_PJ.setText("Consulta Entidade PJ");
        jMenu_Consulta.add(menu_consulta_PJ);

        jMenuBar1.add(jMenu_Consulta);

        jMenu_Contabil.setText("Contabilidade");

        menu_lancamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/total-plan-cost-icon.png"))); // NOI18N
        menu_lancamentos.setText("Lancamentos");
        jMenu_Contabil.add(menu_lancamentos);
        jMenu_Contabil.add(jSeparator3);

        menu_contas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bookmark-book-icon.png"))); // NOI18N
        menu_contas.setText("Contas");
        jMenu_Contabil.add(menu_contas);
        jMenu_Contabil.add(jSeparator4);

        menu_subcontas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bookmark-book-open-icon.png"))); // NOI18N
        menu_subcontas.setText("Subcontas");
        jMenu_Contabil.add(menu_subcontas);

        jMenuBar1.add(jMenu_Contabil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_Principal_Interno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_Principal_Interno)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void menu_consulta_PFActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        UsuarioConsultaView consultaUser = new UsuarioConsultaView(jLabelUser.getText());
        desktop_Principal_Interno.add(consultaUser);
        consultaUser.setVisible(true);
    }                                                

    private void menu_Cadastro_PFActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setLogin(jLabelUser.getText());
        usuario.setTipo("administrador");
        if(usuarioDao.verifica_Acesso(usuario)) {
            UsuarioView cadPF = new UsuarioView();
            desktop_Principal_Interno.add(cadPF);
            cadPF.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Necessário perfil de Administrador!");
        }
    }                                                

    private void jMenu_CadastroActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jMenu_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void menu_Cadastro_PJActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setLogin(jLabelUser.getText());
        usuario.setTipo("administrador");
        if(usuarioDao.verifica_Acesso(usuario)) {
            EntidadeView cadPJ = new EntidadeView();
            desktop_Principal_Interno.add(cadPJ);
            cadPJ.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Necessário perfil de Administrador!");
        }
    }                                                

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JDesktopPane desktop_Principal_Interno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Cadastro;
    private javax.swing.JMenu jMenu_Consulta;
    private javax.swing.JMenu jMenu_Contabil;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem menu_Cadastro_PF;
    private javax.swing.JMenuItem menu_Cadastro_PJ;
    private javax.swing.JMenuItem menu_consulta_PF;
    private javax.swing.JMenuItem menu_consulta_PJ;
    private javax.swing.JMenuItem menu_contas;
    private javax.swing.JMenuItem menu_lancamentos;
    private javax.swing.JMenuItem menu_subcontas;
    // End of variables declaration                   
}
