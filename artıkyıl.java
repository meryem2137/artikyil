import java.util.Scanner;

public class artıkyıl {


    public static void main(String[] args) {
        int yıl;
    Scanner input=new Scanner(System.in);
    System.out.print("yıl giriniz: ");
    yıl=input.nextInt();

    if(yıl%100==0){
        if(yıl%400==0){
            System.out.print(""+yıl+" Artık yıl");
        }else{
            System.out.print(""+yıl+" Artık yıl değildir");
        }}
    else if(yıl%4==0) {
        System.out.print(" " + yıl + " Artık yıldır ");
    }else{
        System.out.print(""+yıl+" Artık yıl değil");







 }}}



























































