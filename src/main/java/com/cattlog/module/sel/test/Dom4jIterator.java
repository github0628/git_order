package com.cattlog.module.sel.test;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jIterator {
	public static void test(File file) throws DocumentException{
		SAXReader read=new SAXReader();
		Document doc=read.read(file);
	//获得文档的根节点
		Element root=doc.getRootElement();
		Element book=root.element("book");		
		for(Iterator it=book.attributeIterator(); it.hasNext(); ) {   
		    Attribute attribute = (Attribute) it.next();
		    String text=attribute.getText();   
		    System.out.println(text);
		}
	   //取得root节点的子节点
//		Element element=root.element("book");
//		Element t=element.element("title");
//		System.out.println(t.getText());
    
	
	}
	public static void main(String[] args) throws DocumentException {
		test(new File("C:/cqr2/xmlTest.xml"));
	}

}
