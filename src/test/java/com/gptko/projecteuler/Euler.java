package com.gptko.projecteuler;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Euler {

    /** a + b + c = 1000 이 되는 피타고라스 수
     * 세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
     * 예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.
     *
     * a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
     */
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

    /** 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면?
     * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
     *
     * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
     */
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

    /** 피보나치 수열에서 4백만 이하이면서 짝수인 항의 합
     * 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * 4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
     */
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

    /** 가장 큰 소인수 구하기
     * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
     * 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
     *
     * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
     */
    @Test
    public void solve3() {
        long n = 600851475143L;
        long divid = 2;
        long max = 0;

        while (n > 1) {
            if (n % divid == 0) {
                System.out.println("divid = " + divid);
                max = divid;
                n /= divid;
            } else {
                divid++;
            }
        }
        System.out.println("max = " + max);
    }


}
