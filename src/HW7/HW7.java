package HW7;

public class HW7 {
    public static void main(String[] args) {
        Plate plate1 = new Plate(50);
        Cat [] cats = {
                new Cat ("Vasik",10),
                new Cat ("Barsik",10),
                new Cat ("Murka",20),
                new Cat ("Kotik",20),
        };
        for (Cat cat : cats) {
            cat.eat(plate1);
            System.out.println(cat.isSatiety());
        }
    }
}
