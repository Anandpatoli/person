import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class person {
    private String name;
    private Date dateOfBirth;

    public person(String name) {
        this.name = name;
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void setDOB(String dobString) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.dateOfBirth = formatter.parse(dobString.replace(" ", "-"));
    }

    public void displayAge() {
        if (dateOfBirth != null) {
            long ageInMillis = new Date().getTime() - dateOfBirth.getTime();
            long years = ageInMillis / (1000L * 60 * 60 * 24 * 365);
            System.out.println("Age: " + years + " years");
        } else {
            System.out.println("Date of birth not set.");
        }
    }
}