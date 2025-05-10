public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM(){
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup, dh, dh.prev);
        dh.prev.next = newPatient;
        newPatient.prev = dh.prev;
        dh.prev = newPatient;
        newPatient.next = dh; 
    }

    public void servePatient(){
        if(dh.next == dh){
            System.out.println("No patients to serve");
        }
        else{
            Patient paitent1 = dh.next;
            System.out.println("Patient " + paitent1.name + " has been served");
            dh.next = paitent1.next;
            paitent1.next.prev = dh;
        }
    }

    public void showAllPatient(){
        if(dh.next == dh){
            System.out.println("No patients waiting.");
            
        }
        Patient temp = dh.next;
        System.out.print("Patients in line: ");
        while(temp != dh){
            System.out.print(temp.name + " > " );
            temp = temp.next;
        }
        System.out.println("End");
    }

    public boolean canDoctorGoHome() {
        return dh.next == dh;
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
        System.out.println("All appointments have been canceled.");
    }


    public void reverseTheLine() {
        if(dh.next == dh){
            System.out.println("No patients to reverse.");          
    }
    Patient current =dh.next;
        while(current != dh){
            Patient temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        Patient temp= dh.next;
        dh.next = dh.prev;
        dh.prev = temp;
        System.out.println("Patient line reversed successfully.");

   }
}