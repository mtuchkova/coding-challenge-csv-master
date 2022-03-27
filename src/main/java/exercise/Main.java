package exercise;


import exercise.model.Contact;

import java.io.IOException;
import java.util.List;

import static exercise.model.Gender.FEMALE;

public class Main {

    public static final String FILE_NAME = "src/testdata/address-book.csv";

    public static void main(String[] args) throws IOException {
        FileParserService parserService = new FileParserService();
        AddressBookService addressBookService = new AddressBookService();

        List<List<String>> lines = parserService.readFromCsv(FILE_NAME);
        List<Contact> contacts = addressBookService.createContacts(lines);

        long femaleCount = addressBookService.getPersonCountByGender(contacts, FEMALE);
        System.out.println("Number of females inside address book: " + femaleCount);
    }
}
