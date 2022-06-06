package eks20v;

import java.util.List;

public class Student {

	public String fornavn;
	public String Etternavn;
	public int studentNr;

	public Student(String fornavn, int studentNr,String Etternavn) {
		this.fornavn=fornavn;
		this.studentNr=studentNr;
		this.Etternavn=Etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return Etternavn;
	}

	public void setEtternavn(String etternavn) {
		Etternavn = etternavn;
	}

	public int getStudentNr() {
		return studentNr;
	}

	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}

	@Override
	public String toString() {
		return "Student [fornavn=" + fornavn + ", Etternavn=" + Etternavn + ", studentNr=" + studentNr + "]";
	}
	
}
