import java.util.Scanner;
public class WRMTester {
    public static void main(String[] args) {
        WRM wrm = new WRM();
        Scanner sc = new Scanner(System.in);
        System.out.println("** Welcome to Waiting Room Management System **");
       while(true){
        System.out.println("Select an option:");
        System.out.println("1. Register Patient");
        System.out.println("2. Serve Patient");
        System.out.println("3. Show All Patients");
        System.out.println("4. Check if Doctor Can Go Home");
        System.out.println("5. Cancel All Patients");
        System.out.println("6. Reverse Patient Line");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        sc.nextLine(); 

        if(choice == 1){
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Patient Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Blood Group: ");
            String bgroup = sc.nextLine();
            
            wrm.registerPatient(id, name, age, bgroup);
            System.out.println("Success: Patient Registered");
        
        } 
        else if(choice == 2){
            wrm.servePatient();
        
        } 
        else if(choice == 3){
            wrm.showAllPatient();
        
        } 
        else if(choice == 4){
            if (wrm.canDoctorGoHome()){
                System.out.println("Yes, doctor can go home.");
            }
            else{
                System.out.println("No, patients are still waiting.");
            }
        
        }
        else if(choice == 5){
            wrm.cancelAll();
            System.out.println("Successfully All appointments are canceled.");
        
        }
        else if(choice == 6){
            wrm.reverseTheLine();
            System.out.println("Successfully then Patient line reversed.");
        
        } 
        else if(choice == 7){
            System.out.println("Exiting...");
            break;
        
        } 
        else{
            System.out.println("Invalid choice! Please try again.");
        }
    }
    sc.close();
   }
 }
