package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class ExempleLinkedList {
    public static void main(String[] args) {
        // Création d'une LinkedList pour utiliser comme une queue
        Queue<String> fileAttente = new LinkedList<>();

        // Ajout d'éléments à la queue
        fileAttente.offer("Client A");
        fileAttente.offer("Client B");
        fileAttente.offer("Client C");

        // Affichage de la file d'attente
        System.out.println("File d'attente : " + fileAttente);

        // Retrait du premier élément de la queue
        String premierClient = fileAttente.poll();
        System.out.println("Client servi : " + premierClient);

        // Affichage mis à jour de la file d'attente
        System.out.println("Après service : " + fileAttente);

        // Accès au premier élément sans le retirer de la queue
        String prochainClient = fileAttente.peek();
        System.out.println("Prochain client : " + prochainClient);

        // Affichage final de la file d'attente
        System.out.println("File d'attente finale : " + fileAttente);
    }
}
