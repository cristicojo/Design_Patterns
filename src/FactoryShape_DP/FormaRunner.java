package FactoryShape_DP;

public class FormaRunner {

    public static void main(String[] args) {

        FormaFactory formaFactory = new FormaFactory();

        Forma f = formaFactory.getForma(FormaFactory.FormaType.PATRAT);

        f.explicaForma();
    }

}
