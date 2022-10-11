package com.sddevops.CWF_CodeManagement_Julie;

import java.util.*;

//import com.sddevops.junit_maven.eclipse.Song;

public class NewAppointmentCollection_Junit {

    //private static Comparator titleComparator;
	private ArrayList<NewAppointment_Junit> appointments = new ArrayList<>();
	//private ArrayList<NewAppointment_Junit> doctors_name = new ArrayList<>();
    private int capacity;

    public NewAppointmentCollection_Junit() {
    	
        this.capacity = 2;
        
    }

    public NewAppointmentCollection_Junit(int capacity) {
        this.capacity = capacity;
    }

    public List<NewAppointment_Junit> getAppointments() {
        return appointments;
    }

    public void addAppointment(NewAppointment_Junit appointment) {
    	if(appointments.size() != capacity) {
    		appointments.add(appointment);
    	}
    }
    
   //@SuppressWarnings("unchecked")
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
