package com.lockedme.buisnessleveloperations;

import java.io.File;

public class AddFiles implements Operations {
    public void perform(String name) {
        // File f=new File("C:\\Users\\prati\\OneDrive\\Desktop\\project");
        File f1 = new File("C:\\Users\\prati\\OneDrive\\Desktop\\project\\" + name);
        try {
            boolean b = f1.createNewFile();
            System.out.println("file added");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
