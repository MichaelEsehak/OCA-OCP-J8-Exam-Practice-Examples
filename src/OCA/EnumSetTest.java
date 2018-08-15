/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

/**
 *
 * @author Michael
 */
class EnumSetTest {

    enum Month {
        JAN("jan"), FEB("feb"), MAR("MAR");

        private Month(String e) {
            this.e = e;
            System.out.println("michael");
        }

        public String getEmployee() {
            return e;
        }
        private String e;

    };

//    public static void main(String[] args) throws InterruptedException {
//
////        Month m = Month.JAN;
////        Month m2 = Month.FEB;
//        WeekDay w = WeekDay.MONDAY;
//        WeekDay m = WeekDay.SATURDAY;
//        System.out.println(w.getAppriviation());
//        System.out.println(m.getAppriviation());
//
////        System.out.println(Month.MICHAEL.getEmployee().toString());
////        Thread.sleep(3000);
////        System.out.println(Month.MICHAEL.getEmployee().toString());
//    }

}

enum WeekDay {
    MONDAY("M") {
        public String getAppriviation() {
            return "Michael";
        }
    }, TUESDAY("T"), WEDNESDAY("W"), THURSDAY("Y"), FRIDAY("F"), SATURDAY("S");

    private WeekDay(String s) {
        this.appriviation = s;
    }

    public String getAppriviation() {
        return this.appriviation;
    }
    private String appriviation;
}
