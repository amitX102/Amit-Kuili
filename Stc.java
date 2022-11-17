class Stc{
	  public static void main(String args[]){
	  
	  
	      St.mul(20,30);
		  St.div(30,20);
		 System.out.println("div is"+ St.m);
		  System.out.println("div is"+ St.n);
	  
	  }
}

class St{
	 
	       static int m,n;
		   static int mul(int x, int y){
			      m=x+y;
				  return m;
		   }
		   
		   static int div(int x, int y){
			      n=x-y;
				  return n;
		   }
}