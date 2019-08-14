package com;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Date data = new Date();
        Timestamp tm = new Timestamp(data.getTime());

        String dataFormatada = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(tm.getTime());
        String dataFormatada2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(tm.getTime());
        String dataFormatada3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(tm.getTime());
        String dataFormatada4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(tm.getTime());

        System.out.println("Data (yyyy-MM-dd'T'HH:mm:ssXXX): " + dataFormatada);
        System.out.println("Data (yyyy-MM-dd HH:mm:ss.S): " + dataFormatada2);
        System.out.println("Data (yyyy-MM-dd'T'HH:mm:ss'Z'): " + dataFormatada3);
        System.out.println("Data (yyyy-MM-dd'T'HH:mm:ss): " + dataFormatada4);
        System.out.println(dataFormatada3.replace("Z", dataFormatada.substring(19)));
        System.out.println(dataFormatada.substring(0, 19).concat(dataFormatada.substring(19)));
        System.out.println("--------------------------------------");

        String dataTeste = "2019-07-03T10:12:34-04:00";
        try {
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            Date dataFormat2 = formato2.parse(dataTeste);

            System.out.println("Data (yyyy-MM-dd'T'HH:mm:ssXXX): " + formato2.format(dataFormat2));
            System.out.println("Data (yyyy-MM-dd'T'HH:mm:ssXXX): " + dataTeste);

            if (formato2.format(dataFormat2).equals(dataTeste)) {
                System.out.println(true);
            }
            System.out.println("------------------------------------");

            SimpleDateFormat formatoSemZone = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date dataSemZone = formatoSemZone.parse(dataTeste);

            System.out.println("Data (yyyy-MM-dd'T'HH:mm:ss): " + formatoSemZone.format(dataSemZone));
            System.out.println("Data (yyyy-MM-dd'T'HH:mm:ssXXX): "
                    + formatoSemZone.format(dataSemZone).concat(dataTeste.substring(19)));

            if (formatoSemZone.format(dataSemZone).concat(dataTeste.substring(19)).equals(dataTeste)) {
                System.out.println(true);
            }
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");

            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            System.out.println(formato2.format(gc.getTime()));

            gc.add(Calendar.SECOND, 60);

            System.out.println(formato2.format(gc.getTime()));

            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");
            System.out.println("--------------------------------------");

            System.out.println("NFe33190603669753000182550010000173801004000007".substring(3));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
