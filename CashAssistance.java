import java.util.*;
class cashAssistance{
	private int studIdNum;
	private String sname;
	private int age;
	private int income;
    private String gender;
	private double cont;


	
	cashAssistance(int studIdNum, String sname, int age, String gender,int income,double cont) {
		this.studIdNum = studIdNum;
		this.sname = sname;
		this.age = age;
		this.income = income;
		this.gender = gender;
		this.cont = cont;
		
    }
	
	public int getstudIdNum(){
		return studIdNum;
	}
	public int getAge(){
	    return age;
	}
	public int getIncome(){
		return income;
	}
	public String getName(){
		return sname;
	}
	public String getGender(){
	    return gender;
	}
	public double getConT(){
	    return cont;
	}
	public String toString(){	
		return studIdNum +"\t "+ sname + "\t "+ age + "\t"+income + "\t" + gender + "t" + cont;
    }
}
class Main {
	public static void main(String[] args) {
        System.out.println("===================================================");
		System.out.println("||        College Cash Assistance System         ||"); 
		
        Main m = new Main();
        m.OpenP();
    }
    public void OpenP(){
		//for String
		Scanner input = new Scanner(System.in);
		
		this.display("===================================================");
		this.display("||          [S] - Student                        ||");
		this.display("||          [A] - Admin                          ||");
	    this.display("===================================================");         
              String choice= this.inputText("Enter your Choice:");
               switch(choice){
                   case "S":this.StudenT();
                   case "A":
                   default:{
                    System.out.println("!...INVALID ENTRY...!");
                this.OpenP();
                   }
               }

			     }
		
	public void StudenT(){
        this.display("[L] - Log In\n[E] - Exit\n");
        String input = this.inputText("Enter your Choice: ");
        switch(input){
            case "L" : this.LogIn();
            case "E" :this.StudentR();
            this.display("You have Successfully Exited");
            System.exit(0);
            case "":
            
         
            default:{
                System.out.println("!...INVALID ENTRY...!");
                this.StudenT();
            }
        }
    }
	 
    public void display(String text){
        System.out.println(text);
    }
    public String inputText(String label)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        String text = scan.nextLine();
        return text;
    }
    public double inputDouble(String label)
    {
        boolean numsuccess;
        double n = 0;
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print(label);
                n = scan.nextDouble();
                numsuccess = true;
            }
            catch(Exception e){
                System.out.println("Invalid");
                numsuccess = false;
            }
        }while(!numsuccess);
    
        return n;
    }
 
    
    public int inputInt(String label)
    {
        boolean numsuccess;
        int n = 0;
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print(label);
                n = scan.nextInt();
                numsuccess = true;
            }
            catch(Exception e){
                System.out.println("Invalid");
                numsuccess = false;
            }
        }while(!numsuccess);
    
        return n;
    }
   
    public void StudentR(){
        

		Scanner s1 = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		List<cashAssistance> c = new ArrayList<cashAssistance>();
		String letter;
	
		
	
		do{
			System.out.println("===============================");
	        System.out.println("||   College Cash Assitance  ||");
	        System.out.println("===============================");
			System.out.println("||      [R] Registered       ||");
			System.out.println("||      [P] Pending          ||");
			System.out.println("||      [N] Received         ||");
			System.out.println("||      [M] Register         ||");
			System.out.println("||      [C] Claim            ||");
		    System.out.println("===============================");
			System.out.print("\n  Enter your chosen Letter: ");
			 letter= s1.nextLine();
		
			switch(letter){
				case "R":
			System.out.println("ID No:\tName:\tAge:\tIncome:\tGender:");
		      Iterator<cashAssistance>i = c.iterator();
		      					      			           	
			  while(i.hasNext()){
		     	cashAssistance e = i.next();
		     	System.out.println(e);
		      	}
   	            System.out.println("---------------------------------------------------------------\n\n\n");
				break;
				
				case "P":
				
				
				break;
				
				case "N":
				System.out.println("Name \tID. No   \tIncome");
		        Iterator<cashAssistance>j= c.iterator();
		        while(j.hasNext()){
		     	cashAssistance e = j.next();
		     	System.out.println(e);
		      	}
                System.out.println("===============================================\n\n\n");
				break;
				
				case "M":
				
			
				System.out.print("Enter Student ID Number: ");
		      	int sNo= s.nextInt();
		      	System.out.print("Enter Name: ");
		      	String sname= s1.nextLine();
		      	System.out.print("Enter Age: ");
		      	int age = s.nextInt();
		        System.out.print("Enter Gender: ");
		        String gender = s1.nextLine();
		      	System.out.print("Enter Monthly Income: ");
                int income = s.nextInt();
				System.out.println("Enter Contact Number: ");
				double cont = s.nextDouble();
                
		      
		      	
		     	      	{	
		      			if(income >=4000){
		      	System.out.println("#######################################");
		      	System.out.println("#                                      #");
		      	System.out.println("# You are not eligible for the program #");      
		      	System.out.println("#                                      #");                  
		      	System.out.println("#######################################");
		      	
		      				break;
						}
					}
		      			
		      	
		    	c.add (new cashAssistance(sNo,sname,age,gender,income,cont));
		      	System.out.println("--------------------------------------------\n");
				break;
				
				
	    case "C":
	    
	    int ch;
	    System.out.print("Claim Cash Assistance? \n1.Yes \t2.No\n");
	    ch = s.nextInt();
	      boolean found= false;
		     System.out.print("Enter Student ID No. :");
		     int studNo= s.nextInt();
		     i = c.iterator();
		     while(i.hasNext()){
		     cashAssistance e =i.next();
		     if (e.getstudIdNum()==studNo){
		     	i.remove();
		     	found=true;	
		     		     
		     }
		   }		
		if (!found) {
		System.out.println("*********************************");	
		System.out.println("*                               *");
		System.out.println("*     Sorry record not found!   *");
		System.out.println("*                               *");
		System.out.println("*********************************");
		}
		else {
		System.out.println("*********************************");	
		System.out.println("*                               *");	
		System.out.println("* You have Successfully Claimed!*");
		System.out.println("*                               *");
		System.out.println("*********************************");
		}		
		System.out.println("");	
		break ;
		
		     case "L":
		       
             default:{
                System.out.println("!...INVALID ENTRY...!");
                this.StudentR();
             }
			}
		}
	
	while(letter!="E");
			System.out.println("");	
		
		
	   }
    
    public void LogIn(){
        String username ; 
        String password; 
        String yes_0r_no;    
        String scann;     
        String passscan;
        
                    
        Scanner scan = new Scanner(System.in); 
        Scanner scanner = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
             
        System.out.print("Username: ");     
        username = name.next().toLowerCase();     
        Scanner pass = new Scanner(System.in);     
        System.out.print("Password: ");     
        password = pass.next().toLowerCase();       
        System.out.println("You are logged in");      
        Scanner ask = new Scanner(System.in);     
        System.out.println("Continue?(yes or no) :");       
        yes_0r_no = ask.next().toLowerCase();  
        
        boolean check;    
          
        while (true){         
        if (yes_0r_no.equals("yes")){                      
        System.out.print("Password: ");         
        passscan = scanner.next().toLowerCase();
                
        if (passscan.equals(password)) {             
        System.out.println("You are logged in");   
                 this.StudentR();
       break;
                 
        }if (!password.equals(passscan)) {           
        System.out.println("Incorrect Password! Try Again");
        check =false;             
             }         
         }         
          if (yes_0r_no.equals("no"))        
               
          break ;
		
		
          
                }
            }
        }
        
