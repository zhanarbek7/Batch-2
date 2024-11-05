package day62.customException;

public class User {
    String email;
    String password;

    public User(String email, String password) {
        try{
            if(email.contains("@") && email.endsWith("@gmail.com")){
                this.email = email;
            }
            else{
                throw new InvalidEmailException("Email is invalid");
            }
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try{
            if(email.contains("@") && email.endsWith("@gmail.com")){
                this.email = email;
            }
            else{
                throw new InvalidEmailException("Email is invalid");
            }
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
