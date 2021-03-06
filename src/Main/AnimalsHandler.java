package Main;

import Animals.*;

import java.util.ArrayList;

public class AnimalsHandler {
    private ArrayList<Animal> createAnimals() {
        var animals = new ArrayList<Animal>();
        animals.add(new Raccoon("Oreo", "01.02.2020"));
        animals.add(new Lynx("Leo", "04.11.2017"));
        animals.add(new Kangaroo("Max", "14.11.2015"));
        animals.add(new Eagle("Killer", "30.03.2020"));
        animals.add(new Ostrich("Typo", "23.02.2020"));
        animals.add(new Carp("Vasya", "24.11.2021"));
        animals.add(new Ram("Egor", "20.10.2019"));
        return animals;
    }

    public void task1() {
        var animals = createAnimals();

        for (Animal animal : animals) {
            animal.setProp();
            System.out.println(animal.getProp());
            System.out.print("Meat? ");
            this.printResultOfFeeding(animal.ableToEat("meat"));
            System.out.print("Plant? ");
            this.printResultOfFeeding(animal.ableToEat("plant"));
        }
    }

    private void printResultOfFeeding(boolean hadAte) {

        System.out.println(hadAte ? "Я буду есть..." : "Я не буду есть..");
    }

    public ArrayList<Animal> countOfAnimals() throws Exception {
        var animals = createAnimals();
        for (Animal animal : animals) {
            animal.setProp();
            switch (animal.getClass().getSimpleName()) {
                case "Raccoon" -> animal.count = 4;
                case "Lynx" -> animal.count = 5;
                case "Kangaroo" -> animal.count = 2;
                case "Eagle", "Ram" -> animal.count = 7;
                case "Ostrich" -> animal.count = 3;
                case "Carp" -> animal.count = 15;
                default -> throw new Exception("Invalid animal");
            }
        }
        return animals;
    }

    public int task2() throws Exception {
        var animals = countOfAnimals();
        int sumSquare = 0;
        for (Animal animal : animals) {
            animal.setProp();
            sumSquare += animal.count * animal.area;
        }
        return sumSquare;
    }

    public int taskOptional(String zone) throws Exception {
        var animals = countOfAnimals();
        int weightCar = 0;
        for (Animal animal : animals) {
            animal.setProp();
            if (animal.zone.equals(zone))
                weightCar += animal.count * animal.maxWeight;
        }
        return weightCar;
    }
}
