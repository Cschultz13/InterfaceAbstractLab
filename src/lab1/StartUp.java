/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {
    public static void main(String[] args) {
        
    
     ProgrammingClass[] classes = {
            new AdvancedJavaCourse("AdvJava", "999-5555"), new IntroJavaCourse("IntroJava", "555-5555"),
            new IntroToProgrammingCourse("IntroPro", "999-5959")
        };
        for (ProgrammingClass p : classes) {
            p.setCourseName("named");
        }
        
        ProgrammingClass pClass = new AdvancedJavaCourse("AdvJava", "999-5555");
        System.out.println(pClass.getCourseName());
        
        AdvancedJavaCourse course = new AdvancedJavaCourse("AdvJavaC", "999-5599");
        System.out.println(course.getCourseNumber() + " " + course.getCourseName());
}
}
