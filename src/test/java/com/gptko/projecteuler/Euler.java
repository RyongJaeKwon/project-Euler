package com.gptko.projecteuler;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Euler {

    @Test
    public void solve9() {
        for (int a = 1; a <= 333; a++) {
            for (int b = a + 1; b < (1000 - a) / 2; b++) {
                int c;
                c = 1000 - a - b;
                if (a*a + b*b == c*c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    return;
                }
            }
        }
    }

    @Test
    public void solve1() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void solve2() {

        int prev = 1;
        int curr = 2;
        int sum = 0;

        while (curr <= 4000000) {
            if (curr % 2 == 0) {
                sum += curr;
            }
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println("sum = " + sum);
    }


}
