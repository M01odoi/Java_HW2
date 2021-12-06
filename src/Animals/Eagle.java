package Animals;

public class Eagle extends Animal{
    public Eagle(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void setProp() {
        zone = "air";
        typeFood = "meat";
        maxWeight = 7;
        area = 100;
    }
}
