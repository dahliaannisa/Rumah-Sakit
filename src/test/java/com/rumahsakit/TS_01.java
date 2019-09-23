package com.rumahsakit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rumahsakit.Dokter;
import rumahsakit.Fungsi;

public class TS_01 {
	Dokter dok;
	Fungsi fungsi;
	
	@Before
	public void initDok() {
		dok = new Dokter() ;
		fungsi = new Fungsi();
		
	}
	
	@Test
	public void TC_01() {
		dok.setKodeDokter("123");
		dok.setNamaDokter("Budi");
		dok.setSpesialis("Mata");
		dok.setAlamat("Bandung");
		dok.setJk("L");
		
		boolean cek = fungsi.validasiTambahDokter(dok);
		Assert.assertTrue(cek);
	}
	
	@test
	public void TC_02() {
		dok.setKodeDokter("");
		dok.setNamaDokter("");
		dok.setSpesialis("");
		dok.setAlamat("");
		dok.setJk("");
		
		boolean cek = fungsi.validasiTambahDokter(dok);
		Assert.assertFalse(cek);
	}
}
