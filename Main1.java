package sk.kosickaakademia.MatoRudolf.projectvetvenie;

public class Main1 {
    public static void main(String[] args) {
        int x= 34;
        if (x<=9 & x>=0)
            System.out.println("1 ciferne");
        if (x<=99 & x>=10)
            System.out.println("2 ciferne");
        if (x<=999 & x>=100)
            System.out.println("3 ciferne");
        if (x<=9999 & x>=1000)
            System.out.println("4 ciferne");
        if (x>= 10_000)
            System.out.println("Viac ciferne");
    }
}
