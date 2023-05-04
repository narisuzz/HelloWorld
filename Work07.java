public class Work07 {
	public static void main(String[] args) {
		Music music = new Music("abcdefg",200);
		music.play();
	}
}
/*定义Music类 里面有音乐名 name，音乐时长times属性 并有播放play功能和返回
 * 本身属性信息的功能方法getlnfo
 * */
 class Music {
	 String name;
	 int times;
	 public Music(String name,int times) {
		 this.name = name;
		 this.times = times;
	 }
	 public void play() {
		 System.out.println("音乐" + name +"正在播放中，，，，，时长为"
				 + times + "秒");
	 }
 }
