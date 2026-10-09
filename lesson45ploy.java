package ploysismsabstraction;
class Hillstations{
    void location(){
        System.out.println("location is :");
    }
    void famousfor(){
        System.out.println("famous for :");
    }

}
class Manali extends Hillstations{
    void location(){
        System.out.println("location is : Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("famous for : Rohtang pass");
    }
}
class Mussooorie extends Hillstations{
    void location(){
        System.out.println("location is : Uttarakhand");

    }
    void famousfor(){
        System.out.println("famous for : Kempty falls");
    }
}
class Gulmarg extends Hillstations{
    void location(){
        System.out.println("location is : Jammu and Kashmir");
    }
    void famousfor(){
        System.out.println("famous for : Gulmarg ski resort");
    }
}
class Main{
    public static void main(String args[]){
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussooorie();
        Hillstations G = new Gulmarg();
        A.location();
        A.famousfor();
        M.location();
        M.famousfor();
        Mu.location();
        Mu.famousfor();
        G.location();
        G.famousfor();
    }
}