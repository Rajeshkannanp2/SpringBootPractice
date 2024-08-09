package com.ace.validator;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlValidator {
	public static boolean isValidXml(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Custom error handler to suppress error messages
            builder.setErrorHandler(new DefaultHandler() {
                @Override
                public void error(SAXParseException e) throws SAXException {
                    // Do nothing or log the error if necessary
                }

                @Override
                public void fatalError(SAXParseException e) throws SAXException {
                    // Do nothing or log the error if necessary
                }

                @Override
                public void warning(SAXParseException e) throws SAXException {
                    // Do nothing or log the warning if necessary
                }
            });

            builder.parse(new InputSource(new StringReader(xml)));
            return true; // XML is well-formed
        } catch (ParserConfigurationException | SAXException | IOException e) {
            return false; // XML is not well-formed
        }
    }
}
