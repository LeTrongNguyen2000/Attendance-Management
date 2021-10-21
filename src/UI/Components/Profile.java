package UI.Components;

import javax.swing.Icon;

public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        setOpaque(false);
    }
    
        
    public void setInfo(String Name, String Position)
    {
        lb_Name.setText(Name);
        lb_Position.setText(Position);
    }
    
    public void setAvatar(Icon icon)
    {
        imageAvatar1.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new UI.Swing.ImageAvatar();
        lb_Name = new javax.swing.JLabel();
        lb_Position = new javax.swing.JLabel();

        imageAvatar1.setForeground(new java.awt.Color(0, 181, 204));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_avatar.png"))); // NOI18N

        lb_Name.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lb_Name.setForeground(new java.awt.Color(0, 181, 204));
        lb_Name.setText("Lê Trọng Nguyên");

        lb_Position.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lb_Position.setText("Ban cán sự");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Name)
                    .addComponent(lb_Position))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Name)
                        .addGap(10, 10, 10)
                        .addComponent(lb_Position))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lb_Name;
    private javax.swing.JLabel lb_Position;
    // End of variables declaration//GEN-END:variables
}
