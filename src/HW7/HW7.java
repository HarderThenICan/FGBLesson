package HW7;

public class HW7 {
    public static void main(String[] args) {
        Plate plate1 = new Plate(50);
        Cat [] cats = {
                new Cat ("Барсик",10),
                new Cat ("Петя",10),
                new Cat ("Маша",20),
                new Cat ("Вася",20),
        };
        for (Cat cat : cats) {
            cat.eat(plate1);
            System.out.println(cat.isSatiety());
        }
    }
}
