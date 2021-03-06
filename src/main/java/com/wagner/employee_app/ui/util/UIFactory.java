package com.wagner.employee_app.ui.util;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public final class UIFactory {
  ////////////////////// region Variables  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // endregion
  ////////////////////// region Initialisation /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private UIFactory(){}
  // endregion
  ////////////////////// region Methods ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static Border createDefaultLineBorder(){
    Border lineBorder       = BorderFactory.createLineBorder(new Color(0,120,215));
    Border innerLineBorder  = BorderFactory.createLineBorder(Color.WHITE, 10);
    Border outerLineBorder  = BorderFactory.createLineBorder(new Color(245,248,250), 10);
    Border innerBorder      = BorderFactory.createCompoundBorder(lineBorder, innerLineBorder);
    return BorderFactory.createCompoundBorder(outerLineBorder, innerBorder);
  }

  // endregion
  ////////////////////// region Inner Classes //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ////////////////////// End of Class //////////////////////////////////////////////////////////////////////////////////////////////////////////////// endregion
}

