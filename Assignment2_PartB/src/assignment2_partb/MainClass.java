/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_partb;

import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author mahitha
 */
public class MainClass {
    public static void printVitalSigns(Patient p){
        System.out.println("Vital Signs history : ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Patient Name" + " ||"+"Time entered"+"               ||"+ "Respiratory Rate"+" ||" + "Heart Rate"+" ||" + "Blood Pressure" +" ||"+ "Weight in Kilos" +" ||"+ "Weight in pounds");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    for(VitalSigns vs:p.getVitalSignsHistory()){
    
        System.out.println(p.getName() + "      ||"+vs.getTime()+"||"+ vs.getRespiratoryRate()+"               ||" + vs.getHeartRate()+"         ||" + vs.getBp() +"             ||"+ vs.getWeightKls() +"             ||"+ vs.getWeightPnds());
    
    }
     System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Current Vital Sign : ");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("Patient Name" + " ||"+"Time entered"+"               ||"+ "Respiratory Rate"+" ||" + "Heart Rate"+" ||" + "Blood Pressure" +" ||"+ "Weight in Kilos" +" ||"+ "Weight in pounds");
 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
VitalSigns currentVitalSigns=p.getCurrVital();
System.out.println(p.getName() + "      ||"+currentVitalSigns.getTime()+"||"+ currentVitalSigns.getRespiratoryRate()+"               ||" + currentVitalSigns.getHeartRate()+"         ||" + currentVitalSigns.getBp() +"             ||"+ currentVitalSigns.getWeightKls() +"             ||"+ currentVitalSigns.getWeightPnds());
 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");    
boolean result=p.isPatientNormal( p.getName(), p.getAge(), currentVitalSigns.getRespiratoryRate(), currentVitalSigns.getHeartRate(), currentVitalSigns.getBp(),  currentVitalSigns.getWeightKls(), currentVitalSigns.getWeightPnds());
if (result==true){
System.out.println("Patient is Normal");
    }
else{
  System.out.println("Patient is abnormal");  
}
    }
public static void main(String[] args) { 
Patient p=new Patient();  
System.out.println("Patient 1");
   Scanner myObj = new Scanner(System.in);  
   
    System.out.println("Enter patient name");
    String patientName = myObj.nextLine(); 
    System.out.println("Enter patient age in years");
    double patientAge=myObj.nextDouble();
 
    System.out.println("****************Vital Signs 1******************");
    Date t1=new Date(System.currentTimeMillis());
     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate=myObj.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate=myObj.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp=myObj.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls=myObj.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds=myObj.nextFloat();
       p.setName(patientName);
        p.setAge(patientAge);
         VitalSigns vs=new VitalSigns();
     vs.setRespiratoryRate(patientRespiratoryRate);
        vs.setHeartRate(patientHeartRate);
         vs.setBp(patientBp); 
         vs.setWeightKls(patientWeightKls);
         vs.setWeightPnds(patientWeightPnds); 
         vs.setTime(t1);
    p.setCurrVital(vs);
    
    printVitalSigns(p);
    
    System.out.println("****************Vital Signs 2******************");
     System.out.println("Enter patient age in years");
    double patientAge1=myObj.nextDouble(); 
     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate1=myObj.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate1=myObj.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp1=myObj.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls1=myObj.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds1=myObj.nextFloat();
       Date t2=new Date(System.currentTimeMillis());
      p.setAge(patientAge1);
         VitalSigns vs1=p.newVitalSign(p.getCurrVital());
     vs1.setRespiratoryRate(patientRespiratoryRate1);
        vs1.setHeartRate(patientHeartRate1);
         vs1.setBp(patientBp1); 
         vs1.setWeightKls(patientWeightKls1);
         vs1.setWeightPnds(patientWeightPnds1); 
         vs1.setTime(t2);
         printVitalSigns(p);
         
         System.out.println("****************Vital Signs 3******************");
     System.out.println("Enter patient age in years");
    double patientAge2=myObj.nextDouble();

     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate2=myObj.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate2=myObj.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp2=myObj.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls2=myObj.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds2=myObj.nextFloat();
       Date t3=new Date(System.currentTimeMillis());
        p.setAge(patientAge2);
         VitalSigns  vs2=p.newVitalSign(p.getCurrVital());
     vs2.setRespiratoryRate(patientRespiratoryRate2);
        vs2.setHeartRate(patientHeartRate2);
         vs2.setBp(patientBp2); 
         vs2.setWeightKls(patientWeightKls2);
         vs2.setWeightPnds(patientWeightPnds2); 
         vs2.setTime(t3);
         printVitalSigns(p);
         myObj.nextLine();
       System.out.println("Enter vital sign name for which you want to check abnormality");
    String vitalSignName=myObj.nextLine();
    
         boolean test=p.isThisVitalSignNormal(vitalSignName);
         
        
       if (test ==true)
       {System.out.println(vitalSignName+" is normal");}
       else {
           System.out.println(vitalSignName+" is abnormal");
       }
       
        System.out.println("Any other vital sign you want to check (respiratory rate) ?? ");
    String vitalSignName2=myObj.nextLine();
    
         boolean test2=p.isThisVitalSignNormal(vitalSignName2);
         
        
       if (test2 ==true)
       {System.out.println(vitalSignName2+" is normal");}
       else {
           System.out.println(vitalSignName2+" is abnormal");
       }
       
        System.out.println("Any other vital sign you want to check (Blood pressure)?? ");
    String vitalSignName3=myObj.nextLine();
    
         boolean test3=p.isThisVitalSignNormal(vitalSignName3);
         
        
       if (test3 ==true)
       {System.out.println(vitalSignName3+" is normal");}
       else {
           System.out.println(vitalSignName3+" is abnormal");
       }
       
        System.out.println("Any other vital sign you want to check (Weight in Kilos/pounds) ?? ");
    String vitalSignName4=myObj.nextLine();
    
         boolean test4=p.isThisVitalSignNormal(vitalSignName4);
         
        
       if (test4 ==true)
       {System.out.println(vitalSignName4+" is normal");}
       else {
           System.out.println(vitalSignName4+" is abnormal");
       }
       
        
       
       
       //******Patient 2******************************************************************************************************************************
       Patient p2=new Patient(); 
       System.out.println("Patient 2");
   Scanner myObj2 = new Scanner(System.in);  
   
    System.out.println("Enter patient name");
    String patientName2 = myObj2.nextLine(); 
    System.out.println("Enter patient age in years");
    double patientAge21=myObj2.nextDouble();
    
    System.out.println("****************Vital Signs 1******************");
  
    Date t21=new Date(System.currentTimeMillis());
     
     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate21=myObj2.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate21=myObj2.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp21=myObj2.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls21=myObj2.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds21=myObj2.nextFloat();
       p2.setName(patientName2);
        p2.setAge(patientAge21);
         VitalSigns vs21=new VitalSigns();
     vs21.setRespiratoryRate(patientRespiratoryRate21);
        vs21.setHeartRate(patientHeartRate21);
         vs1.setBp(patientBp21); 
         vs21.setWeightKls(patientWeightKls21);
         vs21.setWeightPnds(patientWeightPnds21); 
         vs21.setTime(t21);
    p2.setCurrVital(vs21);
    printVitalSigns(p2);
    
    System.out.println("****************Vital Signs 2******************");
     System.out.println("Enter patient age in years");
    double patientAge22=myObj2.nextDouble();
  
     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate22=myObj2.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate22=myObj2.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp22=myObj2.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls22=myObj2.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds22=myObj2.nextFloat();
       Date t22=new Date(System.currentTimeMillis());
      p.setAge(patientAge22);
         VitalSigns vs22=p2.newVitalSign(p2.getCurrVital());
     vs22.setRespiratoryRate(patientRespiratoryRate22);
        vs22.setHeartRate(patientHeartRate22);
         vs22.setBp(patientBp22); 
         vs22.setWeightKls(patientWeightKls22);
         vs22.setWeightPnds(patientWeightPnds22); 
         vs22.setTime(t22);
         printVitalSigns(p2);
        
         System.out.println("****************Vital Signs 3******************");
     System.out.println("Enter patient age in years");
    double patientAge23=myObj2.nextDouble();
     System.out.println("Enter patient respiratory rate");
    int patientRespiratoryRate23=myObj2.nextInt();
     System.out.println("Enter patient heart rate");
    int patientHeartRate23=myObj2.nextInt();
    
     System.out.println("Enter patient blood pressure");
    int patientBp23=myObj2.nextInt();
    
     System.out.println("Enter patient's weight in kilos");
    float patientWeightKls23=myObj2.nextFloat();
    
     System.out.println("Enter patient's weight in pounds");
    float patientWeightPnds23=myObj2.nextFloat();
       Date t23=new Date(System.currentTimeMillis());
        p2.setAge(patientAge23);
         VitalSigns  vs23=p2.newVitalSign(p2.getCurrVital());
     vs23.setRespiratoryRate(patientRespiratoryRate23);
        vs23.setHeartRate(patientHeartRate23);
         vs23.setBp(patientBp23); 
        vs23.setWeightKls(patientWeightKls23);
         vs23.setWeightPnds(patientWeightPnds23); 
         vs23.setTime(t23);
         printVitalSigns(p2);
         myObj2.nextLine();
       System.out.println("Enter vital sign name for which you want to check abnormality");
    String vitalSignName21=myObj2.nextLine();
    
         boolean test21=p2.isThisVitalSignNormal(vitalSignName21);
         
        
       if (test21 ==true)
       {System.out.println(vitalSignName21+" is normal");}
       else {
           System.out.println(vitalSignName21+" is abnormal");
       }
}}