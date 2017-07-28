package com.cattlog.module.sel.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.crimson.tree.XmlDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// readXmlFile("C:/cqr2/xmlTest.xml");
		insertXml();
	}

	public static void readXmlFile(String path) throws ParserConfigurationException, SAXException, IOException {
		// 加载本地文件
		File file = new File(path);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder doc = factory.newDocumentBuilder();
		Document document = doc.parse(file);
		NodeList nl = document.getElementsByTagName("book");
		// for(int a=0;a<nl.getLength();a++){
		Element node = (Element) nl.item(0);
		System.out.println("Name: " + node.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
		// }
		// System.out.println( document.getElementById("12"));

		// Element element=document.getDocumentElement();
		// System.out.println(element.getTextContent());
		// NodeList nodeList=element.getElementsByTagName("book");
		// System.out.println(nodeList.item(0).getNodeName());
		// System.out.println(nodeList.item(2).getNodeName());

	}

	// 向已存在的xml文件插入元素
	public static void insertXml() throws ParserConfigurationException, SAXException, IOException {
		Element books = null;
		Element book = null;
		Element name = null;
		Element price = null;
		// Element author=null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbFactory.newDocumentBuilder();
		Document doc = db.parse("C:/cqr2/xmlTest.xml");
		NodeList nl = doc.getElementsByTagName("books");
		books = (Element) nl.item(0);
		book = doc.createElement("book");
		book.setAttribute("id", "100");
		name = doc.createElement("name");
		name.appendChild(doc.createTextNode("熊二"));
		book.appendChild(name);
		books.appendChild(book);
		((XmlDocument) doc).write(new FileOutputStream("C:/cqr2/xmlTest.xml"));
		System.out.println("输出成功！");

	}

}
