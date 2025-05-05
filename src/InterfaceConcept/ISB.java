package InterfaceConcept;

public class ISB implements USEducationSystem, UKEducationSystem, IndianEducationSystem {
	
	@Override
	public void BBA() {
		System.out.println("ISB - BBA - IndianEducationSystem");
		
	}

	@Override
	public void MBA() {
		System.out.println("ISB - MBA - IndianEducationSystem");
		
	}

	@Override
	public void MFin() {
		
		System.out.println("ISB - MFin - UKEducationSystem");
	}

	@Override
	public void Pg() {
		System.out.println("ISB - Pg - UKEducationSystem");
		
	}

	@Override
	public void PhD() {
		System.out.println("ISB - PhD - USEducationSystem");
		
	}

	@Override
	public void MSc() {
		System.out.println("ISB - MSc - USEducationSystem");
		
	}

	@Override
	public void EMBA() {
		System.out.println("ISB - EMBA - USEducationSystem");
		
	}

}
