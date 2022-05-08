public class Dog extends Animals {
    public Dog() {
    }

    public Dog(int age) {
//        super(age);
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void play(){
        System.out.println("狗玩球");
    }
}
