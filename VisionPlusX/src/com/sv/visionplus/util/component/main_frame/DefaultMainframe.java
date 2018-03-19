/*
 *  DefaultMainframe.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.sv.visionplus.util.component.main_frame;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuEntryPrimary;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;

/**
 *
 * @author mohan
 */
public abstract class DefaultMainframe extends JRibbonFrame {

    public void getMainFrame() {
        initOthers();
    }

    public void resetMainFrame() {
        createGUI();
        createTask();
        finalizeApplicationMenu();
        initOthers();
    }

    protected abstract JPanel getContentPanel();

    protected abstract void createGUI();

    protected void startApplicationMenu() {
        if (applicationMenu == null) {
            applicationMenu = new RibbonApplicationMenu();
        }
    }

    protected void addPrimaryMenu(String title, URL iconUrl, ActionListener actionListener) {
        if (applicationMenu != null) {
            RibbonApplicationMenuEntryPrimary primary = new RibbonApplicationMenuEntryPrimary(
                    ImageWrapperResizableIcon.getIcon(iconUrl, ICON_DIMENSION),
                    title,
                    actionListener,
                    JCommandButton.CommandButtonKind.ACTION_ONLY);
            applicationMenu.addMenuEntry(primary);
        }
    }

    private void finalizeApplicationMenu() {
        if (applicationMenu != null) {
            getRibbon().setApplicationMenu(applicationMenu);
        }
    }

    protected void addTask(String title) {
        if (curTask != null) {
            createTask();
        }

        curTask = title;
    }

    protected void addBand(String title, URL iconURL) {
        if (curBand != null) {
            setResizePolicies(curBand);
        }

        JRibbonBand band = new JRibbonBand(title, ImageWrapperResizableIcon.getIcon(iconURL, ICON_DIMENSION));

        curBands.add(band);
        curBand = band;
    }

    protected void addButton(String title, URL iconURL, ElementPriority priority, ActionListener actionListener) {
        curBand.addCommandButton(
                new CRibbonButton(title, iconURL, actionListener),
                getRibbonElementPriority(priority));
    }

    protected void startGroup() {
        curBand.startGroup();
    }

    private void createTask() {
        if (curBand != null) {
            setResizePolicies(curBand);
        }

        JRibbonBand[] bands = new JRibbonBand[curBands.size()];
        int i = 0;
        for (JRibbonBand jRibbonBand : curBands) {
            bands[i] = jRibbonBand;
            ++i;
        }
        getRibbon().addTask(new RibbonTask(curTask, bands));
        curBands.clear();
    }

    private void setResizePolicies(JRibbonBand band) {
        ArrayList policy = new ArrayList();
        policy.add(new CoreRibbonResizePolicies.Low2Mid(band.getControlPanel()));
        policy.add(new CoreRibbonResizePolicies.Mid2Low(band.getControlPanel()));
        band.setResizePolicies(policy);
    }

    private void initOthers() {
        this.add(getContentPanel());

        setSize(800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private RibbonElementPriority getRibbonElementPriority(ElementPriority priority) {
        switch (priority) {
            case LOW:
                return RibbonElementPriority.LOW;
            case MEDIUM:
                return RibbonElementPriority.MEDIUM;
            case TOP:
                return RibbonElementPriority.TOP;
            default:
                return null;
        }
    }

    private String curTask;
    //band
    private List<JRibbonBand> curBands = new ArrayList<>();
    private JRibbonBand curBand;
    private RibbonApplicationMenu applicationMenu;
    //demensions
    protected static final Dimension ICON_DIMENSION = new Dimension(48, 48);

    private class CRibbonButton extends JCommandButton {

        private final String text;
        private final URL imageUrl;
        private ActionListener actionListener;
        //

        public CRibbonButton(String text, URL imageUrl, ActionListener actionListener) {
            super(text);

            this.text = text;
            this.imageUrl = imageUrl;
            this.actionListener = actionListener;

            initIcon();
            initAction();
        }

        private void initIcon() {
            if (imageUrl == null) {
                setIcon(new EmptyResizableIcon(ICON_DIMENSION));
            } else {
                setIcon(ImageWrapperResizableIcon.getIcon(imageUrl, ICON_DIMENSION));
            }
        }

        private void initAction() {
            if (actionListener != null) {
                addActionListener(actionListener);
            }
        }
    }

    public enum ElementPriority {

        TOP, MEDIUM, LOW;
    }
}
