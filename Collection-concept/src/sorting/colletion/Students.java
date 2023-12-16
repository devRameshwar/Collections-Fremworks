package sorting.colletion;

public class Students {

	private int stdId;
	private String dpt;

	public Students(int stdId, String dpt) {
		super();
		this.stdId = stdId;
		this.dpt = dpt;

	}

	@Override
	public String toString() {
		return stdId + "\t" + dpt + "\t";
	}

}
