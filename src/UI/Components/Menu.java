package UI.Components;

import UI.Event.EventMenu;
import UI.Event.EventMenuCallBack;
import UI.Event.EventMenuSelected;
import UI.Model.Model_Menu;
import UI.Shadow.ShadowBorder;
import UI.Swing.PanelShadow;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends PanelShadow {

    private int selectedIndex = -1;
    private double menuTarget;
    private double menuLastTarget;
    private double currentLocation;
    private BufferedImage selectedImage;
    private Animator animator;
    private EventMenuCallBack callBack;
    private EventMenu event;

    public Menu() {
        initComponents();
        init();
    }

    private void init() {
        setRadius(20);
        initData();
        listMenu.addEventSelectedMenu(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, EventMenuCallBack callBack) {
                if (!animator.isRunning()) {
                    if (index != selectedIndex) {
                        Menu.this.callBack = callBack;
                        selectedIndex = index;
                        menuTarget = selectedIndex * 50 + listMenu.getY();
                        animator.start();
                    }
                }
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                currentLocation = (menuTarget - menuLastTarget) * fraction;
                currentLocation += menuLastTarget;
                repaint();
            }

            @Override
            public void end() {
                menuLastTarget = menuTarget;
                callBack.call(selectedIndex);
                if (event != null) {
                    event.menuIndexChange(selectedIndex);
                }
            }
        };
        animator = new Animator(300, target);
        animator.setResolution(1);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }

    public void setSelectedIndex(int index) {
        selectedIndex = index;
        menuTarget = selectedIndex * 50 + listMenu.getY();
        menuLastTarget = menuTarget;
        currentLocation = menuLastTarget;
        listMenu.selectedIndex(index);
        repaint();
    }

    private void initData() {
        listMenu.addItem(new Model_Menu("1", "Trang chủ", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("2", "Tài khoản", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("3", "Điểm danh", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("4", "Sinh viên", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("5", "Ban cán sự", Model_Menu.MenuType.MENU));
    }

    private void createImage() {
        int width = getWidth() - 30;
        selectedImage = ShadowBorder.getInstance().createShadowOut(width, 50, 8, 8, new Color(242, 246, 253));
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        createImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (selectedIndex >= 0) {
            grphcs.drawImage(selectedImage, 15, (int) currentLocation, null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile1 = new UI.Components.Profile();
        listMenu = new UI.Swing.ListMenu<>();

        listMenu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        listMenu.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profile1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addEvent(EventMenu event) {
        this.event = event;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.Swing.ListMenu<String> listMenu;
    private UI.Components.Profile profile1;
    // End of variables declaration//GEN-END:variables
}
