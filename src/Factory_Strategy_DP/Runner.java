package Factory_Strategy_DP;

public class Runner {

    public static void main(String[] args) {

        FizzBuzzStrategyFactory factory = new FizzBuzzStrategyFactory(3);

        FizzBuzzStrategy strategy = factory.getStrategy();


        FizzBuzzExecutor executor = new FizzBuzzExecutor(strategy);

        executor.say();

    }
}
