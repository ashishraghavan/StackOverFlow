//https://stackoverflow.com/questions/56637656/reading-multiple-lines-of-input-from-user-using-buffer-reader

package com.stackoverflow;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingMultipleLines {
    public static void main(String args[]) throws IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder;
        String line;
        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElementNS("www.DATA.com/XML", "Contact");
            doc.appendChild(rootElement);
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many containers are you planning to ship?");
            line = buf.readLine();


            //First separate out the space.
            String[] columnStrings = line.split(" ");

            for (String columnString : columnStrings) {
                String[] columns = columnString.split(":");
                String id = columns[0];
                String street = columns[1];
                String city = columns[2];
                String state = columns[3];
                String zipcode = columns[4];
                String country = columns[5];
                // close the input stream
                buf.close();
                //append first child element to root element
                rootElement.appendChild(getShipmentDetails(doc, id, street, city, state, zipcode, country));
            }

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ContactDetails.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
            System.out.println("");
            System.out.println("XML file saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Node getShipmentDetails(Document doc, String id, String street, String city, String state, String zipcode, String country) {
        Element address = doc.createElement("address");

        //set id attribute
        address.setAttribute("addressId", id);

        //create street element
        address.appendChild(getShipmentElements(doc, address, "street", street));

        //create city element
        address.appendChild(getShipmentElements(doc, address, "city", city));

        //create state element
        address.appendChild(getShipmentElements(doc, address, "state", state));

        //create zipcode element
        address.appendChild(getShipmentElements(doc, address, "zipcode", zipcode));

        //create country element
        address.appendChild(getShipmentElements(doc, address, "country", country));

        return address;
    }

//utility method to create text node


    private static Node getShipmentElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}
