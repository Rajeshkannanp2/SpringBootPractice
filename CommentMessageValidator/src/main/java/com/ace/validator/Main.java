package com.ace.validator;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    static boolean checkTheProps = true;
    static Pattern patternForLink = Pattern.compile("<link[^>]*>.*?</link>");

    public static void main(String[] args) {
        // Path to your XML file
        //String filePath = "D:\\ACE_git_ant\\ACE-16622\\src\\config\\CommentMessages.props";
        
        String filePath = args[0]; // Replace with your file name
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
            	// Parse XML file
            	System.out.println("File Path : " +line);
        		Map<String, String> keyValuePairs = parseXmlFile(line);

        		// Check and print values with improperly formatted XML
        		checkXmlValues(keyValuePairs);
            }
            if (checkTheProps) {
    		    System.out.println("Files validation completed....No issue in tag");
    		}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, String> parseXmlFile(String filePath) {
        Map<String, String> keyValuePairs = new HashMap<>();

        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String content = line.replaceFirst("=", "||");
                String[] parts = content.split("\\|\\|");

                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    keyValuePairs.put(key, value);
                }
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return keyValuePairs;
    }

    private static void checkXmlValues(Map<String, String> keyValuePairs) {
        for (Map.Entry<String, String> entry : keyValuePairs.entrySet()) {
            String value = entry.getValue();

            // Properly formatted entity replacement
            value = value.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("(?:<!--|<\\?|\\?>|-->)", "");
            
            
            if(Pattern.compile("link").matcher(value).find()) {
            	boolean checkTheTag = checkLinks(value); 
            	if(checkTheTag) {
            		continue;
            	}else if(!checkTheTag) {
            		checkTheProps=false;
            		System.out.println("Key1: " + entry.getKey() + ", Value: " + value + " contains improperly formatted XML.");
            	}
           }else if (Pattern.compile("<|>").matcher(value).find()) {
        	   
        	   if(Pattern.compile("(?:<style|style>)").matcher(value).find()) {
        		   if(!Pattern.compile("<style[^>]*>.*?<\\/style>").matcher(value).find()) {
        			   checkTheProps=false;
        			   System.out.println("Key2: " + entry.getKey() + ", Value: " + value + " contains improperly formatted XML.");
        		   }
        	   }
        	   else if(Pattern.compile("(?:<b>|</b>|<i>|</i>)").matcher(value).find()) {
        		   if(!areTagsBalanced(value)) {
        			   checkTheProps=false;
        			   System.out.println("Key3: " + entry.getKey() + ", Value: " + value + " contains improperly formatted XML.");
        		   }
        	   }
        	   else if (!XmlValidator.isValidXml(value)) {
        		   checkTheProps=false;
        		   System.out.println("Key4: " + entry.getKey() + ", Value: " + value + " contains improperly formatted XML.");
               }
           }
        }
    }
    
    public static boolean areTagsBalanced(String input) {
        Stack<String> stack = new Stack<>();
        Pattern pattern = Pattern.compile("</?([a-zA-Z]+)>");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String tag = matcher.group();
            String tagName = matcher.group(1);

            if (tag.charAt(1) != '/') {
                // Opening tag
                stack.push(tagName);
            } else {
                // Closing tag
                if (stack.isEmpty() || !stack.pop().equals(tagName)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
    public static boolean checkLinks(String input) {
    	Boolean checkLinkTag = false;
    	int linkCount = countLinks(input);

        ArrayList<String> links = new ArrayList<>();
        Matcher matcher = patternForLink.matcher(input);

        while (matcher.find()) {
            links.add(matcher.group());
            boolean checking = XmlValidator.isValidXml(matcher.group());
            //System.out.println(checking+"===="+matcher.group());
        }
        
        if(linkCount==links.size()) {
        	checkLinkTag = true;
        	//System.out.println("link tag perfect....");
        }else {
        	if(Pattern.compile("<link|link>").matcher(input).find()) {
        		checkLinkTag = false;
            	System.out.println("Issue in link tag..."+input);
        	}else {
        		checkLinkTag = true;
        	}
        }
        return checkLinkTag;
    }
    
    public static int countLinks(String input) {
        int count = 0;
        Pattern pattern = Pattern.compile("link id");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
