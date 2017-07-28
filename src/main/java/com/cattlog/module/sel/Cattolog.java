package com.cattlog.module.sel;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.Parser;

public class Cattolog {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\qiaorui.chen\\Documents\\Test\\regist-1\\test.xml");
		String xmlPath=file.getAbsolutePath();
		List<Map<String, String>> list=parseDBXML(xmlPath)	;
		for(int i=0;i<list.size();i++){
			Map  map=(HashMap)list.get(i);
			 String  netMode=(String)map.get("title");
			 String  netMode1=(String)map.get("year");
			 String  netMode2=(String)map.get("price");
			 System.out.println(netMode);
			 System.out.println(netMode1);
			 System.out.println(netMode2);
		
		System.out.println("=======结束=======");
	}}
	
	public static List<Map<String, String>> parseDBXML(String configFile) throws Exception {
	    List<Map<String, String>> dbConnections = new ArrayList<Map<String, String>>();
	    //InputStream is = Parser.class.getResourceAsStream(configFile);
	    SAXReader saxReader = new SAXReader();
	    Document document = saxReader.read(configFile);
	    Element connections = document.getRootElement();

	    Iterator<Element> rootIter = connections.elementIterator();
	    while (rootIter.hasNext()) {
	    	//得到一个book节点
	        Element connection = rootIter.next();
	        //得到一个book节点遍历器
	        Iterator<Element> childIter = connection.elementIterator();
	        //new出来一个Map集合
	        Map<String, String> connectionInfo = new HashMap<String, String>();
	        //得到属性节点List
	        List<Attribute> attributes = connection.attributes();
	        for (int i = 0; i < attributes.size(); ++i) { // 添加节点属性
	            connectionInfo.put(attributes.get(i).getName(), attributes.get(i).getValue());
	        }
	        while (childIter.hasNext()) { // 添加子节点
	            Element attr = childIter.next();
	            connectionInfo.put(attr.getName().trim(), attr.getText().trim());
	        }
	        dbConnections.add(connectionInfo);
	    }

	    return dbConnections;
	}
}
	

	
	