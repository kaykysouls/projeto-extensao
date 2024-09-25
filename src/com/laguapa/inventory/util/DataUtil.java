package com.laguapa.inventory.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String formatarDataAtual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }
}
