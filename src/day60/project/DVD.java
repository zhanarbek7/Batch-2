package day60.project;

public class DVD extends LibraryItem{
    private String director;

    public DVD(int id, String title, int year, String director) {
        super(id, title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getYear() + ", "
                + getDirector();
    }
}
