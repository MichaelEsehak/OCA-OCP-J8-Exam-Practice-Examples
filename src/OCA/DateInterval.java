/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.util.Date;

/**
 *
 * @author Michael
 */
class DateInterval extends Pair<Date> {

    @Override
    public void setSecond(Date second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }

}
