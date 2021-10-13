package com.mab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
        fileInputStreamDemo.readInputStream("C:\\MAB\\Perso\\tutos\\Java\\edureka_Projects\\EdurekaModule4\\EdurikaIO\\Greetings.txt");
        System.out.println("Fin ok");
    }

    private void readInputStream(String fileToRead) throws FileNotFoundException, IOException {
        FileInputStream inputStream = new FileInputStream(fileToRead);

        int integerReadFromFile;
        while((integerReadFromFile=inputStream.read() )!= -1){
            System.out.println("Character read from the file is " + (char)integerReadFromFile);
        }
        inputStream.close();


    }

}
