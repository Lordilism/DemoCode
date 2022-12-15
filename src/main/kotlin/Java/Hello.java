package Java;

public class Hello {
    public static void main(String[] args) {
        Person person= new Person("");
        person.setName("Daemon");
        String name = person.getName();
        new Person("").setName("");
//        person.setName("U kar");
        String newName= new Person("").getName();

        System.out.println(newName);

    }
}
