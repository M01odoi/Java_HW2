package Animals;

public class Ram extends Animal{
    public Ram(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void setProp() {
        zone = "water";
        typeFood = "meat";
        maxWeight = 2;
        area = 5;
    }
}
