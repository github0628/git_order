package com.cattlog.module.sel.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@BeforeClass //的所有方法运行之前运行。 
	public static void beforeClass(){ System.out.println("-------------------beforeClass"); }

	@Test
	public void testAdd(){
		int A=9;
		int b=0;
		assertEquals(A,9);
		//int a=9/0;
	}
	@Test
	public void testAdd2(){
		int A=9;
		int b=0;
		assertEquals(b,0);
		//int a=9/0;
	}
	@Test
	public void testAdd3(){
		int A=9;
		int b=11;
		assertEquals(b,11);
		//int a=9/0;
	}

}
