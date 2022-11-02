package org.example;

import java.util.stream.DoubleStream;

public class Kwadrat {
    public String JumlahHasilAkar(int a, int b, int c){
        double xpx = -b/a;
        double xmx = c/a;
        double x2px2 = (xpx*xpx) - (2*xmx);
        double xpxp = x2px2/xmx;
        String hasil = "XPX = " + xpx + " XMX = " + xmx + " X2PX2 = " + x2px2 + " XPXP = " + xpxp;
        return hasil;
    }
    public String RumusABC(int a,int b,int c){
        double root = Math.sqrt(b*b - 4*a*c);
        double answerPlus = (-(b)+root)/2*a;
        double answerMin = (-(b)-root)/2*a;
        String hasil = "Answer Plus = " + answerPlus + " Answer Minus = " + answerMin;
        return hasil;
    }
    public String MenyusunPersamaanKuadrat(int x1, int x2){
        int hasilx1,hasilx2;
        hasilx1 = -x1+-x2;
        hasilx2 = -x1*-x2;
        String hasil = "";
        if(hasilx1 >= 0){
            hasil = "x^2 +" + hasilx1 +"x " + hasilx2 + " = 0";
        }
        else if(hasilx2 >= 0){
            hasil = "x^2 " + hasilx1 +"x +" + hasilx2 + " = 0";
        }
        else if(hasilx1 >=0 && hasilx2 >=0 ){
            hasil = "x^2 +" + hasilx1 +"x   +" + hasilx2 + " = 0";
        }else{
            hasil = "x^2 " + hasilx1 +"x " + hasilx2 + " = 0";
        }
        return hasil;
    }
    public String PertidaksamaanKuadrat(int a, int b, int c,String equivalent){
        String hasil = "";
        double root = Math.sqrt(b*b - 4*a*c);
        double answerPlus = (-(b)+root)/2*a;
        double answerMin = (-(b)-root)/2*a;
        double test;
        test = a*((answerPlus-1)*(answerPlus-1)) + b * (answerPlus-1) + c;

        boolean if1 = answerPlus > answerMin,if2 = answerPlus < answerMin;
        if(answerPlus > answerMin){
            test = a*((answerMin-1)*(answerMin-1)) + b * (answerMin-1) + c;
            if(test > 0){
                if(equivalent == "<"){
                    hasil = answerMin + " < x < " + answerPlus;
                }else if(equivalent == "<="){
                    hasil = answerMin + " <= x <= " + answerPlus;
                }else if(equivalent == ">"){
                    hasil = "x < " + answerMin + " atau x > "+ answerPlus;
                }else if(equivalent == ">="){
                    hasil = "x <= " + answerMin + " atau x >= "+ answerPlus;
                }
            }else if(test < 0){
                if(equivalent == "<"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == "<="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }else if(equivalent == ">"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == ">="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }
            }
        }else if(answerPlus < answerMin){
            test = a*((answerPlus-1)*(answerPlus-1)) + b * (answerPlus-1) + c;
            if(test > 0){
                if(equivalent == "<"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == "<="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }else if(equivalent == ">"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == ">="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }
            }else if(test < 0){
                if(equivalent == "<"){
                    hasil = "x < " + answerPlus + " atau x > "+ answerMin;
                }else if(equivalent == "<="){
                    hasil = "x <= " + answerPlus + " atau x >= "+ answerMin;
                }else if(equivalent == ">"){
                    hasil = answerPlus + " < x < " + answerMin;
                }else if(equivalent == ">="){
                    hasil = answerPlus + " <= x <= " + answerMin;
                }
            }
        }
        return hasil;
    }
    public String PertidaksamaanLinear(int a,int b,int c,int d,String equivalent){
        String hasil = "";
        //form a + bx > c
//        double hasil = (c-b)/a;
//        if(a <0 && equivalent == "<"){
//            equivalent = ">";
//        }
//        else if(a <0 && equivalent == ">"){
//            equivalent = "<";
//        }
//        else if(a <0 && equivalent == "<="){
//            equivalent = ">=";
//        }
//        else if(a <0 && equivalent == ">="){
//            equivalent = "<=";
//        }

        //form a + bx < cx + d
        double hasil2 = (d-a)/(b-c);

        if((b-c) <0 && equivalent == "<"){
            equivalent = ">";
        }
        else if((b-c) <0 && equivalent == ">"){
            equivalent = "<";
        }
        else if((b-c) <0 && equivalent == "<="){
            equivalent = ">=";
        }
        else if((b-c) <0 && equivalent == ">="){
            equivalent = "<=";
        }
        hasil = "x "+ equivalent + " " + hasil2;
        return hasil;
    }
}