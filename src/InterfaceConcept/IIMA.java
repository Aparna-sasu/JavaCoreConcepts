package InterfaceConcept;

public class IIMA implements USEducationSystem, UKEducationSystem, IndianEducationSystem {

	@Override
	public void BBA() {
		System.out.println("BBA - IndianEducationSystem");
		
	}

	@Override
	public void MBA() {
		System.out.println("MBA - IndianEducationSystem");
		
	}

	@Override
	public void MFin() {
		
		System.out.println("MFin - UKEducationSystem");
	}

	@Override
	public void Pg() {
		System.out.println("Pg - UKEducationSystem");
		
	}

	@Override
	public void PhD() {
		System.out.println("PhD - USEducationSystem");
		
	}

	@Override
	public void MSc() {
		System.out.println("MSc - USEducationSystem");
		
	}

	@Override
	public void EMBA() {
		System.out.println("EMBA - USEducationSystem");
		
	}
	
	

}
