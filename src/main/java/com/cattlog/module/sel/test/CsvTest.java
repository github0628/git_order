package com.cattlog.module.sel.test;

import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class CsvTest {
	public static void main(String[] args) {
		String path="C:/cqr2/test.csv";
		readCscFile(path);
	}
   public static void readCscFile(String path){
	 
	  try{ ArrayList<String []> csvList=new ArrayList<String []>();
	  CsvReader reader=new CsvReader(path,',',Charset.forName("SJIS"));
	    reader.readHeaders();//跳过表头
	  while(reader.readRecord()){
		  csvList.add(reader.getValues());
	  }
	  reader.close();
	  for(int a=0;a<csvList.size();a++){
		  System.out.println(csvList.get(a)[0]);
		  System.out.println(csvList.get(a)[1]);
		  System.out.println(csvList.get(a)[2]);
		  System.out.println(csvList.get(a)[3]);
		  System.out.println("------------------");
	  }
	  }
	  catch(Exception e){
		  System.out.println(e);
      		  
	  }}
}
