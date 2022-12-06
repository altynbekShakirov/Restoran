import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Salat extends  Menu{
    private static final Scanner scanner= new Scanner(System.in);
    ArrayList<Salat> salatArrayList;
    public void vodh(){
        salatArrayList=new ArrayList<>(Arrays.asList(
                new Salat("po Koreiyski",80,100),
                new Salat("Olivie",100,120),
                new Salat("vinegred",90,100)
        ));
        salatArrayList.forEach(System.out::println);

    }
    @Override
    void create() {
        String name = scanner.nextLine();
        int i=0;
        for( Salat s:salatArrayList) {
            i++;
            if (name.equalsIgnoreCase(s.getName())){
                i--;
                System.out.println(salatArrayList.get(i));
            }

        }




    }

    @Override
    void remove() {

    }

    @Override
    void getAll() {


        Salat salat= new Salat();
        System.out.println("dagy alasyzby");
        salat.vodh();
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

    public Salat(String name, int price, int kolom) {
        super(name, price, kolom);
    }
    public Salat(){}
}
