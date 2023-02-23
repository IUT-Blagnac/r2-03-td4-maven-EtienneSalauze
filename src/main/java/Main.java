package Main;

public class Main {

    public static void main(String argv[]) throws Exception{
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");

    }
}

	