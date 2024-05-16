package com.last.spring.studyreport;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.last.spring.studyreport.beans.Study;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudyReport {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("hours.json"));
        
        ObjectMapper objectMapper = new ObjectMapper();
        Study[] study = objectMapper.readValue(jsonData, Study[].class);
       
        for(Study stud: study){
            System.out.println(stud);
        }
    }
}
