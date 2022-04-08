package OrdenacaoJava;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Teste {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        fatorial();
    }
    
    public static void fatorial() {
        int n = 0;
        // ^ Indique o valor de n
        int nAnterior = 0, res = 0;
        for (nAnterior = n - 1; nAnterior > 0; nAnterior--) {
            res = n * nAnterior;
            System.out.println(n+" x "+nAnterior+" = "+res);
            n = res;
        }
        // ^ loop responsável pela repetição da multiplicação
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
    
    public static int[] entInt2val() {
        Scanner ent = new Scanner(System.in);
        
        int[] entInt2val = new int[2];
        
        System.out.println("Insira o primeiro valor: ");
        entInt2val[0] = ent.nextInt();
        System.out.println("Insira o segundo valor: ");
        entInt2val[1] = ent.nextInt();
        for (int i = 0; i < entInt2val.length; i++) {
            System.out.println(entInt2val[i]);
        }
        return entInt2val;
    }
    
    public static void atividade6estagio() {
    int[][] matriz = new int[3][3];
        int[][] resultado = new int[3][3];
        int linhas;
        int colunas;
        int i;
        int j;
        int k;
        
        matriz[0][0] = 3;
        matriz[0][1] = 4;
        matriz[0][2] = 5;
        
        linhas = 3;
        colunas = 1;
        
        for (j = 0; j < linhas; j++) {
            for (i = 0; i < linhas; i++) {
                resultado[i][j] = 0;
                
                for (k = 0; k < colunas; k++) {
                    resultado[i][j] = resultado [i][j] + matriz[k][i] * matriz[k][j];
                }
                
            }
            
        }
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < linhas; j++) {
                System.out.println(resultado[i][j]);
                System.out.println(" - ");              
            }
        }
    }
}