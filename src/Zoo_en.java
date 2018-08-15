



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Michael
 */
import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {

    private Object[][] contents = new Object[2][2];

    @Override
    protected Object[][] getContents() {

        contents[0][0]="M";
        contents[0][1]="m";
        contents[1][0]="T";
        contents[1][1]="t";
        
        return contents;
    }

}
