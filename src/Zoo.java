import java.util.Arrays;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimals = 0;


    public Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;

    }

    public void displayZoo() {
        System.out.println("nom:" + name);
        System.out.println("city:" + city);
        System.out.println("nbre de cages:" + nbrCages);
    }

    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(String name) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].name.equals(name)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    /* question 10 public boolean addAnimal(Animal animal){
        if (nbrAnimals< animals.length){
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;}
        return false;
        }*/


    public boolean addAnimal(Animal animal) {

        // Vérifier si le zoo est plein
        if (nbrAnimals >= animals.length) {
            return false;
        }

        // Vérifier si l'animal existe déjà
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] == animal) {
                return false;
            }
        }

        // Ajouter l'animal
        animals[nbrAnimals] = animal;
        nbrAnimals++;

        return true;
    }
    public boolean removeAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i] == animal) {

                // Décaler les animaux
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }

                // Vider la dernière case
                animals[nbrAnimals - 1] = null;

                nbrAnimals--;

                return true;
            }
        }

        return false;
    }
    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }
    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {

        if (zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        }

        return zoo2;
    }
}


