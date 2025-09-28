// This is a java code that public class HealthKiosk
import java.util.*;
public class HealthKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Task 1 prompting user for  their choice
        char choice0;
        char choice;
        String niche = "";
        System.out.print("Enter one letter P/L/T/C:  ");
        choice0 = input.next().charAt(0);
        choice = Character.toUpperCase(choice0)
        switch (choice) {
            case 'P': System.out.println("Go to Pharmacy Desk");
                    niche = "Pharmacy";break;
            case 'L': System.out.println("Go to Lab Desk");
                    niche = "Lab";break;
            case 'T': System.out.println("Go to Triage Desk");
                    niche = "Triage";break;
            case 'C': System.out.println("Go to Counselling Desk");
                    niche = "Counselling"; break;
            default: System.out.println("Invalid service code");
        }
        // Task 2 Mini Health Metric

        int metric;
        double bmi=0;
        System.out.println("Enter you health metric:\n 1. BMI\n 2. Dosage round-up\n 3. Simple Trig Helper");
        metric = input.nextInt();
        double tabGiven = 0;
        double roundedSin = 0;

        if (metric == 1){
            double height;
            double weight;
            double roundedBmi;
            System.out.println("Enter your height in meters: ");
            height = input.nextDouble();
            System.out.println("Enter your weight in kgs: ");
            weight = input.nextDouble();
            bmi = (weight/(height*height));
            roundedBmi = Math.round(bmi*10)/10.0;
            if(bmi<18.5){
                System.out.println("BMI: "+roundedBmi);
                System.out.println("Category: Underweight");
            }else if(bmi<25){
                System.out.println("BMI: "+roundedBmi);
                System.out.println("Category: Normal");
            }else if(bmi<30){
                System.out.println("Category: Overweight");
                System.out.println("BMI: "+roundedBmi);
            } else {
                System.out.println("Category: Obese");
                System.out.println("BMI: "+roundedBmi);
            }
        } else if (metric == 2){
            double dosage;
            double tabGiven;   
            System.out.println("Enter the required dosage in mg");
            dosage = input.nextInt();
            if(dosage>250){
                System.out.println("We only dispense 250mg and below");
            } else{
                tabGiven = Math.ceil(dosage/250.0);

            }
            System.out.println("Your tablet is "+tabGiven);
            // option C
        } else if(metric == 3) {
            double angle;
            System.out.println("Enter the angle in degree");
            angle = input.nextInt();
            if((angle<0)||(angle>360)){
                System.out.println("Your entry is either less than 0 or greater than 360");
            }else{
                double cos;
                double sin;
                double angleToRad;
                double roundedCos;
                angleToRad = Math.toRadians(angle);
                cos = Math.cos(angleToRad);
                sin = Math.sin(angleToRad);
                roundedCos = (Math.round(cos*1000)/1000.0);
                roundedSin = (Math.round(sin*1000)/1000.0);
                System.out.println("Cos is: "+roundedCos);
                System.out.println("Sin is: "+roundedSin);
            }
        }else{
            System.out.println("Invalid service code");
        }
        //Generating a random character in upper case
        char randChar = (char) ('A'+(int)(Math.random()*26));
        int char1 = 3+(int)(Math.random()*7);
        int char2 = 3+(int)(Math.random()*7);
        int char3 = 3+(int)(Math.random()*7);
        int char4 = 3+(int)(Math.random()*7);
        String id = randChar+String.valueOf(char1)+String.valueOf(char2)+String.valueOf(char3)+String.valueOf(char4);
        char ch0 = id.charAt(0);
        char ch1 = id.charAt(1);
        char ch2 = id.charAt(2);
        char ch3 = id.charAt(3);
        char ch4 = id.charAt(4);
        if(id.length()==5){
            if (Character.isLetter(ch0)&&(Character.isDigit(ch1)) &&(Character.isDigit(ch2))&&(Character.isDigit(ch3))&&(Character.isDigit(ch4))){
            System.out.println("ID: "+id);
            System.out.println("ID OK");
            }else{
            System.out.println("Invalid ID");
        }
        }else{
            System.out.println("Irreasonable length");
        }
        input.nextLine(); //clearing the leftover from the nextInt method.
        char base;
        String studentName;
        String lastTwo;
        System.out.println("Enter student name: ");
        studentName = input.nextLine();
        input.close();
        base = Character.toUpperCase(studentName.charAt(0));
        char shiftChar = (char)('A' + ((base - 'A' + 2) % 26));
        lastTwo = String.valueOf(id.charAt(3))+String.valueOf(id.charAt(4));
        int roundedVal = 0;


        if(metric==1){
           roundedVal = (int) (Math.round(bmi));
        }else if (metric==2) {
            roundedVal = (int) (Math.round(tabGiven));
        }else if (metric==3){
            roundedVal = (int) (Math.round(roundedSin*100));
        }
        String shiftedId = shiftChar+(lastTwo)+"-"+String.valueOf(roundedVal);
        // Task five, displaying the user summary
        if(choice == 'P'){
            System.out.println("Summary: "+niche+" | ID = "+id+"|" +" BMI "+bmi+" | Code = "+shiftedId);
        }else if(choice == 'L'){
            System.out.println("Summary: "+niche+" | ID = "+id+" | Code = "+shiftedId);
        }else if(choice=='T'){
            System.out.println("Summary: "+niche+" | ID = "+id+" | Code = "+shiftedId);
        }else if(choice=='C'){
            System.out.println("Summary: "+niche+" | ID = "+id+" | Code = "+shiftedId);
        }else{
            System.out.println("Error occured while resolving summary");
        }
    }

}