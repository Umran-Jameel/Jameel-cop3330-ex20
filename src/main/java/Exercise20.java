import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String money = in.nextLine();
        double amount = Double.parseDouble(money);

        System.out.print("What state do you live in? ");
        String state = in.nextLine();
        double tax;
        String result = "";

        if (state.equals("Wisconsin"))
        {
            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            if (county.equals("Dunn")) {
                tax = 0.05 + 0.004;
            }
            else if (county.equals("Eau CLaire")) {
                tax = 0.05 + 0.005;
            }
            else {
                tax = 0.05;
            }
            result = String.format("The tax is %.2f\nThe total is %.2f.", (tax * amount), (tax * amount + amount));
        }
        else if (state.equals("Illinois")) {
            tax = 0.08;
            result = String.format("The tax is %.2f\nThe total is %.2f.", (tax * amount), (tax * amount + amount));
        }
        else {
            result = String.format("The total is %.2f", amount);
        }

        System.out.println(result);
    }
}
