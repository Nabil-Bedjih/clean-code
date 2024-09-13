package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
        zoo.addAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
        zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
        zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
        zoo.addAnimal(new Animal("Requin blanc", "POISSON", "CARNIVORE"));
        zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
        zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
        zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));

        // Affiche la liste des animaux du zoo
        zoo.afficherListeAnimaux();
    }
}
