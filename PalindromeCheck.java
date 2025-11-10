import java.util.Scanner;
public class PalindromeCheck {

    public class PalindromeChecking {
        public static void main(String[] args) {
            Scanner var = new Scanner(System.in);
            System.out.println("Enter your choice:\n 1.Do you wanna check word phrase \n 2.Do you wanna check number");
            int choice = var.nextInt();
            var.nextLine(); // Consume the leftover newline character

            switch(choice){
                case 1:
                    System.out.println("Enter word phrase:");
                    String word  = var.nextLine();
                    String revPhrase = "";

                    for (int i = word.length()-1;i>=0;i--){
                        revPhrase = revPhrase + word.charAt(i);
                    }
                    if(revPhrase.equals(word)){
                        System.out.println("Phrase is Palindrome!");
                    }else{
                        System.out.println("Phrase is not a Palindrome!");
                    }
                    break;

                case 2:
                    System.out.println("Enter digits");
                    int num = var.nextInt();
                    int originalNum = num; // Store the original number
                    int revDigits = 0;
                    while(num!=0){
                        int digits = num % 10;
                        revDigits = revDigits * 10 + digits;
                        num/=10;
                    }
                    if(revDigits==originalNum){ // Compare with the original number
                        System.out.println("It is a Palindrome");
                    }else{
                        System.out.println("It is not a Palindrome");
                    }
                    break;
                default:
                    System.out.println("Wrong choice try again!!!!!");
            }
            var.close();
        }
    }

}
