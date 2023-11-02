package work18.home;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static File xml= new File("src\\work18\\home\\xmlHome.xml");
    static Scanner in = new Scanner(System.in);
    static final String DIRECTORY="src\\work18\\home\\";
    public static void main(String[] args) {
        System.out.println("Task1 and Task*");
        System.out.println("Enter number, number 1-parse xml using DOM, number 2 - parse xml using SAX");
        if(in.hasNextInt()){
        int num = in.nextInt();
        if(num==1)
        parseXmlDOM();
        else if (num==2) parseXmlSAX();
        else {System.out.println("There is no such option");}
        }
        else {
            System.out.println("It isn't number");
        }
    }

    private static void parseXmlSAX() {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            XmlHandler xmlHandler = new XmlHandler();
            saxParser.parse(xml, xmlHandler);
            System.out.println(xmlHandler.getFirstName()+xmlHandler.getLastName()+xmlHandler.getTitle()+xmlHandler.getLines());
            writeInFile(DIRECTORY+xmlHandler.getFirstName()+"_" +
                    "_"+xmlHandler.getLastName()+
                    "_"+xmlHandler.getTitle()+"_SAX.txt",xmlHandler.getLines());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }


    private static void parseXmlDOM() {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            String lastName, firstName, title;
            Document document = documentBuilder.parse(xml);
            String lines = "";
            Node nodeSonnet = document.getElementsByTagName("sonnet").item(0);
            if (nodeSonnet.getNodeType() == Node.ELEMENT_NODE) {
                lines = getLines((Element) nodeSonnet);
            }
            lastName = document.getElementsByTagName("lastName").item(0).getTextContent();
            firstName = document.getElementsByTagName("firstName").item(0).getTextContent();
            title = document.getElementsByTagName("title").item(0).getTextContent();
            writeInFile( DIRECTORY+ firstName + "_" + lastName
                    + "_" + title + "_DOM.txt",lines);
            System.out.println(lines);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

    }

    private static void writeInFile(String path, String lines) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(lines);
        fileWriter.close();
    }

    private static String getLines(Element element) {
        NodeList lines = element.getElementsByTagName("line");
        StringBuilder sonnetText = new StringBuilder();
        for (int i = 0; i < lines.getLength(); i++) {
            Node lineNode = lines.item(i);

            if (lineNode.getNodeType() == Node.ELEMENT_NODE) {
                Element lineElement = (Element) lineNode;
                sonnetText.append(lineElement.getTextContent() + "\n");
            }
        }
        return sonnetText.toString();
    }
}
