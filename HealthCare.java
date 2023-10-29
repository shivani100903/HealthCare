import java.util.*;

class Doctor 
{
    String name;
    String speciality;
    int availability;

    Doctor(String name, String speciality, int availability) 
    {
        this.name = name;
        this.speciality = speciality;
        this.availability = availability;
    }
}

class Patient 
{
    String name;
    int age;
    String gender;
    String contact;

    Patient(String name, int age, String gender, String contact) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }
}

class Appointment 
{
    Doctor doctor;
    Patient patient;
    Date date;

    Appointment(Doctor doctor, Patient patient, Date date) 
    {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
}

class OnlineDoctorAppointmentSystem
 {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();

    void addDoctor(Doctor doctor) 
    {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) 
    {
        patients.add(patient);
    }

    void bookAppointment(Doctor doctor, Patient patient, Date date) 
    {
        Appointment appointment = new Appointment(doctor, patient, date);
        appointments.add(appointment);
    }

    List<Appointment> getAppointments() 
    {
        return appointments;
    }
}

public class HealthCare
 {
    public HealthCare()
     {
    }

    public static void main(String[] var0)
     {
        // Take personal details
        Scanner var1 = new Scanner(System.in);
        System.out.println("Welcome to the Health Management System!");
        try 
        {
            Thread.sleep(1500); // 1000 milliseconds is one second.
        }
         catch(InterruptedException ex) 
         {
            Thread.currentThread().interrupt();
        }
        System.out.println("Please enter your name:");
        String var2 = var1.nextLine();
        System.out.println("Please enter your age:");
        int var3 = var1.nextInt();
        var1.nextLine();
        System.out.println("Please enter your gender (M/F):");
        String var4 = var1.nextLine();
        System.out.println("Please enter your weight (in kg):");
        double var5 = var1.nextDouble();
        var1.nextLine();
        System.out.println("Please enter your height (in cm):");

        // Calculate BMI
        double var7 = var1.nextDouble();
        var1.nextLine();
        double var9 = calculateBMI(var5, var7);
        System.out.println("Your Body Mass Index is: " + var9);
        String var11 = getBMICategory(var9);
        System.out.println("Your Body Mass Index category is: " + var11);

        // Calculate BMR (calorie)
        System.out.println("Please enter your activity level (1-5):");
        int var12 = var1.nextInt();
        var1.nextLine();
        double var13 = calculateBMR(var5, var7, var3, var4, var12);
        System.out.println("Your BMR calorie is: " + var13);
        System.out.println("Your goal is : (Lose Weight/Gain Weight/ Maintain Weight)");
        String var15 = var1.nextLine();
        double var16 = calculateCalories(var13, var15);
        System.out.println("Your daily calorie intake should be: " + var16);

        try
         {
            Thread.sleep(2000); // 1000 milliseconds is one second.
        } 
        catch(InterruptedException ex)
         {
            Thread.currentThread().interrupt();
        }

        // Ask  questions about health
        System.out.println("Do you eat Fruits and Vegetables regularly(Yes/No)");
        String fruitsAndVegetables = var1.nextLine().toLowerCase();

        System.out.println("Are you eating junk food regularly(Yes/NO)");
        String junkfood = var1.nextLine().toLowerCase();

        System.out.println("Do you do physical activity every week(Yes/NO)");
        String physicalActivity = var1.nextLine().toLowerCase();

        System.out.println("Do you get proper sleep regularly (Yes/No)");
        String sleep = var1.nextLine().toLowerCase();

        System.out.println("How many glasses of water have you had today?");
        int glassesOfWater = var1.nextInt();

        // Check fitness level
        String output = "";
        if (var9 < 15000 || var9 > 22000 || var13 > 900 || fruitsAndVegetables.equals("yes") || junkfood.equals("no") || physicalActivity.equals("yes") || sleep.equals("yes") || glassesOfWater > 5 )
         {
            output = "not fit";
            System.out.println("You are not fit. Please Consult a doctor or dietitian for your good health.");
        } 
        else 
        {
            output = "fit";
            System.out.println("You are fit. Keep up the good work!");
        }
        try
         {
            Thread.sleep(2000); // 1000 milliseconds is one second.
        } 
        catch(InterruptedException ex)
         {
            Thread.currentThread().interrupt();
        }

        if (output.equals("not fit"))
         {
            // Connect the program with the doctor consult program
            OnlineDoctorAppointmentSystem doctorAppointmentSystem = new OnlineDoctorAppointmentSystem();
            // Add doctors
            Doctor doctor1 = new Doctor("Dr. John", "General Physician", 5);
            Doctor doctor2 = new Doctor("Dr. Emily", "Dermatologist", 3);
            doctorAppointmentSystem.addDoctor(doctor1);
            doctorAppointmentSystem.addDoctor(doctor2);

            // Add patient
            Patient patient = new Patient(var2, var3, var4, "1234567890");
            doctorAppointmentSystem.addPatient(patient);

            // Book appointment
            Date appointmentDate = new Date(); // Use the current date for simplicity
            doctorAppointmentSystem.bookAppointment(doctor1, patient, appointmentDate);

            // Get appointments
            List<Appointment> appointments = doctorAppointmentSystem.getAppointments();
            System.out.println("Your appointment has been booked with Dr. John on " + "  "  + appointmentDate.toString());
        }

         try
         {
            Thread.sleep(1500); // 1000 milliseconds is one second.
        } 
        catch(InterruptedException ex)
         {
            Thread.currentThread().interrupt();
        }

        System.out.println("Here is a summary of your health today:");
        System.out.println("Sleep proper: " + sleep);
        System.out.println("Junk food: " + junkfood);
        System.out.println("Servings of Fruits and Vegetables: " + fruitsAndVegetables);
        System.out.println("Physical Activity: " + physicalActivity);
        System.out.println("Glasses of Water: " + glassesOfWater);


        try
         {
            Thread.sleep(1500); // 1000 milliseconds is one second.
        } 
        catch(InterruptedException ex)
         {
            Thread.currentThread().interrupt();
        }

         System.out.println("For Better Health :");
          System.out.println("Do Exercise regularly. \n Eat healthy food" );
          System.out.println("Drink atleast 6 to 7 glass of water");

          try
         {
            Thread.sleep(2000); // 1000 milliseconds is one second.
        } 
        catch(InterruptedException ex)
         {
            Thread.currentThread().interrupt();
        }

        System.out.println("Thank you for using the Health Care Program, " + var2 + "!");

    }

    public static double calculateBMI(double var0, double var2) 
    {
        return var0 / (var2 / 100.0 * (var2 / 100.0));
    }

    public static String getBMICategory(double var0)
     {
        if (var0 < 30.5) 
        {
            return "Underweight";
        } 
        else if (var0 < 45.0)
         {
            return "Normal weight";
        } 
        else
         {
            return var0 < 60.0 ? "Overweight" : "Obese";
        }
    }

    public static double calculateBMR(double var0, double var2, int var4, String var5, int var6) {
        double var7;
        if (var5.equalsIgnoreCase("M"))
         {
            var7 = 88.362 + 13.397 * var0 + 4.799 * var2 - 5.677 * (double) var4;
        } 
        else 
        {
            var7 = 447.593 + 9.247 * var0 + 3.098 * var2 - 4.33 * (double) var4;
        }

        switch (var6)
         {
            case 1:
                var7 *= 1.2;
                break;
            case 2:
                var7 *= 1.375;
                break;
            case 3:
                var7 *= 1.55;
                break;
            case 4:
                var7 *= 1.725;
                break;
            case 5:
                var7 *= 1.9;
        }

        return var7;
    }

    public static double calculateCalories(double var0, String var2) 
    {
        double var3;
        switch (var2.toLowerCase()) 
        {
            case "lose weight":
                var3 = var0 * 0.8;
                break;
            case "gain weight":
                var3 = var0 * 1.2;
                break;
            default:
                var3 = var0;
        }

        return var3;
    }
}
