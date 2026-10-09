package ploysismsabstraction.abstraction;
abstract class Object{
    abstract void showShape();
    public void shape(){
        System.out.println("I'm from abstract class ");
    }
}
class Sphere extends Object{
    void showShape(){
        System.out.println("I'm Sphere");
    }
}
class Cube extends Object{
    void showShape(){
        System.out.println("I'm Cube");
    }
}
class Prism extends Object{
    void showShape(){
        System.out.println("I'm Prism");
    }
}
class Cubiod extends Object{
    void showShape(){
        System.out.println("I'm Cubiod");
    }
}
class Main{
    public static void main(String args[]){
        Object obj = new Sphere();
        obj.shape();
        obj.showShape();
        obj = new Cube();
        obj.shape();
        obj.showShape();
        obj = new Prism();
        obj.shape();
        obj.showShape();
        obj = new Cubiod();
        obj.shape();
        obj.showShape();
    }
}