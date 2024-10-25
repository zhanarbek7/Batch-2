package day55teacher;

interface Constants {
    // This is implicitly public, static, and final
    int MAX_USERS = 100;
}

class App implements Constants {
    void checkUsers(int users) {
        if (users > MAX_USERS) {
            System.out.println("Exceeds maximum users");
        }
    }
}
