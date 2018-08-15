/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

/**
 *
 * @author Michael
 */
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;

public class LocaleTest {

    public static void main(String[] args) {

        Locale us=new Locale.Builder().setRegion("US").setLanguage("en").build();
        Locale fr=new Locale.Builder().setRegion("FR").setLanguage("fr").build();
        
        printData(us);
        //printData(fr);
    }
    public static void printData(Locale l){
        ResourceBundle rb=ResourceBundle.getBundle("Zoo",Locale.US);
        
        //System.out.println(rb.getString("michael"));
        
        //rb.keySet().stream().forEach((x)->System.out.println(x+"="+rb.getString(x)));
        //rb.keySet().stream().map(x->x+"="+rb.getString(x)).forEach(System.out::println);
//        Properties p=new Properties();
//        
//        rb.keySet().stream().forEach((x)->p.put(x, rb.getString(x)));
        //System.out.println(p);
        System.out.println(rb.getString("M"));
    }
}

