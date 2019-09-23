package rumahsakit;

public class Dokter {
	private String kodeDokter;
	private String namaDokter;
	private String Spesialis;
	private String alamat;
	private String jk;
	
	public Dokter() {
		
	}

	public String getKodeDokter() {
		return kodeDokter;
	}

	public void setKodeDokter(String kodeDokter) {
		this.kodeDokter = kodeDokter;
	}

	public String getNamaDokter() {
		return namaDokter;
	}

	public void setNamaDokter(String namaDokter) {
		this.namaDokter = namaDokter;
	}

	public String getSpesialis() {
		return Spesialis;
	}

	public void setSpesialis(String spesialis) {
		Spesialis = spesialis;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}
}
