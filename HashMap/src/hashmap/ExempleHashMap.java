package hashmap;
import java.util.HashMap;

public class ExempleHashMap {
    public static void main(String[] args) {
        // Création d'une HashMap pour stocker des capitales de pays
        HashMap<String, String> map = new HashMap<>();

        // Ajout de paires clé-valeur à la HashMap
        map.put("France", "Paris");
        map.put("Espagne", "Madrid");
        map.put("Italie", "Rome");

        // Affichage des paires clé-valeur de la HashMap
        System.out.println("Contenu de la HashMap : " + map);

        // Accès à la valeur pour une clé donnée
        String capitaleFrance = map.get("France");
        System.out.println("Capitale de la France : " + capitaleFrance);

        // Suppression d'une entrée dans la HashMap
        map.remove("Espagne");
        System.out.println("Après suppression : " + map);
    }
}
