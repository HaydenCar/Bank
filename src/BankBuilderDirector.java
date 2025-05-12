import java.util.TimeZone;

public class BankBuilderDirector {
    public static Bank getDefaultBank() {
        return new Bank.Builder()
                .build();
    }

    // An example such as for countries using different timezones
    public static Bank getBankJPTimezone() {
        TimeZone jp = TimeZone.getTimeZone("Asia/Tokyo");
        return new Bank.Builder()
                .setTimeZone(jp) // Optional setter
                .build();
    }

    /*
    HERE I COULD FOR EXAMPLE MAKE A BANK WITH A SPECIFIC ATTRIBUTES WITHOUT AS MUCH EFFORT
    public static Bank getBankWithXAttribute(XAttribute) {
    }
    */
}
