package UI.Form;

import DataTable.Table_User;
import Dialog.Update;
import Main.Main;
import UI.Components.Add_Checkin;
import UI.Swing.EventCallBack;
import UI.Swing.EventTextField;
import java.awt.Color;
import UI.Components.Add_Student;
import UI.Components.Add_User;
import UI.Event.EventMenu;
import UI.Event.EventMenuCallBack;
import UI.Event.EventMenuSelected;
import UI.Form.Form_Home;
import UI.Form.Form_StudentCheckin;
import UI.Form.Form_User;
import UI.Model.Model_Menu;
import UI.Shadow.ShadowBorder;
import DataTable.ScrollBar;
import Model.User;
import Service.Service;
import UI.Components.Update_User;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Form_User extends javax.swing.JPanel {

    private int selectedIndex = -1;
    private double menuTarget;
    private double menuLastTarget;
    private double currentLocation;
    private BufferedImage selectedImage;
    private Animator animator;
    private EventMenuCallBack callBack;
    private EventMenu event;

    Table_User t = new Table_User();
    Service service = new Service();

    public Form_User() {
        initComponents();

        //Chỉnh lại table
        Table_User.repaint();
        t.ver_table(Table_User);
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

    public void showData() {
        //Nút cập nhật
        JButton btn2 = new JButton();
        btn2.repaint();
        btn2.setName("Update");
        Icon i2 = new ImageIcon(getClass().getResource("/Icon/icon_update.png"));
        btn2.setIcon(i2);

        //Nút xóa
        JButton btn3 = new JButton();
        btn3.repaint();
        btn3.setName("Delete");
        Icon i3 = new ImageIcon(getClass().getResource("/Icon/icon_delete.png"));
        btn3.setIcon(i3);

        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Table_User.setModel(defaultTableModel);

        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");

        // Defines table's column width.
        int[] columnsWidth = {
            450, 530, 400, 100, 100
        };

        // Creates an instance of JTable and fill it with data and
        // column names information.
        // Configures table's column width.
        int x = 0;
        for (int width : columnsWidth) {
            TableColumn column = Table_User.getColumnModel().getColumn(x++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        List<User> users = service.getAllUser();
        for (User user : users) {
            defaultTableModel.addRow(new Object[]{user.getUserName(), user.getFullName(), user.getRoleName(), btn2, btn3});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelShadow1 = new UI.Swing.PanelShadow();
        spTable = new javax.swing.JScrollPane();
        Table_User = new javax.swing.JTable();
        txt_TimKiem = new UI.Swing.TextFieldAnimation();
        btn_refresh = new javax.swing.JButton();
        myButton1 = new UI.Swing.MyButton();
        panelShadow2 = new UI.Swing.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 253));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Danh sách tài khoản");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        Table_User.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table_User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Table_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_User.setSelectionBackground(new java.awt.Color(99, 222, 247));
        Table_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_UserMouseClicked(evt);
            }
        });
        Table_User.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Table_UserPropertyChange(evt);
            }
        });
        spTable.setViewportView(Table_User);

        txt_TimKiem.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_TimKiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_TimKiemMouseEntered(evt);
            }
        });
        txt_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimKiemActionPerformed(evt);
            }
        });

        btn_refresh.setBackground(new java.awt.Color(242, 246, 253));
        btn_refresh.setForeground(new java.awt.Color(242, 246, 253));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_refresh.png"))); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(btn_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh))
                .addGap(18, 18, 18)
                .addComponent(spTable))
        );

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_AddUser.png"))); // NOI18N
        myButton1.setText("Tạo tài khoản");
        myButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        myButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        myButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add_user.png"))); // NOI18N

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Danh sách tài khoản quản trị hệ thống, bạn có thể tạo mới và phân quyền các thành viên tại đây.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TimKiemMouseClicked

    }//GEN-LAST:event_txt_TimKiemMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        new Add_User().setVisible(true);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void Table_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_UserMouseClicked
        // TODO add your handling code here:
        int selectedRow = Table_User.getSelectedRow();
        // Lấy số lượng cột của bảng
        int numCols = Table_User.getColumnCount();
        // lấy dữ liệu của dòng
        DefaultTableModel model = (DefaultTableModel) Table_User.getModel();
        System.out.print(" \n row " + selectedRow + ":");

        int column = Table_User.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / Table_User.getRowHeight();
        Object value = Table_User.getValueAt(row, column);
        if (value instanceof JButton) {
            ((JButton) value).doClick();
            JButton btn = (JButton) value;

            if (btn.getName().equals("Delete")) {
                Icon icon = new ImageIcon(getClass().getResource("/Icon/icon_warning.png"));
                int option = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa tài khoản của " + (String) model.getValueAt(selectedRow, 1) + "?", "", JOptionPane.INFORMATION_MESSAGE, 0, icon);
                if (option == JOptionPane.YES_OPTION) {
                    service.DeleteUser((String) model.getValueAt(selectedRow, 0));
                } else {
                    System.out.println("Cancle");
                }
            } else if (btn.getName().equals("Update")) {
                new Update_User((String) model.getValueAt(selectedRow, 0), (String) model.getValueAt(selectedRow, 1), (String) model.getValueAt(selectedRow, 2)).setVisible(true);
            }
        }
    }//GEN-LAST:event_Table_UserMouseClicked

    private void Table_UserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Table_UserPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_UserPropertyChange

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_TimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TimKiemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TimKiemMouseEntered

    private void txt_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimKiemActionPerformed
        // TODO add your handling code here:
        String HoTen = txt_TimKiem.getText();

        JButton btn2 = new JButton();
        btn2.repaint();
        btn2.setName("Update");
        Icon i2 = new ImageIcon(getClass().getResource("/Icon/icon_update.png"));
        btn2.setIcon(i2);

        //Nút xóa
        JButton btn3 = new JButton();
        btn3.repaint();
        btn3.setName("Delete");
        Icon i3 = new ImageIcon(getClass().getResource("/Icon/icon_delete.png"));
        btn3.setIcon(i3);

        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Table_User.setModel(defaultTableModel);

        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");

        // Defines table's column width.
        int[] columnsWidth = {
            450, 530, 400, 100, 100
        };

        // Creates an instance of JTable and fill it with data and
        // column names information.
        // Configures table's column width.
        int x = 0;
        for (int width : columnsWidth) {
            TableColumn column = Table_User.getColumnModel().getColumn(x++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        List<User> users = service.Search(HoTen);
        for (User user : users) {
            defaultTableModel.addRow(new Object[]{user.getUserName(), user.getFullName(), user.getRoleName(), btn2, btn3});
        }
    }//GEN-LAST:event_txt_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_User;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private UI.Swing.MyButton myButton1;
    private UI.Swing.PanelShadow panelShadow1;
    private UI.Swing.PanelShadow panelShadow2;
    private javax.swing.JScrollPane spTable;
    private UI.Swing.TextFieldAnimation txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
