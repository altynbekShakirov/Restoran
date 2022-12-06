import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Nopitki extends Menu{
    ArrayList<Nopitki>nopitkis1;
    public void gfdgj(){
       nopitkis1 =new ArrayList<>(Arrays.asList(
                new Nopitki("Coca-cola",75,1000),
                new Nopitki("Fanta",75,1000),
                new Nopitki("Fanta",55,500),
                new Nopitki("Pepsi",80,1000),
                new Nopitki("Pepsi",60,500),
                new Nopitki("Kymyz",120,1000),
                new Nopitki("Sprite",70,1000),
                new Nopitki("Sprite",50,500)
        ));
       nopitkis1.forEach(System.out::println);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public Nopitki(String name, int price, int kolom) {
        super(name, price, kolom);
    }
    public  Nopitki(){}

    @Override
    void create() {
        String name = scanner.nextLine();
        int i=0;
        for( Nopitki n:nopitkis1) {
            i++;
            if (name.equalsIgnoreCase(n.getName())){
                i--;
                System.out.println(nopitkis1.get(i));
            }

        }



    }

    @Override
    void remove() {

    }

    @Override
    void getAll() {

        Nopitki  nopitki= new Nopitki();
        nopitki.gfdgj();
        System.out.println("dagy alasyzby");
        String world=scanner.nextLine();
        if (world.equalsIgnoreCase("yes")){
           create();
        }



    }

    @Override
    void sortByPrice() {

    }

    @Override
    void getByName() {

    }
}
