package Strategy_DP;

public class Runner {

    public static void main(String[] args) {

        Context context = new Context(new Add());

        System.out.println(context.executeStrategy(7,7));

        Context context1=new Context(new Divide());

        System.out.println(context1.executeStrategy(7,7));

        Context context2=new Context(new Multiply());

        System.out.println(context2.executeStrategy(7,7));

        Context context3=new Context(new Subtract());

        System.out.println(context3.executeStrategy(7,7));

    }
}
