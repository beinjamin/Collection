package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemplePriorityQueue {
    public static void main(String[] args) {
        // Création d'une PriorityQueue pour une file d'attente avec priorité
        Queue<String> filePrioritaire = new PriorityQueue<>();

        // Ajout d'éléments avec priorité à la queue
        filePrioritaire.offer("Urgent Task");
        filePrioritaire.offer("Normal Task");
        filePrioritaire.offer("High Priority Task");

        // Affichage de la file d'attente prioritaire
        System.out.println("File d'attente prioritaire : " + filePrioritaire);

        // Retrait du premier élément de la queue (le plus prioritaire)
        String prochaineTache = filePrioritaire.poll();
        System.out.println("Prochaine tâche : " + prochaineTache);
        // Affichage mis à jour de la file d'attente prioritaire
        System.out.println("Après traitement : " + filePrioritaire);

        // Accès au premier élément sans le retirer de la queue
        String tacheSuivante = filePrioritaire.peek();
        System.out.println("Tâche suivante : " + tacheSuivante);

        // Affichage final de la file d'attente prioritaire
        System.out.println("File d'attente prioritaire finale : " + filePrioritaire);
    }
}