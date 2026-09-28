import java.util.Arrays;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages, Animal[] animals){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;

    }
    public void displayZoo() {
        System.out.println("nom:"+ name);
        System.out.println("city:"+city);
        System.out.println("nbre de cages:" + nbrCages);
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
}
