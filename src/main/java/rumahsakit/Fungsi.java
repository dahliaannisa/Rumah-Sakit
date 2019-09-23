package rumahsakit;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Fungsi {
	public boolean validasiTambahDokter(Dokter dok) {
		if(dok.getKodeDokter() != "" &&
		   dok.getNamaDokter() != "" &&
		   dok.getAlamat() != "" &&
		   dok.getSpesialis() != "" &&
		   dok.getJk() != "") {
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Dokter> hapusDokter(ArrayList<Dokter> dok, String kodeDokter){
		Iterator<Dokter> it = dok.iterator();
		ArrayList<Dokter> id = new ArrayList<>();
			while (it.hasNext()) {
				Dokter d = it.next();
				if (d.getKodeDokter().equals(kodeDokter)) {
					d.setKodeDokter("");
					d.setNamaDokter("");
					d.setSpesialis("");
					d.setAlamat("");
					d.setJk("");
					System.out.println(d.getKodeDokter());
				}
				id.add(d);
		}
			return id;
	}
}
