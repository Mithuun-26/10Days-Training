import java.util.Scanner;

interface DiscountStrategy {
    double apply(double amount);
}

class NoDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount;
    }
}

class PercentageDiscount implements DiscountStrategy {
    private double percent;
    public PercentageDiscount(double percent) {
        this.percent = percent;
    }
    public double apply(double amount) {
        return amount - (amount * percent / 100);
    }
}

class ThresholdDiscount implements DiscountStrategy {
    private double threshold;
    private double discount;
    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }
    public double apply(double amount) {
        return (amount >= threshold) ? amount - discount : amount;
    }
}

class DiscountEngine {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double getFinal(double amount) {
        return strategy.apply(amount);
    }
}

public class Task3Ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. No Discount");
        System.out.println("2. 10% Discount");
        System.out.println("3. Spend 500, save 50");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        DiscountEngine engine = new DiscountEngine();

        switch (choice) {
            case 1:
                engine.setStrategy(new NoDiscount());
                break;
            case 2:
                engine.setStrategy(new PercentageDiscount(10));
                break;
            case 3:
                engine.setStrategy(new ThresholdDiscount(500, 50));
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Final Amount = " + engine.getFinal(amount));
        sc.close();
    }
}
