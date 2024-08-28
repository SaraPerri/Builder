public class Main {
    public static void main(String[] args) {
            Person person1 = new Builder("Sara", "Perri")
                    .age(27)
                    .address("Via ACaso 3")
                    .build();
            Person person2 = new Builder("Marco", "Scrofani")
                    .build();
            System.out.println(person1);
            System.out.println(person2);
    }
}