package com.kenshinji.Lesson11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by kenshinji on 5/4/16.
 */
public class CountSemiprimes {

    public static int[] solution(int N, int[] P, int[] Q) {
        boolean[] primes = Sieve(N);
        HashSet<Integer> semiPrimes = new HashSet<Integer>();
        int[] result = new int[P.length];
        for(int i = 0; i < primes.length; i++) {
            for(int k = i ; k < primes.length; k++) {
                if(primes[i]&&primes[k]){
                    if(i*k <= N && !semiPrimes.contains(i*k)){
                        semiPrimes.add(i * k);
                    }
                }
            }
        }

        Iterator<Integer> iter = semiPrimes.iterator();
        while (iter.hasNext()) {
            int semiprime = iter.next();
            for(int i = 0;i < P.length;i++) {
                if (semiprime >= P[i] && semiprime <= Q[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    private static boolean[] Sieve(int N) {
        boolean[] sieve = new boolean[N + 1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        int i = 2;
        while (i * i <= N) {
            if(sieve[i]){
                int k = i * i;
                while (k <= N) {
                    sieve[k] = false;
                    k = k + i;
                }

            }
            i++;
        }

        return sieve;
    }

}
