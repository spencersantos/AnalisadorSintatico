package analisadorLexicoSintatico;

import java.io.IOException;

import java_cup.internal_error;

public class GeradorClassesJavaCup {

  public static void main(String[] args) throws internal_error, IOException, Exception {

    String[] argumentos = new String[] { "especificacoes/ExtratorMiniC.cup" };
    
    java_cup.Main.main( argumentos );
    
  }
  
}
