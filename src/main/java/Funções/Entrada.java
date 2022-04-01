package Funções;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Entrada {
    public static int[] entIntArray() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de números a serem guardados: ");
        int tamanhoArray = ent.nextInt();
        int[] entIntArray = new int[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o número da posição: ");
            int num = ent.nextInt();
            entIntArray[pos] = num;
        }
        
        return entIntArray;
    }
    
    public static String[] entStringArray() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de texto a ser armazenado: ");
        int tamanhoArray = ent.nextInt();
        String[] entStringArray = new String[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o texto da posição: ");
            String text = ent.next();
            entStringArray[pos] = text;
        }
        
        return entStringArray;
    }
}