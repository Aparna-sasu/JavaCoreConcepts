package testpackage;

import java.util.ArrayList;

public class Honda extends Car{

//	public Honda(String msg) {
//		super(msg);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		
		Car c = new Honda();
		c.start("honda starting");
		//c.stop();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		
		System.out.println(ar);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
