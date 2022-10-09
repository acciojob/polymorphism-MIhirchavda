package com.driver;

public class Main {


    public static class Product{
        public int product(int x , int y){
            return x*y;
        }
        public  int product(int x , int y , int z){
            return x*y*z;
        }
        public  double product(double x , double y){
            return x*y;
        }
    }
    public static void main(String arg[]){
        Product p = new Product();
        int ans1 = p.product(10 , 15);

        int ans2 = p.product(10 , 15 , 20);

        double ans3 =  p.product(1.6 , 1.5);
        System.out.println(" ans1 "+ans1+ " ans2 " + ans2 +" ans3 "+ ans3);

    }
}