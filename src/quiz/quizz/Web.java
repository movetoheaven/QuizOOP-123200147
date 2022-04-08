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
public class Web extends body implements Calculation {
    private double calculate;
    public Web(String name, String nim, double write, double code, double interview){
        super(name, nim, write, code, interview);
        
    }

    @Override
    public double calculate() {
        return this.calculate =((super.getWrite()*0.4)+(super.getCode()*0.35)+(super.getInterview()*0.25));
    }
    
    
}
