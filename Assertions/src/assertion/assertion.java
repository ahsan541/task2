package assertion;

import java.util.Scanner;

public class assertion {
	int balance=1000000;
	public void deposit(int amount){
		int old=balance;System.out.println(+balance);
		System.out.println(+balance);
		
		
		balance+=amount;
		assert balance>old :"lun is in correct";System.out.println(+balance);
		
		
		
		
		
		
	}
	public void widdraw(int amount) throws Exception{
		int old=balance;
		System.out.println(+balance);
		System.out.println(+balance);
		
		balance-=amount;
		assert balance<old :"Loic is in correct";
		
	System.out.println(+balance);
		
		
		
	}
	
	
	
	
	public static void main(String d[]){
		
		
		assertion a=new assertion();
		a.deposit(10000);
	
		int amount=0;
		
		Scanner in= new Scanner(System.in);
	try{
		System.out.println("it trows exception");	a.widdraw(100000);
			amount=in.nextInt();
			assertion b=new assertion();
			a.deposit(10000);
			throw new Exception ("Enter the correct value"+amount);
			
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		
	}

}
