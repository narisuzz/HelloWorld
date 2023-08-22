package chuji;

public class sheyuan<N,A> {
    private N name;
    private A age;

    public sheyuan(N name, A age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

    public static void main(String[] args) {
        sheyuan<String, Integer> sheyuan = new sheyuan<>("哪吒",20);
        String name = sheyuan.getName();
        int age = sheyuan.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
