package com.lockedme.buisnessleveloperations;

import java.io.File;

public class SearchFile implements Operations {
    public void perform(String name) {
        File f=new File("C:\\Users\\prati\\OneDrive\\Desktop\\project");
        String[] listOfFiles = f.list();
        boolean b=false;
        for (int i = 0; i < listOfFiles.length; i++) {
            if(listOfFiles[i].equals(name))
            {
                System.out.println("File Found -"+ name);
                b=true;
                break;
            }

        }

        if(b==false) System.out.println("FNF-File Not Found");
    }
}
