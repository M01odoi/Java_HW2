package Animals;

import com.sun.tools.javac.Main;

public class Raccoon extends Animal {
    public Raccoon(String name, String birthday) {
        super(name,birthday);
    }

    @Override
    public void setProp() {
        zone = "ground";
        typeFood = "meat";
        maxWeight = 9;
        area = 50;
    }
}