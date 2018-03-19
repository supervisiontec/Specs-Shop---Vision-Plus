package visionplusx;

import javax.swing.JPanel;

/**
 *
 * @author Mohan
 */
public class ContentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContentPanel
     */
    public ContentPanel() {
        initComponents();
    }

    public void setView(JPanel panel) {
        removeAll();
        add(panel);
        revalidate();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
