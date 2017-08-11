/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashan
 */
public class Test {
    
    public static void main(String[] args){
    String folder = "C:\\Users\\Hashan\\Documents\\NetBeansProjects\\lms\\src\\Libs\\SOC\\BMIS104 Computer Technology";
   //     String path = "https://nsbmlms.000webhostapp.com/website/uploads/"+dept"/"+courses;
        System.out.println(folder);
        listFiles(folder);
    
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new CourseContentLecturer("Course1","SOC").setVisible(true);
                
            }
        });
    }
    
    /*
    public void listFilesForFolder(final File folder) {
    for (final File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry);
        } else {
            System.out.println(fileEntry.getName());
        }
    }
    */
        public static  void listFiles(String directoryName){

        File directory = new File(directoryName);

        //get all the files from a directory

        File[] fList = directory.listFiles();

        for (File file : fList){

            if (file.isFile()){

                System.out.println(file.getName());

            }

        }

    }
}
