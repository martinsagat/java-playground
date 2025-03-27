package com.martinsagat.quickstart.config;

import com.martinsagat.quickstart.services.BluePrinter;
import com.martinsagat.quickstart.services.ColorPrinter;
import com.martinsagat.quickstart.services.GreenPrinter;
import com.martinsagat.quickstart.services.RedPrinter;
import com.martinsagat.quickstart.services.impl.ColorPrinterImpl;
import com.martinsagat.quickstart.services.impl.EnglishBluePrinter;
import com.martinsagat.quickstart.services.impl.EnglishGreenPrinter;
import com.martinsagat.quickstart.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

  @Bean
  public BluePrinter bluePrinter() {
    return new EnglishBluePrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new EnglishRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new EnglishGreenPrinter();
  }

  @Bean
  ColorPrinter colorPrinter(
      BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
    return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}
