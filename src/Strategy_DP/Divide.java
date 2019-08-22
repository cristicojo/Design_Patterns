package Strategy_DP;

public class Divide implements Strategy{

    @Override
    public int operation(int i, int j) {

        System.out.print(i+" / "+j+" = ");

        return i/j;
    }
}
