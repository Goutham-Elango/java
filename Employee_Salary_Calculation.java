//java
import java.util.*;
import java.io.*;
class program1{
	int id;
	String name;
	String des;
	float salary;
	float hra,da,pf,pt,np;
	public static void main(String[] args){
		System.out.println("Hello");
		Scanner sr = new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
		System.out.println("Enter Number Of Employees:");
		int num = sr.nextInt();
		char ch;
		int i;
		int flag = 0;
		program1[] emp= new program1[num];
				for(i =0;i<num;i++){
					emp[i] = new program1();
				}
		do{
			System.out.println("Employees Record");
			System.out.println("1-Enter Employee Details");
			System.out.println("2-Display Employee Details");
			int res = sr.nextInt();
				
			switch(res){
				case 1:if(flag==0){
						for(i=0;i<num;i++){
						System.out.print("Enter id:");
						emp[i].id = sr.nextInt();
						System.out.print("Enter Name:");
						emp[i].name = sr.next();
						System.out.print("Enter Designation:");
						emp[i].des = sr.next();
						System.out.print("Enter Basic Salary");
						emp[i].salary = sr.nextInt();
						emp[i].da = emp[i].salary*0.4f;
						emp[i].hra = 2500;
						emp[i].pf = emp[i].salary*0.04f;
						emp[i].pt = 100;
						emp[i].np=emp[i].salary+emp[i].da+emp[i].hra+emp[i].pf+emp[i].pt;
						flag=1;
						}
						break;}
						else{
						System.out.println("Already Created!");
						break;}
				case 2: for(i=0;i<num;i++){
							System.out.println("Id : "+emp[i].id);
							System.out.println("Name: "+emp[i].name);
							System.out.println("Designation : "+emp[i].des);
							System.out.println("Basic Salary: "+emp[i].salary);
							System.out.println("DA : "+emp[i].da);
							System.out.println("HRA: "+emp[i].hra);
							System.out.println("PF : "+emp[i].pf);
							System.out.println("PT: "+emp[i].pt);
							System.out.println("Net Pay: "+emp[i].np);
							}break;
				}
		System.out.println("Enter Y/y to Continue: ");
		 ch = sr.next().charAt(0);
		}while((ch=='y')||(ch=='Y'));
		
	}
}
