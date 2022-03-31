package Funções;
/** 
   por Rafael Ferreira Goulart
**/
public class Todas {
    public static void sortingSystem(int[] entIntArray, String escolha) {
        int guarda;
        for (int pos = 0; pos < entIntArray.length ; pos++) {
            for (int proxPos = pos; proxPos < entIntArray.length; proxPos++) {
                if (escolha.toLowerCase().equals("a")) {
                    if (entIntArray[proxPos] < entIntArray[pos]) {
                        guarda = entIntArray[pos];
                        entIntArray[pos] = entIntArray[proxPos];
                        entIntArray[proxPos] = guarda;
                    }
                } else if (escolha.toLowerCase().equals("b")) {
                    if (entIntArray[proxPos] > entIntArray[pos]) {
                        guarda = entIntArray[pos];
                        entIntArray[pos] = entIntArray[proxPos];
                        entIntArray[proxPos] = guarda;
                    }
                }
            }
            
            System.out.println("pos: "+pos+" - "+entIntArray[pos]);
        }
    }
}