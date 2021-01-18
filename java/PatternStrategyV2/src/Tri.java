
public class Tri {

	private InterfaceTri tri;
	
	
	public Tri() {
		this.tri= new TriImplDefault();
	}
	
	
	
	public void process() {
		
		System.out.println("Init step");

		
		tri.applyTri();
		
		System.out.println("Last step ");

		
	}

	

	



	public void setTri(InterfaceTri tri) {
		this.tri = tri;
	}
	
	
}
