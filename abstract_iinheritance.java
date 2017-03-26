

 abstract class GeometrikSekil{
   	 
  private String isim;

  public void isimBelirle(String isim){
    this.isim = isim;
  }
  

  public String isimGetir(){
    return isim;
  }

  public abstract double alanHesap();

}

  class ucgen extends GeometrikSekil{
  private double yukseklik;
  private double taban;

  public void bilgi(double yukseklik, double taban){
    isimBelirle("Üçgen");
    this.yukseklik = yukseklik;
    this.taban = taban;
  }

  public double alanHesap(){
    return (taban*yukseklik)/2;
  }
}

class yamuk extends GeometrikSekil{
  private double alt;
  private double ust;
  private double h;

  public void bilgi(double alt,double ust,double h){
    isimBelirle("Yamuk");
    this.alt = alt;
    this.ust = ust;
    this.h   = h;
  }

  public double alanHesap(){
    return (alt+ust)/2*h;
  }
}

class daire extends GeometrikSekil{
  private double yaricap;
  private final double pi = 3.14;

  public void bilgi(double yaricap){
    isimBelirle("Daire");
    this.yaricap = yaricap;

  }

  public double alanHesap(){
    return (pi*yaricap*yaricap);
  }
}


public class odev{
  public static void main(String args[]){
    ucgen a = new ucgen();
    yamuk b = new yamuk();
    daire c = new daire();
    a.bilgi(4.0,5.0);
    b.bilgi(4.0,2.0,5.0);
    c.bilgi(4.0);
    System.out.println("Geometrik Seklin ismi : "+a.isimGetir());
    System.out.println("Geometrik Seklin alanı : "+a.alanHesap());
    System.out.println("Geometrik Seklin ismi : "+b.isimGetir());
    System.out.println("Geometrik Seklin alanı : "+b.alanHesap());
    System.out.println("Geometrik Seklin ismi : "+c.isimGetir());
    System.out.println("Geometrik Seklin alanı : "+c.alanHesap());
  }
}



    
