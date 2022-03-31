package Funções;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class menu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  " |------ O que você deseja avaliar? ------| \n"
                + "<A> Sorting System (Crescente)      \n"
                + "<B> Sorting System (Decrescente)    \n"
                + "<> \n"
                + "<> \n"
                + "<> \n"
                + "<S> Sair \n");
        String escolha = ent.next();
        
        switch (escolha.toLowerCase()) {
            case "a":
                System.out.println(" ---| Sorting System (Crescente) |--- \n");
                /**
                 * Ordena os números inseridos de forma Crescente
                **/
                Funções.Todas.sortingSystem(Funções.Entrada.entIntArray(), escolha);
                break;
            case "b":
                System.out.println(" ---| Sorting System (Decrescente) |--- \n");
                /**
                 * Ordena os números inseridos de forma Decrescente
                **/
                Funções.Todas.sortingSystem(Funções.Entrada.entIntArray(), escolha);
                break;
            case "s":
                System.out.println(" ---| Saindo do Programa |--- \n");
                break;
            default:
                System.out.println("Ocorreu um erro!");
        }
    }
}