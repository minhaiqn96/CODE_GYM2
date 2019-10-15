/*
 * Supermarket.java
 *
 *
 */

package supermarket;
import java.util.Scanner;
import java.io.IOException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author vincent
 */
public class Supermarket {
  
  /** Creates a new instance of Supermarket */
  public Supermarket() {
  }
  public static void main(String[] args){
    try {
      System.out.println("Enter the name of the XML document to parse");
      Scanner input = new Scanner(System.in);
      String filename = input.next();
      SAXParserFactory SPfactory = SAXParserFactory.newInstance();
      SAXParser parser = SPfactory.newSAXParser();
      // Create a new XML parser
      XMLReader reader = parser.getXMLReader();
      reader.setErrorHandler(new CustomErrorHandler());
      reader.setContentHandler(new CustomDocHandler());
      reader.parse(filename);
    } catch(IOException e){ System.out.println(e.getMessage());} catch (ParserConfigurationException e) {
      System.out.println("The underlying parser does not support the requested features.");
    } catch (FactoryConfigurationError e) {
      System.out.println("Error occurred obtaining SAX Parser Factory.");
    } catch (SAXException e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
class CustomErrorHandler implements ErrorHandler {
  public void warning(SAXParseException ex) throws SAXException {
    
    System.out.println("Parsing Warning encountered");
    System.out.println("Line:" + ex.getLineNumber()+"Message: "+ex.getMessage());
  }
  public void error(SAXParseException ex) throws SAXException {
    
    System.out.println("**Parsing Error encountered**");
    System.out.println("Line:" + ex.getLineNumber()+"Message: "+ex.getMessage());
  }
  public void fatalError(SAXParseException ex) throws SAXException {
    System.out.println("**Parsing Fatal Error**");
    System.out.println("Line:" + ex.getLineNumber()+"Message: "+ex.getMessage());
  }
}
class CustomDocHandler extends DefaultHandler 
{
  public void startDocument() throws SAXException {
System.out.println("Start of Document");
}
public void endDocument() throws SAXException{
System.out.println ("End of Document");
}
public void startElement(String qname) throws SAXException{
System.out.println("Start element:\t"+qname);
}
public void characters(char[] ch, int start, int length) throws SAXException {
String text = new String(ch, start, length);
if (!(text.trim().equals("")))
{
	System.out.println("Text element: "+text);
}
}
public void endElement(String uri, String name, String qname) throws SAXException
{
System.out.println("End: \t"+qname);
}
public void processingInstruction(String target, String data) throws SAXException
{

System.out.println("This is for the target: '"+target+"' to process this instruction '"+data+"'");
}
  
}