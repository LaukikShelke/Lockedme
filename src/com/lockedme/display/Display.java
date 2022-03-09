package com.lockedme.display;

public class Display {
    public void welcome_page()
    {
        System.out.println("/*  Welcome to LockedMe.com  */");
        System.out.println("Developed by Laukik Shelke ");
    }
    public void operations_Display()
    {
        System.out.println("Plz select the function below");
        System.out.println("1:List all the files");
        System.out.println("2:Buisness Level Operations ");
        System.out.println("3:close the application");
    }
    public void display_buisness_levelOpeartons()
    {   System.out.println("Plz select the function below");
        System.out.println("1:add files");
        System.out.println("2:Delete file");
        System.out.println("3:Search file");
        System.out.println("4:Back to menue");
    }
    public void input_msg()
    {
        System.out.println("Enter file name");
    }
}
