import static java.time.LocalDateTime.now;

public class PersonBinding implements  SecondInterf{
    FirstInterf sourceClass;

    public PersonBinding(FirstInterf sourceClass) {
        this.sourceClass = sourceClass;
    }

    @Override
    public String getPersonalInfo() {
        return sourceClass.getFullName() + " " +(now().getYear() - sourceClass.getBornDate().getYear());
    }
}
