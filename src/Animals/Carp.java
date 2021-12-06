package Animals;

public class Carp extends Animal{
    public Carp(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void setProp() {
        zone = "water";
        typeFood = "meat and plant";
        maxWeight = 4;
        area = 8;
    }
}
