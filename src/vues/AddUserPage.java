package vues;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import modeles.UserUserService;
import services.Inserer;
import services.InsererResponse;

/**
 *
 * @author Amadou Moustapha Fall DIC2 INFO ESP UCAD DAKAR SENEGAL
 */
public class AddUserPage extends javax.swing.JFrame {

    /**
     * Creates new form AddUserPage
     */
    public AddUserPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        autorizedGroupBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        addUserPageTitle = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prenomField = new javax.swing.JTextField();
        nomField = new javax.swing.JTextField();
        numtelField = new javax.swing.JTextField();
        OuiRBtn = new javax.swing.JRadioButton();
        NonRBtn = new javax.swing.JRadioButton();
        Role_userBox = new javax.swing.JComboBox<>();
        EnregistrerBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addUserPageTitle.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        addUserPageTitle.setText("Ajouter un  nouvel utilisateur");

        emailField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setText("Numero Tel");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel6.setText("Autorized");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setText("Role User");

        prenomField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        prenomField.setForeground(new java.awt.Color(102, 102, 102));

        nomField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        nomField.setForeground(new java.awt.Color(102, 102, 102));

        passwordField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 102, 102));

        numtelField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        numtelField.setForeground(new java.awt.Color(102, 102, 102));

        autorizedGroupBtn.add(OuiRBtn);
        OuiRBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        OuiRBtn.setText("Oui");

        autorizedGroupBtn.add(NonRBtn);
        NonRBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        NonRBtn.setText("Non");

        Role_userBox.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Role_userBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "editeur", "admin" }));

        EnregistrerBtn.setBackground(new java.awt.Color(51, 153, 255));
        EnregistrerBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EnregistrerBtn.setForeground(new java.awt.Color(255, 255, 255));
        EnregistrerBtn.setText("Enregistrer");
        EnregistrerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(addUserPageTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Role_userBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(OuiRBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(NonRBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numtelField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnregistrerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(254, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(addUserPageTitle)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numtelField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role_userBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(OuiRBtn)
                    .addComponent(NonRBtn))
                .addGap(18, 18, 18)
                .addComponent(EnregistrerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(279, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                                                                  
                                          

    private void EnregistrerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        
        UserUserService us = UserUserService.getInstanceUserUserService();
        Inserer requete = new Inserer();
        requete.setEmail(emailField.getText());
        requete.setNom(nomField.getText());
        requete.setPrenom(prenomField.getText());
        requete.setPassword(passwordField.getText());
        requete.setTelnum(numtelField.getText());
        requete.setUserRole(Role_userBox.getSelectedItem().toString());
        requete.setAutorized(OuiRBtn.isSelected());

        InsererResponse reponse = us.inserer(requete);
        
        if(reponse.getReturn() == 1){
            JOptionPane.showMessageDialog(null, "L'utilisateur a bien été ajouté !");
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "L'utilisateur n'a pas été enregistré !");
            emailField.setText("");
            passwordField.setText("");
            nomField.setText("");
            prenomField.setText("");
            numtelField.setText("");
        }
        
    }                                              

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton EnregistrerBtn;
    private javax.swing.JRadioButton NonRBtn;
    private javax.swing.JRadioButton OuiRBtn;
    private javax.swing.JComboBox<String> Role_userBox;
    private javax.swing.JLabel addUserPageTitle;
    private javax.swing.ButtonGroup autorizedGroupBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomField;
    private javax.swing.JTextField numtelField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField prenomField;
    // End of variables declaration                   
}
