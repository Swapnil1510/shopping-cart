
public class College {
	private int rollno;
	private String studentname;
	private String mobileno;
	private String branch;
	private String semester;

	public College() {

	}

	public College(int rollno, String studentname, String mobileno, String branch, String semester) {
		super();
		this.rollno = rollno;
		this.studentname = studentname;
		this.mobileno = mobileno;
		this.branch = branch;
		this.semester = semester;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

}
