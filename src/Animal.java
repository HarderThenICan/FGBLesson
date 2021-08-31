public abstract class Animal {
    protected int maxRun = 0;
    protected int maxSwim = 0;
    protected boolean canSwim = true;
    private static int counter = 0;
    protected String name;
    private String color;
    private int age;
    static String cMess = "";

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        counter++;
    }

    public void run(int length) {
        if (length <= maxRun && length > 0) {
            System.out.println(this.name + " пробежал " + length + " метров");
        } else System.out.println(this.name + " Значеие расстояния должно быть положительным и не привышать <= " + maxRun +" метров");
    }

    public void swim(int length) {
        if (!canSwim) {
            System.out.println(this.name + "    Я не могу плыть!!!");
        } else if (canSwim && length <= maxSwim && length > 0) {
            System.out.println(this.name + " проплыл " + length + " метров");
        } else System.out.println(this.name + " Значеие расстояния должно быть положительным и не привышать" + maxRun +" метров");
    }

    public static void getCounter() {

        System.out.println("Животных создано " + counter + " " + getcMess(counter));
    }

    public abstract void swim_2(int length);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public static String getcMess(int counter) {
        if (counter == 1) {
            cMess = "Класс";
        } else if (counter > 1 && counter < 5) {
            cMess = "Класса";
        } else cMess = "Классов";
        return cMess;
    }
}
