package com.martinsagat.quickstart.services.impl;

import com.martinsagat.quickstart.services.BluePrinter;
import com.martinsagat.quickstart.services.ColorPrinter;
import com.martinsagat.quickstart.services.GreenPrinter;
import com.martinsagat.quickstart.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {

  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  // public ColorPrinterImpl() {
  //   this.redPrinter = new EnglishRedPrinter();
  //   this.bluePrinter = new EnglishBluePrinter();
  //   this.greenPrinter = new EnglishGreenPrinter();
  // }

  public ColorPrinterImpl(
      RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join("\n", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
