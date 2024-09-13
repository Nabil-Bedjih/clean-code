package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse qui peut contenir des items et qui a des conditions d'acceptation.
 */
public class Caisse implements CaisseAccepteur {

    private String nom;
    private List<Item> items;
    private int poidsMin;
    private int poidsMax;

    /**
     * Constructeur pour initialiser une caisse.
     *
     * @param nom le nom de la caisse
     * @param poidsMin le poids minimum accepté par la caisse
     * @param poidsMax le poids maximum accepté par la caisse
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        this.nom = nom;
        this.poidsMin = poidsMin;
        this.poidsMax = poidsMax;
        this.items = new ArrayList<>();
    }

    /**
     * Détermine si cette caisse accepte l'item en fonction de son poids.
     *
     * @param item l'item à vérifier
     * @return true si l'item est accepté, false sinon
     */
    @Override
    public boolean accepteItem(Item item) {
        int poids = item.getPoids();
        return poids >= poidsMin && (poidsMax == 0 || poids <= poidsMax);
    }

    /**
     * Ajoute un item à la caisse.
     *
     * @param item l'item à ajouter
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Retourne la liste des items dans la caisse.
     *
     * @return la liste des items
     */
    public List<Item> getItems() {
        return items;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}