package Xml;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFileJava {
	
	public static final String xmlFilePath = "C:\\xmlfile.xml";

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d=db.newDocument();
		Element root=d.createElement("FIFA");
		d.appendChild(root);
		Element branch=d.createElement("branch");		
		Attr attr=d.createAttribute("continent");
		Attr head=d.createAttribute("president");
		branch.setAttributeNode(attr);
		branch.setAttributeNode(head);
		root.appendChild(branch);
		
		Element fed1=d.createElement("EUFA");
		branch.appendChild(fed1);
		fed1.setAttribute("continent", "Europe");
		fed1.setAttribute("president", "Platini");
		
		Element fed2=d.createElement("CONCACAFF");
		branch.appendChild(fed2);
		fed2.setAttribute("continent", "Latin America");
		fed2.setAttribute("president", "Eusebbio");	
		
		Element country=d.createElement("country");
		Attr a=d.createAttribute("id");
		//country.setAttribute(a, "1");
		fed1.appendChild(country);
		country.setTextContent("IT");
		fed1.appendChild(country);
		country.setTextContent("UK");
		
		TransformerFactory tf=TransformerFactory.newInstance();
		Transformer t=tf.newTransformer();
		DOMSource ds=new DOMSource(d);
		StreamResult sr=new StreamResult(new File(xmlFilePath));
		t.transform(ds, sr);
		System.out.println("Done creating XML File");

	}

}
