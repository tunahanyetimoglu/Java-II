abstract class Sporcu{
	private int maas;
	private String kulup;
	private int basarı_sırası;

	void bilgiAl(int maas,String kulup,int basarı_sırası){
		this.maas = maas;
		this.kulup = kulup;
		this.basarı_sırası = basarı_sırası;
	}

	void yazdır(){
		System.out.println("Maaş : "+maas+"\t"+"Kulubu : "+kulup+"\t"+"Başarı sırası: "+basarı_sırası);
	}
}

class Basketbolcu extends Sporcu{

	public Basketbolcu(){
		bilgiAl(1000,"Golden State",1);
		yazdır();
	}
}

class Futbolcu extends Sporcu{

	public Futbolcu(){
		bilgiAl(500,"Fenerbahce",5);
		yazdır();
	}
}

class Voleybolcu extends Sporcu{
	public Voleybolcu(){
		bilgiAl(450,"Çanakkale",6);
		yazdır();
	}
}

public class abstract_class{
	public static void main(String args[]){
		Basketbolcu a = new Basketbolcu();
		Voleybolcu b = new Voleybolcu();
		Futbolcu c = new Futbolcu();
	}
}
