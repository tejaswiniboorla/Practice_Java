package day3;

class parent
{
	String house;

parent(String house)
{
	this.house=house;
	System.out.println("Parent");
}
}
class child extends parent
{
	String car;
	
void print()
{
	System.out.println(this.car+":"+this.house);
}
void show()
{
	System.out.println(super.house);
}
child(String house,String car)
{
super(house);
this.car=car;
{
	System.out.println("child");
}

}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child("3bhk","creta");
		
	}

}
}