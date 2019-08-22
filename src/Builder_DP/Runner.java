package Builder_DP;

public class Runner {

    public static void main(String[] args) {

        Shaorma.ShaormaBuilder sb = new Shaorma.ShaormaBuilder();

        Shaorma shaormaNoastra = sb.withCarne(true).withCartofi(true).withSos(true).build();


        System.out.println(shaormaNoastra);

    }
}
