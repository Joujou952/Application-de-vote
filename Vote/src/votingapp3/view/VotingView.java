/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package votingapp3.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import votingapp3.controller.*;
import votingapp3.model.Candidate;
import votingapp3.model.Citizen;


/**
 *
 * @author pilou
 */
public class VotingView extends javax.swing.JFrame {

    private final VotingController controller;
    private final Citizen citizen;
    private Candidate candidate;
    
    /**
     * Creates new form ClassAppView
     * @param c
     */
    public VotingView(Citizen c) {
        super("VOTE'IT");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.setResizable(false);
        
        this.citizen = c;
        this.controller = new VotingController(citizen);
        this.candidate = controller.initCandidate(1);
        
        initCitizen();
        initCandid();
        
    }
    
    private void initCitizen() {
        jLabel_LastName.setText(citizen.getLname());
        jLabel_FirstName.setText(citizen.getFname());
        jLabel_Location.setText(citizen.getLocation());
    }
    
    private void initCandid() {
        
        jLabel_Candidat_name.setText(candidate.getLname() + " " + candidate.getFname());
        jLabel_Candidat_party.setText(candidate.getPoliticParty());
        
        try {
            File file = new File("media\\" + candidate.getFname() + ".jpg");
            BufferedImage bufferedImage;
            bufferedImage = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            jLabelImage.setIcon(imageIcon);
        } catch (IOException ex) {
            System.out.println(ex);
        }
       
        jLabel_NbrPage.setText(candidate.getCaId() + " of " + controller.getNbrCandidate());
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
        jLabel_NbrPage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Candidat_name = new javax.swing.JLabel();
        jLabel_Candidat_party = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jLabel_LastName = new javax.swing.JLabel();
        jLabel_FirstName = new javax.swing.JLabel();
        jLabel_Location = new javax.swing.JLabel();
        jButton_More = new javax.swing.JButton();
        jButton_Vote = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        jButtonDisconnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel_NbrPage.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_NbrPage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_NbrPage.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_NbrPage.setText("1 of 9");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 280));

        jLabel_Candidat_name.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_Candidat_name.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel_Candidat_name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Candidat_name.setText("Emanuel Macron");
        jLabel_Candidat_name.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel_Candidat_party.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_Candidat_party.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel_Candidat_party.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Candidat_party.setText("Les R??publicains");

        jLabelImage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Candidat_party, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Candidat_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Candidat_party)
                .addGap(7, 7, 7)
                .addComponent(jLabel_Candidat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel_LastName.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_LastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_LastName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LastName.setText("L??toquart");

        jLabel_FirstName.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_FirstName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FirstName.setText("Pierre-Louis");

        jLabel_Location.setBackground(new java.awt.Color(0, 51, 51));
        jLabel_Location.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel_Location.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Location.setText("Yvelines");

        jButton_More.setBackground(new java.awt.Color(0, 51, 51));
        jButton_More.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_More.setForeground(new java.awt.Color(255, 255, 255));
        jButton_More.setText("MORE");
        jButton_More.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton_More.setFocusPainted(false);
        jButton_More.setPreferredSize(new java.awt.Dimension(100, 32));
        jButton_More.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_MoreMouseClicked(evt);
            }
        });
        jButton_More.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MoreActionPerformed(evt);
            }
        });

        jButton_Vote.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Vote.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Vote.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Vote.setText("VOTE");
        jButton_Vote.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton_Vote.setFocusPainted(false);
        jButton_Vote.setPreferredSize(new java.awt.Dimension(100, 32));
        jButton_Vote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_VoteMouseClicked(evt);
            }
        });

        jButton_Next.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Next.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Next.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next.setText("NEXT CANDIDATE >");
        jButton_Next.setBorder(null);
        jButton_Next.setFocusPainted(false);
        jButton_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_NextMouseClicked(evt);
            }
        });

        jButton_Previous.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Previous.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Previous.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Previous.setText("< PREVIOUS");
        jButton_Previous.setBorder(null);
        jButton_Previous.setFocusPainted(false);
        jButton_Previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_PreviousMouseClicked(evt);
            }
        });

        jButtonDisconnect.setBackground(new java.awt.Color(0, 102, 102));
        jButtonDisconnect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonDisconnect.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDisconnect.setText("Disconnect");
        jButtonDisconnect.setBorder(null);
        jButtonDisconnect.setFocusPainted(false);
        jButtonDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDisconnectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Next))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_FirstName)
                                            .addComponent(jLabel_Location))
                                        .addGap(42, 42, 42)
                                        .addComponent(jButton_More, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Vote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_NbrPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_NbrPage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonDisconnect)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel_LastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Location))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_More, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Vote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Next)
                    .addComponent(jButton_Previous))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(510, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MoreMouseClicked
        JOptionPane.showMessageDialog(this, "comming soon!");
    }//GEN-LAST:event_jButton_MoreMouseClicked

    private void jButton_NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NextMouseClicked
        this.candidate = controller.initCandidate(candidate.getCaId() + 1);
        initCandid();
    }//GEN-LAST:event_jButton_NextMouseClicked

    private void jButton_PreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PreviousMouseClicked
        this.candidate = controller.initCandidate(candidate.getCaId() - 1);
        initCandid();
    }//GEN-LAST:event_jButton_PreviousMouseClicked

    private void jButton_VoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VoteMouseClicked
        if(controller.voted(candidate.getCaId())) {
            JOptionPane.showMessageDialog(this, "Thanks for your vote!");
        } else {
            JOptionPane.showMessageDialog(this, "You've already voted!");
        }
    }//GEN-LAST:event_jButton_VoteMouseClicked

    private void jButtonDisconnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDisconnectMouseClicked
        new EntryView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDisconnectMouseClicked

    private void jButton_MoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_MoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDisconnect;
    private javax.swing.JButton jButton_More;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Previous;
    private javax.swing.JButton jButton_Vote;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabel_Candidat_name;
    private javax.swing.JLabel jLabel_Candidat_party;
    private javax.swing.JLabel jLabel_FirstName;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JLabel jLabel_Location;
    private javax.swing.JLabel jLabel_NbrPage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
