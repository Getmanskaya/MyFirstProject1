class AbbreviateTwoWords {
    public String abbrevName(String name) {
        name = "Гетманская Анастасия";
        String[] arrOfStr = name.split(" ");
        String firstName = arrOfStr[0];
        String firstNameBig = firstName.toUpperCase();
        String lastName = arrOfStr[1];
        String lastNameBig = lastName.toUpperCase();
        char firstSign = firstNameBig.charAt(0);
        char lastSign = lastNameBig.charAt(0);
        String FIO = firstSign + "." + lastSign;
        return FIO;
    }
}
