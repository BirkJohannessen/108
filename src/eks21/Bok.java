package eks21;

import java.util.List;

public class Bok {


	public String tittel;
	public int aar;
	public List<String> forfattere; //Hver forfatter er en enkel String
	
	public Bok(String tittel, int aar,List<String> forfattere) {
		this.tittel=tittel;
		this.aar=aar;
		this.forfattere=forfattere;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public List<String> getForfattere() {
		return forfattere;
	}

	public void setForfattere(List<String> forfattere) {
		this.forfattere = forfattere;
	}
	@Override
	public String toString() {
		return "Bok [tittel=" + tittel + ", aar=" + aar + ", forfattere=" + forfattere + "]";
	}
}
