package Factory_Strategy_DP;

public class FizzBuzzExecutor {

    private FizzBuzzStrategy z;

    FizzBuzzExecutor(FizzBuzzStrategy z) {

        this.z = z;
    }

    public void say() {

        this.z.say();
    }
}
