package Introduction;
//Run method's return type is void and it does not return any value. So how to return or get value from the thread?
public class Returning_Result implements Runnable {
	int id;
	double resultVal;
	
	public Returning_Result(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	

	public void run() {
		double result = 0;
		for(int i =0; i< 1000000; i++) {
			result = result+Math.random();
		}
		System.out.println(id+"Thread result ="+ result);
		System.out.flush();
		resultVal = result;
	}
	
	static void example() throws InterruptedException{
		Thread[] thread = new Thread[8];
		Returning_Result[] runnables = new Returning_Result[8];
		
		for(int t = 0; t< 8;t++) {
			runnables[t] = new Returning_Result(t);
			thread[t] = new Thread(runnables[t]);
			thread[t].start();
		}
		//Now access the values of resultVal which were set by the thread.
		//join the threads
		for(int t =0; t<8;t++) {
			//throws Interrupted Exception.
			thread[t].join();
			System.out.println("Joined with threads" + runnables[t].id + "result = "+runnables[t].resultVal);
		}
		
	}
	public static void main(String[] args) {
		try {
			example();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
/**
 * 
 * 1Thread result =499794.45650465094
5Thread result =499855.1955137221
4Thread result =500242.54908929305
2Thread result =499622.6482771563
3Thread result =499836.25449917413
6Thread result =500147.3330670578
0Thread result =500141.1925079086
Joined with threads0result = 500141.1925079086
Joined with threads1result = 499794.45650465094
Joined with threads2result = 499622.6482771563
Joined with threads3result = 499836.25449917413
Joined with threads4result = 500242.54908929305
Joined with threads5result = 499855.1955137221
Joined with threads6result = 500147.3330670578
7Thread result =500226.34884673
Joined with threads7result = 500226.34884673
 * 
 * 
 * 
 * 
 * 
 * */
