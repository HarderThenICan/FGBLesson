public class Cat extends Animal {
    private static int counter = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        super.maxRun = 200;
        super.canSwim = false;
        counter++;
    }

    public static void getCounter() {
        System.out.println("Котов создано " + counter + " " + getcMess(counter));
    }

    @Override
    public void swim_2(int length) {
        System.out.println(this.name + "  Я не могу плыть!!!");
    }
}