package analisadorLexicoSintatico;

import java.io.File;
import java.io.FileReader;

import java_cup.runtime.Symbol;

public class Main {
	public static void main(String[] args) throws Exception {

		File arquivoMinic = new File("programas/MiniC.txt");
		ClasseJFlex analisador = new ClasseJFlex(new FileReader(arquivoMinic));

		System.out.println("Executando Análise\n");
		parser parser = new parser(analisador);

		try {
		Symbol symbol = parser.parse();
		System.out.println("\n Quantidade de Erros: " + symbol);
		} catch(Exception e) {
			
			System.out.println();
		}
	}
}
