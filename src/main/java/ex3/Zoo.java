package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo qui contient une collection d'animaux.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour initialiser un zoo avec un nom.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param animal l'animal à ajouter
     */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne la taille du zoo (le nombre d'animaux).
     *
     * @return le nombre d'animaux dans le zoo
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour modifier le nom du zoo.
     *
     * @param nom le nouveau nom du zoo
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
