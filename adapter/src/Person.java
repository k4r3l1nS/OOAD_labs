import java.time.LocalDate;

public class Person implements FirstInterf{
    String firstName;
    String lastName;
    String patronymic;
    LocalDate birthday;

    public Person(String firstName, String lastName, String patronymic, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName + " " +  patronymic;
    }

    @Override
    public LocalDate getBornDate() {
        return birthday;
    }
}
