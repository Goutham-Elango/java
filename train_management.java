import java.util.*;
class train{
    static Random rand = new Random();
    int no=rand.nextInt(10000);
    int coach=1;
    String train_name;
    int no_of_passengers=(this.coach*5);
    int count_passenger=0;
    int available_tickets = no_of_passengers-count_passenger;
    train(String train_name,int coach){
        this.train_name=train_name;
        this.coach=coach;
        this.no = this.no ;
        this.no_of_passengers =this.coach*5;
        this.count_passenger=0;
        this.available_tickets=this.no_of_passengers-this.count_passenger;
    }
    train(){

    }
}
class passenger{
    static Random rand = new Random();
    int pnr = rand.nextInt(1000000);
    String pr_name;
    int age;
    int train_noo;
    passenger(int train_noo,String name,int age){
        this.train_noo=train_noo;
        this.pr_name=name;
        this.age=age;
        this.pnr=this.pnr;
    }
    passenger(){

    }
    
}
class passengertrain extends passenger {
     passengertrain(int train_details,String name,int age){
        super(train_details,name,age);
        
    }

    passengertrain(){

    }               
}

class pro6{
    static train[] objtrain = new train[10000];
    static train temp = new train();
    static passengertrain[] objpassenger = new passengertrain[10000];
    static passengertrain temp1 = new passengertrain();
    static Scanner sr = new Scanner(System.in);
    static int Count_train=0,count_p=0;


    static void add_train(){
        int i;
        Count_train = Count_train+1;

        System.out.print("Enter Train Name: ");
        temp.train_name = sr.next();
        System.out.print("Enter Number Of Coach: ");
        temp.coach = sr.nextInt();
        objtrain[Count_train] = new train(temp.train_name,temp.coach);

    }
    static void view_train(){
        int i;
        System.out.println("----------------------------\n");
        for(i=1;i<=Count_train;i++){
        System.out.println("Train Number: "+objtrain[i].no);
        System.out.println("Train Name: "+objtrain[i].train_name);
        System.out.println("Number Of Coach: "+objtrain[i].coach);
        System.out.println("Number Of Total Tickets: "+objtrain[i].no_of_passengers);
        System.out.println("Number Of Available Tickets: "+objtrain[i].available_tickets);
         System.out.println("----------------------------\n");
        }
         
    }
    static int get_tickets(){
        count_p = count_p+1;
        int id,i,ag,flag=0,k;
        String na;
        view_train();
        System.out.print("Select the train: ");
        id=sr.nextInt();
        for(k=1;k<=Count_train;k++){
            if(objtrain[k].no==id){
                   flag=1;
                }
            }
       if(flag==0){
            System.out.println("Invalid Train Number!");
                     return 1;
        }
        for(i=1;i<=Count_train;i++){
            if(objtrain[i].no==id){
                if(objtrain[i].available_tickets==0){
                    System.out.println("Sorry!");
                     return 1;
                   
                }
            }
        }
        System.out.print("Enter Passenger Name: ");
        na= sr.next();
        System.out.print("Enter Passenger Age: ");
        ag=sr.nextInt();
        for(i=1;i<=Count_train;i++){
            if(objtrain[i].no==id){
                objtrain[i].count_passenger += 1;
                objtrain[i].available_tickets=objtrain[i].no_of_passengers-objtrain[i].count_passenger;
            }
        }
        objpassenger[count_p] = new passengertrain(id,na,ag);
        return 0;
    }

    static void get_details(){
        int j,i;
        System.out.println("----------------------------\n");
        for(i=1;i<=count_p;i++){
        System.out.println("PNR: "+objpassenger[i].pnr);
        System.out.println("Passenger Name: "+objpassenger[i].pr_name);
        System.out.println("Passenger Age: "+objpassenger[i].age);
        System.out.println("Passenger Train No: "+objpassenger[i].train_noo);
        for(j=1;j<=Count_train;j++){
            if(objtrain[j].no==objpassenger[i].train_noo){
                System.out.println("Train Name: "+objtrain[j].train_name);
            }
        }
        System.out.println("----------------------------\n");
        }
    }

     public static void main(String[] args){
        char ch;
        int res,fl;
        do{
            System.out.println("-----Railway System-----");
            System.out.println("1)Add Train");
            System.out.println("2)View Train");
            System.out.println("3)Get Tickets");
            System.out.println("4)View Passenger Details");

            res = sr.nextInt();
            switch(res){
                case 1: add_train();
                        break;
                case 2:view_train();
                        break;
                case 3:fl=get_tickets();
                        break;
                case 4:get_details();
                        break;

            }
     System.out.println("Enter Y/y to Continue: ");
		    ch = sr.next().charAt(0);
        }while(ch =='y'); 



     }
}

