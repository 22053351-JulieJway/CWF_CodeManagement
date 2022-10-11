package com.sddevops.CWF_CodeManagement_Julie;

import java.util.Comparator;
import java.util.Objects;

//import com.sddevops.junit_maven.eclipse.Song;

public class NewAppointment_Junit {
	private String nric;
	private String userName;
	private String title;
	private String doctor_name;
	private int doctor_name_length;
	private String date_of_appointment;
	private String time_of_appointment;
	private String email;

	/**
	 * @param id
	 * @param title
	 * @param artiste
	 * @param songLength
	 */
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

	/**
	 * @return the id
	 */
	public String getNric() {
		return nric;
	}

	/**
	 * @param id the id to set
	 */
	public void setNric(String nric) {
		this.nric = nric;
	}

	/**
	 * @return the title
	 */
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

	/**
	 * @param songLength the songLength to set
	 */
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	
	
	public String date_of_appointment() {
		return date_of_appointment;
	}

	/**
	 * @param songLength the songLength to set
	 */
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	
	
	public String time_of_appointment() {
		return time_of_appointment;
	}

	/**
	 * @param songLength the songLength to set
	 */
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	
	
	public String email() {
		return email;
	}

	/**
	 * @param songLength the songLength to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nric,userName, title, doctor_name, date_of_appointment, time_of_appointment, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof NewAppointment_Junit))
			return false;
		NewAppointment_Junit other = (NewAppointment_Junit) obj;
		return Objects.equals(nric, other.nric) && Objects.equals(userName, other.userName)
				&& Objects.equals(title, other.title) ==  Objects.equals(doctor_name, other.doctor_name)
				&& Objects.equals(date_of_appointment, other.date_of_appointment)&& Objects.equals(time_of_appointment, other.time_of_appointment)
				&& Objects.equals(email, other.email);
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
		@Override
		public int compare(NewAppointment_Junit a1, NewAppointment_Junit a2) {
			return (int) (a1.getUserName().compareTo(a2.getUserName()));
		}
	};
	
}

	

