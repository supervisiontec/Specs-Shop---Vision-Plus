/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.util.component.textfield.validator;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Channa
 */
public class ComponentValidationPaintor {

    private static final Image SUCCESS_ICON = getScaledIcon("resources/success.png", 16, 16);
    private static final Image WARNING_ICON = getScaledIcon("resources/warning.png", 16, 16);
    private static final Image ERROR_ICON = getScaledIcon("resources/error.png", 16, 16);

    private static Image getScaledIcon(String url, int w, int h) {
        ImageIcon imageIcon = new ImageIcon(ComponentValidationPaintor.class.getResource(url));
        Image image = imageIcon.getImage();
        image = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return (image);
    }

    public static void paintValidation(Component observer, Validator.ValidationLevel validationLevel, Graphics g) {
        Image image;
        switch (validationLevel) {
            case NONE:
                image = null;
                System.out.println("none");
                break;
            case SUCCESS:
                image = SUCCESS_ICON;
                break;
            case WARN:
                image = WARNING_ICON;
                break;
            case ERROR:
                image = ERROR_ICON;
                break;
            default:
                throw new AssertionError();
        }

        if (image != null) {
            int w = image.getWidth(observer);

            g.drawImage(image, observer.getWidth() - w - 4, 4, observer);
        }
    }
}
