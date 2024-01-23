/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaDADOS;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ALUNO
 */
public class NewClassx {

    public static void main(String args[]) {

        Calendar dataCalendar = Calendar.getInstance();
    //  System.out.println("Data atual "+dataCalendar.getTime());

        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(c.getTime()));




        /*
         Dateformat.SHORT // 03/04/10
         Dateformat.MEDIUM // 03/04/2010
         Dateformat.LONG //3 de Abril de 2010
         Dateformat.FULL //Sábado, 3 de Abril de 2010
         */
    }
}
