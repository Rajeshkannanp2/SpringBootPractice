import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D:\\TestingFile\\ACSReport\\Thread8_txt"; // replace with the path to your folder
        String csvFilePath = "D:\\TestingFile\\ACSReport\\file.csv"; // replace with the path to your CSV file
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        try {
            FileWriter csvWriter = new FileWriter(csvFilePath);
            csvWriter.append("File Name, midprocessXML Rules, midprocessJAVA Rules, XML Rules, JAVA Rules, Total Time Taken\n");
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    int midprocessXMLHour = 0, midprocessXMLMinute = 0, midprocessXMLSecond = 0;
                    int midprocessJAVAHour = 0, midprocessJAVAMinute = 0, midprocessJAVASecond = 0;
                    int XMLHour = 0, XMLMinute = 0, XMLSecond = 0;
                    int JAVAHour = 0, JAVAMinute = 0, JAVASecond = 0;
                    int totalHour = 0, totalMinute = 0, totalSecond = 0;
                    while ((line = br.readLine()) != null) {
                        if (line.contains("midprocessXML Rules:")) {
                        	System.out.println(line.split(":")[0].replaceAll("midprocessXML Rules:", ""));
                            String[] time = line.replaceAll(":", "").replaceAll("midprocessXML Rules", "").replaceAll("^\\s+", "").split("\\s+");
                            midprocessXMLHour = Integer.parseInt(time[1]);
                            midprocessXMLMinute = Integer.parseInt(time[3]);
                            midprocessXMLSecond = Integer.parseInt(time[5]);
                        } else if (line.contains("midprocessJAVA Rules:")) {
                            String[] time = line.replaceAll(":", "").replaceAll("midprocessJAVA Rules", "").replaceAll("^\\s+", "").split("\\s+");
                            midprocessJAVAHour = Integer.parseInt(time[1]);
                            midprocessJAVAMinute = Integer.parseInt(time[3]);
                            midprocessJAVASecond = Integer.parseInt(time[5]);
                        } else if (line.contains("XML Rules:")) {
                            String[] time = line.replaceAll(":", "").replaceAll("XML Rules", "").replaceAll("^\\s+", "").split("\\s+");
                            XMLHour = Integer.parseInt(time[1]);
                            XMLMinute = Integer.parseInt(time[3]);
                            XMLSecond = Integer.parseInt(time[5]);
                        } else if (line.contains("JAVA Rules:")) {
                            String[] time = line.replaceAll(":", "").replaceAll("JAVA Rules", "").replaceAll("^\\s+", "").split("\\s+");
                            JAVAHour = Integer.parseInt(time[1]);
                            JAVAMinute = Integer.parseInt(time[3]);
                            JAVASecond = Integer.parseInt(time[5]);
                        } else if (line.contains("totalTimeTaken :")) {
                            String[] time = line.replaceAll(":", "").replaceAll("totalTimeTaken", "").replaceAll("^\\s+", "").split("\\s+");
                            totalHour = Integer.parseInt(time[1]);
                            totalMinute = Integer.parseInt(time[3]);
                            totalSecond = Integer.parseInt(time[5]);
                        }
                    }
                    br.close();
                    int totalTimeInSeconds = totalHour * 3600 + totalMinute * 60 + totalSecond;
                    csvWriter.append(fileName + "," + midprocessXMLHour + "h " + midprocessXMLMinute + "m " + midprocessXMLSecond + "s," + midprocessJAVAHour + "h " + midprocessJAVAMinute + "m " + midprocessJAVASecond + "s," + XMLHour + "h " + XMLMinute + "m " + XMLSecond + "s," + JAVAHour + "h " + JAVAMinute + "m " + JAVASecond + "s," + totalHour+"h "+totalMinute+"m "+totalSecond+"s\n");
                }
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}