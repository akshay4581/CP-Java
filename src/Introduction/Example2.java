package Introduction;

class Print1 implements Runnable{
	int id;
	Print1(int id){
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Thread"+id+": Hello World");
	}
	
}
public class Example2 {
	static final int NUM_THREADS = 8;
	static void exp() {
		Thread[] thread = new Thread[NUM_THREADS];
		for(int t =0; t< NUM_THREADS; ++t) {
			thread[t] = new Thread(new Print1(t));
			thread[t].start();
		}
		
	}
//	public static void main(String[] args) {
//		exp();
//	}


}
