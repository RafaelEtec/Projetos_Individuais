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
    
    public static void sortingText(String[] entStringArray, String escolha) {
        String guarda;
        for (int pos = 0; pos < entStringArray.length; pos++) {
            for (int proxPos = pos; proxPos < entStringArray.length; proxPos++) {
                if (escolha.toLowerCase().equals("c")) {
                    if (entStringArray[proxPos].length() < entStringArray[pos].length()) {
                        guarda = entStringArray[pos];
                        entStringArray[pos] = entStringArray[proxPos];
                        entStringArray[proxPos] = guarda;
                    }
                } else if (escolha.toLowerCase().equals("d")) {
                    if (entStringArray[proxPos].length() > entStringArray[pos].length()) {
                        guarda = entStringArray[pos];
                        entStringArray[pos] = entStringArray[proxPos];
                        entStringArray[proxPos] = guarda;
                    }
                }
            }
            
            System.out.println("pos: "+pos+" - "+entStringArray[pos]+" - "+entStringArray[pos].length()+" letras");
        }
    }
}