
import java.util.*;

public class ToDo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        while (true) { 
            System.out.println("\n1. Add 2.View 3.Complete 4.Delete 5.Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if(choice == 5) break;
            switch(choice) {
                case 1:
                System.out.print("Enter task: "); tasks.add(sc.nextLine()); break;
                case 2:
                if (tasks.isEmpty()) System.out.println("No Tasks.");
                else tasks.forEach(t -> System.out.println(t)); break;
                case 3:
                System.out.print("Task number to complete:");
                tasks.set(sc.nextInt() -1, "[completed]" + tasks.get(sc.nextInt()));
                case 4:
                System.out.print("Tasks number to delete:");
                tasks.remove(sc.nextInt() -1); break;
                default: System.out.println("Invalid choice.");

            }
        }
        sc.close();
    }
}