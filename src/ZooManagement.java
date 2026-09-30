import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le nom du zoo");
        String zooName = sc.nextLine();

        int nbrCages;

        do {
            System.out.println("Entrez le nombre de cages :");
            nbrCages=sc.nextInt();
        }while (nbrCages<=0);

        System.out.println(" Le Zoo "+zooName+" est composé de "+nbrCages+" cages");


        Animal lion = new Animal("Felidae", "lion",2,true);
        Animal chat = new Animal("Félidés ","leo",1,true);
        Animal oiseau = new Animal("Corvidés", "name",1, false);
        Animal lion2 = new Animal("Felidae", "lion", 2, true);
        Animal[] animals= new Animal[25];

        Zoo myZoo= new Zoo("zoo","Tunis", animals);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(chat));
        System.out.println(myZoo.addAnimal(oiseau));
        System.out.println(myZoo.searchAnimal("lion"));


    myZoo.displayZoo();
    /*System.out.println(myZoo);
    System.out.println(myZoo.toString());
    System.out.println(lion);*/
    System.out.println("indice de lion:" +myZoo.searchAnimal("lion"));
    System.out.println("Indice du tigre : " + myZoo.searchAnimal("tigre"));
    System.out.println("Avant suppression :");
        myZoo.displayAnimals();
        System.out.println("Suppression du lion : "
                + myZoo.removeAnimal(lion));

        System.out.println("Après suppression :");
        myZoo.displayAnimals();
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        Zoo zoo1 = new Zoo("Zoo Tunis", "Tunis", new Animal[25]);
        Zoo zoo2 = new Zoo("Zoo Sousse", "Sousse", new Animal[25]);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(chat);

        zoo2.addAnimal(oiseau);

        Zoo zooPlusPeuple = Zoo.comparerZoo(zoo1, zoo2);

        System.out.println("Le zoo avec le plus d'animaux est : "
                + zooPlusPeuple.name);



    }

}