package Xml;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFileJava0 {
	
	public static final String xmlFilePath = "C:\\xmlfile0.xml";

	public static void main(String[] args) throws ParserConfigurationException, TransformerException, InterruptedException {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document document =db.newDocument();
		
		Element root = document.createElement("company");
		document.appendChild(root);
		
		String [][] arr= {{"Іван","Коваленко","111","01"},
							{"Андрій","Петренко","222","02"},
								{"Олег","Борисенко","333","03"},
									{"Петро","Вальцман","444","04"}};
				
		for (int i=0;i<4;i++) {
			long id=System.currentTimeMillis();
			Thread.sleep(1L);			
			String idText=md5(String.valueOf(id));			
			Element employee = document.createElement("employee");
			root.appendChild(employee);
			Attr attr = document.createAttribute("id");
			employee.setAttributeNode(attr);
			//attr.setValue(String.valueOf(id));		
			attr.setValue(idText);
			Element firstName = document.createElement("firstname");
			firstName.appendChild(document.createTextNode(arr[i][0]));
			employee.appendChild(firstName);
			Element lastname = document.createElement("lastname");
			lastname.appendChild(document.createTextNode(arr[i][1]));
			employee.appendChild(lastname);
			Element email = document.createElement("email");
			email.appendChild(document.createTextNode(arr[i][2]));
			employee.appendChild(email);
			Element department = document.createElement("department");
			department.appendChild(document.createTextNode(arr[i][3]));
			employee.appendChild(department);
		}
		
		TransformerFactory tf=TransformerFactory.newInstance();
		Transformer t=tf.newTransformer();
		DOMSource ds=new DOMSource(document);
		StreamResult sr=new StreamResult(new File(xmlFilePath));
		t.transform(ds, sr);
		System.out.println("Done creating XML File");

	}
	static String md5(String password) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CreateXMLFileJava0.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        md.update(password.getBytes());
        byte byteData[] = md.digest();
 
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
}

}
