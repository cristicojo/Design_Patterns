package Factory_Strategy_DP;

public class FizzBuzzStrategyFactory {

    private int i;

    FizzBuzzStrategyFactory(int i) {

        this.i = i;

    }

    public FizzBuzzStrategy getStrategy() {

        if (this.i % 3 == 0 && this.i % 5 == 0)
            return new FizzBuzz();

        else if (this.i % 3 == 0)
            return new Fizz();

        else if (this.i % 5 == 0)
            return new Buzz();

        else
            return new Default();


    }
}
