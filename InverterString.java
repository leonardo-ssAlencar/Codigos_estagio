public class InverterString {

    public static String reverter(String str) {

        char invertida[] = new char[str.length()];
        int strTam = str.length() - 1;

        for (int i = 0; i <= strTam; i++) {
            invertida[i] = str.charAt((strTam - i));
        }

        return new String(invertida);
    }
}
