package com.cattlog.module.sel.test;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void main(String[] args) throws IOException {
		Path path=Paths.get("C:/cqr2/testXml.xml");
		System.out.println(path.toString());
		System.out.println(path);
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		 System.out.println(path.getNameCount());
		 System.out.println("------------------");
		
	}

}
