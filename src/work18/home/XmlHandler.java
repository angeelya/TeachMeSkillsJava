package work18.home;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class XmlHandler extends DefaultHandler {
    private StringBuilder lines= new StringBuilder();
    private String firstName, lastName, title;
    private boolean inSonnet = false, inLastName = false, inFirstName = false,
            inLine = false, inTitle = false;
    private StringBuilder data;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("lastName")) {
            inLastName = true;
        } else if (qName.equalsIgnoreCase("firstName")) {
            inFirstName = true;
        } else if (qName.equalsIgnoreCase("title")) {
            inTitle = true;
        } else if (qName.equalsIgnoreCase("line")) {
            inLine = true;
        }
        data = new StringBuilder();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (inLastName) {lastName = data.toString(); inLastName=false;}
        else if (inFirstName) {firstName=data.toString(); inFirstName=false;}
        else if(inTitle) {title= data.toString();inTitle=false;}
        if(qName.equalsIgnoreCase("line")) lines.append(data.toString()+"\n");
    }
    public String getLines() {
        return lines.toString();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }
}
