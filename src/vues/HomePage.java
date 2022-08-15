package vues;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modeles.UserUserService;
import services.Find;
import services.FindResponse;
import services.ListerResponse;
import services.Sup;
import services.SupResponse;
import services.User;

/**
 *
 * @author moust
 */
public final class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomeUser
     */
    public HomePage() {
        initComponents();
        this.actualiser();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.setVisible(true);
    }
    
    public void actualiser(){
        UserUserService us = UserUserService.getInstanceUserUserService();
        ListerResponse reponse = us.lister() ;
        DefaultTableModel useTabDef = (DefaultTableModel)userTable.getModel();
        useTabDef.setRowCount(0);
        List<User> userList = reponse.getReturn();

        for(int k=0; k<userList.size(); k++){
            String id = String.valueOf(userList.get(k).getId());
            String email = userList.get(k).getEmail();
            String password = userList.get(k).getPassword();
            String nom = userList.get(k).getNom();
            String prenom = userList.get(k).getPrenom();
            String numtel = userList.get(k).getTelnum();
            String role_user = userList.get(k).getUserRole();
            String autoriz = String.valueOf(userList.get(k).isAutorized());
            String []listA = {id, email, password, nom, prenom, numtel, role_user, autoriz};
            useTabDef.addRow(listA);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addUserBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setText("     Gestion des utilisateurs");

        userTable.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "email", "password", "nom", "prenom", "numtel", "user_role", "autorized"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        addUserBtn.setBackground(new java.awt.Color(51, 153, 255));
        addUserBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        addUserBtn.setText("Ajouter un utilisateur");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Supprimer");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 153, 102));
        updateBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Modifier");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(153, 204, 0));
        refreshBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Actualiser");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1246, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        AddUserPage aup = new AddUserPage();
        aup.show();
        aup.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        actualiser();
    }                                          

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.actualiser();
        
    }
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {

        int rowToUpdate = userTable.getSelectedRow();
        if(rowToUpdate < 0)
        JOptionPane.showMessageDialog(null, "Veuillez selectionner une ligne !");
        else {
            UserUserService us = UserUserService.getInstanceUserUserService();
            model = (DefaultTableModel) userTable.getModel();
            Find userToFind = new Find();
            userToFind.setEmail(model.getValueAt(rowToUpdate, 1).toString());
            //String adresseMail = model.getValueAt(rowToUpdate, 1).toString();
            FindResponse userFound = us.find(userToFind);
            UpdateUserPage uup = new UpdateUserPage(userFound.getReturn());
            uup.show();
            this.actualiser();
            uup.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }
    
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        int rowToDelete = userTable.getSelectedRow();  
        model = (DefaultTableModel)userTable.getModel();
        if(rowToDelete <= 0){
            //JOptionPane.showMessageDialog(null,"Veuillez selectionner une ligne au niveau du tableau","Selectionnez une ligne",JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir supprimer cet Utilisateur ?","Suppression d'un utilisateur", JOptionPane.YES_NO_OPTION);
            if(result == 0){
                UserUserService us2 = UserUserService.getInstanceUserUserService();
                Sup requete = new Sup();
                requete.setEmail(model.getValueAt(rowToDelete, 1).toString());
                SupResponse reponse ;
                reponse = us2.sup(requete);
                if(reponse.equals(1))
                    JOptionPane.showMessageDialog(null, "Suppression de l'utilisateur avec succès");
                else
                    JOptionPane.showMessageDialog(null, "Suppression de l'utilisateur a échoué !");



                // String id = model.getValueAt(rowToDelete, 0).toString();
                // String email = model.getValueAt(rowToDelete, 1).toString();
                // String password = model.getValueAt(rowToDelete, 2).toString();
                // String nom = model.getValueAt(rowToDelete, 3).toString();
                // String prenom = model.getValueAt(rowToDelete, 4).toString();
                // String telnum = model.getValueAt(rowToDelete, 5).toString();
                // String user_role = model.getValueAt(rowToDelete, 6).toString();


                //us2.updateUser(id, email, password, nom, prenom, telnum, user_role);
                //us2.deleteUser(email);
                //JOptionPane.showMessageDialog(null, "Suppression de l'utilisateur avec succès");
            }
        }
        
    }                                         

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTable userTable;
    private DefaultTableModel model;
    // End of variables declaration                   
}
