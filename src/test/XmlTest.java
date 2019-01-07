package test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
  
import org.w3c.dom.Document;  
import org.w3c.dom.NamedNodeMap;  
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlTest {
	private static DocumentBuilderFactory dbFactory = null;  
    private static DocumentBuilder db = null;  
    private static Document document = null;  
    static{  
        try {  
            dbFactory = DocumentBuilderFactory.newInstance();  
            db = dbFactory.newDocumentBuilder();  
        } catch (ParserConfigurationException e) {  
            e.printStackTrace();  
        }  
    }
    
    public static void getinfo(String filepath) throws SAXException, IOException {
    	document = db.parse(filepath);  
    	 NodeList bookList = document.getElementsByTagName("Hit");
    	 //的确是10040个 没错啊
    	 //System.out.println(bookList.getLength());
    	 for (int i = 0; i < bookList.getLength(); i++) {
    		 org.w3c.dom.Node node = bookList.item(i); 
    		 NamedNodeMap namedNodeMap = node.getAttributes(); 
    		 if (namedNodeMap.getNamedItem("Hit_def")!=null) {
    			 String content =  namedNodeMap.getNamedItem("Hit_def").toString();
    			 System.out.println(content);
			}
		}
    	
    }
    public static void main(String[] args) throws SAXException, IOException {
		getinfo("C:\\Users\\tangqichang\\Desktop\\YMP1.1.fa.blastout.xml");
	}
    
}
