package com.narisu.generic;

public class Cus_ {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R> {
    int n = 10;
    R get();
    void hi(R r);
    void ren(R r1, R r2,U u1,U u2);

    default R mathod(U u) {
        return null;
    }
}
interface IA extends IUsb<String,Double> {

}
class AA implements IA {

    @Override
    public Double get() {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void ren(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public Double mathod(String s) {
        return IA.super.mathod(s);
    }
}
class BB implements IUsb<Integer,Float> {

    @Override
    public Float get() {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void ren(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
class CC implements IUsb {

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void ren(Object r1, Object r2, Object u1, Object u2) {

    }
}
