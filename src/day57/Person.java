package day57;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("Person object is  created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18){
            this.age = age;
            System.out.println("Age is assigned successfully");
        }
        else{
            System.out.println("Is not valid for voting");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("MALE") || gender.equals("FEMALE")){
            this.gender = gender;
        }
        else{
            System.out.println("Not valid gender");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
    }

    public String toString(){
        return name + " " + age + " " + gender;
    }
}