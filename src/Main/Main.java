package Main;

public class Main {
    public static void main(String[] args) {
        var handler = new AnimalsHandler();
        System.out.println("*************** Task 1 ***************");

        handler.task1();
        System.out.println("*************** Task 2 ***************");

        try {
            System.out.println("Min square meters in zoo " + handler.task2() + " sq. m.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*************** Task optional ***************");

        System.out.println("Min car carrying capacity for ground animals " + handler.taskOptional("ground") + " kg.");
        System.out.println("Min car carrying capacity for water animals " + handler.taskOptional("water") + " kg.");
        System.out.println("Min car carrying capacity for air animals " + handler.taskOptional("air") + " kg.");
    }
}

