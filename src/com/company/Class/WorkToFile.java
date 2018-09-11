package com.company.Class;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkToFile
{

    private static void createFile(String name) throws Exception        //создание файла со списком
    {
        File file = new File(name + ".txt");

        if (file.exists() == false)
        {
            file.createNewFile();
        }
    }

    public static void addToFile(String name, ArrayList<String> list) throws Exception      //добавление в файл
    {
        createFile(name);
        FileWriter fw = new FileWriter(name + ".txt",true);

        for (int i = 0; i < list.size(); i++)
            fw.append(list.get(i) + "\n");
        fw.close();
    }

    public static ArrayList<String> readToFile(String name) throws Exception        //чтение из файла
    {
        createFile(name);
        ArrayList<String> list = new ArrayList<String>();
        FileReader fr = new FileReader(name + ".txt");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine())
        {
            list.add(in.nextLine());
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        fr.close();
        return list;
    }

    public static void change_file(String name,ArrayList<String> list) throws Exception     //перезапись в файл
    {
        createFile(name);
        FileWriter fw = new FileWriter(name + ".txt",false);

        for (int i = 0; i < list.size(); i++)
            fw.append(list.get(i) + "\n");
        fw.close();
    }
}
