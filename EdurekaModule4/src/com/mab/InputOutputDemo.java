package com.mab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {

        String fileName = "C:\\MAB\\Perso\\tutos\\Java\\edureka_Projects\\EdurekaModule4\\EdurikaIO\\EmployeeInfo.txt";
        File employeeInfoFile = new File(fileName);
        InputOutputDemo demo = new InputOutputDemo();

        demo.writeToFile(employeeInfoFile);

        String fileToReadName = "C:\\MAB\\Perso\\tutos\\Java\\edureka_Projects\\EdurekaModule4\\EdurikaIO\\CarList.txt";
        File fileToRead = new File(fileToReadName);
        try {
            demo.readFile(fileToRead);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(File fileToWrite) {
        PrintWriter employeeInfoWriter = null;
        try {
            employeeInfoWriter = new PrintWriter(fileToWrite);
            employeeInfoWriter.println("vinod");
            employeeInfoWriter.println("100");
            employeeInfoWriter.println("Markus");
            employeeInfoWriter.println("150");
        } catch (FileNotFoundException e) {
            System.out.println("given file was not found on the local disk : " + fileToWrite.getAbsolutePath());
            throw new RuntimeException(e);
        } finally {
            employeeInfoWriter.close();
        }
    }


    public void readFile(File fileToRead) throws FileNotFoundException {

        Scanner input = new Scanner(fileToRead);
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }

    }

}
