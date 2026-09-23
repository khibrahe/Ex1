/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellof26;

/**
 *
 * @author ibikh
 */
public class PartTimeStudent extends Student {
    private int num_of_course;

    public PartTimeStudent(int num_of_course, String sID, String sName) {
        super(sID, sName);
        this.num_of_course = num_of_course;
    }
    
    

    public int getNum_of_course() {
        return num_of_course;
    }

    public void setNum_of_course(int num_of_course) {
        this.num_of_course = num_of_course;
    }
    
    
}
