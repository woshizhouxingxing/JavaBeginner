package com.woshizhouxingxing.utils;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 2);

        Assert.assertEquals(0, result);
    }

    @Test
    public void ss() {
        String tt=";";
        String[] web=tt.split(";");
        if(web.length==1){
            String[]temp=new String[2];
            temp[0]=web[0];
            temp[1]="";
            web=temp;
        }else if(web.length==0){
            String[]temp=new String[2];
            temp[0]="";
            temp[1]="";
            web=temp;
        }
        System.out.println("0000"+web[0]);
        System.out.println("0001"+web[1]);
    }
}

class Worker extends Thread {

    @Override
    public void run() {
        String msg = "It was interrupted";     // 1

        try {
            Thread.sleep(200);                 // 2
        } catch (InterruptedException e) {
            System.out.println(msg);
        }

        int i = 0;                             // 3
        while (i < 100_000) {
            if (isInterrupted()) {
                System.out.println(msg);
                return;
            }
            i++;                               // 4
        }

        System.out.println("Finished");        // 5
    }
}
