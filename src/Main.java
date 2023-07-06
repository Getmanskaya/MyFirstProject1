// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int shortest  = Kata.findShort("Гетманская Настя по 23 гулять");
        System.out.println(shortest);
    }

    public static String abbrevName(String name) {
        String[] arrOfStr = name.split(" ");
        String firstName = arrOfStr[0];
        String firstNameBig = firstName.toUpperCase();
        String lastName = arrOfStr[1];
        String lastNameBig = lastName.toUpperCase();
        char firstSign = firstNameBig.charAt(0);
        char lastSign = lastNameBig.charAt(0);
        String FIO = firstSign + "." + lastSign + ".";
        return FIO;
    }
}


class Kata {
    public static int findShort(String s) {
        String[] arrOfStr = s.split(" ");
        int superMin = Integer.MAX_VALUE;

        for (int i = 0; i < arrOfStr.length; i++) {
            if (arrOfStr[i].length() < superMin) {
                superMin = arrOfStr[i].length();
            }
        }
        return superMin;
    }
}
