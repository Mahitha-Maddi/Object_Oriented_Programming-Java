/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mahit
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalSignsHistory;

    public VitalSignsHistory() {
        this.vitalSignsHistory = new ArrayList<VitalSigns>();
    }
    
    

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    
    public VitalSigns addVitalSign(){
    VitalSigns vs=new VitalSigns();
    
    vitalSignsHistory.add(vs);
    return vs;
    }
    
    
    public void deleteVitalSign(  VitalSigns v){
 
    vitalSignsHistory.remove(v);
   
    }
    
    
}
