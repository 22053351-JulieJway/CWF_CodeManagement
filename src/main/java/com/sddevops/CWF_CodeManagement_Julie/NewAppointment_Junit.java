package com.sddevops.CWF_CodeManagement_Julie;

import java.util.Comparator;
//import java.util.Objects;



public class NewAppointment_Junit {
	public String nric;
	public String userName;
	public String title;
	public String doctor_name;
	public int doctor_name_length;
	public String date_of_appointment;
	public String time_of_appointment;
	public String email;


	public NewAppointment_Junit(String nric, String userName, String title, String doctor_name, int doctor_name_length, String date_of_appointment, String time_of_appointment, String email ) {
		super();
		this.nric = nric;
		this.userName = userName;
		this.title = title;
		this.doctor_name = doctor_name;
		this.doctor_name_length = doctor_name_length;
		this.date_of_appointment = date_of_appointment;
		this.time_of_appointment = time_of_appointment;
		this.email = email;
	}


	public String getNric() {
		return nric;
	}


	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String doctor_name() {
		return doctor_name;
	}
	
	public double getDoctor_name_length() {
		return doctor_name_length;
	}


	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	
	
	public String date_of_appointment() {
		return date_of_appointment;
	}


	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	
	
	public String time_of_appointment() {
		return time_of_appointment;
	}


	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	
	
	public String email() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	



	public static Comparator<NewAppointment_Junit> titleComparator = new Comparator<NewAppointment_Junit>() {
		@Override
		public int compare(NewAppointment_Junit a1, NewAppointment_Junit a2) {
			return (int) (a1.getTitle().compareTo(a2.getTitle()));
		}
	};
	
	public static Comparator<NewAppointment_Junit> doctorLengthComparator = new Comparator<NewAppointment_Junit>() {
		@Override         
	    public int compare(NewAppointment_Junit d1, NewAppointment_Junit d2) {             
	      return (d2.getDoctor_name_length() <d1.getDoctor_name_length() ? -1 :                     
	              (d2.getDoctor_name_length() == d1.getDoctor_name_length() ? 0 : 1));           
	    }     
	};
	
	public static Comparator<NewAppointment_Junit> userNameComparator = new Comparator<NewAppointment_Junit>() {
	
		public int compare(NewAppointment_Junit a1, NewAppointment_Junit a2) {
			return (int) (a1.getUserName().compareTo(a2.getUserName()));
		}
	};
	
}

	

