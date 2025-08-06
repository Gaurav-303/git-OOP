package day2;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (atIndex <= 0 || atIndex != lastAt || atIndex == email.length() - 1)
            return false;

        String local = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        int dotIndex = domain.indexOf('.');
        if (dotIndex <= 0 || dotIndex == domain.length() - 1)
            return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@gmail.com"));
        System.out.println(isValidEmail("invalid@com"));
        System.out.println(isValidEmail("bad@@mail.com"));
        System.out.println(isValidEmail("noatsymbol.com"));
    }
}
