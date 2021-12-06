package Animals;

public class Kangaroo extends Animal{

    public Kangaroo(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void setProp() {
        zone = "ground";
        typeFood = "plant";
        maxWeight = 85;
        area = 300;
    }
}
