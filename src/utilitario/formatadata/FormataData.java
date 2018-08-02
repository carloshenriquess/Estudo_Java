package utilitario.formatadata;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;

public class FormataData{
  public static void main(String[] args) {
    // // Usando Date direto
    // Date d = new Date();
    //
    // DateFormat dfDefault = DateFormat.getInstance();
    // //df1 e df2 são exatamente iguais
    // DateFormat df1 = DateFormat.getDateInstance();
    // DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT);
    // DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
    // DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
    // DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
    // DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);


    // System.out.println(dfDefault.format(d));
    // System.out.println(df1.format(d));
    // System.out.println(df2.format(d));
    // System.out.println(dfShort.format(d));
    // System.out.println(dfMedium.format(d));
    // System.out.println(dfLong.format(d));
    // System.out.println(dfFull.format(d));

    // // Usando Calendar e vetor
    // Calendar c = Calendar.getInstance();
    //
    // DateFormat[] dfa= new DateFormat[6];
    // dfa[0] = DateFormat.getInstance();
    // dfa[1] = DateFormat.getDateInstance();
    // dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
    // dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
    // dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
    // dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
    //
    // for(DateFormat df:dfa){
    //   System.out.println(df.format(c.getTime()));
    // }

    // //Formatação de hora
    // Date data = new Date();
    // DateFormat nada = DateFormat.getTimeInstance();
    // DateFormat da1 = DateFormat.getTimeInstance(DateFormat.ERA_FIELD);
    //
    //
    // System.out.println(nada.format(data));
    // System.out.println(da1.format(data));


    //Ainda deve ter Muito mais
  }
}
