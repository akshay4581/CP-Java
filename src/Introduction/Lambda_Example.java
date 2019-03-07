package Introduction;

//Using of Lambda instead of runnable
public class Lambda_Example {
	public static void main(String[] args) {
		Thread[] threads = new Thread[8];
		for(int i =0; i< threads.length;i++) {
			
			//id needs to be final as lambda can only access variables which are in scope and which are final
			
			final int id = i;
			threads[i] = new Thread(
					//lambda expression which prints the id
					() -> System.out.println("Thread"+id+"Hello World")
					);
			
			//starting the threads
			//Using Lambda using of Runnable and overriding run function can be avoided.
			threads[i].start();
		}
	}
}
/**
Thread0Hello World
Thread1Hello World
Thread3Hello World
Thread5Hello World
Thread4Hello World
Thread6Hello World
Thread2Hello World
Thread7Hello World
**/