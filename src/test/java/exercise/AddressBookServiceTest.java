package exercise;


import exercise.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static exercise.model.Gender.MALE;

class AddressBookServiceTest {

    private final AddressBookService addressBookService = new AddressBookService();

    @Test
    public void createContacts() {
        //given
        List<String> line = List.of("Jon", "Male", "1985-03-09");

        //when
        List<Contact> result = addressBookService.createContacts(List.of(line));

        //then
        Assertions.assertEquals(result.size(), 1);
        Assertions.assertEquals(result.get(0), new Contact("Jon", MALE, LocalDate.parse("1985-03-09")));
    }
}
