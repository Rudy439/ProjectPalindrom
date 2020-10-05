package sk.kosickaakademia.matorudolf;

public class Domaca1 {
    public static void main(String[] args) {
        int i=100;
        int count=0;
        while(i<1000){
            i++;
            if(i%10!=(i/10)%10 && (i/10)%10!=(i/100)%10 && i%10!=(i/100)%10){
                count++;             }
        }    System.out.println(count);
    }

}
