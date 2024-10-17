package day45.task3;

public class Main {
    public static void main(String[] args) {
        ContactApp contactApp = new ContactApp();
        Contact contact1 = new Contact("Joe", "77336341");
        Contact contact2 = new Contact("Alen", "2545469834");
        Contact contact3 = new Contact("Sophia", "2512339534");
        contactApp.addContact(contact1);
        contactApp.addContact(contact2);
        contactApp.addContact(contact3);

        contactApp.removeContact("Max");

        contactApp.findByName("Max");
        contactApp.findByName("Alen");

        contactApp.updateName("Alen", "Java");
    }
}
