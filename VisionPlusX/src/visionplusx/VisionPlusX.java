package visionplusx;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.GeminiSkin;
import visionplusx.model.MUser;

public class VisionPlusX implements Runnable {

    public static void main(String[] args) {
        //  system init point

        //show main frame
        VisionPlusX vpx = new VisionPlusX();
        SwingUtilities.invokeLater(vpx);
    }

    @Override
    public void run() {
        //look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

//        SubstanceLookAndFeel.setSkin(new BusinessBlackSteelSkin());
        SubstanceLookAndFeel.setSkin(new GeminiSkin());

        //check user permission
        MUser user = Login.getInstance().attemptLogin();
        

        if (user == null) {
            JOptionPane.showMessageDialog(null, "Login Fail");
            System.exit(0);//login failed
            
        }
        BirthdayWishes birthdayWishes = new BirthdayWishes(null, true);
        birthdayWishes.setVisible(true);
       
        //create main frame
        Home home = Home.getInstance();
        home.resetMainFrame();
        home.setUser(user);
        home.setVisible(true);
    }
}
