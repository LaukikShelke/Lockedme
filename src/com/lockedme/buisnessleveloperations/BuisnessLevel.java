package com.lockedme.buisnessleveloperations;

public class BuisnessLevel {
    public Operations getop(int choice)
    {
        if(choice==1) return new AddFiles();
        else if(choice==2)return new DeleteFile();
        else if(choice==3)return new SearchFile();

        return null;
    }

}
