package com.muffin;

public class CustomThread extends Thread{
    Integer timerstatus = 0;
    Integer zeit = 0;

    public CustomThread(Integer status) {
        this.timerstatus = status;
    }

    public void run() {

        while (timerstatus == 0){
            zeit = zeit + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(zeit);

        }
        System.out.println(zeit);

    }
}
