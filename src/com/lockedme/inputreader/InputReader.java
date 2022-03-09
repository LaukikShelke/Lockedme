package com.lockedme.inputreader;

import java.util.Scanner;

public class InputReader {
    Scanner sc=new Scanner(System.in);
    public int c;
    String name;
    public int select_choice()
    {
        this.c=sc.nextInt();
        return c;
    }
    public String setFile_name()
    {
        this.name=sc.next();
        return name;
    }
}
