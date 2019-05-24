package com.wagner.employee_app.ui.dialogs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public final class AboutDialog extends JDialog{
  ////////////////////// region Variables  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // endregion
  private BufferedImage image;
  ////////////////////// region Initialisation /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public AboutDialog(Frame owner){
    super(owner, "About", true);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(owner);
    try{
      image = ImageIO.read(this.getClass().getClassLoader().getResource("images/waginator.png"));
    }
    catch(IOException ioe){
      ioe.printStackTrace();
    }

    this.add(new JLabel(new ImageIcon(image)));
    this.getContentPane().setBackground(Color.WHITE);
    this.pack();
    this.setResizable(false);
  }
  // endregion
  ////////////////////// region Methods ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // endregion
  ////////////////////// region Inner Classes //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ////////////////////// End of Class //////////////////////////////////////////////////////////////////////////////////////////////////////////////// endregion
}

