public class Dog extends Animal {
    private static int counter = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        super.maxRun = 500;
        super.maxSwim = 10;
        counter++;
    }

    public static void getCounter (){
        System.out.println("Собак создано " + counter + " " + getcMess(counter));
    }

    @Override
    public void swim_2(int length) {
        if (canSwim && length <= maxSwim && length > 0){
            System.out.println(this.name + " проплыл " + length + " метров");
        }
        else System.out.println(this.name + " Значеие расстояния должно быть положительным и не привышать <= " + maxRun +" метров");
    }
}