/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.quizz;

/**
 *
 * @author lenovo
 */
public class body {
        String name,nim; 
        private double write, code, interview;

    public body(String name, String nim, double write, double code, double interview) {
        this.name = name;
        this.nim = nim;
        this.write = write;
        this.code = code;
        this.interview = interview;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getWrite() {
        return write;
    }

    public void setWrite(double write) {
        this.write = write;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getInterview() {
        return interview;
    }

    public void setInterview(double interview) {
        this.interview = interview;
    }

    
        
        
}
