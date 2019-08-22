package Strategy_DP;

public class Subtract implements Strategy {

    @Override
    public int operation(int i, int j) {

        System.out.print(i+" - "+j+" = ");

        return i-j;
    }
}
