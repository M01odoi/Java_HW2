package Animals;
//страус
public class Ostrich extends Animal{
    public Ostrich(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void setProp() {
        zone = "ground";
        typeFood = "plant";
        maxWeight = 140;
        area = 150;
    }
}
