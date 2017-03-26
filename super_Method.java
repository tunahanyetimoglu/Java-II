class Sınıf{
	int x,y;
	public Sınıf(int a, int b){
		x = a;
		y = b;

	}

	void yazdir(){
		System.out.println("x ve y değerleri : "+x+","+y);
	}
}

class Deneme extends Sınıf{
	int k;
	public Deneme(int a,int b, int z){
		super(a,b);
		k = z;
	}
	void yazdir(String t){
		System.out.println(t + k);
	}
}
  public class super_Method{
  	public static void main(String args[]){
  		Deneme a = new Deneme(1,2,3);
  		a.yazdir("Respect :");
  		a.yazdir();
  		
  	}
  }
