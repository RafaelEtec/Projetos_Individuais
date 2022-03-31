package Funções;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class menu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "O que você deseja avaliar?: \n"
                + "<a> Sorting System\n");
        String escolha = ent.next();
        
        switch (escolha.toLowerCase()) {
            case "a":
                System.out.println(" ---| Sorting System |--- \n");
                Funções.Todas.sortingSystem();
                break;
            default:
                System.out.println("Ocorreu um erro!");
        }
    }
}