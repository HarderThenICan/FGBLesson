package HW7;

public class Plate {private int food;
    public Plate (int food){
        this.food = food;
        System.out.println("Создана тарелка на " + food + " единиц еды");
    }
    public void decreaseFood (int appetite){
        if (this.food >= appetite){
            this.food -= appetite;
            System.out.println("В тарелке " + this.food +" единиц еды");
        } else {
            System.out.println("Кол-ва еды должно быть больше, чем аппетита");
        }
    }
    public void addFood (int food){
        if (food > 0){
            this.food += food;
        }
        else{
            System.out.println("error");
        }
    }

    public int getFood() {
        return food;
    }
}
