package com.lockedme.buisnessleveloperations;

import java.io.File;

public class DeleteFile implements Operations {
    @Override
    public void perform(String name) {
        File f=new File("C:\\Users\\prati\\OneDrive\\Desktop\\project");
        boolean be=false;
        String[] listOfFiles = f.list();
        for (int i = 0; i < listOfFiles.length; i++) {
            if(listOfFiles[i].equals(name))
            {   be=true;

                File f1 = new File("C:\\Users\\prati\\OneDrive\\Desktop\\project\\" + name);
                try {
                    {
                        boolean b=f1.delete();
                        System.out.println(f1.getName()+" Deleted");
                        // System.out.println("File Not found");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        if(be==false) System.out.println("Delete error -File Not Found ");
    }
}
