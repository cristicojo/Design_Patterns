package Builder_DP;

public class Shaorma {

    private boolean cartofi;
    private boolean sos;
    private boolean varza;
    private boolean morcovi;
    private boolean salata;
    private boolean ceapa;
    private boolean castraveti;
    private boolean carne;

    private Shaorma() {

    }

    public static class ShaormaBuilder {

        private Shaorma shaorma = new Shaorma();

        public Shaorma build() {
            return shaorma;
        }

        public ShaormaBuilder withCarne(boolean withCarne) {
            shaorma.carne = withCarne;
            return this;
        }

        public ShaormaBuilder withSos(boolean withSos) {
            shaorma.sos = withSos;
            return this;
        }

        public ShaormaBuilder withCartofi(boolean withCartofi) {
            shaorma.cartofi = withCartofi;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Shaorma --> " +
                "cartofi=" + cartofi +
                ", sos=" + sos +
                ", varza=" + varza +
                ", morcovi=" + morcovi +
                ", salata=" + salata +
                ", ceapa=" + ceapa +
                ", castraveti=" + castraveti +
                ", carne=" + carne;
    }
}
