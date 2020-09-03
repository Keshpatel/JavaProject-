package OOP_Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.oncologySevices();
		fh.entServices();
		fh.emergencyServices();
		fh.neuroServices();
		USMedical.covidTest();  // static method called by interface name
		fh.billing();		// US Default method 
		//You can not create the object of an interface 
		fh.SwineFlu();
		fh.Covid19();
		
		//Top casting :
		
		USMedical us = new FortisHospital(); //child class object can be 
											//	Refereed by parent interface reference variable 
		us.ambulanceServices();
		us.cardioServices();
		us.emergencyServices();
		us.orthoServices();
		us.billing();
		us.SwineFlu();
		us.Covid19();
		
		
		
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.neuroServices();
		uk.Covid19();
		uk.SwineFlu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
