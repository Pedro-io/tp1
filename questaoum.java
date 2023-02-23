
import java.util.Scanner;

public class questaoum {
    public static void main(String[] args) {

        int i; // contador

        Scanner entradaScanner = new Scanner(System.in);// declarando scanner

        String entrada = entradaScanner.nextLine(); // variaveis para armazenar as palavras de entrada e scanner para
                                                    // pegar o valor digitado no tecaldo
        String copiaEntrada = "";// copia da palavra
        entradaScanner.close();

        for (i = entrada.length() - 1; i >= 0; i--)// para i = tamanho da palavra e i maior ou igual a zero, i-1
        {
            copiaEntrada += entrada.charAt(i); // copiando o inverso da palavra em copiaEntrada

        }

        if (entrada.toLowerCase().equals(copiaEntrada.toLowerCase()))// usando o toLowerCase para remover espaços e
                                                                     // acentos das palavras
        {
            System.out.print("SIM");

        } else {
            System.out.print("NAO");
        }

    }

}
