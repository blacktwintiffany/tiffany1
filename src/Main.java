
public class Main {

    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values

        String day = "Pizza";

        switch(day) {
            case "Sunday": System.out.print("lt is Sunday!");
            break;
            case"Monday": System.out.println("lt is Monday!");
            break;
            case"Tuesday": System.out.println("lt is Tuesday!");
            break;
            case"Wednesday": System.out.println("lt is Wednesday!");
            break;
            case"Thursday": System.out.println("lt is Thursday!");
            break;
            case"Friday": System.out.println("lt is Friday!");
            break;
            case"Saturday": System.out.println("lt is Saturday!");
            break;
            default: System.out.println("That is not a day!");
        }

    }

}