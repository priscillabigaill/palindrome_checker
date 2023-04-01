import java.util.*;

public class Both {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome!: ");
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        boolean ans = false;

        Queue<Character> queue = new LinkedList<>();
        for(char c : letters) {
            queue.add(c);
        }
        Stack<Character> stack = new Stack<>();
        for(char c : letters){
            stack.push(c);
        }

        while(!queue.isEmpty() && !stack.isEmpty()){
            if(queue.remove() != stack.pop()){
                ans = false;
            } else {
                ans = true;
            }
        }

        if(ans == true){
            System.out.println("It's a palindrome!! :)");
        } else {
            System.out.println("Not a palindrome... better luck next time :(");
        }
    }
}
