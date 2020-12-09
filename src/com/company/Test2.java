package com.company;

public class Test2 {
    public static void main(String args[])throws ArrayIndexOutOfBoundsException {
        int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        fizzBuzz(numbers);

    }

    public static void fizzBuzz(int[] numbers) {
        //Write the function body here
         for(int i = 0; i<numbers.length;i++){
            if(numbers[i]%3==0&& numbers[i]%5==0){
                System.out.println("FizzBuzz");
            } else if (numbers[i]%5==0) {
                System.out.println("Buzz");
            }
            else if (numbers[i]%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(numbers[i]+" ");
            }

        }
    }
}
