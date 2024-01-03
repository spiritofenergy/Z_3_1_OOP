package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File dir = new File("out");
        File[] files = dir.listFiles();
        int filesCount = files.length;
    /*    long [] sizes = new long[filesCount];
        String []fileName = new String[filesCount];
        String []absolutePath = new String[filesCount];*/
        FileInformation[] fileInfos = new FileInformation[filesCount];

        for (int i = 0; i < files.length; i++){
            File currentFile = files[i];
            FileInformation info = new FileInformation();
            info.absolutePath = currentFile.getAbsolutePath();
            info.fileName = currentFile.getName();
            info.size = currentFile.length();
            fileInfos[i] = info;
            System.out.println(fileInfos[0].fileName);


        }
        long max = 0;
        int i = 0;
        while (i < fileInfos.length) {
            if( fileInfos[i].size > max){
                max = fileInfos[i].size;
            }
            System.out.println(i+ " " +max);
            i++;
        }


  /*      FileInformation info2 = new FileInformation();
        info2.absolutePath = file2.getAbsolutePath();
        info2.fileName = file2.getName();
        info2.size = file2.length();*/

      /*  Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 4;
        Cat cat2 = new Cat();
        cat2.name = "Murzic";
        cat2.age = 2;
        Cat cat3 = new Cat();
        cat3.name = "Basy";
        cat3.age = 1;
        System.out.println("Meow! Im " + cat3.name + ", " + cat3.age + " year old");
*/

        /*  File file = new File("E:\\Sinergy\\Z_3_1_OOP\\test.txt");
        String absolutePath = file.getAbsolutePath();
        String fileName = file.getName();
        long size = file.length();

        FileInformation info = new FileInformation();
        info.absolutePath = file.getAbsolutePath();
        info.fileName = file.getName();
        info.size = file.length();

        File file2 = new File("E:\\Sinergy\\Z_3_1_OOP\\book.txt");
        FileInformation info2 = new FileInformation();
        info2.absolutePath = file2.getAbsolutePath();
        info2.fileName = file2.getName();
        info2.size = file2.length();

        FileInformation bigInfo = info.size > info2.size ? info : info2;

        System.out.println("Bigger file: ");
        System.out.println(bigInfo.fileName);
        System.out.println("Path: " + bigInfo.absolutePath);
        System.out.println("Size is :" + bigInfo.size);
*/
    }
}