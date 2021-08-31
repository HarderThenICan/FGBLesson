public class SixthHomeWork {public static void main(String[] args) {
    Cat cat1 = new Cat("Васька", "Коричневый", 8);
    Cat cat2 = new Cat("Мурзик", "Чёрный", 1);
    Dog dog1 = new Dog ("Булька", "black", 3);
    cat1.run(100);
    cat1.swim(100);
    cat2.swim(100);
    cat1.getCounter();
    dog1.swim(10);
    dog1.swim(11);
    dog1.run(500);
    dog1.getCounter();
    Animal.getCounter();
    dog1.swim_2(8);
}
}
