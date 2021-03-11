package Creational.Builder.Person;

public class MainTest {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                //.score(20)
                .weight(200)
                //.loc("bj", "23")
                .build();

        System.out.println(p);
    }
}
