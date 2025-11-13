// class First {
//     public static void main(String args[]){
//         System.out.println("Hello world");
//     }
// }


// class First {
//     public static void main(String args[]){
//         System.out.println("hello java");
//         System.out.println("*\n**\n***\n****");
//     }
// }


// class First {
//     public static void main(String args[]){
//         String name = "shamim";
//         int number = 4567;
//         double price = 344.454;
//         System.out.println(name );
//         System.out.println(number);
//         System.out.println(price);
//     }
// }





// class First {
//     public static void main(String args[]){
//         int a = 22;
//         int b = 76;
//         int c = a + b;
//         System.out.println(c);
//     }
// }


// class First {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int ans1 = a * b ;
//         int ans2 = a - b;
//         int fainalAnd = ans1 / ans2 ; 
//         System.out.println(fainalAnd);
//     }
// }

// import java.util.*;
// class First {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int ans = (a * b ) / (a - b);
//         System.out.println(ans + " shamii");
//     }
// }





// import java.util.*;
// class First {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("amar nam holo "+name);
//         sc.close();
//     }
// }


// import java.util.*;
// class First{
//     public static void main(String args[]){
//         System.out.println("kemon aso");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b ;
//         System.out.println(sum);

//     }
// }


// class First {
//     public static void main(String args[]){
//         int age = 18;
//         if(age >= 18){
//             System.out.println("tomi  vot dite parba ..." + age);
//         }else{
//             System.out.println("tomi  bot dite parbe na ");
//         }
//     }
// }


// class First {
//     public static void main (String args[]){
//         int num = 52;
//         if(num % 2 == 0){
//             System.out.println("event number");
//         }else{
//             System.out.println("odd nunmber");
//         }
//     }
// }



// import java.util.*;

// class First{
//     public static void main(String args[]){
//         Scanner sc =  new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();

//         if(num1 >= num2 && num1 >= num3){
//             System.out.println("number "+num1+" is big number");
//         }else if(num2 >= num1 && num2 >= num3){
//             System.out.println("number "+num2+" is big number");
//         }else{
//             System.out.println("number "+num3+" is big number");
//         }
//     }
// }




// import java.util.*;

// class First {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int valu = sc.nextInt();

//         switch (valu) {
//             case 10:
//             System.out.println("number 10 is match");
//                 break;
//             case 20:
//             System.out.println("number 10 is match");
//                 break;
//             default:
//             System.out.println("valu is no match");
//                 break;
//         }
//     }
// }



// class First{
//     public static void main (String args[]){
//         for(int num = 1; num <= 10; num++){
//             System.out.println("Number"+num);
//         }
//     }
// } 


// class First {
//     public static void main(String args[]){
//         int num = 0;
        
//         while(num < 10){
//             num++;
//             System.out.println("number = "+num);
//         }
//     }
// }




// class First {
//     public static void main(String args[]){
//         int num = 0;
//         int sum = 0;
//         while(num < 10){
//             num++;
//             sum += num;
//             System.out.println("number = "+ sum);
//         }
//     }
// }



// class First {
//     public static void main(String args[]){
//         for(int a = 1; a <= 5; a++){
//             System.out.println("*".repeat(100 ) );
//         }
//     }
// }



// class First{
//     public static void main(String args[]){
//         int a = 4;
//         int b = 5; 
//         for(int i = 1; i <= b; i++){
//             for(int j = 1; j <= a; j++){
//                if(j == 1 || i ==1 || i == b || j == a){
//                     System.out.print("*");
//                }else{
//                     System.out.print(" ");
//                }
               
//             }
//             System.out.println();
//         }
//     } 
// }


// class First {
//     public static void main(String args[]){
//         int num = 3;
//         for(int i = 1; i <= num; i++){
//             System.out.println("*".repeat(i));
//         }
//     }
// }



// class First {
//     public static void main(String args[]){
//         for(int i = 5; i >= 1; i--){
//             System.out.println("*".repeat(i));
//         }
//     }
// }


// class First {
//     public static void main(String args[]){
//         int sum = 1;
//         int num = 5;
//         for(int i = 1; i <= num; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" " +sum);
//                 sum++;
//             }
//             System.out.println();
//         }
        
//     }
// }



// class First{
//     static void printName() {
//         System.out.println("amar nam holo shamim");
//     }

//     public static void main(String args[]){
//         printName();
//         printAge();
//     }

//     static void printAge(){
//         System.out.println("amar age holo 19.9 year");
//     }
// }



// import java.util.*;
// class First {
    
//     static void printName (String name){
//         System.out.println("amar nam holo "+name);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printName(name);
//         sc.close();
//     }
// }



// import java.util.*;
// class First {
//     static int returnsum(int a,int b){
//         int sum = a * b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int printSum = returnsum(a,b);
//         System.out.println(printSum);
//         sc.close();
//     }
// }



// import java.util.*;

// class First {
//     static int fectorialnum (int num){
        
//         int fac = 1;
//         for(int i = 1; i <= num; i++){
//             fac *= i;
//         }
//         return fac;
//     }
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         sc.close();
//         int prinoutput = fectorialnum(num);
//         System.out.println(prinoutput);
//     }
// }



// answer 1 ...


// import java.util.*;

// class First {
//     static int averageNumber(int a, int b, int c){
//         return (a + b + c) / 3;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         sc.close();
//         System.out.println("average number holo "+ averageNumber(a,b,c) );
//     }
// }






// import java.util.*;

// class First {
//     static void oddprintFuntion(int a){
//         for(int i = 1; i <= a; i++){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         sc.close();
//         oddprintFuntion(a);
//     }
// }



// import java.util.*;
// class First {
//     public static void main (String args[]){
//         int[] marks= new int[4];
//         marks[0] = 33;
//         marks[1]= 99;
//         marks[2] = 93;
//         marks[3] = 66;

//         System.out.print(Arrays.toString(marks));

//     }
// }

// import java.util.Arrays;

// class First {
//     public static void main (String args[]){
//        int marks[] = {32,43,565,67,878};
//        System.out.println(Arrays.toString(marks));

//     }
// }


// import java.util.*;

// class First {
//     public static void main (String args[]){
//        int marks[] = {32,43,565,67,878};
//        for(int i = 0; i < marks.length; i++){
//         System.out.println(marks[i]);
//        }

//     }
// }




/*In this program I have used a class First which has a static method sum_OF_series(). The function of this method is
to find the square of each number from 1 to the given number and find the sum of all of them. For this I have used a 
for loop where i*i is added to sum.Finally, sum is returned. In the main() method, I called sum_OF_series(30) and stored 
the result in the output variable and printed it using System.out.println(). The code is simple, easy to read, and using
methods makes it cleaner and more modular.*/

// public class First {
//     static int sum_OF_series(int valu){
//         int sum = 0;
//         for(int i = 1; i <= valu; i++){
//             sum += (i*i);
//         }
//         return sum;

//     }

//     public static void main(String args[]){
//         int output = sum_OF_series(30);
//         System.out.println(output);
//     }
// }





// import java.util.*;

// public class First {
//     static void matrix(){
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int number[][] = new  int[row][col];
        
//         for(int i = 0; i < row; i++){
//             for(int j = 0; j < col; j++){
//                 number[i][j] = sc.nextInt();
//             }
//         }

//         int searchValu = sc.nextInt();
//         sc.close();

//         for(int i = 0; i < row; i++){
//             for(int j = 0; j < col; j++){
//                 if(number[i][j] == searchValu){
//                    System.out.println("Value found at location ("+ i +","+ j +")");

//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         matrix();
//     }
// }




// import java.util.*;

// public class First{
//     public static void main(String args[]){
//         // String name = new String("SHAMIM");
//         String name = "shamim";
//         System.out.println(name);
//     }
// }




// string methods ......

// public class First{
//     public static void main(String[] args) {
//         String name = "shamim";
//         String lest_name= "    HACKER jj  ";
//         System.out.println(name.length());
//         System.out.println(name.toUpperCase());
//         System.out.println(lest_name.toLowerCase());
//         System.out.println(lest_name.trim());
//     }
// }










// public class First{
//     public static void main(String args[]){
//         System.out.println("hello world");
//     }
// }



// public class First{
//     public static void main(String args[]){
//         System.out.println("good  mornig");
//     }
// }





                                                        // variable in java 

// 
// public class First{
//     public static void main(String args[]){
//         int mynumber;
//         mynumber = 66;
//         System.out.println(mynumber);

//         String name = "shamim";
//         System.out.println(name);

//         double number = 456.44;
//         System.out.println(number);


//         float number2 = 5666.54f;
//         System.out.println(number2);



//         boolean infoolow = true;
//         System.out.println(infoolow );
//     }
// }




// public class First{
//     public static void main(String args[]){
//         System.out.println("*\n**\n***\n****\n*****");
//     }
// }


// public class First{
//     public static void main(String args[]){
//         System.out.println("    *\n   **\n  ***\n ****\n*****");
//     }
// }


// public class First{
//     public static void main(String args[]){
//         System.out.println("*****\n****\n***\n**\n*");
//     }
// }



                        //  input in java ..




// import java.util.*;
// public class First{
//     public static void main (String args[]){
//         Scanner sc = new  Scanner(System.in);
//         String name = sc.nextLine();
//         sc.close();
//         System.out.println("amar nam cholo "+name);

//     }
// }




// import java.util.*;
// public class First{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         sc.close();

//         System.out.println("welcome "+ name +" vai");
//     }
// }



// import java.util.*;
// public class First{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number: ");
//         int number1 = sc.nextInt();

//         System.out.print("Enter your second number: ");
//         int number2 = sc.nextInt();

//         int output = number1 + number2;
//         System.out.println("Answer : "+output);
//         sc.close();


//     }
// }




// public class First{
//     public static void main(String args[]){
//         float number = 66;
//         System.out.println(number);
//     }
// }



 



                                        //  operators,if-else & number system...

// 
// /assigment oporator

// public class First {

//     public static void main(String args[]){
//         int number = 66;
//         System.out.println(number);
//         String name = "SHAMIM";
//         System.out.println(name);
//         String newname = name;
//         System.out.println(newname);
//     }
// }


// swaping ....

// import java.util.*;

// public class First {

//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you number A : ");
//         int number_A = input.nextInt();
//         System.out.print("enter you number B : ");
//         int number_B = input.nextInt();
//         input.close();

//         int number_C = number_A;
//         number_A = number_B;
//         number_B = number_C;

//         System.out.println("Swapping done...");
//         System.out.println("Value of A is : "+ number_A);
//         System.out.println("Value of B is : "+ number_B);

//     }
// }





// /arithmatic operator in java


// public class First {
//     static void addition(int a, int b){
//         int addition = a + b;
//         System.out.println(addition);
//     }

//     static void subtraction(int a, int b){
//         int subtraction = a - b;
//         System.out.println(subtraction);
//     }

//     static void multiplication(int a , int b){
//         int multiplication = a * b;
//         System.out.println(multiplication);
//     }

//     static void division (int a , int b ){
//         int division = a / b;
//         System.out.println(division);
//     }

//     static void modulus(int a , int b){
//         int modular = a % b;
//         System.out.println(modular);
//     }


//     public static void main(String args[]){
//         addition(30,40);
//         subtraction(20,10);
//         multiplication(50,5);
//         division(10,8);
//         modulus(9,2);
//     }
// } 



// public class First {

//     public static void main(String args[]){
//         int number = ((2 - 5) * 5);
//         System.out.println(number);
//         System.out.println(9/9/9/3);
//     }
// }





//  shorthand operator ....

// public class First {
//     static void shorthand_addition(){
//         int a = 50;
//         a += 10;

//         System.out.println(a);
//     }

//     static void shorthand_subtraction(){
//         int a = 50;
//         a -= 10;

//         System.out.println(a);
//     }

//     static void shorthand_multiplication(){
//         int a = 50;
//         a *= 10;

//         System.out.println(a);
//     }

//     static void shorthand_divition(){
//         int a = 50;
//         a /= 10;

//         System.out.println(a);
//     }

//     static void shorthand_modulus(){
//         int a = 50;
//         a %= 10;

//         System.out.println(a);
//     }
//     public static void main(String args[]){
//         shorthand_addition();
//         shorthand_divition();
//         shorthand_modulus();
//         shorthand_multiplication();
//         shorthand_subtraction();
//     }
// }




//  Unary operator ....

// public class First {

//     public static void main(String args[]){
//         int a = 10;
//         System.out.println(a);
//         a ++;
//         System.out.println(a);


//         int b = 10;
//         System.out.println(b);
//         b --;
//         System.out.println(b);


//         int c = 10;
//         System.out.println(c);
//         ++c;
//         System.out.println(c);


//         int d = 10;
//         System.out.println(d);
//         --d;
//         System.out.println(d);
//     }
// }





// operators challenge ......

// 1 create a program that takes two numbers and whow s reslut of all arithmatic operators ( + , - , * , / , % )



// import java.util.*;
// public class First {
//     static void fun() {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you first number : ");
//         int number_1 = input.nextInt();

//         System.out.print("enter you secound number : ");
//         int number_2 = input.nextInt();

//         System.out.print("enter you operators ( + , - , * , / , % ) : ");
//         String operators = input.next();

//         input.close();

//         switch (operators) {
//             case "+":
//                 System.out.println(number_1 + "+"+ number_2+" = "+(number_1 + number_2));
//                 break;
//              case "-":
//                 System.out.println(number_1 + "-"+ number_2+" = "+(number_1 - number_2));
//                 break;
//              case "*":
//                 System.out.println(number_1 + "*"+ number_2+" = "+(number_1 * number_2));
//                 break;
//              case "/":
//                 System.out.println(number_1 + "/"+ number_2+" = "+(number_1 / number_2));
//                 break;
//              case "%":
//                 System.out.println(number_1 + "%"+ number_2+" = "+(number_1 % number_2));
//                 break;
        
//             default:
//             System.out.println("you operator in not-found");
//                 break;
//         }


//     }
//     public static void main(String[] args) {
//         fun();
//     }
// }




//  2 create a program to calculate product of two floating points numbers.....


// import java.util.*;
// public class First {
//     static void floatingnumber() {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you first number : ");
//         int number_1 = input.nextInt();

//         System.out.print("enter you secound number : ");
//         int number_2 = input.nextInt();
//         input.close();
//         float sum = number_1 + number_2;

//         System.out.println(sum);

//     }
//     public static void main(String[] args) {
//         floatingnumber();
//     }
// }





//  3 create a program to calculate premeter of a rectagle perimeter of reactangle ABCD  = A + B + C + D...


// import java.util.*;
// public class First {
//     static void reactengle(){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number A : ");
//         int number_A = input.nextInt();

//         System.out.print("enter you number B : ");
//         int number_B = input.nextInt();

//         System.out.print("enter you number C : ");
//         int number_C= input.nextInt();

//         System.out.print("enter you number D : ");
//         int number_D= input.nextInt();

//         input.close();

        
//         float sum = (number_A + number_B + number_C + number_D);
//         System.out.println("Answer : "+sum);
       
//     }
//     public static void main(String[] args) {
//         reactengle();
//     }
// }




// 4 create a program to calculate the Area of a Triangle Area of triangle = (0.5f * * b * h )...



// import java.util.*;

// public class First {

//     static void Area(){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter the value of B : ");
//         int number_1 = input.nextInt();

//         System.out.print("enter the value of H : ");
//         int number_2 = input.nextInt();

//         input.close();

//         float sum = (0.5f * number_1 * number_2);
//         System.out.println("Answer : "+sum);
//     }
//     public static void main(String[] args) {
//         Area();
//     }
// }





//  5 create a program to calculate the simple interest simple interest = (p * t * r) / 100...


// import java.util.*;

// public class First {

//     static void interest(){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you value of P : ");
//         int p = input.nextInt();

//         System.out.print("enter you value of T : ");
//         int t = input.nextInt();

//         System.out.print("enter you value of R : ");
//         int r = input.nextInt();

//         input.close();

//         float output = (p * t * r);
//         System.out.println("Answer : "+output);
//     }
//     public static void main(String[] args) {
//         interest();
//     }
// }








//  6 create a program to calculate the simple interest simple interest = p(1 + r/100)t...


// import java.util.*;

// public class First {

//     static void interest(){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you value of P : ");
//         int p = input.nextInt();

//         System.out.print("enter you value of T : ");
//         int t = input.nextInt();

//         System.out.print("enter you value of R : ");
//         int r = input.nextInt();

//         input.close();

//         float output = p*(1 + r / 100)*t;
//         System.out.println("Answer : "+output);
//     }
//     public static void main(String[] args) {
//         interest();
//     }
// }






//  7 create a program to convert fahrenhite to celsius = C = (F - 32) * 5/9...

// import java.util.*;

// public class First {

//     static void fahrenhite(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you farenhite valu : ");
//         int F = input.nextInt();
//         input.close();

//         float Celsius = ( F - 32) * 5/9;

//         System.out.println("Celsius : "+Celsius);
//     }
//     public static void main(String[] args) {
//         fahrenhite();
//     }
// }





                                                // else if in java

// 


// public class First {

//     public static void main(String[] args) {
//         if(true){
//             System.out.println("you are rigjht ...");
//         }

//         if(false){
//             System.out.println("you are wrong");
//         }else{
//             System.out.println("secound is right...");
//         }
//     }
// }



// import java.util.*;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you age : ");
//         int age = input.nextInt();
//         input.close();

//         if(age >= 18 && age < 30){
//             System.out.println("you are adalt..");
//         }else{
//             System.out.println("you are chiled...");
//         }
//     }
// }







// if else challenge ...

// 1 create a program that determines if a number is positive , negative , or zero.....
// Answer...

// import java.util.*;
// public class First {
//     static void determines(){
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("enter you number : ");
//         int number = input.nextInt();
//         if(number == 0){
//             System.out.println(number +" is invalid..");
//         }else if( number % 2 == 0){
//             System.out.println(number + " is positive number ..");
//         }else{
//             System.out.println(number + " is negative..");
//         }
//         input.close();
//     }
//     public static void main(String[] args) {
//         determines();
//     }
// }




//  2 create a program that determines if a number id od and even...
// ANSWER..

// import java.util.*;
// public class First {

//     static void odd_even (){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();

//         if(number % 2 == 0){
//             System.out.println(number + " is even number..");
//         }else{
//             System.out.println(number + " is odd number...");
//         }

//         input.close();
//     }
//     public static void main(String[] args) {
//         odd_even();
//     }
// }




//  3 create a program that determines the greatest of the three numbers ...
// ANSWER...

// import java.util.*;

// public class First {

//     static void greatestnumber(){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number A : ");
//         int number_1 = input.nextInt();

//         System.out.print("enter you number B : ");
//         int number_2 = input.nextInt();

//         System.out.print("enter you number C : ");
//         int number_3 = input.nextInt();

//         if(number_1 > number_2 && number_1 > number_3){
//             System.out.println(number_1 +" is a greatest numbers...A");
//         }else if(number_2 > number_1 && number_2 > number_3){
//             System.out.println(number_3 +" is a greatest numbers...B");
//         }else{
//             System.out.println(number_3 +" is a greatest numbers...C");
//         }
        
//         input.close();
//     }
//     public static void main(String[] args) {
//         greatestnumber();
//     }
// }




//  4 create a program that determines if a given year is a leap year ...
// answer..


// import java.util.*;

// public class First {

//     static void leap_year(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you year : ");
//         int year = input.nextInt();

//         if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
//             System.out.println(year + " is leap year...");
//         }else{
//             System.out.println(year + " is no leap year...");
//         }

//         input.close();
//     }
//     public static void main(String[] args) {
//         leap_year();
//     }
// }





// 5 create a program that calculates greades besed on marks...
// ANSWER ...

// import java.util.*;
// public class First {
//     static void grades (){
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you marks parsentics : ");
//         int number = input.nextInt(); 

//         if(number <= 100 && number >= 90){
//             System.out.println("A+");
//         }else if(number < 90 && number >= 80){
//             System.out.println("B+");
//         }else if(number < 80 && number >= 70){
//             System.out.println("C+");
//         }else if(number < 70 && number >= 60){
//             System.out.println("D+");
//         }else{
//             System.out.println("you are fail");
//         }
            // input.close();
//     }
//     public static void main(String[] args) {
//         grades();
//     }
// }




// import java.util.*;
// public class First {

//     static void person(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you age : ");
//         int age = input.nextInt(); 

//         if(age >= 18 ){
//             if(age > 50){
//                 System.out.println("you are senior..");
//             }
//             System.out.println("you are adult");
//         }else{
//             System.out.println("you are  children..");
//         }
//     }
//     public static void main(String[] args) {
//         person();
//     }
// }















                                                //  while loop ,methods & array in java


// 

// while loop...


// public class First {

//     public static void main(String[] args) {
//         int i , valu;
//         i = 1;
//         valu = 10;

//         while(i <= valu){
           
//             System.out.println("i = "+ i);
//             i++;
//         }
//     }
// }




// public class First {

//     public static void main(String[] args) {
//         int count = 500;

//         while(count >= 0){
//             System.out.println("number : "+count);
//             count--;
//         }
//     }
// }




// import java.util.*;
// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int i = 1;
//         while(i <= 5){
//             System.out.print("enter you number : ");
//             int value = input.nextInt();
//             System.out.println("value is : "+ value);
//             i++;
//         }
//         input.close();
//     }
// }





// function ....


// public class First {

//     static String helloPrint(String valu){
        
//         return valu;
//     }
//     public static void main(String[] args) {
//         String output = helloPrint("shamim");
//         System.out.println(output);
//     }
// }




// public class First {

//     static void welcome(){
//         System.out.println("welcome to java class..");
//     }
//     public static void main(String[] args) {
//         for(int i = 1; i <= 10; i++){
//             System.out.print(i+" : ");
//             welcome();
//         }
//     }
// }





// public class First {

//     public static void main(String[] args) {
//         pattern_1();
//     }

//     static void pattern_1 (){
//         int i = 1;
        
//         while(i <= 50){
//             int j = 1;
//             while(j <= i){
//                 System.out.print("*"+" ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }





// import java.util.*;

// public class First {

//     static String identity (String name, int age){
//         String exjust = "amar nam holo "+name+" amar age holo "+age;
//         return exjust;
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you name : ");
//         String name = input.nextLine();

//         System.out.print("enter you age :");
//         int age = input.nextInt();

//         String output = identity(name, age);
//         System.out.println(output);

//         input.close();
//     }
// }




// public class First {

//     static int sum (int a , int b){
//         return a + b;
//     }
//     public static void main(String[] args) {
//         int output = sum(5,5);
//         System.out.println(output);
//     }
// }






//  loop and function challenge....

// 1 develop a program that prints the multiplication table for a given number ....

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();
//         multiplicationtable(number);
//         input.close();
//     }

//     static void multiplicationtable(int number){
//         int value = number ;
        
//         for(int i = 1; i <= 10; i++){
//             System.out.println(value + " * "+i+" = "+(value * i));
//         }
//     }
// }





//  2 create a program to sum all odd numbers from 1 to speaified number N....
// ANSWER...

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you number : ");
//         int number = input.nextInt();
//         int output = sum_of_odd_Number(number);
//         System.out.println("Answer : "+output);
//         input.close();
//     }

//     static int sum_of_odd_Number(int number){
//         int N = number;
//         int sum = 0;
//         for(int i = 1; i <= N; i++){
//             if(i % 2 != 0){
//                 sum += i;
//             }
//         }
//         return sum;
//     }
// }




//  3 write a function that calculates the factorial of a given number.....

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();

//         int output = factorial(number);
//         System.out.println(output);


//         input.close();

//     }

//     static int factorial(int value){

//         int fac = 1;
//         for(int i = 1; i <= value; i++){
//             fac *= i;
//         }
//         return fac;
//     }
// }





//  4 create a program that computes the sum of the digits on an integer....

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();


//         int output = integer_number_sum(number);
//         System.out.println(output);


//         input.close();
//     }

//     static int integer_number_sum (int value){
//         int sum = 0;
//         for (int i = 1; i <= value; i++){
//             sum += i;
//         }
//         return sum;
//     }
// }


// import java.util.*;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();

//         int output = integer_number_sum(number);
//         System.out.println(output);
//         input.close();

//     }

//     static int integer_number_sum (int value){
//         String str = Integer.toString(value);
//         int number[] = new int[str.length()];

//         int sum = 0;
//         for(int i = 0; i < str.length(); i++){
//             number[i] = str.charAt(i) - '0';
//             sum += number[i];
//         }
//         return sum;

//     }
// }






//  5 Create a program to find the least commonm Multiple (Lcm) of two...

// public class First {

//     public static void main(String[] args) {
//         int Lcm = LCM();
//         System.out.println(Lcm);
//     }

//     static int LCM(){
//         int i = 1;
//         int output = 0;
//         while (i > 0) {
//             if(i % 15 == 0 && i % 20 == 0){
//                 output = i;
//                 break;
//             }
//             i++;
//         }
//         return output;
//     }
// }









// import java.util.Scanner;

// public class First {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = input.nextInt();
//         System.out.print("Enter second number: ");
//         int b = input.nextInt();

//         int lcm = LCM(a, b);
//         System.out.println("LCM = " + lcm);

//         input.close();
//     }

//     static int LCM(int a, int b) {
//         int i = 1;
//         while (true) {
//             if (i % a == 0 && i % b == 0) {
//                 return i;
//             }
//             i++;
//         }
//     }
// }








//  6  create a program to find the greatest common divison  (GCD) of two integers....
// ANSWER...

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you first number : ");
//         int number_1 = input.nextInt();

//         System.out.print("enter you secound number : ");
//         int number_2 = input.nextInt();

//         int output = GCD(number_1, number_2);
//         System.out.println(output);
//         input.close();
//     }

//     static int GCD(int number_1, int number_2){
        
//         int number_output;
//         int value = 1;
//         if(number_1 > number_2){
//             number_output = number_1;
//         }else{
//             number_output = number_2;
//         }

//         for(int i = 1; i < number_output; i++){
//             if(number_1 % i == 0 && number_2 % i == 0){
//                 value = i;
//             }
//         }
//         return value;
//     }
// }








//  7 create a program to cheak whether a geven number in prime...

// public class First {

//     public static void main(String[] args) {
//         int value = 33;
//         boolean isPrime = prime_number(value);
//         System.out.println(value + " is prime? " + isPrime);
//     }

//     static boolean prime_number(int value) {
//         if(value <= 1) return false; // 1 বা 0 prime নয়

//         for(int i = 2; i <= Math.sqrt(value); i++) {
//             if(value % i == 0) {
//                 return false; // ভাগ যাচ্ছে → prime নয়
//             }
//         }

//         return true; // ভাগ যাচ্ছেনা → prime
//     }
// }







//  8 create a program to check reverse the disitst of number...

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you valu : ");
//         String number = input.nextLine(); 
        
//         String output = reberse(number);
//         System.out.println(output);
//         input.close();
//     }

//     static String reberse (String number){
//         String outpur = "";
//         for(int i = number.length()-1; i >= 0; i--){
//             outpur += number.charAt(i);
//         }
//         return outpur;
//     }
// }







//  9 fibinakki ....

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you number : ");
//         int number = input.nextInt();

//         fibonakki(number);
        
//         input.close();
//     }

//     static void fibonakki (int value){
//         int num_1 = 0, num_2 = 1;
//         if(value < 0)return;
//         System.out.print("0 ");
//         if(value == 0)return;
//         System.out.print("1 ");

//         while(num_1+num_2 <= value){
//             int num_3 = num_1+num_2;
//             System.out.print(num_3 + " ");
//             num_1 = num_2;
//             num_2 = num_3;
//             // value++;
//         }

//     }
// }









//  10 create a program to cheak if a number is an armstorng number ....
// ANSWER...

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your number: ");
//         String number = input.nextLine();

//         String outpur = armstorng(number);
//         System.out.println(outpur);

//         input.close();

//     }

//     static String armstorng(String number){
//         int sum = 0;
//         for(int i = 0; i < number.length(); i++){
//             int num = Character.getNumericValue(number.charAt(i));
//             int mu_num = num*num*num;
//             sum += mu_num;
//         }
//         String sumdublicate = Integer.toString(sum);
//         if(number.equals(sumdublicate)){
//             return  "Armstrong number ";
//         }else {
//             return "Not an Armstrong number ";
//         }
//     }
// }






// 11 create a program to verufy if a number palindrome....

// import java.util.Scanner;

// public class First {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("enter you palindom chack : ");
//         String valu = input.nextLine();


//         String output = palindrome(valu);
//         System.out.println(output);

//         input.close();
//     }

//     static String palindrome(String value){
//         String output = "";
//         for(int i = value.length()-1; i >= 0; i--){
//             output += value.charAt(i);
//         }
//         if(value.equals(output)){
//             String values = value+" is palindom";
//             return values;
//         }else{
//             String values = value+" is not palindom";
//             return values;
//         }
//     }
// }





//  12 creatre pattens 

public class First {

    public static void main(String[] args) {
        pattens(5);
        pattens1(5);
        pattens3(5);
    }

    static void pattens(int number ){
        for(int i = 1; i <= number; i++){
            
            for(int j = 1; j <= i; j++){
               
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattens1(int number ){
        for(int i = number; i >= 0; i--){
            
            for(int j=1; j <= i; j++){
               
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    static void pattens3(int number ){
        for(int i = number; i >= 0; i--){
            
            for(int j=1; j <= i; j++){
               
                System.out.print(". ");
            }
            System.out.println();
        }
        for(int i = number; i >= 0; i--){
            
            for(int j=1; j <= i; j++){
               
                System.out.print("* ");
            }
            System.out.println();

             
            
            for(int j = i; j >= 0; j--){
               
                System.out.print("* ");
            }
           
        }
        
    }
}