package vendingMachine;
import java.util.*;

class Products {
double price;
String name;
static Products p[]=new Products[5];
Products(String name,double price)
{
	this.name=name;
	this.price=price;
}
public double getPrice() {
	return price;
}
public String getName() {
	return name;
}
}
public class VendingMachine  extends Products {
	static int count=0;
	VendingMachine(String name, double price) {
		super(name, price);
	}
	static Products[] k=new Products[5];
static void displayProducts()
{
	System.out.println("Available Products and their Prices in rupees from Vending Machine");
	System.out.println("=============================================================================");
	for(int i=0;i<5;i++)
	{
		System.out.println(i+1+". "+p[i].getName()+"		"+p[i].price);
	}
}
static void addItemsToCart(String choice,int n)
{
	for(int i=0;i<5;i++)
	{
		if(p[i].name.equalsIgnoreCase(choice))
		{
			k[count]=p[i];
			k[count].price=p[i].price*n;
			count++;
		}
			
	}
}
static void showCart(int count)
{
	if(count>0)
	{
	System.out.println("Please find your cart with the products you have selected and their prices based on the selected quantity of each brand of drink");
	for(int i=0;i<count;i++)
	{
		System.out.println(i+1+". "+"Product Name : "+k[i].getName()+"	"+"	total price : "+k[i].price);
	}
	VendingMachine.showPayment(count);
}
}
static void showPayment(int count)
{
	System.out.println("Below are the payment methods available");
	System.out.println("1. Crad");
	System.out.println("2. Cash");
	System.out.println("Please provie your choice of payment method");
	System.out.println("Note you have to pay the double amount of actual payment if you select the payment method as Card");
	Scanner p= new Scanner(System.in);
	String paymentMethod;
	paymentMethod=p.nextLine();
	double totalPayment=0.00;
	if(paymentMethod.equalsIgnoreCase("Card"))
	{
	for(int i=0;i<count;i++)
	{
		totalPayment=totalPayment+k[i].price;
		
	}
	totalPayment=totalPayment*2;
	System.out.println("Dear customer your total bill is");
	System.out.println(totalPayment+"rupees");
	System.out.println("Thanks for the payments. Visit us again");
	}
	else if(paymentMethod.equalsIgnoreCase("Cash"))
	{
		for(int i=0;i<count;i++)
		{
			totalPayment=totalPayment+k[i].price;
		}
		System.out.println("Dear customer your total bill is");
		System.out.println(totalPayment+"rupees");
		System.out.println("Thanks for the payments. Visit us again");
	}
	else
	{
		System.out.println("Invalid Payment option");
}
}
public static void main(String arg[])
{
	p[0]=new Products("Pepsi",20.00);
	p[1]=new Products("Thums-Up",30.00);
	p[2]=new Products("Sprite",10.00);
	p[3]=new Products("Coca-Cola",40.00);
	p[4]=new Products("Fanta",25.00);
	VendingMachine.displayProducts();
	VendingMachine.selectItems();
	VendingMachine.showCart(count);
}
static void selectItems()
{
	System.out.println("Vending Machine has total 5 brands of drinks as listed above. Please provide how many brands of drinks  you want to purchase. You can also buy the multiple drinks from the same brand");
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int items;
	System.out.println("Please provide the brand names those you want to purchase to add them in your cart");
	String str[]=new String[5];
	for(int i=0;i<n;i++)
	{
		str[i]=s.next();
		System.out.println("Please provide how many "+str[i]+" bottles you want to purchase");
		items=s.nextInt();
		VendingMachine.addItemsToCart(str[i],items);
	if(i<n-1)
		System.out.println("Please select next brand of drink you want");
	else
		break;
	}
	
}

}

