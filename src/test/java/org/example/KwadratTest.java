package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class KwadratTest {
Kwadrat instance = new Kwadrat();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
@Test
@Disabled("For Demonstration Purposed")
void skippedTest(){

}
    @Test
    @DisplayName("Jumlah Hasil Akar")
    void jumlahHasilAkar()  {
        int a = 1;
        int b = 1;
        int c = 1;
        String result = instance.JumlahHasilAkar(a,b,c);
        //Expected Value
        double xpx = -1;
        double xmx = 1;
        double x2px2 = -1;
        double xpxp = -1;
        String expResult = "XPX = " + xpx + " XMX = " + xmx + " X2PX2 = " + x2px2 + " XPXP = " + xpxp;
        //Assertion
        assertEquals(expResult,result);
    }

    @Test
    void rumusABC() {
        int a = 1;
        int b = 1;
        int c = 1;
        String result = instance.RumusABC(a,b,c);
        //Expected Result
        double answerPlus = 1;
        double answerMin = 1;
        String expResult = "Answer Plus = " + answerPlus + " Answer Minus = " + answerMin;
        //Assertion
        assertEquals(expResult,result);
    }

    @Test
    void menyusunPersamaanKuadrat() {
        int x1 = 1;
        int x2 = 1;
        String result = instance.MenyusunPersamaanKuadrat(x1,x2);
        //Expected Result
        int hasilx1 = 1;
        int hasilx2 = 1;
        String expResult = "x^2 +" + hasilx1 +"x   +" + hasilx2 + " = 0";
        //Assertion
        assertEquals(expResult,result);
    }

    @Test
    void pertidaksamaanKuadrat() {
        int a = 1;
        int b = 1;
        int c = 1;
        String equivalent = "<";
        String result = instance.PertidaksamaanKuadrat(a,b,c,equivalent);
        //Expected Result
        double answerPlus = 1;
        double answerMin = 1;
        String expResult = answerPlus + " <= x <= " + answerMin;
        //Assertion
        assertEquals(expResult,result);
    }

    @Test
    void pertidaksamaanLinear() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        String equivalent = "<";
        String result = instance.PertidaksamaanLinear(a,b,c,d,equivalent);
        //Expected Result
        double hasil2 = 1;
        String expEquivalent = "1";
        String expResult = "x "+ equivalent + " " + hasil2;
        //Assertion
        assertEquals(expResult,result);
    }
}