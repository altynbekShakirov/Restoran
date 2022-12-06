import java.util.List;

public abstract class Menu {
    private  String name ;

    private  int price;
    public Menu(String name, int price, int kolom) {
        this.name = name;
        this.price = price;
        this.kolom = kolom;
    }

    public Menu() {
    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                "price: " + price +"\n"+
                "kolom: " + kolom +"\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKolom() {
        return kolom;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }
    private  int kolom;
    abstract  void  create();
    abstract  void remove();
    abstract void getAll();
    abstract void sortByPrice();
    abstract void getByName();
    

   




}
