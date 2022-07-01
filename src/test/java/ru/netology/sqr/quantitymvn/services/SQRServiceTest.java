package ru.netology.sqr.quantitymvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.sqr.quantitymvn.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/conditions.csv")
   /* @CsvSource({
            "3,200,300",
            "89,50,10000",
            "0,10,99",
            "1,20,100",
            "1,60,101",
            "1,9603,10000",
            "1,9604,9800",
            "0,9605,9900",
            "0,-200,-100",
            "5,-100,200"
    })*/
    public void shouldCalcQuantity(int expected, int beginning, int end) {
        SQRService service = new SQRService();
        //int expected = 5;
        int actual = service.calcSqrt(beginning, end);

        Assertions.assertEquals(expected, actual);
    }

}
