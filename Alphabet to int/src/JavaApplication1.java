// By Luka Lichailidis
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        final Map<Character, Integer> map;

        // Initialize the map with letters and corresponding numbers
        map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

        // Use Scanner to take user input for the letter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single letter: ");
        String input = scanner.nextLine();

        // Ensure input is a single letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char userLetter = input.toLowerCase().charAt(0); // convert to lowercase to match the map

            Integer val = map.get(userLetter);
            if (val == null) {
                System.out.println("Invalid letter!");
            } else {
                System.out.println("The value for '" + userLetter + "' is: " + val);
            }
        } else {
            System.out.println("Please enter a valid single letter.");
        }

        scanner.close();
    }
}