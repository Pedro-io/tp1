import java.util.Scanner;

public class questao3{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //scanner para entrada das variaveis 
        char ascii;
        char x, y;
       
        String mens = entrada.nextLine();
        int chave = 3;//chave definida na questão 
        while (chave >= 26) {//chave tem que ter o tamanho do alfabeto
            chave = chave - 26;
        }
        for (int i = 0; i < mens.length(); i++) {
         //Tratamento Letras minusculas  
            if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {//letrans minusculas de acordo com a tabela ASCII
                if ((int) (mens.charAt(i) + chave) > 122) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");

                }
            }
	//Tratamento Letras mausculas
            if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {
                if (mens.charAt(i) + chave > 90) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 90);
                    ascii = (char) (64 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");
                }
            }
        }
    }
}
