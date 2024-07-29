package Week1.Exercise_7.code;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: If years is 0, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: Calculate future value for (years - 1) and multiply by (1 + growthRate)
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Initial value
        double annualGrowthRate = 0.05; // 5% growth rate
        int years = 10; // Number of years

        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}

