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
    
    public static int[] entInt2val() {
        Scanner ent = new Scanner(System.in);
        
        int[] entInt2val = new int[2];
        
        System.out.println("Insira o primeiro valor: ");
        entInt2val[0] = ent.nextInt();
        System.out.println("Insira o segundo valor: ");
        entInt2val[1] = ent.nextInt();
        
        return entInt2val;
    }
    
    public static double[] entDouble2val() {
        Scanner ent = new Scanner(System.in);
        
        double[] entDouble2val = new double[2];
        
        System.out.println("Insira o primeiro valor: ");
        entDouble2val[0] = ent.nextDouble();
        System.out.println("Insira o segundo valor: ");
        entDouble2val[1] = ent.nextDouble();
        
        return entDouble2val;
    }
}