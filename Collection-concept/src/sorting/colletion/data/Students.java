package sorting.colletion.data;

public class Students implements Comparable<Students> {

	private int stdId;
	private String stdName;
	private long stdPhNumber;
	private char gender;

	public Students(int stdId, String stdName, long stdPhNumber, char gender) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdPhNumber = stdPhNumber;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return stdId + "\t " + stdName + "\t" + stdPhNumber + "\t" + gender;
	}

	@Override
	public int compareTo(Students o) {

		return  this.stdId-o.stdId;
	}

}
