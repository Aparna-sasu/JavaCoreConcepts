package abstractconcept;

public class Browser extends Web{

	@Override
//	public void title() {
//	System.out.println("");
//		
//	}

	public int getNum(int j) {
		
		System.out.println("From browser");
		int num = super.getNum(j);
		return num;
	}
}
