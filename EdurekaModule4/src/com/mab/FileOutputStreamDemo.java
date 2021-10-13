package com.mab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileOutputStreamDemo fileOutputStreamDemo = new FileOutputStreamDemo();
        File file = new File("C:\\MAB\\Perso\\tutos\\Java\\edureka_Projects\\EdurekaModule4\\EdurikaIO\\Greetings.txt");
        fileOutputStreamDemo.writeToFile(file);

    }

    private void writeToFile(File file) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("Salam alikoum folks ! hope you're fine".getBytes());
        fileOutputStream.close();
    }

}
