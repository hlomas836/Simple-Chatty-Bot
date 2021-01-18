package SimpleBot;
import java.util.Scanner;

public class boyHeight {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        
        //ordering heights of boys
        boolean boyOrder = (h1 >= h2) && (h2 >= h3);
        
        //printing result
        System.out.println(boyOrder);
    }
}