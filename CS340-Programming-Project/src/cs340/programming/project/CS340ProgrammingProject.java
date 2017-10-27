/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs340.programming.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Arthur
 */
public class CS340ProgrammingProject {

    /**
     * @param args the command line arguments
     */
    //helper to read some number of lines repeatedly
    static void readLines(String[] array, Scanner scanner, int num_lines_to_read){
        for(int i = 0; i < num_lines_to_read; i++){
            array[i] = scanner.nextLine();
        }
    }
    
    static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        File constraints = new File("C:/Users/Arthur/Documents/NetBeansProjects/CS340-Programming-Project/haverfordConstraints.txt");
        File student_prefs = new File("C:/Users/Arthur/Documents/NetBeansProjects/CS340-Programming-Project/haverfordStudentPrefs.txt");
        Scanner constraints_scanner = new Scanner(constraints);
        Scanner student_prefs_scanner = new Scanner(student_prefs);
        int num_times = 0;
        int num_rooms = 0;
        int num_classes = 0;
        int num_teachers = 0;
        //We know the first line is the number of times
        //We know the first section is all times
        /*
        while(constraints_scanner.hasNext()){
            System.out.println(constraints_scanner.nextLine());
        }
        while(student_prefs_scanner.hasNext()){
            System.out.println(student_prefs_scanner.nextLine());
        }*/
        num_times = Integer.parseInt(constraints_scanner.nextLine().replaceAll("[\\D]",""));
        String[] class_times = new String[num_times];
        readLines(class_times, constraints_scanner, num_times);
        //We know the next section in Haverfordconstraints is the rooms
        num_rooms = Integer.parseInt(constraints_scanner.nextLine().replaceAll("[\\D]",""));
        String[] rooms = new String[num_rooms];
        readLines(rooms, constraints_scanner, num_rooms);
        //We know the third section will be classes and the professors
        //teaching each class
        num_classes = Integer.parseInt(constraints_scanner.nextLine().replaceAll("[\\D]",""));
        num_teachers = Integer.parseInt(constraints_scanner.nextLine().replaceAll("[\\D]",""));
        String[] classprofs = new String[num_classes];
        readLines(classprofs, constraints_scanner, num_classes);
        System.out.println(num_times);
        System.out.println(num_rooms);
        System.out.println(num_classes);
        System.out.println(num_teachers);
        printArray(class_times);
    }
}
