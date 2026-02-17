package day1;
public class a2z{
    public static void main(String[] args) {
        System.out.println("Lowercase a-z with ASCII values:");
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            int ascii = letter;  // char automatically converts to int (ASCII)
            // ascii -=97;// TO CONVERT INTO CHAR ANAGRAM
            System.out.println(letter + ": " + ascii);
        }
        
        // System.out.println("\nUppercase A-Z with ASCII values:");
        // for (int i = 0; i < 26; i++) {
        //     char letter = (char) ('A' + i);
        //     int ascii = letter;
        //     // ascii -=65;// TO CONVERT INTO CHAR ANAGRAM
        //     System.out.println(letter + ": " + ascii);
        // }
    }
}
