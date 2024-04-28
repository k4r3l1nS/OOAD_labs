import java.time.LocalDate;

public class Main12 {
    public static void main(String[] args) {
        FirstInterf person = new Person("aa", "bb", "cc" , LocalDate.parse("2000-01-01"));
        showPersonInfo(new PersonBinding(person));
    }

    public static void showPersonInfo (SecondInterf person){
        System.out.println(person.getPersonalInfo());
    }
}
