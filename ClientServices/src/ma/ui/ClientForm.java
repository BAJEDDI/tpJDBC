/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ma.beans.Client;
import ma.beans.Service;
import ma.service.ClientService;
import ma.service.ServiceService;

/**
 *
 * @author Lachgar
 */
public class ClientForm extends javax.swing.JInternalFrame {

   
    ClientService cs; 
    ServiceService ss;
    static int id=1;
    DefaultTableModel model;
    public ClientForm() {
        initComponents();
        
        ss = new ServiceService();
        cs= new ClientService();
        model=(DefaultTableModel)clientList.getModel();
        loadBox();
        load();

    }
    void load(){
        model.setRowCount(0);
        for(Client c : cs.findAll())
    model.addRow(new Object[]{
        c.getId(),
        c.getNom(),
        c.getPrenom(),
        c.getDate(),
        c.getService()
    });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomTxt = new javax.swing.JTextField();
        prenomTxt = new javax.swing.JTextField();
        serviceBox = new javax.swing.JComboBox();
        AjouterButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        SupprimerButton = new javax.swing.JButton();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientList = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestion des clients");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire des clients"));

        jLabel1.setText("Nom");

        jLabel2.setText("Prénom");

        jLabel3.setText("Date");

        jLabel4.setText("Service");

        nomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtActionPerformed(evt);
            }
        });

        prenomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTxtActionPerformed(evt);
            }
        });

        serviceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBoxActionPerformed(evt);
            }
        });

        AjouterButton.setText("Ajouter");
        AjouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterButtonActionPerformed(evt);
            }
        });

        modifierButton.setText("Modifier");
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        SupprimerButton.setText("supprimer");
        SupprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(prenomTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(nomTxt))
                    .addComponent(serviceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SupprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AjouterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AjouterButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(modifierButton)
                        .addGap(18, 18, 18)
                        .addComponent(SupprimerButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List des clients"));

        clientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prénom", "date", "service"
            }
        ));
        clientList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prenomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTxtActionPerformed

    private void nomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTxtActionPerformed

    private void serviceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceBoxActionPerformed

    private void SupprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerButtonActionPerformed
        // TODO add your handling code here:
        try{
          int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce client ?");
        
            if(reponse == 0){
            cs.delete(cs.findById(id));
            load();
        }
        }
        catch(NullPointerException e){
                JOptionPane.showMessageDialog(this,"vous devez selectionner un client dans la liste");

        }
    }//GEN-LAST:event_SupprimerButtonActionPerformed

    private void AjouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterButtonActionPerformed
        // TODO add your handling code here:
        try{
        cs.create(new Client(nomTxt.getText(),prenomTxt.getText(),dateTxt.getDate(), (Service) serviceBox.getSelectedItem()));
         JOptionPane.showMessageDialog(this,"Bien ajouté");
         load();
         
         nomTxt.setText(null);
         prenomTxt.setText(null);
         dateTxt.setDate(null);
        }
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Veuillez remplir tous les champs");
        }
    }//GEN-LAST:event_AjouterButtonActionPerformed



    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
    try{
    String updatedNom = nomTxt.getText();
    String updatedPrenom = prenomTxt.getText();
    Date updatedDate = dateTxt.getDate();
    Service updatedService = (Service) serviceBox.getSelectedItem();

    Client updatedClient = new Client(id, updatedNom, updatedPrenom, updatedDate, updatedService);

    boolean updated = cs.update(updatedClient);

    if (updated) {
        JOptionPane.showMessageDialog(this, "Client modifié avec succés.");
        load();
    } else {
        JOptionPane.showMessageDialog(this, "erreur de modification.");
    }
         nomTxt.setText(null);
         prenomTxt.setText(null);
         dateTxt.setDate(null);
    }//GEN-LAST:event_modifierButtonActionPerformed
     catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Veuillez remplir tous les champs");

     }
    }
    private void clientListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientListMouseClicked
        int selectedRow = clientList.getSelectedRow();
        if (selectedRow != -1) {
            id = Integer.parseInt(clientList.getValueAt(selectedRow, 0).toString());
            nomTxt.setText(cs.findById(id).getNom());
            prenomTxt.setText(cs.findById(id).getPrenom());
            dateTxt.setDate(cs.findById(id).getDate());

          
            Service selectedService = cs.findById(id).getService();

            for (int i = 0; i < serviceBox.getItemCount(); i++) {
                Service item = (Service) serviceBox.getItemAt(i);
                if (item.getId() == selectedService.getId()) {
                    serviceBox.setSelectedIndex(i);
                    break; 
                }
            }
        }
    }//GEN-LAST:event_clientListMouseClicked

public  void loadBox(){
        serviceBox.removeAllItems(); // Clear existing items
    for(Service s : ss.findAll()){
        serviceBox.addItem(s);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterButton;
    private javax.swing.JButton SupprimerButton;
    private javax.swing.JTable clientList;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierButton;
    private javax.swing.JTextField nomTxt;
    private javax.swing.JTextField prenomTxt;
    private javax.swing.JComboBox serviceBox;
    // End of variables declaration//GEN-END:variables
}
