import java.util.Scanner;
import java.util.Random;
import java.io.*;

class Hospital{
    Random rand = new Random();
    int id;
    String name;
    String department;
    static Hospital[] patient = new Hospital[1000];    
    static int num =0;
    String hospitalName = "   Christian Medical College   "
    Hospital(){
        this.id = rand.nextInt(1000);
        this.name = "New Patient";
        this.department="New Depeartment";
    }
    Hospital(String name , String department){
        this.id =  rand.nextInt(1000);
        this.name = name;
        this.department = department;
    }
    static void search(int ids){
        int i,flag=0;
       
        for(i=1;i<=num;i++){
            if(patient[i].id==ids){
                 System.out.println("\n--------------------------\n");
                System.out.println("Patient id: "+patient[i].id);
                System.out.println("Patient Name: "+patient[i].name);
                System.out.println("Patient Department: "+patient[i].department);
                System.out.println("Hospital Name: "patient[i].hospitalName.trim());
                flag=1;
                System.out.println("\n--------------------------\n");
                break;
            }
        }

        if(flag==0){
            System.out.println("id Not Found");
        }
    }
   static void search(String deps){
       int i,flag=0;
       
        for(i=1;i<=num;i++){
            if(patient[i].department.equals(deps)){
                 System.out.println("\n--------------------------\n");
                System.out.println("Patient id: "+patient[i].id);
                System.out.println("Patient Name: "+patient[i].name);
                System.out.println("Patient Department: "+patient[i].department);
                flag=1;
                System.out.println("\n--------------------------\n");
            }
        }

        if(flag==0){
            System.out.println("Department Not Found");
        }

    }
    static void search(int ids ,String na){
        int i,flag=0;
        for(i=1;i<=num;i++){
            if((patient[i].name.equals(na))&&(patient[i].id==ids)){
                 System.out.println("\n--------------------------\n");
                System.out.println("Patient id: "+patient[i].id);
                System.out.println("Patient Name: "+patient[i].name);
                System.out.println("Patient Department: "+patient[i].department);
                flag=1;
                System.out.println("\n--------------------------\n");
                break;
            }
            
        }

        if(flag==0){
            System.out.println("Sorry Not Found");
        }
    }

    public static void main(String[] args){
        char ch;
        String deps,na;
        int res,i,res1,ids;
        Scanner sr = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{ 
            System.out.println("------Hospital Database------");
			System.out.println("1-Enter New Patient Detials");
			System.out.println("2-Display Old Patient Details");
            System.out.println("3-Search");
            System.out.println("--------------------------");
            res = sr.nextInt();
            switch(res){
                case 1: num = num+1; 
                       
                        System.out.println("------New Patient------");
                        System.out.print("Enter Patient Name: ");
                       /* patient[num].name*/ String nam = sr.next();
                        System.out.print("Enter Patient Department: ");
                        /*patient[num].department*/String deepa= sr.next();
                        patient[num] = new Hospital(nam,deepa);
                        System.out.println("\n--------------------------\n");
                        break;
                case 2:     System.out.println("\n--------------------------\n");
                            for(i=1;i<=num;i++){
                            System.out.println("Patient id: "+patient[i].id);
                            System.out.println("Patient Name: "+patient[i].name);
                            System.out.println("Patient Department: "+patient[i].department);
                            System.out.println("\n--------------------------\n");
                            }
                        break;
                case 3: System.out.println("------Hospital Database------");
			            System.out.println("1-Search By Id");
			            System.out.println("2-Search by Name And id");
                        System.out.println("3-Search By Department");
                        System.out.println("--------------------------");
                        res1 = sr.nextInt();
                        switch(res1){
                            case 1: System.out.print("Enter Patient Id: ");
                                    ids = sr.nextInt();
                                    search(ids);
                                    break;
                            case 2: System.out.print("Enter Patient Id: ");
                                    ids = sr.nextInt();
                                    System.out.print("Enter Patient Name: ");
                                    na = sr.next();
                                    search(ids,na);
                                    break;
                            case 3: System.out.print("Enter Patient Department: ");
                                    deps = sr.next();
                                    search(deps);
                                    break;
                        }
            }
            System.out.println("Enter Y/y to Continue: ");
		    ch = sr.next().charAt(0);
        }while((ch=='y')||(ch=='Y'));       
    }
}

//edited
