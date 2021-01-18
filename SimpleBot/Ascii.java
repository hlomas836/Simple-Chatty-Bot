package SimpleBot;
public class Ascii {
    public static void main(String[] args) {
        char myCharacter = 'a';
        int asciiChar = (int) myCharacter;
        String asciiCharAsString = Integer.toString(asciiChar);
        
        System.out.println("The Character is:" + myCharacter);
        System.out.println("The decimal ASCII code for that character is: " + asciiCharAsString);
        System.out.println("The binary representation is: " + Integer.toBinaryString(asciiChar));
        
    }
}