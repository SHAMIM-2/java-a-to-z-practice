// import java.util.*;

// public class practic {
//     public void logic(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter you number : ");
//         int number =input.nextInt();
//         int random = (int)(Math.random()*3);
//         // int numberC[] = {};
//         while(number != random){
//             System.out.print("plz try agein , enter you number : ");
//             number = input.nextInt();
           
//         }
//         System.out.println("Correct! The number was: " + random);
//         input.close();
    
//     }   
// }








// public class practic {

//     public String title;
//     public String author;
//     public String isbm;

//     public void output(){
//         System.out.println("amar title holo : "+title+"\nauthor holo : "+author+"\n");
//     }
//     practic(String title,String author){
//         this.title = title;
//         this.author = author;

//     }
 
// }


import java.util.*;
public class practic {

    
    Scanner input = new Scanner(System.in);

    int a,b;
    public void outputSUB(){
        

        System.out.print("enter you number a : ");
        a = input.nextInt();

        System.out.print("enter you number b : ");
        b = input.nextInt();
        
    }
    
    public void outputMAIN(){
        int sum = this.a + this.b;
        System.out.println("output : "+sum);
    }

    
}