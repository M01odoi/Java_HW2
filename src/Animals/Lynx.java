package Animals;
//
public class Lynx extends Animal {
    public Lynx(String name, String birthday) {
        super(name,birthday);
    }
    @Override
    public void setProp() {
        zone = "ground";
        typeFood = "meat";
        maxWeight = 30;
        area = 200;
    }
}
