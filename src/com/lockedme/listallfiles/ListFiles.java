package com.lockedme.listallfiles;

import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public void perform() {
        File f=new File("C:\\Users\\prati\\OneDrive\\Desktop\\project");
        String[] listOfFiles = f.list();
        Arrays.sort(listOfFiles);
        if(listOfFiles.length==0) System.out.println("empty");
        for (int i = 0; i < listOfFiles.length; i++) {
            System.out.println(listOfFiles[i]);


        }
    }
}
