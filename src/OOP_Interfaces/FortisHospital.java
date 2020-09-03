package OOP_Interfaces;

public class FortisHospital extends MedicalOrg implements USMedical , UKMedical, IndianMedical{

	
	//US Medical
	@Override
	public void ambulanceServices() {
		System.out.println("FH ---ambulanceServices. ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH ---cardioServices. ");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH ---emergencyServices.");
		
	}
	@Override
	public void orthoServices() {
		System.out.println("FH ---orthoServices.");
	}


	
	//UK Medical
	@Override
	public void neuroServices() {
		System.out.println("FH ---NuroServices.");
		
	}

	@Override
	public void entServices() {
		System.out.println("FH ---entServices.");
	}

	
	//Indian Medical
	@Override
	public void oncologySevices() {
		System.out.println("FH ---oncologySevices.");
	}

	@Override
	public void physioServices() {
		System.out.println("FH ---physioServices.");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH ---pediaServices.");
		
	}

	
	//non overridden methods:
	
	public void MedialInsurence(){
		System.out.println("FH ---MedialInsurence.");
	}
	public void MedicalTraning()
	{
		System.out.println("FH Medical Training ");
	}
	@Override
	public void billing() {
		System.out.println("FH---Medical Billing ");
	}
	
	
	
	//WHO
	@Override
	public void SwineFlu() {
		System.out.println("FH--SwineFlu ");
		
	}

	@Override
	public void Covid19() {
		System.out.println("FH--Covid19 ");
		
		
	}


	
	
}
