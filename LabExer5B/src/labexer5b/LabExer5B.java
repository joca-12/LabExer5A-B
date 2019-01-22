
package labexer5b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5B {

    public static void main(String[] args) {
        int counter = 0; 
        Scanner sc = new Scanner(System.in);
        try{
            try{
            System.out.println("1. It is a block of code that might "
                + "throw an \nexception that can be "
                + "handled by a matching catch block.");
            System.out.println("A. Try block"
                + "\nB. Finally Block"
                + "\nC. getMessage()");
            System.out.print("Answer: ");
            String ans = sc.nextLine();

                if(ans.equalsIgnoreCase("A")){
                    counter++;
                    System.out.println("Correct!");
                }else if(ans.equalsIgnoreCase("B")||ans.equalsIgnoreCase("C")){
                    System.out.println("Incorrect");
                }else if(ans.isEmpty()){
                    throw new Empty();
                }else if(!ans.equalsIgnoreCase("A")||!ans.equalsIgnoreCase("B")||!ans.equalsIgnoreCase("C")){
                throw new not();
            }
            }catch(not n){
                System.out.println("Invalid or Not in the Choices");
            }catch(Empty e){
                System.out.println("No Answer");
            }
            try{
            System.out.println("2. It is a block of code that might "
                + "throw an \nexception that can be "
                + "handled by a matching catch block.");
            System.out.println("A. Try block"
                + "\nB. Finally Block"
                + "\nC. getMessage()");
            System.out.print("Answer: ");
            String nsa = sc.nextLine();
                if(nsa.equalsIgnoreCase("A")){
                counter++;
                    System.out.println("Correct!");
                }else if(nsa.equalsIgnoreCase("B")||nsa.equalsIgnoreCase("C")){
                    System.out.println("Incorrect");
                }else if(nsa.isEmpty()){
                    throw new Empty();
                }else if(!nsa.equalsIgnoreCase("A")||!nsa.equalsIgnoreCase("B")||!nsa.equalsIgnoreCase("C")){
                throw new not();
            }
            }catch(not n){
                System.out.println("Invalid or Not in the Choices");
            }catch(Empty e){
                System.out.println("No Answer");
                }
            try{
            System.out.println("3. It is a block of code that might "
                + "throw an \nexception that can be "
                + "handled by a matching catch block.");
            System.out.println("A. Try block"
                + "\nB. Finally Block"
                + "\nC. getMessage()");
            System.out.print("Answer: ");
            String san = sc.nextLine();
                if(san.equalsIgnoreCase("A")){
                counter++;
                    System.out.println("Correct!");
                }else if(san.equalsIgnoreCase("B")||san.equalsIgnoreCase("C")){
                    System.out.println("Incorrect");
                }else if(san.isEmpty()){
                    throw new Empty();
                }else if(!san.equalsIgnoreCase("A")||!san.equalsIgnoreCase("B")||!san.equalsIgnoreCase("C")){
                throw new not();
                }
            }catch(not n){
                System.out.println("Invalid or Not in the Choices");
            }catch(Empty e){
                System.out.println("No Answer");
                }
            try{
            System.out.println("4. It is a block of code that might "
                + "throw an \nexception that can be "
                + "handled by a matching catch block.");
            System.out.println("A. Try block"
                + "\nB. Finally Block"
                + "\nC. getMessage()");
            System.out.print("Answer: ");
            String nas = sc.nextLine();
                if(nas.equalsIgnoreCase("A")){
                counter++;
                    System.out.println("Correct!");
                }else if(nas.equalsIgnoreCase("B")||nas.equalsIgnoreCase("C")){
                    System.out.println("Incorrect");
                }else if(nas.isEmpty()){
                    throw new Empty();
                }else if(!nas.equalsIgnoreCase("A")||!nas.equalsIgnoreCase("B")||!nas.equalsIgnoreCase("C")){
                throw new not();
                }
            }catch(not n){
                System.out.println("Invalid or Not in the Choices");
            }catch(Empty e){
                System.out.println("No Answer");
                } 
            try{
            System.out.println("5. It is a block of code that might "
                + "throw an \nexception that can be "
                + "handled by a matching catch block.");
            System.out.println("A. Try block"
                + "\nB. Finally Block"
                + "\nC. getMessage()");
            System.out.print("Answer: ");
            String asn = sc.nextLine();
                if(asn.equalsIgnoreCase("A")){
                counter++;
                    System.out.println("Correct!");
                }else if(asn.equalsIgnoreCase("B")||asn.equalsIgnoreCase("C")){
                    System.out.println("Incorrect");
                }else if(asn.isEmpty()){
                    throw new Empty();
                }
            }catch(Empty e){
                System.out.println("No Answer");
                } 
        }catch(InputMismatchException ime){
            System.out.println(ime);
        }finally{
            System.out.println("Your Score: " + counter);
        }
    }

    private static class Empty extends Exception {

        public Empty() {
        }
    }

    private static class not extends Exception {

        public not() {
        }
    }
}
 
