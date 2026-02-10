package com.example.datastructures;

//print from 1 to 5
class LogicBuildingProblems {
    public static void print1to10(int n){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int n=5;
        print1to10(n);
    }
}
//Check even or odd
class LogicBuildingProblems1 {
    public static boolean evenOrOdd(int n){
        if(n%2==0) {
            return true;
     //   }else if(n%2==1){
      //      return false;
        }return false;
    }
    public static void main(String[] args){
        int n= 15;
        System.out.println(evenOrOdd(n));
        int n1 = 12;
        System.out.println(evenOrOdd(n1));
    }
}

//multiplication of table
class LogicBuildingProblems2 {
    public static int table(int n) {
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result = n * i;
            System.out.println(n+"*"+i+"="+result);
        } return result;
    }
    public static void main(String[] args){
        int n=2;
        System.out.println(table(n));
    }
}

//sum of Natural numbers
/*class LogicBuildingProblems3 {
    public static int naturalNumbers(int n){
        int result = 0;
        for(int i=0; i<n; i++){
            result = result+1;
            System.out.println(result);
        }return 0;
    }
    public static void main(String[] args){
        int n=3;
        naturalNumbers(n);
    }
}*/


