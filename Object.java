public class Object{
	public static void main(String[] args) {
	
	cat cat1 = new cat();//创建一只毛
	cat1.name = "小白";
	cat1.age = 3;
	cat1.color = "白色";
	
	cat cat2 = new cat();
	cat2.name = "小花";
	cat2.age = 100;
	cat2.color = "花色";
	System.out.println( "第1只猫的信息" + cat1.name + cat1.age +  cat1.color);
	System.out.println( "第2只猫的信息" + cat2.name + cat2.age +  cat2.color);
	}
}
class cat {
	String name;
	int age;
	String color;
}