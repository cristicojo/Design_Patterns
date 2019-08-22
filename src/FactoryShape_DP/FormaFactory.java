package FactoryShape_DP;

public class FormaFactory {

    public enum FormaType {

        CERC,
        PATRAT,
        TRIUNGHI
    }

    public Forma getForma(FormaFactory.FormaType ff) {


        switch (ff) {

            case CERC:
                return new Cerc();
            case PATRAT:
                return new Patrat();
            case TRIUNGHI:
                return new Triunghi();

            default:
                return null;

        }
    }
}
