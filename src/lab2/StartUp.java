/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
public class StartUp {
    public static void main(String[] args) {
        ProgrammingClass pClass = new IntroJavaCourse("IntroJ", "44568-87953");
        ProgrammingClass pClass2 = new AdvancedJavaCourse("AdvJavaC", "789877-884555");
        IntroToProgrammingCourse intro = new IntroToProgrammingCourse("IntroPC", "1234-56789");
        
        System.out.println(pClass.getCourseName() + " " + pClass.getCourseNumber());
        System.out.println(pClass2.getCourseName() + " " + pClass2.getCourseNumber());
        System.out.println(intro.getCourseName() + " " + intro.getCourseNumber());

    }
}
