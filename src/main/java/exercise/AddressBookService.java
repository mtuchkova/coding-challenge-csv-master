package exercise;

import exercise.model.Contact;
import exercise.model.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    public List<Contact> createContacts(List<List<String>> lines) {
        List<Contact> contacts = new ArrayList<>();
        for (List<String> line : lines) {
            String name = line.get(0);
            Gender gender = Gender.valueOf(line.get(1).toUpperCase());
            LocalDate dateOfBirth = LocalDate.parse(line.get(2));
            contacts.add(new Contact(name, gender, dateOfBirth));
        }
        return contacts;
    }

    public long getPersonCountByGender(List<Contact> contacts, Gender gender){
       return contacts.stream().filter(it -> it.getGender() == gender).count();
    }
}
