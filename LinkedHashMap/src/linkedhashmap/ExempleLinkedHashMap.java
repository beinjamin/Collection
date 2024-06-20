package linkedhashmap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExempleLinkedHashMap {
    public static void main(String[] args) {
        // Création d'une LinkedHashMap pour stocker des noms et âges
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Ajout de paires clé-valeur à la LinkedHashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 20);

        // Affichage des paires clé-valeur de la LinkedHashMap (dans l'ordre d'insertion)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Nom : " + entry.getKey() + ", Âge : " + entry.getValue());
        }

        // Accès à la valeur pour une clé donnée
        int ageBob = map.get("Bob");
        System.out.println("Âge de Bob : " + ageBob);

        // Suppression d'une entrée dans la LinkedHashMap
        map.remove("Charlie");
        System.out.println("Après suppression : " + map);
    }
}
