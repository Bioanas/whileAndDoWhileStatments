package com.ia;

public class Main {

    public static void main(String[] args) {
  //      int count = 1;
//	while(count != 6){
//        System.out.println("Count value = " + count);
//        count++;
//    }
//    for (int i=6; i!=6; i++){
//        System.out.println("Count value is " + count);
//    }
//    count =6;
//    while (true) {
//	    if (count == 6){
//	        break;
//	    }
//        System.out.println("Count value is" + count);
//	    count++;
//        count = 22;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if (count>100){
//               break;
//            }
//        } while (count != 6);
//    }


  //  for (int i=1; i<7; i++){
        //    System.out.println("Count value is " + count);
// }
//        //even numbers
//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber){
//            if(!isEvenNumber(number)){
//               number++;
//               continue;
//            }
//            System.out.println("Even number" + number);
//            number++;
//        }
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber){
            if(!isEvenNumber(number)){
               number++;
               continue;
            }

            System.out.println("Even number" + number);
            evenNumbersFound++;
            if (evenNumbersFound>=5){
                break;
            }
           number++;
       }
        System.out.println("totl even number found = "  +  evenNumbersFound);
   }
public static boolean isEvenNumber(int number){
     if ((number % 2) == 0){
         System.out.println("Number is even");
         return true;
     }else return false;
}




}
