package stack;
import java.util.Stack;

public class ExempleStack {
    public static void main(String[] args) {
        // Création d'une Stack pour stocker des chaînes de caractères
        Stack<String> pile = new Stack<>();

        // Pousser (push) des éléments sur la pile
        pile.push("Java");
        pile.push("Python");
        pile.push("JavaScript");
        pile.push("PHP");


        // Affichage des éléments de la pile
        System.out.println("Contenu de la pile : " + pile);

        // Retrait (pop) d'un élément de la pile
        String langage = pile.pop();
        System.out.println("Élément retiré : " + langage);

        // Affichage mis à jour de la pile
        System.out.println("Après retrait : " + pile);
    }
}
