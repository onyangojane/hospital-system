public class Main {

    public static void main(String[] args) {

        
        Doctor doctor1 = new Doctor(
                "D001",
                "Dr. Kamau",
                45,
                "Surgery",
                "Cardiologist"
        );

        
        Patient patient1 = new Patient(
                "P001",
                "John Mwangi",
                30,
                "Heart Disease"
        );

        Appointment appointment1 = new Appointment(
                doctor1,
                patient1,
                "25-02-2026"
        );

   
        doctor1.displayRole();
        doctor1.performDuties();
        doctor1.schedule("25-02-2026");

        System.out.println();

        patient1.displayRole();
        patient1.generateBill(5000);

        System.out.println();

        appointment1.displayAppointment();
    }
}