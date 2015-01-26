/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Timothy
 */
public class WelcomeService {
    
    private Calendar date;
    
    private String getTimeOfDay() {
        date = Calendar.getInstance();
        
        if(date.get(Calendar.HOUR_OF_DAY) < 12) {
            return "morning";
        }
        if(date.get(Calendar.HOUR_OF_DAY) < 18) {
            return "afternoon";
        }
        return "evening";
    }
    
    public String getMessage(String name) {
        return "Good " + getTimeOfDay() + " " + name + ", welcome!";
    }
    
}
