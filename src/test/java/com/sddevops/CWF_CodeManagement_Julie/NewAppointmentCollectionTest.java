package com.sddevops.CWF_CodeManagement_Julie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import com.sddevops.CWF_CodeManagement_Julie.NewAppointment_Junit;
//import com.sddevops.junit_maven.eclipse.Song;
//import com.sddevops.junit_maven.eclipse.Song;

import java.util.List;

class NewAppointmentCollectionTest {
	
	private NewAppointmentCollection_Junit ac;
	private NewAppointment_Junit ac1;
	private NewAppointment_Junit ac2;
	
	private final int APPOINTMENT_COLLECTION_SIZE = 2;
	private final int APPOINTMENT_CAPACITY_LIMIT = 2;

	@BeforeEach
	void setUp() throws Exception {
		ac = new NewAppointmentCollection_Junit();
		ac1 = new NewAppointment_Junit("T0108307J","Julie Jway","Dental appointment on 19 Dec 2022","Dr Lim", 5, "2022-12-19", "12pm", "julie@gmail.com");
		ac2 = new NewAppointment_Junit("S1345676I","Lim Yuan","Eye appointment on 21 Nov 2022","Dr Tan",4, "2022-11-21", "4pm", "limyuan@gmail.com");
		
		
		ac.addAppointment(ac1);
		ac.addAppointment(ac2);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	void testNewAppointmentCollection_Junit() {
		fail("Not yet implemented");
	}

	
	void testNewAppointmentCollection_JunitInt() {
		fail("Not yet implemented");
	}



	@Test
	void testAddAppointment() {
		//fail("Not yet implemented");
		List<NewAppointment_Junit> testAc = ac.getAppointments();
		//Assert that Song collection is equals to song collection size 4
		assertEquals(testAc.size(), APPOINTMENT_COLLECTION_SIZE);
		//Act - Add song function to add 1 additional song
		ac.addAppointment(ac1);
		// Assert that Song Collection is equals to song collection size 4 + 1
		// We assert that the initial song collection size is now 5
		assertEquals(ac.getAppointments().size(), APPOINTMENT_COLLECTION_SIZE);
		//means "a passed parameter must not be null": if it is null then the test case fails.
		assertNotNull(ac1);
		//Assert that Song Collection cannot be more than 5 (max capacity) 
		assertEquals(ac.getAppointments().size(),APPOINTMENT_CAPACITY_LIMIT);
	}
	
	
	@Test
	void testSortAppointmentByAppointmentLength() {
		// fail("Not yet implemented");
		//Act 
		List<NewAppointment_Junit> testDoctor = ac.sortDoctorByDoctorLength();
		
		//arrange 
		double newDoctorNameLength1 = testDoctor.get(0).getDoctor_name_length();
		double newDoctorNameLength2 = testDoctor.get(1).getDoctor_name_length();
	
		
		//Assert that the the song list is sorted from largest to shortest song length 
		assertTrue(Double.compare(newDoctorNameLength1, newDoctorNameLength2) > 0);
		
	
	
	}
	
	
	

	@Test
	void testSortAppointmentsByTitle() {
		//fail("Not yet implemented");
List<NewAppointment_Junit> testAc = ac.sortAppointmentsByTitle();
		
		//Arrange 
		String newAppointmentTitle1 = testAc.get(0).getTitle();
		String newAppointmentTitle2 =  testAc.get(1).getTitle();
		
		
		//Assert that the Song list sorted from [A-Z] [a-z]
		assertEquals(newAppointmentTitle1,"Dental appointment on 19 Dec 2022");
		assertEquals(newAppointmentTitle2,"Eye appointment on 21 Nov 2022");

	}

	

	@Test
	void testFindAppointmentByTitle() {
		//fail("Not yet implemented");
	//fail("Not yet implemented");
		
		NewAppointment_Junit validAppointment = ac.findAppointmentByTitle("Dental appointment on 19 Dec 2022");
		NewAppointment_Junit invalidAppointment = ac.findAppointmentByTitle("Invalid Appointment Title");
		
		//assert we retrieve a valid song 
		assertNotNull(validAppointment);
		//assert retrieve the accurate song based on Id 
		assertEquals(validAppointment.getNric(),"T0108307J");
		//assert if we input invalid id : we get a null 
		assertNull(invalidAppointment);
	}
	
	
	@Test
	void testFindAppointmentByUserName() {
		//fail("Not yet implemented");
	//fail("Not yet implemented");
		
		NewAppointment_Junit validUserName = ac.findAppointmentByUserName("Julie Jway");
		NewAppointment_Junit invalidUsername = ac.findAppointmentByUserName("Invalid User name");
		
		//assert we retrieve a valid song 
		assertNotNull(validUserName);
		//assert retrieve the accurate song based on Id 
		assertEquals(validUserName.getNric(),"T0108307J");
		//assert if we input invalid id : we get a null 
		assertNull(invalidUsername);
	}


}
