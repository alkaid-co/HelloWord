import java.util.Objects;

public class Animals {
    public int age = 4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age;
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(age);
    }*/

    public Animals() {
    }

    public Animals(int age) {
        this.age = age;
    }

    public static void sta() {
        System.out.println("static");
    }

    public void eat() {
        System.out.println("动物吃食物");
    }

}
