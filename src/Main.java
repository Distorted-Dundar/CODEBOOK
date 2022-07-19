import java.util.Scanner;

public class Main {

//    https://media.discordapp.net/attachments/731267924324646912/991553593469583430/IMG_3568.jpg?width=1272&height=1696
//    _ is 95 in ascii
//    . is 46 in ascii
//   " " A blank space is 32
//    \n a new line char is 10

    public static void main(String[] args) {
        MorseHeap code = new MorseHeap();

        Scanner obj = new Scanner(System.in);
//        System.out.println("Hello Press 1 to Encode your message to Morse Code\npress 2 to Decode A morseCode phrase");
        String line = "";
        while(true){
            System.out.println("Enter  1 to Encode A message\npress 2 to Decode a A morsecode phrase");
            line = obj.nextLine();
            if(line.equals("1") || line.toLowerCase().equals(("encode"))){
                System.out.println("Type your String to ENCODE ONLY LETTERS");
                line = obj.nextLine();
                System.out.println("shh...This is secret but heres your encoded message");
                System.out.println(code.EncodeMessage(line));
            }
            else if(line.equals("2") || line.toLowerCase().equals(("decode"))){
                System.out.println("Type your String to Decode ONLY . and _ allowed");
                line = obj.nextLine();
                System.out.println("shh...This is secret but heres your decoded message");
                System.out.println(code.TranslateString(line));

            }
            else{
                break;
            }
        }
        return;
    }

}
