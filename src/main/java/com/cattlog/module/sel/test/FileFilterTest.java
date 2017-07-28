package com.cattlog.module.sel.test;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilterTest extends FileFilter{

	@Override
	public boolean accept(File f) {
		if(f.isDirectory())
			return true;
			return f.getName().endsWith(".exe");
		
	}

	@Override
	public String getDescription() {
		
		return ".exe";
	}
	

}
