import java.util.Scanner;
class palindrom1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=num/100;
		int b=num%100;
		int c=b%10;
		if(a==c)
		{
			System.out.println("The number is palindrom.");
		}
		else{
			System.out.println("The number is not palindrom.");
		}
		sc.close();
	}
}