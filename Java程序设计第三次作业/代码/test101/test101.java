package test101;

public class test101{
    double real,image;

    public test101(double real,double image){
        this.real=real;
        this.image=image;
    }

    public test101 add(test101 t1){
        test101 test = new test101(this.real+t1.real,this.image+t1.image);
        return test;
    }

    public test101 sub(test101 t1){
        test101 test = new test101(this.real-t1.real,this.image-t1.image);
        return test;
    }

    public test101 mul(test101 t1){
        test101 test = new test101(this.real*t1.real-this.image*t1.image,this.real*t1.image+this.image*t1.real);
        return test;
    }

    public void complexprint(){
        System.out.println(this.real + " + "+this.image+ "i");
    }
}