public class get_set{
	private int value;
	private String name;
	public int getValue(){  //getter method
 	  return value;
  }
  public void setValue(int value){  //setter method
    this.value = value;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
   this.name = name;
  }
/*  public get_set(String str,int number){
    System.out.println("Constructor");
    setName(str);
    setValue(number);
   }*/
  public static void main(String args[]){
/*	 get_set cons = new get_set("Cons_Tunahan",20);
     System.out.println(cons.getName());
     System.out.println(cons.getValue());  */
     get_set object = new get_set();
		 object.setName("Tunahan");
		 object.setValue(20);
     System.out.println("Name : " +object.getName());
     System.out.println("Value : "+object.getValue());
  }
}
