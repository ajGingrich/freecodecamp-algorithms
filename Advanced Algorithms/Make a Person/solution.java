public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person("Bob Ross");
        System.out.println(p.getFirstName());
    }
}

public class Person {
    private String firstName;
    private String lastName;

    Person(String fullName) {
        this.firstName = fullName.split(" ")[0];
        this.lastName = fullName.split(" ")[1];
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLasttName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public void setFullName(String firstAndLast) {
        this.firstName = firstAndLast.split(" ")[0];
        this.lastName = firstAndLast.split(" ")[1];
    }
}