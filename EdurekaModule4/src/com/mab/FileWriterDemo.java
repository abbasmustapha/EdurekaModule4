package com.mab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        File fileToWrite = new File("C:\\MAB\\Perso\\tutos\\Java\\edureka_Projects\\EdurekaModule4\\EdurikaIO\\bikeInfo.txt");
        fileWriterDemo.writeToFile(fileToWrite);

    }

    private void writeToFile(File fileToWriteTo) throws IOException {
        FileWriter bikeInfoWriter = new FileWriter(fileToWriteTo);
        bikeInfoWriter.write("Et voici cz que j'écris !");
        bikeInfoWriter.write("Et je dirai même plus et confirme ça !");
        bikeInfoWriter.close();
    }

}
