package com.example.survivign_in_columbin;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class hora {



    public static String calculaHora() {
        Date horaAtual = new Date();
        String horaN =  new SimpleDateFormat("hh:mm").format(horaAtual);

        return horaN;
    }



}