package jrapik.basic.output.pout;

public class Main
{
    public static void main(String []argv)
    {
        final float p = 3.1415926f;
        float v = java.lang.Math.round(p * 1000);
        int i = (int)v / 1000;
        int f = (int)v % 1000;

        System.out.println(i + "." + f);
    }
}
