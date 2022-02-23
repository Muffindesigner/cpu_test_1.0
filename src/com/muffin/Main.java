package com.muffin;

import java.util.Timer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Integer status = 0;

        CustomThread customThread = new CustomThread(status);

        int sec = 0;
        int min = 0;
        int std = 0;
        int tag = 0;
        int monat = 0;
        int jahr = 0;
        int zeit = 0;

        customThread.start();

        while (true) {

            sec = sec + 1;

            Thread.sleep(250);

            if (sec > 59) {
                min = min + 1;
                sec = 0;
                break;
            }
            if (min > 59) {
                std = std + 1;
                min = 0;

            }
            if (std > 23) {
                tag = tag + 1;
                std = 0;
            }
            if (tag > 30) {
                monat = monat + 1;
                tag = 0;
            }
            if (monat > 12) {
                jahr = jahr + 1;
                monat = 0;
            }
            if (jahr >= 1) {
                System.out.println("Fertig");


            }
            System.out.println("Sekunden: " + sec + "   Minuten: " + min + "    Stunden: " + std + "    Tage: " + tag + "   Monate: " + monat + "   Jahre: " + jahr + ".");
        }
    }
}
