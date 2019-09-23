package com.rumahsakit;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rumahsakit.Dokter;
import rumahsakit.Fungsi;

public class TS_02 {
	Dokter dok, dok2, dok3;
	Fungsi fungsi;
	ArrayList<Dokter> listDokter;
	
	@Before
	public void initDok() {
		dok = new Dokter();
		dok2 = new Dokter();
		dok3 = new Dokter();
		fungsi = new Fungsi();
		listDokter = new ArrayList<Dokter>();
		
	}
	
	@Test
	public void TC_03() {
		dok.setKodeDokter("123");
		dok.setNamaDokter("Budi");
		dok.setSpesialis("Mata");
		dok.setAlamat("Bandung");
		dok.setJk("L");
		
		dok2.setKodeDokter("323");
		dok2.setNamaDokter("Adel");
		dok2.setSpesialis("Mata");
		dok2.setAlamat("Bandung");
		dok2.setJk("P");
		
		dok3.setKodeDokter("223");
		dok3.setNamaDokter("Faris");
		dok3.setSpesialis("Gigi");
		dok3.setAlamat("Bandung");
		dok3.setJk("L");
		
		listDokter.add(dok);
		listDokter.add(dok2);
		listDokter.add(dok3);
		
		ArrayList<Dokter> id = (ArrayList<Dokter>) fungsi.hapusDokter(listDokter, "323");
		Assert.assertNotSame(listDokter, id);
	}
}
