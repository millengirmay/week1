package Day4;

public class boolean_logic {
    //Example 1: check age is adult or not
    public static void ageCheck(int age) {
        int limit = 18;     //when we declare variables inside of method it's called local variable
        boolean isAdult = age >= limit; //comparison operator that generates a boolean value

        if (isAdult) {
            System.out.println("IS ADULT.");
        } else {
            System.out.println("IS NOT ADULT.");
        }
    }

    public static void main(String[] args) {
        ageCheck(25);
        ageCheck(15);

    //Example 2: Health recommendation
    boolean isDiabetic = true;
    boolean likescake = true;

    if(likescake && !isDiabetic){
        System.out.println("eats cake");
    }else{
        System.out.println("Don't eat cake");
    }
    //Example 3 check whether is animal or person
        boolean isCat = true;
        boolean isDog = false;
        boolean isFriendly = false;

        if((isCat || isDog) && isFriendly){
            System.out.println("It is an Animal");
        }else if(isDog && isFriendly) {
            System.out.println("They are a person");
        }else{
            System.out.println("should be a robot");
        }
    }
}

