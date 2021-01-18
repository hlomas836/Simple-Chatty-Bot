package SimpleBot;
import java.util.Scanner;
import java.util.*;

public class busTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people;
        int temp;
        int bridge;
        people = scanner.nextInt();
        temp = scanner.nextInt();
        int j = 0;
        int i = 0;
        
        for (; i < temp; i++) {
            bridge = scanner.nextInt();
            j = i+1;
            if (bridge <= people) {
                System.out.println("Will crash onb the bridge " + j);
                break;
            }
        }
        if (i == temp){
            System.out.println("Will not crash");
        }
    }
}
