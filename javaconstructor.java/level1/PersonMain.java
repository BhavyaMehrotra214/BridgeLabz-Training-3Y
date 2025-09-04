public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Aarav", 22);
        Person p2 = new Person(p1);


        p2.setName("Isha");
        p2.setAge(21);

        System.out.println("Original: " + p1);
        System.out.println("Copy: " + p2);
    }
}
