import java.util.Scanner;
import java.util.Stack;

public class StackP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome!: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i < word.length(); i++){
            char x = word.charAt(i);
            stack.push(x);
        }
        StringBuilder maybe = new StringBuilder();
        for(int i=0; i < word.length(); i++){
            maybe.append(stack.pop());
        }

        if(word.equals(maybe.toString())){
            System.out.println("Original word: " + word + "\nReversed: " + maybe);
            System.out.println("It's a palindrome!! :)");
        } else {
            System.out.println("Original word: " + word + "\nReversed: " + maybe);
            System.out.println("Sorry... better luck next time :(");
        }
    }
}
