package hashet;
import java.util.HashSet;

public class ExempleHashSet {
    public static void main(String[] args) {
        // Création d'un HashSet pour stocker des noms de pays
        HashSet<String> ensemble = new HashSet<>();

        // Ajout d'éléments au HashSet
        ensemble.add("France");
        ensemble.add("Espagne");
        ensemble.add("Italie");

        // Affichage des éléments du HashSet (ordre non garanti)
        System.out.println("Contenu du HashSet : " + ensemble);

        // Ajout d'un élément déjà présent (ne sera pas ajouté)
        ensemble.add("France");

        // Affichage mis à jour (pas de doublons dans un HashSet)
        System.out.println("Après tentative d'ajout de doublon : " + ensemble);
    }
}
