import java.util.Scanner;

public class MorseCode {

    public MorseCode(){

    }
//    https://media.discordapp.net/attachments/731267924324646912/991553593469583430/IMG_3568.jpg?width=1272&height=1696
//samihah was here 
    public static void main(String[] args) {
        System.out.println((int)'_');
        System.out.println((int)'.');
        System.out.println((int)'_');
        System.out.println((int)' ');
        System.out.println((int)'\n');
        MorseHeap code = new MorseHeap();
      System.out.println(code.getCode(3).meaning);

        Scanner obj = new Scanner(System.in);
        String line = obj.nextLine();
        String Code;
//        for(int i = 0; i < line.length();i++){
//            System.out.println(line.charAt(i));
//            if(line)
//
//        }
        System.out.println("Hello");

//        if(char.int ==95)
//            root.Left
//        if(char.int ==46)
//            root.right

        /** need some way to access the root and then traverse when needed
         * by applying a similar thing a BST we will want to straverse until we hit a blank space perhaps use
         * a while loop while you dont reach a blank space
         * must check if double blank space by also gaurding against the end of a line
         *
         *
         * check if char is actually a _ or . in which case just check if ints are 95 or 46
         * A blank space is 32
         *
         * everytime we pass a new space we must go back to the front at the root
         * so perhaps current = root
         *      while(there still is more chars in the line that follow 94 46 32 and 10){
         *        while (char != 32 or char != 10)
         * //        if(char.int ==95)
         *               current = root
         * //            current.Left
         * //        if(char.int ==46)
         *                current = root
         * //            current.right
         *        S.O.P(current.data)
         *        current = root;}
         *
         *        ALTERNATIVLY!!!! YOU CAN USE A HEAPP!!!
         *        WE WILL MAKE A FIXED SIZED ARRAY OF ABOUT 2^4 ENTRIES
         *        EACH ENTRY IS A MORSENODE
         *        we can use a while loop
         *        if 94 or 46 determine which parent to go to each time apply
         *        2*i or 2*i+1
         *        same while loop condition
         *
         *
         * */
    }

}
