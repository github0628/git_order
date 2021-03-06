package com.cattlog.module.sel.test;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		File file = new File("C:/cqr2/xmlTest.xml");
		Document document = reader.read(file);
		Element root = document.getRootElement();
		// System.out.println(root.getName());
		List<Element> childElements = root.elements();
		for (Element child : childElements) {

			List<Attribute> attributeList = child.attributes();
			for (Attribute attr : attributeList) {
				System.out.println(attr.getName() + ": " + attr.getValue());
			}

			// 已知属性名情况下
			// System.out.println("id: " + child.attributeValue("id"));

			// 未知子元素名情况下
			/*
			 * List<Element> elementList = child.elements(); for (Element ele :
			 * elementList) { System.out.println(ele.getName() + ": " +
			 * ele.getText()); } System.out.println();
			 */

			// 已知子元素名的情况下
			System.out.println("title" + child.elementText("title"));
			System.out.println("author" + child.elementText("author"));
			// 这行是为了格式化美观而存在
			// System.out.println();
		}
	}

}
