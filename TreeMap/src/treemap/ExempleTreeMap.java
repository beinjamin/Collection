package treemap;
import java.util.TreeMap;
import java.util.Map;

public class ExempleTreeMap {
    public static void main(String[] args) {
        // Création d'un TreeMap pour stocker des notes d'étudiants
        TreeMap<String, Double> map = new TreeMap<>();

        // Ajout de paires clé-valeur au TreeMap
        map.put("Alice", 85.0);
        map.put("Bob", 72.5);
        map.put("Charlie", 90.0);

        // Affichage des paires clé-valeur du TreeMap (triées par ordre de clé)
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Étudiant : " + entry.getKey() + ", Note : " + entry.getValue());
        }

        // Accès à la valeur pour une clé donnée
        double noteBob = map.get("Bob");
        System.out.println("Note de Bob : " + noteBob);

        // Suppression d'une entrée dans le TreeMap
        map.remove("Charlie");
        System.out.println("Après suppression : " + map);
    }
}