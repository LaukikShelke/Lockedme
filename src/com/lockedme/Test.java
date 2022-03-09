package com.lockedme;

import com.lockedme.buisnessleveloperations.BuisnessLevel;
import com.lockedme.buisnessleveloperations.Operations;
import com.lockedme.display.Display;
import com.lockedme.inputreader.InputReader;
import com.lockedme.listallfiles.ListFiles;

public class Test {
    public static void main(String[] args) {

        Display d=new Display();
        d.welcome_page();
        InputReader i=new InputReader();
        int c;
        do {
            d.operations_Display();

            c=i.select_choice();
            int c1;
            if(c==1)
            {
                ListFiles l1=new ListFiles();
                l1.perform();
            }
            else if(c==2) {
                do {

                    d.display_buisness_levelOpeartons();
                    c1=i.select_choice();
                    BuisnessLevel b = new BuisnessLevel();
                    Operations o= b.getop(c1);
                    if(c1==1||c1==2||c1==3)
                    {
                        d.input_msg();
                        String name=i.setFile_name();
                        o.perform(name);
                    }
                    else if(c1>4)System.out.println("Plz enter correct choice");
                } while (c1 != 4);
            }
            else if(c!=3)
            {
                System.out.println("Plz enter correct choice");
            }

        }while (c!=3);


    }
}
