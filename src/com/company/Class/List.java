package com.company.Class;

import java.util.ArrayList;

public class List
{

    public static ArrayList<String> createList(String fname, String sname, String year)
    {
        ArrayList<String> list = new ArrayList<String>(3);

        list.add(0,sname);
        list.add(1,fname);
        list.add(2,year);

        return list;
    }

    public static ArrayList<String> renameElement(String sname, ArrayList<String> list)
    {
        if (list.contains(sname) == true)
        {
            int index = list.indexOf(sname);

            list.set(index, Main.s_name());
            list.set(index + 1, Main.f_name());
            list.set(index + 2, Main.year());
        }
        return list;
    }
    public static ArrayList<String> deleteElement(String sname, ArrayList<String> list)
    {
        if (list.contains(sname) == true)
        {
            int index = list.indexOf(sname);

            list.remove(index);
            list.remove(index);
            list.remove(index);
        }
        return list;
    }
}
