package vector;
import java.util.Vector;

public class ExempleVector {
    public static void main(String[] args) {
        // Création d'un Vector pour stocker des nombres entiers
        Vector<Integer> vecteur = new Vector<>();

        // Ajout d'éléments au Vector
        vecteur.add(10);
        vecteur.add(20);
        vecteur.add(30);

        // Affichage des éléments du Vector
        System.out.println("Contenu du Vector : " + vecteur);

        // Accès à un élément spécifique par son indice
        int valeur = vecteur.get(1);
        System.out.println("Élément à l'indice 1 : " + valeur);

        // Suppression d'un élément
        vecteur.removeElement(20);
        System.out.println("Après suppression : " + vecteur);
    }
}
