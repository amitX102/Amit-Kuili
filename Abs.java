//acces modiferar 2->>abstract 


abstract class Lt{
	  public void swin(){
		      boolean a=true;
	  }
	  abstract public double price();
}

class Lps extends Lt{
	    double t;
	    public double price(){
			  t=4.5;
			  return (t);
		}
}
class Abs{
	  public static void main(String args[]){
		    Lps ps=new Lps();
			ps.price();
			ps.swin();
			
			System.out.println("The valu of t is "+ ps.t);
			//System.out.println("The valu of t is "+ ps.swin);
	  }
}
