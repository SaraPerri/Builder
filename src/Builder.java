public class Builder {
    final String firstName;
    final String lastName;
    int age = 0;
    String address = "";

    public Builder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
