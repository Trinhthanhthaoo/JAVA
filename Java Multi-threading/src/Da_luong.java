
public class Da_luong extends Thread{
private String ten;
public Da_luong(){
	
}
public Da_luong(String ten) {
	super();
	this.ten = ten;
}
@Override
public void run() {
	
	for(int i = 0 ;  i <= 10;i++){
		System.out.println(this.ten + i);
	}
	
}
public static void main(String[] args){
	Da_luong a = new Da_luong("A");
	Da_luong b = new Da_luong("B");
	Da_luong c = new Da_luong("C");
	a.start();
	b.start();
	c.start();
}

}
