package com.rumahsakit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith (Suite.class)
@Suite.SuiteClasses({
	TS_01.class,
	TS_02.class // untukmerunning yang mana dan jika disini kelas yang di tes bisa langsung dua
})

public class Main {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Main.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
