
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_partb;

import java.util.ArrayList;

/**
 *
 * @author mahitha
 */
public class Patient {
    private String name;
    private double age;
   private ArrayList<VitalSigns> vitalSignsHistory;
  private VitalSigns currVital;
  
  
    public Patient() {
        this.vitalSignsHistory = new ArrayList<VitalSigns>();
    }
     public VitalSigns getCurrVital() {
        return currVital;
    }
     
    public void setCurrVital(VitalSigns currVital) {
        this.currVital = currVital;
    }

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

   
    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
  
    public VitalSigns newVitalSign(VitalSigns vs){
       
        vitalSignsHistory.add(vs);
        VitalSigns vs1=new VitalSigns();
        this.currVital=vs1;
        return vs1;
        
    }
    
    public boolean isThisVitalSignNormal(String vitalSignName){
        String vitalSignName1=vitalSignName.toLowerCase();
        double age=this.age;
        VitalSigns v=this.currVital;
        int r=v.getRespiratoryRate();
        int h=v.getHeartRate();
        int b=v.getBp();
        float wk=v.getWeightKls();
        float wp=v.getWeightPnds();
        if (vitalSignName1.equals("heartrate"))
        {   
           if((age>=0.08)&&(age<1)){
             System.out.println("Heart rate is "+h );
               return ((h>=80)&&(h<140));
        
        }
        if((age>=1)&&(age<3)){
           
             System.out.println("Heart rate is "+h );
               return ((h>=80)&&(h<130));
        }
       
        if((age>=3)&&(age<=5)){
            
             System.out.println("Heart rate is "+h );
               return ((h>=80)&&(h<120));
            }
             
        
        if((age>=6)&&(age<=12)){
           
             System.out.println("Heart rate is "+h );
               return ((h>=70)&&(h<110));
        }
        if(age>=13){
           
             System.out.println("Heart rate is "+h );
               return ((h>=55)&&(h<105));
        }
        else{
            
             System.out.println("Heart rate is "+h );
               return ((h>=120)&&(h<160));
        }}else
            
        if (vitalSignName1.equals("respiratoryrate"))
        {
           if((age>=0.08)&&(age<1)){
             System.out.println("Respiratory rate is "+r);
             return ((r>=20)&&(r<30));
        }
        if((age>=1)&&(age<3)){
           
             System.out.println("Respiratory rate is "+r );
               return ((r>=20)&&(r<30));
              
        }
       
        if((age>=3)&&(age<=5)){
            
             System.out.println("Respiratory rate is "+r );
               return  ((r>=20)&&(r<30));}
             
        
        if((age>=6)&&(age<=12)){
           
             System.out.println("Respiratory rate is "+r );
               return ((r>=20)&&(r<30));
        }
        if(age>=13){
           
             System.out.println("Respiratory rate is "+r );
               return ((r>=12)&&(r<20));
       
        }
        else{
             System.out.println("Respiratory rateis "+r );
               return ((r>=30)&&(r<50)); 
        }
        
        }else
    if (vitalSignName1.equals("bloodpressure"))
        {
           if((age>=0.08)&&(age<1)){
             System.out.println("blood Pressure is "+b );
             return ((b>=70)&&(b<100));
        }
        if((age>=1)&&(age<3)){
           
             System.out.println("blood Pressure is "+b );
               return ((b>=80)&&(b<110));
              
        }
       
        if((age>=3)&&(age<=5)){
            
             System.out.println("blood Pressure is "+b );
               return  ((b>=80)&&(b<110));}
             
        
        if((age>=6)&&(age<=12)){
           
             System.out.println("blood Pressure is "+b );
               return ((b>=70)&&(b<120));
        }
        if(age>=13){
           
             System.out.println("blood Pressure is "+b );
               return ((b>=110)&&(b<120));
       
        }
        else{
             System.out.println("blood Pressure is "+b );
               return ((b>=50)&&(b<70)); 
        }
        
        }else
            if (vitalSignName1.equals("weightinkilos"))
        {
           if((age>=0.08)&&(age<1)){
             System.out.println("Weight in Kilos is "+wk);
             return ((wk>=4)&&(wk<10));
        }
        if((age>=1)&&(age<3)){
           
             System.out.println("Weight in Kilos is "+wk );
               return ((wk>=10)&&(wk<14));
              
        }
       
        if((age>=3)&&(age<=5)){
            
             System.out.println("Weight in Kilos is "+wk );
               return  ((wk>=14)&&(wk<18));}
             
        
        if((age>=6)&&(age<=12)){
           
             System.out.println("Weight in Kilos is "+wk);
               return ((wk>=20)&&(wk<42));
        }
        if(age>=13){
           
             System.out.println("Weight in Kilos is "+wk );
               return ((wk>50));
       
        }
        else{
             System.out.println("Weight in Kilos is "+wk );
               return ((wk>=2)&&(wk<3)); 
        }
        
        }else
    if (vitalSignName1.equals("weightinpounds"))
        {
           if((age>=0.08)&&(age<1)){
             System.out.println("Weight in pounds is "+wp );
             return ((wp>=9)&&(wp<22));
        }
        if((age>=1)&&(age<3)){
           
             System.out.println("Weight in pounds is "+wp );
               return ((wp>=80)&&(wp<130));
              
        }
       
        if((age>=3)&&(age<=5)){
            
             System.out.println("Weight in pounds is "+wp );
               return  ((wp>=80)&&(wp<120));}
             
        
        if((age>=6)&&(age<=12)){
           
             System.out.println("Weight in pounds is "+wp );
               return ((wp>=70)&&(wp<110));
        }
        if(age>=13){
           
             System.out.println("Weight in pounds is "+wp );
               return ((wp>=55)&&(wp<105));
       
        }
        else{
             System.out.println("Weight in pounds is "+wp );
               return ((wp>=120)&&(wp<160)); 
        }
        
        }return false;}
   public boolean isPatientNormal(String name,double age,int r,int h,int b, float wk,float wp){
        if((age>=0.08)&&(age<1)){
            System.out.println("Patient is an infant"); 
        return (r>=20)&&(r<30)&&(h>=80)&&(h<140)&&(b>=70)&&(b<100)&&(wk>=4)&&(wk<10)&&(wp>=9)&&(wp<22);
        
        }
        if((age>=1)&&(age<3)){
           System.out.println("Patient is a toddler"); 
        return (r>=20)&&(r<30)&&(h>=80)&&(h<130)&&(b>=80)&&(b<110)&&(wk>=10)&&(wk<14)&&(wp>=22)&&(wp<31);
        }
       
        if((age>=3)&&(age<=5)){
           System.out.println("Patient is a preschooler");
        return (r>=20)&&(r<30)&&(h>=80)&&(h<120)&&(b>=80)&&(b<110)&&(wk>=14)&&(wk<18)&&(wp>=31)&&(wp<40);
        }
        
        if((age>=6)&&(age<=12)){
            System.out.println("Patient is a school going kid");
        return (r>=20)&&(r<30)&&(h>=70)&&(h<110)&&(b>=80)&&(b<120)&&(wk>=20)&&(wk<42)&&(wp>=41)&&(wp<92);
       
        }
        if(age>=13){
            System.out.println("Patient is an adolescent");
        return (r>=12)&&(r<20)&&(h>=55)&&(h<105)&&(b>=110)&&(b<120)&&(wk>50)&&(wp>110);
       
        }
        else{
            System.out.println("Patient is a Newborn");
        return (r>=30)&&(r<50)&&(h>=120)&&(h<160)&&(b>=50)&&(b<70)&&(wk>=2)&&(wk<3)&&(wp>=4.5)&&(wp<7);
        }
   
        
   }}
        
        
  
   
   
   

