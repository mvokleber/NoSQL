package Request_Engine;

public class RDFTriplets {

	int s;
	int p;
	int o;
	
	public RDFTriplets(int ns, int np, int no) {
		// TODO Auto-generated constructor stub
		this.s = ns;
		this.p = np;
		this.o = no;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("{"+s+","+p+","+o+"}");
		
	}

}