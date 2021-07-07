package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

        sb.append(" my").append(" name is").append(" Diana");
        System.out.println(sb.toString());

        System.out.printf("This is new %s, it costs %d, EUR \n","T-shirt", X );

        System.out.printf("There are %10d apples \n", 5);
        System.out.printf("There are %10d apples \n", 100);
        System.out.printf("There are %10d apples \n", 548500);

        System.out.printf("Parrot %.2f \n", 1.55555);
    }

    class Test{
        public static final int CONSTANT = 0;
    }
}
