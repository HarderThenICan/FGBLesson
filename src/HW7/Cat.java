package HW7;

public class Cat {
    private String name;
    private boolean satiety = false;
    private int appetite;
    public Cat (String name, int appetite){
        this.appetite = appetite;
        this.name = name;
    }
    public void eat (Plate plate){
        if (plate.getFood() >= this.appetite){
            plate.decreaseFood(this.appetite);
            this.satiety = true;
        }
        else{
            System.out.println("В тарелке недостаточно еды");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
