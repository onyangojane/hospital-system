import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Hospital Management System ===");
        System.out.println();
        
        Doctor doctor = createDoctor();
        Patient patient = createPatient();
        
        System.out.println();
        System.out.print("Enter appointment date (DD-MM-YYYY): ");
        String date = scanner.nextLine();
        
        Appointment appointment = new Appointment(doctor, patient, date);
        
        System.out.println();
        System.out.println("=== System Output ===");
        
        doctor.displayRole();
        doctor.performDuties();
        doctor.schedule(date);
        
        System.out.println();
        
        patient.displayRole();
        System.out.print("Enter bill amount: Ksh ");
        double amount = getValidDouble();
        patient.generateBill(amount);
        
        System.out.println();
        appointment.displayAppointment();
        
        scanner.close();
    }
    
    static Doctor createDoctor() {
        System.out.println("--- Enter Doctor Details ---");
        
        System.out.print("ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = getValidInt();
        scanner.nextLine();
        
        System.out.print("Department: ");
        String department = scanner.nextLine();
        
        System.out.print("Specialization: ");
        String specialization = scanner.nextLine();
        
        return new Doctor(id, name, age, department, specialization);
    }
    
    static Patient createPatient() {
        System.out.println();
        System.out.println("--- Enter Patient Details ---");
        
        System.out.print("ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = getValidInt();
        scanner.nextLine();
        
        System.out.print("Illness: ");
        String illness = scanner.nextLine();
        
        return new Patient(id, name, age, illness);
    }
    
    static int getValidInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
        }
    }
    
    static double getValidDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid amount: Ksh ");
                scanner.next();
            }
        }
    }
}