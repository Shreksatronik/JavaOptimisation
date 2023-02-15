import java.util.ArrayList;

public class Main {
    static Runtime gfg = Runtime.getRuntime();
    static ArrayList<Object> list = new ArrayList<>(999999);

    public static void main(String args[]) {
        while (true) {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }

            System.out.println("Max memory is: "
                    + gfg.maxMemory() / Math.pow(1024, 2));

            System.out.println("Total memory is: "
                    + gfg.totalMemory() / Math.pow(1024, 2));

            System.out.println("Initial free memory: "
                    + gfg.freeMemory() / Math.pow(1024, 2));

            System.out.println("Amount of occupied memory: "
                    + (gfg.totalMemory() - gfg.freeMemory()) / Math.pow(1024, 2));

            System.out.println("================================");
        }

    }

}