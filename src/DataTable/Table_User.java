/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTable;

import Model.User;
import Service.Service;
import java.awt.Color;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Dell
 */
public class Table_User {

    Service service = new Service();

    public void ver_table(JTable table) {

        table.setDefaultRenderer(Object.class, new Render());

//        //Nút chi tiết
//        JButton btn1 = new JButton();
//        btn1.setName("Detail");
//        btn1.repaint();
//        Icon i1 = new ImageIcon(getClass().getResource("/Icon/icon_detail.png"));
//        btn1.setIcon(i1);

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

        table.setModel(defaultTableModel);
        

        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Chức vụ");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");

        // Defines table's column width.
        int[] columnsWidth = {
            450, 560, 440, 70, 70
        };

        // Creates an instance of JTable and fill it with data and
        // column names information.
        // Configures table's column width.
        int x = 0;
        for (int width : columnsWidth) {
            TableColumn column = table.getColumnModel().getColumn(x++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        List<User> users = service.getAllUser();
        for (User user : users) {
            defaultTableModel.addRow(new Object[]{user.getUserName(), user.getFullName(), user.getRoleName(), btn2, btn3});
        }
        table.setRowHeight(60);
    }

}
