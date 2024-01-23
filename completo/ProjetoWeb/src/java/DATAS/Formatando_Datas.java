/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATAS;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Formatando_Datas {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: " + data);

        /*Formata a data. DateFormat.getDateInstance()Cria uma Novo instância de 
        um objeto DateFormat usado para representar uma data (sem uma hora) 
        com o estilo padrão e localidade. */
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: " + formataData.format(data));

        /*Formata Hora. DateFormat.getTimeInstance() Cria uma Novo instância de 
        um objeto DateFormat usado para representar uma hora (sem uma data) com o 
        estilo padrão e localidade. */
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: " + hora.format(data));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }
}
