package day63.library;

public class Teacher extends Person{
    private String subject;

    public Teacher(int personId, String name, int maxBooksAllowed, String subject) {
        super(personId, name, maxBooksAllowed);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
