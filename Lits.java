//defolt explicet constractor


class Ak{
	  
	  
	     int a;
		 boolean b;
		 String amit;
		 
		 Ak(){
			   
			   
			   a=100;
			   b=true;
			   amit="kuili";
		 }
}

class Lits{
	 public static void main(String args[]){
		   Ak a1=new Ak();
		   Ak a2=new Ak();
		   Ak a3=new Ak();
		   
		   
		     System.out.println("a="+ a1.a);
			// System.out.println("b="+ a2.b);
			// System.out.println("amit="+a3.amit);
	 }
}