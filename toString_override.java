class Sınıf{
	String ad = "Ahmet";
	String soyad = "Ser";
	int yas = 14;
	int a,b;

/*	public Sınıf(int k, int j){
		a= k;
		b=j;
		System.out.println("Sınıf a ve b değeleri:"+a+","+b);
	}  */
	 public String toString(){
	 	return "Ad:"+ad+"  soyad :"+soyad+"  yas:"+yas;
	 }
}

/* class Inheritiance extends Sınıf{
	int z;
	public Inheritiance(int k,int j,int c){
		super(k,j);
		z = c;
		System.out.println("Inheritiance :" +z);
	}
} */

public class Exercise_2{
public static void main(String args[]){
     Sınıf s1 = new Sınıf();
     System.out.println(s1);
   //  Inheritiance s2 = new Inheritiance(1,2,3);
 }
} 
