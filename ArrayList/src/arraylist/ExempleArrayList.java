package arraylist;
import java.util.ArrayList;

public class ExempleArrayList {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Java");
        liste.add("Python");
        liste.add("JavaScript");
        

        System.out.println("Contenu de l'ArrayList : " + liste);

        String langage = liste.get(0);
        System.out.println("Premier élément : " + langage);

        liste.remove("Python");
        System.out.println("Après suppression : " + liste);
    }
}
