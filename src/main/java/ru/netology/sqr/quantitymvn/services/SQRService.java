package ru.netology.sqr.quantitymvn.services;

public class SQRService {
    public int calcSqrt(int beginning, int end) {

        int result = 0;
        for (int i = 10; i < 99; i++) {
            int square = i * i;
            if (square <= end)
                if (square >= beginning) {
                    result = result + 1;
                }
        }
        return result;
    }
}