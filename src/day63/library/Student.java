package day63.library;

public class Student extends Person{
    private String favoriteSubject;

    public Student(int personId, String name, int maxBooksAllowed, String favoriteSubject) {
        super(personId, name, maxBooksAllowed);
        this.favoriteSubject = favoriteSubject;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }
}
