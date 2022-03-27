package exercise.model;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {

    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;


    public Contact(String name, Gender gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && gender == contact.gender && Objects.equals(dateOfBirth, contact.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, dateOfBirth);
    }
}
