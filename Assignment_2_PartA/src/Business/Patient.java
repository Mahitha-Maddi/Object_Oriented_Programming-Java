/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

public class Patient {
 private String name;
    private double age;
    private VitalSigns vs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

  
   
    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
   
      boolean isPatientNormal(String name,double age,int r,int h,int b, float wk,float wp){
        if((age>=0.08)&&(age<1)){
            System.out.println("Name of the patient is "+name);
            System.out.println("Age of the patient is "+age);
            System.out.println("Patient is an infant");
          
            System.out.println("Respiratory rate is "+r );
            if ((r>=20)&&(r<30)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=80)&&(h<140)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=70)&&(b<100)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>=4)&&(wk<10)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>=9)&&(wp<22)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
            
        return (r>=20)&&(r<30)&&(h>=80)&&(h<140)&&(b>=70)&&(b<100)&&(wk>=4)&&(wk<10)&&(wp>=9)&&(wp<22);
        
        }
        if((age>=1)&&(age<3)){
            System.out.println("Name of the patient is "+name);
            System.out.println("Age of the patient is "+age);
           System.out.println("Patient is a toddler");
            System.out.println("Respiratory rate is "+r );
            if ((r>=20)&&(r<30)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=80)&&(h<130)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=80)&&(b<110)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>=10)&&(wk<14)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>=22)&&(wp<31)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
            
        return (r>=20)&&(r<30)&&(h>=80)&&(h<130)&&(b>=80)&&(b<110)&&(wk>=10)&&(wk<14)&&(wp>=22)&&(wp<31);
        }
       
        if((age>=3)&&(age<=5)){
            System.out.println("Name of the patient is "+name);
            System.out.println("Age of the patient is "+age);
           System.out.println("Patient is a preschooler");
           
            System.out.println("Respiratory rate is "+r );
            if ((r>=20)&&(r<30)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=80)&&(h<120)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=80)&&(b<110)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>=14)&&(wk<18)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>=31)&&(wp<40)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
        return (r>=20)&&(r<30)&&(h>=80)&&(h<120)&&(b>=80)&&(b<110)&&(wk>=14)&&(wk<18)&&(wp>=31)&&(wp<40);
        }
        
        if((age>=6)&&(age<=12)){
            System.out.println("Name of the patient is "+name);
            System.out.println("Age of the patient is "+age);
            System.out.println("Patient is a school going kid");
             System.out.println("Respiratory rate is "+r );
            if ((r>=20)&&(r<30)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=70)&&(h<110)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=80)&&(b<120)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>=20)&&(wk<42)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>=41)&&(wp<92)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
        return (r>=20)&&(r<30)&&(h>=70)&&(h<110)&&(b>=80)&&(b<120)&&(wk>=20)&&(wk<42)&&(wp>=41)&&(wp<92);
       
        }
        if(age>=13){
            System.out.println("Name of the patient is "+name);
            System.out.println("Age of the patient is "+age);
            System.out.println("Patient is an adolescent");
            System.out.println("Respiratory rate is "+r );
            if ((r>=12)&&(r<20)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=55)&&(h<105)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=110)&&(b<120)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>50)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>110)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
        return (r>=12)&&(r<20)&&(h>=55)&&(h<105)&&(b>=110)&&(b<120)&&(wk>50)&&(wp>110);
       
        }
        else{
            System.out.println("Name of the patient is "+name);            
            System.out.println("Age of the patient is "+age);
            System.out.println("Patient is a Newborn");
             System.out.println("Respiratory rate is "+r );
            if ((r>=30)&&(r<50)){
                
            System.out.println("Respiratory rate is normal "); }else{
                System.out.println("Respiratory rate is abnormal ");
            }
             System.out.println("Heart rate is "+h );
               if ((h>=120)&&(h<160)){
                
            System.out.println("Heart rate is normal "); }else
               {
                System.out.println("Heart rate is abnormal ");
            }
              System.out.println("Blood pressure is "+b );
              if ((b>=50)&&(b<70)){
                
            System.out.println("Blood pressure is normal "); }
              else{
                System.out.println("Blood pressure is abnormal ");
            }
               System.out.println("Weight in Kilos is "+wk );
               if ((wk>=2)&&(wk<3)){
                
            System.out.println("Weight in Kilos is normal "); }
               else{
                System.out.println("Weight in Kilos is abnormal ");
            }
                System.out.println("Weight in pounds is "+wp );
             if ((wp>=4.5)&&(wp<7)){
                
            System.out.println("Weight in pounds is normal "); }
             else{
                System.out.println("Weight in pounds is abnormal ");
            }
        return (r>=30)&&(r<50)&&(h>=120)&&(h<160)&&(b>=50)&&(b<70)&&(wk>=2)&&(wk<3)&&(wp>=4.5)&&(wp<7);
        }
    
      }

 public static void main(String[] args) { 
  
        Patient newBorn=new Patient();//testing newBorn
         VitalSigns newBornVs=new VitalSigns();
        System.out.println("****(Testing for new born : ");
        System.out.println("Respiratory rate should be in the range of 30-50");
        System.out.println("Heart rate should be in the range of 120-160");
        System.out.println("Systolic Blood Pressure should be in the range of 50-70");
        System.out.println("Weight should be in the range of (2-3)Kilos and (4.5-7)Pounds)****\n");
         newBorn.setName("Mike");
       newBorn.setAge(0);
        newBornVs.setRespiratoryRate(40);
        newBornVs.setHeartRate(140);
         newBornVs.setBp(60); 
        newBornVs.setWeightKls((float) 2.5);
         newBornVs.setWeightPnds(5); 
        newBorn.setVs(newBornVs);
        boolean result1;
        result1 = newBorn.isPatientNormal(newBorn.getName(),newBorn.getAge(),newBornVs.getRespiratoryRate(),newBornVs.getHeartRate(),newBornVs.getBp(),newBornVs.getWeightKls(),newBornVs.getWeightPnds());
        if(result1==true){
        System.out.println("Patient "+newBorn.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +newBorn.getName() + " is abnormal \n");}
        
        Patient infant=new Patient();//testing infant
         VitalSigns infantVs=new VitalSigns();
        System.out.println("****(Testing for infant(1-12 months) : ");
        System.out.println("Respiratory rate should be in the range of 20-30");
        System.out.println("Heart rate should be in the range of 80-140");
        System.out.println("Systolic Blood Pressure should be in the range of 70-100");
        System.out.println("Weight should be in the range of (4-10)Kilos and (9-22)Pounds)****\n");
         infant.setName("Mike");
       infant.setAge(0.9);
        infantVs.setRespiratoryRate(25);
        infantVs.setHeartRate(90);
         infantVs.setBp(80); 
        infantVs.setWeightKls((float) 5);
         infantVs.setWeightPnds(10); 
        infant.setVs(infantVs);
        boolean result2;
        result2 = infant.isPatientNormal(infant.getName(),infant.getAge(),infantVs.getRespiratoryRate(),infantVs.getHeartRate(),infantVs.getBp(),infantVs.getWeightKls(),infantVs.getWeightPnds());
        if(result2==true){
        System.out.println("Patient "+infant.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +infant.getName() + " is abnormal \n");}
        
        Patient toddler=new Patient();//testing toddler
         VitalSigns toddlerVs=new VitalSigns();
        System.out.println("****(Testing for toddler(1-3 yrs)//(12-36 months) : ");
        System.out.println("Respiratory rate should be in the range of 20-30");
        System.out.println("Heart rate should be in the range of 80-130");
        System.out.println("Systolic Blood Pressure should be in the range of 80-110");
        System.out.println("Weight should be in the range of (10-14)Kilos and (22-31)Pounds)****\n");
         toddler.setName("Mike");
       toddler.setAge(2);
        toddlerVs.setRespiratoryRate(25);
        toddlerVs.setHeartRate(90);
         toddlerVs.setBp(85); 
        toddlerVs.setWeightKls((float)11);
         toddlerVs.setWeightPnds(24); 
        toddler.setVs(toddlerVs);
        boolean result3;
        result3 = toddler.isPatientNormal(toddler.getName(),toddler.getAge(),toddlerVs.getRespiratoryRate(),toddlerVs.getHeartRate(),toddlerVs.getBp(),toddlerVs.getWeightKls(),toddlerVs.getWeightPnds());
        if(result3==true){
        System.out.println("Patient "+toddler.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +toddler.getName() + " is abnormal \n");}
        
         Patient preSchooler=new Patient();//testing preSchooler
         VitalSigns preSchoolerVs=new VitalSigns();
        System.out.println("****(Testing for preSchooler(3-5 yrs)//(36-60 months) : ");
        System.out.println("Respiratory rate should be in the range of 20-30");
        System.out.println("Heart rate should be in the range of 80-120");
        System.out.println("Systolic Blood Pressure should be in the range of 80-110");
        System.out.println("Weight should be in the range of (14-18)Kilos and (31-40)Pounds)****\n");
         preSchooler.setName("Mike");
       preSchooler.setAge(4);
        preSchoolerVs.setRespiratoryRate(25);
        preSchoolerVs.setHeartRate(90);
         preSchoolerVs.setBp(90); 
        preSchoolerVs.setWeightKls((float)16);
         preSchoolerVs.setWeightPnds(34); 
        preSchooler.setVs(preSchoolerVs);
        boolean result4;
        result4 = preSchooler.isPatientNormal(preSchooler.getName(),preSchooler.getAge(),preSchoolerVs.getRespiratoryRate(),preSchoolerVs.getHeartRate(),preSchoolerVs.getBp(),preSchoolerVs.getWeightKls(),preSchoolerVs.getWeightPnds());
        if(result4==true){
        System.out.println("Patient "+preSchooler.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +preSchooler.getName() + " is abnormal \n");}
        
         Patient schoolAge=new Patient();//testing schoolAge
         VitalSigns schoolAgeVs=new VitalSigns();
        System.out.println("****(Testing for schoolAge(6-12 yrs)//(72-144 months) : ");
        System.out.println("Respiratory rate should be in the range of 20-30");
        System.out.println("Heart rate should be in the range of 70-110");
        System.out.println("Systolic Blood Pressure should be in the range of 80-120");
        System.out.println("Weight should be in the range of (20-42)Kilos and (41-92)Pounds)****\n");
         schoolAge.setName("Mike");
       schoolAge.setAge(7);
        schoolAgeVs.setRespiratoryRate(25);
        schoolAgeVs.setHeartRate(90);
         schoolAgeVs.setBp(90); 
        schoolAgeVs.setWeightKls((float)30);
         schoolAgeVs.setWeightPnds(42); 
        schoolAge.setVs(schoolAgeVs);
        boolean result5;
        result5 = schoolAge.isPatientNormal(schoolAge.getName(),schoolAge.getAge(),schoolAgeVs.getRespiratoryRate(),schoolAgeVs.getHeartRate(),schoolAgeVs.getBp(),schoolAgeVs.getWeightKls(),schoolAgeVs.getWeightPnds());
        if(result5==true){
        System.out.println("Patient "+schoolAge.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +schoolAge.getName() + " is abnormal \n");}
        
         Patient adolescent=new Patient();//testing adolescent
         VitalSigns adolescentVs=new VitalSigns();
        System.out.println("****(Testing for adolescent(13+ yrs)//(156 months) : ");
        System.out.println("Respiratory rate should be in the range of 12-20");
        System.out.println("Heart rate should be in the range of 55-105");
        System.out.println("Systolic Blood Pressure should be in the range of 110-120");
        System.out.println("Weight should be in the range of (>50)Kilos and (>110)Pounds)****\n");
         adolescent.setName("Mike");
       adolescent.setAge(14);
        adolescentVs.setRespiratoryRate(18);
        adolescentVs.setHeartRate(90);
         adolescentVs.setBp(115); 
        adolescentVs.setWeightKls((float)60);
         adolescentVs.setWeightPnds(120); 
       adolescent.setVs(adolescentVs);
        boolean result6;
        result6 = adolescent.isPatientNormal(adolescent.getName(),adolescent.getAge(),adolescentVs.getRespiratoryRate(),adolescentVs.getHeartRate(),adolescentVs.getBp(),adolescentVs.getWeightKls(),adolescentVs.getWeightPnds());
        if(result6==true){
        System.out.println("Patient "+adolescent.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +adolescent.getName() + " is abnormal \n");}
        
        
         Patient abnormal=new Patient();//testing abnormal condition
         VitalSigns abnormalVs=new VitalSigns();
        System.out.println("****(Testing for abnormal adolescent(13+ yrs)//(156 months) : ");
        System.out.println("Respiratory rate should be in the range of 12-20");
        System.out.println("Heart rate should be in the range of 55-105");
        System.out.println("Systolic Blood Pressure should be in the range of 110-120");
        System.out.println("Weight should be in the range of (>50)Kilos and (>110)Pounds)****\n");
         abnormal.setName("Mike");
       abnormal.setAge(14);
        abnormalVs.setRespiratoryRate(11);
        abnormalVs.setHeartRate(54);
         abnormalVs.setBp(109); 
        abnormalVs.setWeightKls((float)40);
         abnormalVs.setWeightPnds(100); 
       abnormal.setVs(abnormalVs);
        boolean result7;
        result7 = abnormal.isPatientNormal(abnormal.getName(),abnormal.getAge(),abnormalVs.getRespiratoryRate(),abnormalVs.getHeartRate(),abnormalVs.getBp(),abnormalVs.getWeightKls(),abnormalVs.getWeightPnds());
        if(result7==true){
        System.out.println("Patient "+abnormal.getName() + " is normal \n");}
        else{
        System.out.println("Patient " +abnormal.getName() + " is abnormal \n");}
        
        
             Patient p=new Patient();//dynamic input
        VitalSigns vs=new VitalSigns();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter patient name");
    String patientName = myObj.nextLine();  // Read user input
     System.out.println("Enter patient age in years");
    double patientAge=myObj.nextDouble();
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
        vs.setRespiratoryRate(patientRespiratoryRate);
        vs.setHeartRate(patientHeartRate);
         vs.setBp(patientBp); 
         vs.setWeightKls(patientWeightKls);
         vs.setWeightPnds(patientWeightPnds); 
        p.setVs(vs);
        boolean result =p.isPatientNormal(p.getName(),p.getAge(),vs.getRespiratoryRate(),vs.getHeartRate(),vs.getBp(),vs.getWeightKls(),vs.getWeightPnds());
        if(result==true){
        System.out.println("Patient "+patientName + " is normal \n");}
        else{
        System.out.println("Patient " + patientName + " is abnormal \n");}
    }
    }
