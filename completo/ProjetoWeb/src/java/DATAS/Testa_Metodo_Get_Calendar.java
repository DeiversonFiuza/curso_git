/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATAS;

import java.util.Calendar;

/**
 *
 * @author ALUNO
 */
public class Testa_Metodo_Get_Calendar {

    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();

        System.out.println("Data/Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
    }
}
