package Main;

public class Main {
    public static void main(String[] args) {
        var handler = new AnimalsHandler();
        handler.task1();
        try {
            System.out.println("Min square meters in zoo "+handler.task2()+" sq. m.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(handler.taskOptional("ground"));
        System.out.println(handler.taskOptional("water"));
        System.out.println(handler.taskOptional("air"));
    }
}

