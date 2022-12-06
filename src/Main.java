import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        Bluda bluda=new Bluda();
        Salat salat= new Salat();
        Disert disert= new Disert();
        Nopitki  nopitki= new Nopitki();
        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~Menu~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1==Tamaktar");
            System.out.println("2==Salattar");
            System.out.println("3==desertter");
            System.out.println("4==Suusunduktar");
            int snum = scanner.nextInt();
            switch (snum) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~TAMAKTAR~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    bluda.hjjh();
                    System.out.println("tandanyz");
                    bluda.create();
                    bluda.getAll();
                    break;
                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~SALATTAR~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    salat.vodh();
                    System.out.println("tandanyz");
                    salat.create();
                    salat.getAll();
                    break;
                case 3:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~DESERTTER~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    disert.khk();
                    System.out.println("tandanyz");
                    disert.create();
                    disert.getAll();
                    break;
                case 4:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~SUUSUNDUKTAR~~~~~~~~~~~~~~~~~~~~~~~");
                    nopitki.gfdgj();
                    System.out.println("tandanyz");
                    nopitki.create();
                    nopitki.getAll();
                    break;
            }


        }
    }



}