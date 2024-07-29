public class Main {
    private static final String CzyPrzetwarzaDaneOsob = ""; // basic field
    private static final String CzyDaneOsobowePracDost = "TAK"; // always required field
    private static final String CzyAdminZewnetrzny = "NIE"; // if CzyPrzetwarzaDaneOsob or CzyDaneOsobowePracDost = TAK
    private static final String CzyPonadDanePodstawowe = "NIE"; // if CzyAdminZewnetrzny = NIE && (CzyPrzetwarzaDaneOsob || CzyDaneOsobowePracDost = TAK)
    private static final String rodoWymog1 = "NIE";
    private static final String rodoWymog2 = "NIE";
    private static final String rodoWymog3 = "NIE";
    private static final String rodoWymog4 = "NIE";
    private static final String rodoWymog5 = "NIE";
    private static final String rodoWymog6 = "NIE";
    private static final String rodoWymog7 = "NIE";
    private static final String rodoWymog8 = "TAK";
    private static final String rodoWymog9 = "TAK";

    public static void main(String[] args) {
        System.out.println(validate());
    }

    public static boolean validate() {
        boolean result = false;

        System.out.println("run check CzyDaneOsobowePracDost field");
        result = !CzyDaneOsobowePracDost.isEmpty();

        // Validate CzyAdminZewnetrzny
        boolean isCzyAdminZewnetrznyValid = "TAK".equals(CzyPrzetwarzaDaneOsob) || "TAK".equals(CzyDaneOsobowePracDost);
        if (isCzyAdminZewnetrznyValid) {
            System.out.println("run check CzyAdminZewnetrzny field");
            result = !CzyAdminZewnetrzny.isEmpty();
        }

        // Validate CzyPonadDanePodstawowe
        boolean isCzyPonadDanePodstawoweValid = "NIE".equals(CzyAdminZewnetrzny) &&
                ("TAK".equals(CzyPrzetwarzaDaneOsob) || "TAK".equals(CzyDaneOsobowePracDost));
        if (isCzyPonadDanePodstawoweValid) {
            System.out.println("run check CzyPonadDanePodstawowe field");
            result = !CzyPonadDanePodstawowe.isEmpty();
        }

        // Validate RodoWymogi
        boolean isRodoWymogiValid = "TAK".equals(CzyPonadDanePodstawowe) &&
                ("TAK".equals(CzyPrzetwarzaDaneOsob) || "TAK".equals(CzyDaneOsobowePracDost)) &&
                "NIE".equals(CzyAdminZewnetrzny);
        if (isRodoWymogiValid) {
            System.out.println("run check RodoWymogi fields");
            String[] wymogiArray = {
                    rodoWymog1, rodoWymog2, rodoWymog3, rodoWymog4, rodoWymog5,
                    rodoWymog6, rodoWymog7, rodoWymog8, rodoWymog9
            };

            for (String item : wymogiArray) {
                if (item.isEmpty()) {
                    result = false;
                }
            }
        }

        return result;
    }
}