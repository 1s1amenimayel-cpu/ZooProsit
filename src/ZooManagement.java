import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {
     /*   int nbrCages=20;
        String zooName="my Zoo";

        System.out.println(" Le Zoo "+zooName+" est composé de "+nbrCages+" cages");
*/
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
        /*lion.family= "Felidae";
        lion.name = "lion";
        lion.age = 2;
        lion.isMammal= true;*/
        Animal[] animals= new Animal[25];
        animals[0] = lion;
        animals[1] = chat;
        animals[2] = oiseau;
        Zoo myZoo= new Zoo("zoo","Tunis",20, animals);
        /*myZoo.animals = new Animal[25];
        myZoo.name = "zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;*/

    myZoo.displayZoo();
    System.out.println(myZoo);
    System.out.println(myZoo.toString());
    System.out.println(lion);





    }

}