package test101;

public class test {
    public static void main(String[] args){
        test101 t1 = new test101(1.1,2);
        test101 t2 = new test101(2.1,5);
        test101 t3 = t1.mul(t2);
        test101 t4 = t1.add(t2);
        test101 t5 = t1.sub(t2);
        t3.complexprint();
        t4.complexprint();
        t5.complexprint();
    }
}
