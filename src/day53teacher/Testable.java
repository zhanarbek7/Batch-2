package day53teacher;

// Testable interface
public class Testable {
    void testSearchBox(){

    }
}
// Implementation for WebApp
class WebAppTest extends Testable {
    public void testSearchBox() {
        System.out.println("Selenium is used to test searchbox on the Chrome browser");
    }
}
// Implementation for MobileApp
class MobileAppTest extends Testable {
    public void testSearchBox() {
        System.out.println("Apium is used to test searchbox on the Chrome browser");
    }
}
// Implementation for APITests
class APITest extends Testable {
    public void testSearchBox() {
        System.out.println("Rest Assured");
    }
}

// TestRunner class
class TestRunner {
    public void executeTests(Testable test) {
        test.testSearchBox(); // Dynamic method resolution
    }
}

// Usage
class MainTestable {
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        Testable webTest = new WebAppTest();
        Testable mobileTest = new MobileAppTest();
        Testable apiTest = new APITest();

        runner.executeTests(webTest);  // Output: Running web application tests...
        runner.executeTests(mobileTest); // Output: Running mobile application tests...
        runner.executeTests(apiTest);    // Output: Running API tests...
    }
}

