interface Myinterface {
    public void method1();

    public void method2();
}

class Main implements Myinterface {
    public void method1() {
        System.out.println("Implement of method 1");
    }

    public void method2() {
        System.out.println("Implement of method 2");
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.method1();
        obj.method2();
    }
}