package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Total revenue per item
        int bubbleGum = 202, toffee = 118, iceCream = 2250, milkChocolate = 1680,
                doughnut = 1075, pancake = 80;


        //Prints total revenue per item
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubbleGum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);

        //Prints income before expenses or revenue
        int income = bubbleGum + toffee + iceCream + milkChocolate + doughnut + pancake;
        System.out.printf("Income: $%d%n", income);

        //Prints expenses
        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();

        //Prints Net Income
        int netIncome = income-(staffExpenses+otherExpenses);
        System.out.println("Net income: $" + netIncome);

        sc.close();

    }
}