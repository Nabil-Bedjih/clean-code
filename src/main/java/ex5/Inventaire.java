package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un inventaire qui contient plusieurs caisses.
 */
public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        // Ajout de caisses avec leurs limites de poids
        caisses.add(new Caisse("Petits objets", 0, 5));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 20, 0));
    }

    /**
     * Ajoute un item à la première caisse qui l'accepte.
     *
     * @param item l'item à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.addItem(item);
                break;
            }
        }
    }

    /**
     * Retourne la taille totale des items dans toutes les caisses.
     *
     * @return le nombre total d'items dans l'inventaire
     */
    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
