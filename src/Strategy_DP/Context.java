package Strategy_DP;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){

        this.strategy=strategy;
    }

    public int executeStrategy(int i,int j){

        return strategy.operation(i,j);

    }
}
