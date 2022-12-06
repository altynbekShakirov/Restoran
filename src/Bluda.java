import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bluda extends  Menu{


    ArrayList<Bluda> bludaArrayList;
    public void hjjh(){
        bludaArrayList=new ArrayList<>(Arrays.asList(
                new Bluda("Samsa",75,200),
                new Bluda( "Lagman",140,400 ),
                new Bluda("Manty",120,250),
                new Bluda("Ash",350,150),
                new Bluda("Besh barmak",200,350)
        ));
     bludaArrayList.forEach(System.out::println);
    }
    private static final Scanner scanner= new Scanner(System.in);

    public Bluda(String name, int price, int kolom) {
        super(name, price, kolom);
    }

    public Bluda() {
    }

    @Override
    void create() {

        String name = scanner.nextLine();
        int i=0;
        for (Bluda b:bludaArrayList) {
            i++;
            if (name.equalsIgnoreCase(b.getName())){
                i--;
                System.out.println(bludaArrayList.get(i));
            }

        }



    }

    @Override
    void remove() {

    }

    @Override
    void getAll() {
        Bluda bluda=new Bluda();
        System.out.println("dagy alasyzby");

        bluda.hjjh();
        String world=scanner.nextLine();

        if (world.equalsIgnoreCase("yes")){
            create();
        }


    }

    @Override
    void sortByPrice(){

    }

    @Override
    void getByName() {

    }
}
