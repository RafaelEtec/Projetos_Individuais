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
                + "<A> Sorting System (Crescente)              \n"
                + "<B> Sorting System (Decrescente)            \n"
                + "<C> Sorting Text   (Crescente)              \n"
                + "<D> Sorting Text   (Decrescente)            \n"
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
            case "c":
                System.out.println(" ---| Sorting Text (Crescente) |--- \n");
                /**
                 * Ordena os textos baseado no numero de caracteres de forma Crescente
                **/
                Funções.Todas.sortingText(Funções.Entrada.entStringArray(), escolha);
                break;
            case "d":
                System.out.println(" ---| Sorting Text (Decrescente) |--- \n");
                /**
                 * Ordena os textos baseado no numero de caracteres de forma Decrescente
                **/
                Funções.Todas.sortingText(Funções.Entrada.entStringArray(), escolha);
                break;
            case "s":
                System.out.println(" ---| Saindo do Programa |--- \n");
                break;
            default:
                System.out.println("Ocorreu um erro!");
        }
    }
}