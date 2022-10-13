package com.sddevops.CWF_CodeManagement_Julie;

import java.util.*;



public class NewAppointmentCollection_Junit {

    
	public ArrayList<NewAppointment_Junit> appointments = new ArrayList<>();
	
    public int capacity;

    public NewAppointmentCollection_Junit() {
    	
        this.capacity = 2;
        
    }



    public List<NewAppointment_Junit> getAppointments() {
        return appointments;
    }

    public void addAppointment(NewAppointment_Junit appointment) {
    	if(appointments.size() != capacity) {
    		appointments.add(appointment);
    	}
    }
    
 
	public ArrayList<NewAppointment_Junit> sortAppointmentsByTitle() {         
        Collections.sort(appointments, NewAppointment_Junit.titleComparator);         
        return appointments;     
    } 
	
    
 

    public NewAppointment_Junit findAppointmentByTitle(String title) {
    	for (NewAppointment_Junit a : appointments) { 		      
            if(a.getTitle().equals(title)) return a;
       }
    	return null;
    }
    
    public ArrayList<NewAppointment_Junit> sortDoctorByDoctorLength() {         
        Collections.sort(appointments, NewAppointment_Junit.doctorLengthComparator);         
        return appointments;     
    }
    
    public NewAppointment_Junit findAppointmentByUserName(String username) {
    	for (NewAppointment_Junit a : appointments) { 		      
            if(a.getUserName().equals(username)) return a;
       }
    	return null;
    }

 
}
