package work18;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class XmlHandler extends DefaultHandler {
    private Address address;
    private List<Address> listAddresses;
    private boolean inAddress = false, inName = false, inStreet = false,
            inCity = false, inState = false, inZip = false, inCountry = false;
    private StringBuilder data;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Address")) {
            inAddress = true;
            address = new Address();
            address.setType(attributes.getValue("Type"));
            if (listAddresses == null) {
                listAddresses = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("Name")) inName = true;
        else if (qName.equalsIgnoreCase("Street")) inStreet = true;
        else if (qName.equalsIgnoreCase("City")) inCity = true;
        else if (qName.equalsIgnoreCase("State")) inState = true;
        else if (qName.equalsIgnoreCase("Zip")) inZip = true;
        else if (qName.equalsIgnoreCase("Country")) inCountry = true;
        data = new StringBuilder();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }

    public List<Address> getListAddresses() {return listAddresses;}

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (inName) {
            address.setName(data.toString());
            inName = false;
        } else if (inStreet) {
            address.setStreet(data.toString());
            inStreet = false;
        } else if (inCity) {
            address.setCity(data.toString());
            inCity = false;
        } else if (inState) {
            address.setState(data.toString());
            inState = false;
        } else if (inZip) {
            address.setZip_index(data.toString());
            inZip = false;
        } else if (inCountry) {
            address.setCountry(data.toString());
            inCountry = false;
        }
        if (qName.equalsIgnoreCase("Address")) listAddresses.add(address);
    }


}
