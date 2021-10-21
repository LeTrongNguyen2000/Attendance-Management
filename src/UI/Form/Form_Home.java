package UI.Form;

import Model.Checkin;
import Model.ClassSubject;
import Model.Student;
import Model.User;
import Service.Service;
import UI.Charts.ModelChart;
import UI.Model.Model_Card;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    Service service = new Service();

    public Form_Home() {
        initComponents();
        ValuesStudent();
        ValuesLeader();
        ValuesCheckin();
        ValuesClassSubject();
        testData();
    }

    public void ValuesClassSubject() {
        //card1.setValues(values);
        List<ClassSubject> classSubjects = service.SetNumberOfClassSubject("");
        for (ClassSubject classSubject : classSubjects) {
            String NumberOfClassSubject = classSubject.getQuantity();
            System.out.println(NumberOfClassSubject);
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_class.png")), "Lớp học phần", NumberOfClassSubject));
        }
    }

    public void ValuesStudent() {
        //card2.setValues(values);
        List<Student> students = service.SetNumberOfStudent("");
        for (Student student : students) {
            String NumberOfStudent = student.getQuantity();
            System.out.println(NumberOfStudent);
            card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_student.png")), "Sinh viên", NumberOfStudent));
        }
    }

    public void ValuesLeader() {
        //card3.setValues(values);
        List<Student> students = service.SetNumberOfLeader("");
        for (Student student : students) {
            String NumberOfLeader = student.getQuantity();
            System.out.println(NumberOfLeader);
            card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_leader.png")), "Ban cán sự", NumberOfLeader));
        }
    }

    public void ValuesCheckin() {
        //card4.setValues(values);
        List<Checkin> checkins = service.SetNumberOfCheckin("");
        for (Checkin checkin : checkins) {
            String NumberOfCheckin = checkin.getQuantity();
            System.out.println(NumberOfCheckin);
            card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_lesson.png")), "Buổi học", NumberOfCheckin));
        }
    }

    private void testData() {

        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_class.png")), "Lớp học phần", "1000"));
        card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/Icon/icon_lesson.png")), "Buổi học", "10000"));
        chart.addLegend("Lớp học phần", new Color(245, 189, 135));
        chart.addLegend("Buổi học", new Color(135, 189, 245));
        chart.addLegend("Sinh viên đã điểm danh", new Color(189, 135, 245));
        chart.addData(new ModelChart("HK 1 Năm học 2020-2021", new double[]{500, 200, 80}));
        chart.addData(new ModelChart("HK 2 Năm học 2020-2021", new double[]{600, 750, 90}));
        chart.addData(new ModelChart("HK 3 Năm học 2020-2021", new double[]{200, 350, 460}));
        chart.addData(new ModelChart("HK 1 Năm học 2021-2022", new double[]{480, 150, 750}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        card2 = new UI.Components.Card();
        card3 = new UI.Components.Card();
        card4 = new UI.Components.Card();
        panelShadow1 = new UI.Swing.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        chart = new UI.Charts.Chart();
        card1 = new UI.Components.Card();
        panelShadow2 = new UI.Swing.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 253));
        setPreferredSize(new java.awt.Dimension(1090, 745));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Background.png"))); // NOI18N

        card2.setPreferredSize(new java.awt.Dimension(255, 132));
        card2.setShadowType(UI.Shadow.ShadowBorder.ShadowType.OUT_SHADOW);

        card3.setPreferredSize(new java.awt.Dimension(255, 132));
        card3.setShadowType(UI.Shadow.ShadowBorder.ShadowType.OUT_SHADOW);

        card4.setPreferredSize(new java.awt.Dimension(255, 132));
        card4.setShadowType(UI.Shadow.ShadowBorder.ShadowType.OUT_SHADOW);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 181, 204));
        jLabel2.setText("Chart Report");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        chart.setOpaque(false);

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        card1.setPreferredSize(new java.awt.Dimension(255, 132));
        card1.setShadowType(UI.Shadow.ShadowBorder.ShadowType.OUT_SHADOW);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add_HomePage.png"))); // NOI18N

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Trang chủ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Một số thống kê được thể hiện ở trang chủ.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 574, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addComponent(panelShadow1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.Components.Card card1;
    private UI.Components.Card card2;
    private UI.Components.Card card3;
    private UI.Components.Card card4;
    private UI.Charts.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private UI.Swing.PanelShadow panelShadow1;
    private UI.Swing.PanelShadow panelShadow2;
    // End of variables declaration//GEN-END:variables
}
