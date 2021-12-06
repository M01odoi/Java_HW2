package Animals;

public abstract class Animal {
    Animal(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    private final String name;
    private final String birthday;
    public int count = 1;
    public String zone;
    public String typeFood;
    public int maxWeight;
    public int area;

    public abstract void setProp();

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getProp() {
        return this.getClass().getSimpleName() + ". Name: " + getName() + ", birthday: " + getBirthday() + "; Zone: " +
                zone + "; Type food: " + typeFood + "; Max weight: " + maxWeight + " kg; Area: " + area + " square meters.";
    }

    public boolean ableToEat(String food) {
        return typeFood.contains(food);
    }

}
