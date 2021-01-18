package SimpleBot;
import java.util.Scanner;

class armyUnits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        int soldiers = myObj.nextInt();
        
        if (soldiers <= 1) {
            System.out.println("No Army");
        }
        else if (soldiers <= 19) {
            System.out.println("Pack");
        }
        else if (soldiers <= 149) {
            System.out.println("Throng");
        }
        else if (soldiers <= 999) {
            System.out.println("Zounds");
        }
        else if (soldiers >= 1000) {
            System.out.println("Legion");
        }
    }
}