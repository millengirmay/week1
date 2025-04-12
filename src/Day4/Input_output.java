package Day4;

import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = input.nextLine().toUpperCase();
        System.out.println("How old are you?");
        int age = input.nextInt();

        String greeting;

        if(age <= 21){
            greeting = "Hi";
        }else{
            greeting = "Hello";
        }
        System.out.println(greeting + " " + name );
    }
}
