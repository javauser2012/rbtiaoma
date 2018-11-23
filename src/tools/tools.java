package tools;

import window.Login;

import javax.swing.*;
import java.awt.*;

public class tools {
    public tools(Login frame){
        this.centered(frame);
    }
    public void centered(Container container) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int w = container.getWidth();
        int h = container.getHeight();
        container.setBounds((screenSize.width - w) / 2,(screenSize.height - h) / 2, w, h);
    }
}
