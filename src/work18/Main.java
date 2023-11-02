package work18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.*;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    static File xml = new File("src\\work18\\exampleXml.xml");

    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithXmlDOM();
        System.out.println("Practice 2");
        workWithXmlSAX();
        System.out.println("Practice 3");
        workWithXmlStAX();
        System.out.println("Practice 4");
        getJSON();
    }

    private static void getJSON(){
        try {
            Map<String,String> animals = new HashMap<>();
            animals.put("tiger","roar");
            animals.put("cat","meow");
            animals.put("rabbit","fr");
            animals.put("dog","woof");
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(animals);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private static void workWithXmlStAX() {
        List<Address> addresses = new ArrayList<>();
        Address address = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xml));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equalsIgnoreCase("Address")) {
                        address = new Address();
                        Attribute attribute = startElement.getAttributeByName(new QName("Type"));
                        if (attribute != null) address.setType(attribute.getValue());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("Name")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("Street")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setStreet(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("City")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setCity(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("State")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setState(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("Zip")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setZip_index(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equalsIgnoreCase("Country")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        address.setCountry(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equalsIgnoreCase("Address")) {
                        addresses.add(address);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
      System.out.println(addresses);
    }

    private static void workWithXmlSAX() {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            XmlHandler xmlHandler = new XmlHandler();
            saxParser.parse(xml, xmlHandler);
            System.out.println(xmlHandler.getListAddresses());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void workWithXmlDOM() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            List<Address> addresses = new ArrayList<>();
            Document document = documentBuilder.parse(xml);
            NodeList nodeList = document.getElementsByTagName("Address");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    Address address = new Address();
                    address.setType(element.getAttribute("Type"));
                    address.setName(element.getElementsByTagName("Name").item(0).getTextContent());
                    address.setStreet(element.getElementsByTagName("Street").item(0).getTextContent());
                    address.setCity(element.getElementsByTagName("City").item(0).getTextContent());
                    address.setState(element.getElementsByTagName("State").item(0).getTextContent());
                    address.setZip_index(element.getElementsByTagName("Zip").item(0).getTextContent());
                    address.setCountry(element.getElementsByTagName("Country").item(0).getTextContent());
                    addresses.add(address);
                }
            }
            System.out.println(addresses);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getMessage());
        }
    }
}
