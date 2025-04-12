package Day3;
//when we don't declare the method as void we should use datatype that we want to return
//You cannot declare static variables inside methods (those are called local variables and can't be static).
public class methods {
    public static void greet(){
        System.out.println("Hello World. I am in a method/function");
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static String agePhrase(int age){   //use string to return,but we give to the argument is int
        return "Your age is: " + age;
    }

    public static void main(String[] args) {
        greet();
        greet();
        System.out.println(add(5,6));
        int sum = add(8,9);
        System.out.println(sum);
        System.out.println(fullName("Mili","Girmay"));
        System.out.println(agePhrase(26));
    }

}
