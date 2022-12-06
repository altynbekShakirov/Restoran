import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Disert extends Menu{
    private static final Scanner scanner= new Scanner(System.in);

    ArrayList<Disert> disertArrayList;
    public void khk(){
        disertArrayList=new ArrayList<>(Arrays.asList(
                new Disert("pirojnoe",50 ,150),
                new Disert("tort",150,200),
                new Disert("atala",200,150)
        ));
        disertArrayList.forEach(System.out::println);
    }
    public  Disert(){}


    public Disert(String name, int price, int kolom) {
        super(name, price, kolom);
    }

    @Override
    void create() {
        String name= scanner.nextLine();
        int i=0;
        for (Disert d:disertArrayList) {
            i++;
            if (name.equalsIgnoreCase(d.getName())){
                i--;
                System.out.println(disertArrayList.get(i));

                break;
            }

        }


    }

    @Override
    void remove() {

    }

    @Override
    void getAll() {


        Disert disert= new Disert();
        System.out.println("dagy alasyzby");

        disert.khk();
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
