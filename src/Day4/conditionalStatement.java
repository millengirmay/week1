package Day4;

public class conditionalStatement {
    public static void go(int age){
        if (age >= 18){
            System.out.println("Go Vote!!");
        }else {
            System.out.println("Go play");
        }
    }

    public static void respond(char answer){
        if(answer == 'Y' || answer == 'y'){
            System.out.println("Yup Yup");
        }else{
            System.out.println("Nope Nope");
        }
    }

    public static void drink(int age){
        if(age < 21){
            System.out.println("Juice");
        }else if( age <45){
            System.out.println("adult beverage");
        }else if(age < 70){
            System.out.println("tea");
        }else{
            System.out.println("Heavy beverage");
        }
    }

    public static void login(String username, String password){
        if(username == username.toUpperCase()){
            System.out.println("Login successfully");
        }else if(username != password){
            System.out.println("Login work");
        }else{
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        go(25);
        respond('x');
        drink(96);
        login("milli","MILI");
    }
}
