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

public class First{
    public static void main(String[] args) {
        String name = "shamim";
        String lest_name= "    HACKER jj  ";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(lest_name.toLowerCase());
        System.out.println(lest_name.trim());
    }
}