
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tri tr = new Tri();
		
//		tr.process();
//		System.out.println("--------------------------------");
//		tr.process();
//		System.out.println("--------------------------------");
//		tr.process();
//		System.out.println("--------------------------------");
//		tr.process();
		
		
		tr.process();
		System.out.println("--------------------------------");
		tr.setTri(new TriImpl1());
		tr.process();
		System.out.println("--------------------------------");
		tr.setTri(new TriImpl2());
		tr.process();
		System.out.println("--------------------------------");
		tr.setTri(new TriImpl3());
		tr.process();
	}

}
