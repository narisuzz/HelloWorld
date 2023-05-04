public class Work02 {
	public static void main(String[] args) {
		Book book = new Book("笑傲江湖",300);
		book.info();
		book.updatePrice();
		book.info();
		
	}
}
 /*编写Book 定义方法 updateprice 实现更改某本书的价格
具体 如果价格>500 则更改为150 如果价格>100 更改为100 否则不变
分析
1。类名 Book
2.属性 peice name
3.方法名 updateprice
4。形参 （）
5.返回值 void
6.提供一个构造器
*/
 class Book {
	 String name;
	 double price;
	 public Book(String name,double price) {
		 this.name = name;
		 this.price = price; 
	 }
	 public void updatePrice() {
		 if(this.price > 150) {
			this.price = 150;
		 } else if(this.price > 100) {
			 this.price = 100;
		 }
	 }
	 public void info() {
		 System.out.println("书名"+ this.name + "书价" + this.price);
	 }
 }