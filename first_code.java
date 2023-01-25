
class Cal{
	int a=12;
	int b=22;
	int c=12;
	float ope(float i,int j) {
	 return i*j;	
	}
	int ope(int i,int j) {
		
     return i+j;
	}
	

}





public class Calc1 {

	public static void main(String[] args) {
	 Cal obj1= new Cal();
	 System.out.println(obj1.ope(23,44));
	}

}
