public class Algorithm {
    public static void main(String[] args) {

        String result = convertHTML("Shindler's List");
        System.out.println(result);
    }

    private static String convertHTML(String sentence) {
        return sentence.replaceAll("&", "&amp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;");
    }
}