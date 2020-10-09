public class MainDierentuin01 {
    public static void main(String[] args) {
        String naamDierentuin = "Valori's Zoo";
        String[] mijnDieren;
        String[] mijnDiersoorten;
        mijnDieren = haalOpMijnDieren();
        dierentuinOverzichtDieren(naamDierentuin, mijnDieren);
        mijnDiersoorten = haalOpMijnDiersoorten();
        dierentuinOverzichtDieren(naamDierentuin, mijnDieren, mijnDiersoorten );

    }

    public static String[] haalOpMijnDieren() {
        String[] dieren = new String[10];
        dieren[0] = "stokstaartje";
        dieren[1] = "bever";
        dieren[2] = "marmot";
        dieren[3] = "giraf";
        dieren[4] = "struisvogel";
        dieren[5] = "haai";
        dieren[6] = "tarantella";
        dieren[7] = "kikker";
        dieren[8] = "libelle";
        dieren[9] = "wild zwijn";
        return dieren;
    }

    public static String[] haalOpMijnDiersoorten() {
        String[] diersoorten = {"zoogdier", "zoogdier", "zoogdier", "zoogdier", "vogel",
                                "vis", "spin","amfibie", "insect", "zoogdier"};
        return diersoorten;
    }

    public static void dierentuinOverzichtDieren(String naam, String[] dieren) {
        System.out.println("Naam dierentuin: " + naam);
        for (String dier : dieren) {
            System.out.println(dier);
        }
    }

    public static void dierentuinOverzichtDieren(String naam, String[] dieren, String[] soorten) {
        System.out.println("Naam dierentuin: " + naam);
        for (int x = 0 ; x < dieren.length ; x++) {
            System.out.println(dieren[x] + " " + soorten[x]);
        }
    }
}
