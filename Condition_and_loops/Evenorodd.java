package Condition_and_loops;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number= input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " the number is even ");
        }
        else {
            System.out.println(number + " the number is odd ");
        }
        input.close();

        
    }
}
