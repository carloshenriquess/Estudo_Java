package utilitario.datas;

import java.util.Date;
import java.util.Calendar;

public class Datas{

  public static void main(String[] args) {

    // //cria com a data atual
    // Date data = new Date();
    // System.out.println("Data atual: "+data);
    // data.setTime(data.getTime() + 3_600_000l);
    // //data atual + uma hora
    // System.out.println("Data atual + 1 hora: "+data);
    //
    // data.setTime(0l);
    // //menor data possível
    // System.out.println("Menor data possível: "+data);


    // //cria com data atual
    // Calendar c = Calendar.getInstance();
    // System.out.println("Data atual: "+c);
    //
    // Date d = new Date();
    // //converte um Date para um Calendar
    // c.setTime(d);

    // Calendar c = Calendar.getInstance();
    // if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
    //   System.out.println("No país atual, Domingo é o primeiro dia da semana");
    // }

    // //add() adiciona no geral
    // c.add(Calendar.DAY_OF_MONTH,30);
    // //getTime() da classe Calendar, retorna um Date, e getTime() do Date retorna milisegundos
    // //método toString() do Date retorna de uma forma mais bonita que do Calendar
    // System.out.println(c.getTime());

    // //roll() adiciona só do field específico, sme alterar o resto
    // c.roll(Calendar.DAY_OF_MONTH,30);
    // System.out.println(c.getTime());

  }

}
