package dbt.online.delivery;

public class Supplement extends Product {

	private int SUPPLEMENT_ID=0;
	
	public Supplement() {
		super();
	}

	public int getSUPPLEMENT_ID() {
		return SUPPLEMENT_ID;
	}

	public void setSUPPLEMENT_ID(int sUPPLEMENT_ID) {
		SUPPLEMENT_ID = sUPPLEMENT_ID;
	}

}
