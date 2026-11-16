package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String text) {
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        int n = number;
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
