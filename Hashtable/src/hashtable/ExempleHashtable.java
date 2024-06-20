package hashtable;
import java.util.Hashtable;
import java.util.Map;

public class ExempleHashtable {
    public static void main(String[] args) {
        // Création d'une Hashtable pour stocker des mots et leurs significations
        Hashtable<String, String> map = new Hashtable<>();

        // Ajout de paires clé-valeur à la Hashtable
        map.put("Apple", "A fruit");
        map.put("Car", "A vehicle");
        map.put("Java", "A programming language");

        // Affichage des paires clé-valeur de la Hashtable
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Mot : " + entry.getKey() + ", Signification : " + entry.getValue());
        }

        // Accès à la valeur pour une clé donnée
        String significationJava = map.get("Java");
        System.out.println("Signification de Java : " + significationJava);

        // Suppression d'une entrée dans la Hashtable
        map.remove("Car");
        System.out.println("Après suppression : " + map);
    }
}