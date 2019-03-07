package Introduction;

class Stutterer extends Thread{	 
	static final int ITERS = 100;
    private String m;
	
	public Stutterer(String m){ 
		this.m = m;  
	}
	
	//overrides run method @Override 	
   public void run()
	{  for (int i = 0; i != ITERS; i++)
		{  System.out.println(m);  }
	}
}

//class Talk2
//{	public static void main(String[] args){
// //create two Thread objects	
//     Thread s = new Stutterer("Go ");    
//	  Thread t = new Stutterer("Gators");
//  //start the threads
//	   s.start();  
//	   t.start();    
//   }
//}
