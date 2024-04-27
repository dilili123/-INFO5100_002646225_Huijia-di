import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        testPatterns();
    }

    public static void testPatterns() {
        validatePattern("Email", "name@name.com", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", "huijiamail@.com");
        validatePattern("Phone Number", "925-519-7493", "^\\d{3}-\\d{3}-\\d{4}$", "466-65-8589");
        validatePattern("URL", "https://www.example.com", "https?://(www\\.)?example\\.com", "http://www.huija.com");
        validatePattern("Date (MM/dd/yyyy)", "08/20/1995", "^\\d{2}/\\d{2}/\\d{4}$", "03/25/24");
        validatePattern("Number", "657754.44", "^[0-9]*\\.?[0-9]+$", "123.abc");
    }

    public static void validatePattern(String type, String testString, String pattern, String badString) {
        System.out.println("Testing " + type);
        System.out.println("Pattern: " + pattern);
        System.out.println("Test String: " + testString);
        System.out.println("Result: " + testString.matches(pattern));

        System.out.println("Negative Test String: " + badString);
        System.out.println("Negative Result: " + !badString.matches(pattern));
        System.out.println();
    }
}
