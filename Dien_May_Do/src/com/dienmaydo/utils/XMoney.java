package com.dienmaydo.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class XMoney {

    static Locale localeVN = new Locale("vi", "VN");
    static NumberFormat vn = NumberFormat.getInstance(localeVN);

    public static String themDauCham(long money) {
        return vn.format(money);
    }

    public static Long loaiBoVND(String money) {
        String moneyReplace = money.replace(".", "");
        String moeySubString = moneyReplace.substring(0, moneyReplace.length() - 4);
        return Long.parseLong(moeySubString);
    }

    public static Long loaiBoDauCham(String money) {
        String moneyReplace = money.replace(".", "");
        return Long.parseLong(moneyReplace);
    }

}
