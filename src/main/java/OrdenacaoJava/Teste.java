package OrdenacaoJava;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Teste {
    public static void main(String[] args) {
        textoMaior();
    }
    
    public static void sortingSystemTest() {
        Scanner ent = new Scanner(System.in);
                
        System.out.println("Insira a quantidade de números a serem ordenados: ");
        int tamanhoArray = ent.nextInt();
        int[] sequencia = new int[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o número da posição: ");
            int num = ent.nextInt();
            sequencia[pos] = num;
        }
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            for (int proxPos = pos; proxPos < tamanhoArray; proxPos++) {
                int guarda;
                if (sequencia[proxPos] < sequencia[pos]) {
                    guarda = sequencia[pos];
                    sequencia[pos] = sequencia[proxPos];
                    sequencia[proxPos] = guarda;
                }
            }
            
            System.out.println("pos: "+pos+" - "+sequencia[pos]);
        } 
    }
    
    public static void textoMaior() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de texto a ser armazenado: ");
        int tamanhoArray = ent.nextInt();
        String[] entStringArray = new String[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o texto da posição: ");
            String text = ent.next();
            entStringArray[pos] = text;
        }
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            for (int proxPos = pos; proxPos < tamanhoArray; proxPos++) {
                String guarda;
                if (entStringArray[proxPos].length() < entStringArray[pos].length()) {
                    guarda = entStringArray[pos];
                    entStringArray[pos] = entStringArray[proxPos];
                    entStringArray[proxPos] = guarda;
                }
            }
            
            System.out.println("pos: "+pos+" - "+entStringArray[pos]+" - "+entStringArray[pos].length()+" letras");
        }
    }
}