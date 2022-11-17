//local variable and instance variable

class A{
	     int i=20;
		 void fun(){
			     i=100;
		  System.out.println("The valu of i is"+ i);
		 }
}
class Tance{
	   public static void main(String args[]){
		       A a=new A();
			   a.i=30;
			   System.out.println("The value of i is"+ a.i);
			   a.fun();
	   }
}
			   