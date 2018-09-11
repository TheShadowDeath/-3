package com.company.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean end = false;
        ArrayList<String> list = new ArrayList<String>();

        String str = new String();
        String file_name = new String();
        String fname = new String();
        String sname = new String();
        String year = new String();
        Scanner in = new Scanner(System.in);

        System.out.println("Имя файла: ");
        file_name = in.nextLine();

        while (end == false)
        {
            System.out.println("0. Выход");
            System.out.println("1. Создать новый список");
            System.out.println("2. Изменить список");
            System.out.println("3. Удалить список");
            System.out.println("4. Вывести все списки");
            System.out.println("5. Выбрать новый файл");
            str = in.nextLine();

            switch (str)
            {

                    case "0":
                        end = true;
                        break;
                    case "1":
                        sname = s_name();
                        fname = f_name();
                        year = year();
                        list = List.createList(fname, sname, year);

                        try
                        {
                            WorkToFile.addToFile(file_name, list);
                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        break;
                    case "2":
                        try
                        {
                            list = WorkToFile.readToFile(file_name);
                            sname = s_name();
                            list = List.renameElement(sname, list);
                            WorkToFile.change_file(file_name, list);
                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        break;
                    case "3":
                        try
                        {
                            list = WorkToFile.readToFile(file_name);
                            sname = s_name();
                            list = List.deleteElement(sname, list);
                            WorkToFile.change_file(file_name, list);
                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        break;
                    case "4":
                        try
                        {
                            WorkToFile.readToFile(file_name);
                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        break;
                    case "5":
                        System.out.println("Имя файла: ");
                        file_name = in.nextLine();
                        break;
                    default:
                        System.out.println("Неверное значение!!!");
                        break;
            }
        }
    }

    public static String s_name()
    {
        String str = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Фамилия: ");

        str = "Фамилия: " + in.nextLine();
        return str;
    }

    public static String f_name()
    {
        String str = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Имя: ");

        str = "Имя: " + in.nextLine();
        return str;
    }

    public static String year()
    {
        String str = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Год рождения: ");

        str = "Год рождения: " + in.nextLine();
        return str;
    }
}
