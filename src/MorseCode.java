import java.util.Scanner;

public class MorseCode {

    public MorseCode(){

    }
//    https://media.discordapp.net/attachments/731267924324646912/991553593469583430/IMG_3568.jpg?width=1272&height=1696
//samihah was here -> Thanks
//    _ is 95 in ascii
//    . is 46 in ascii
//   " " A blank space is 32
//    \n a new line char is 10

    public static void main(String[] args) {
        MorseHeap code = new MorseHeap();
//      System.out.println(code.getCode(3).meaning);

        Scanner obj = new Scanner(System.in);
//        String line = obj.nextLine();
//        String Code;
//        for(int i = 0; i < line.length();i++){
//            System.out.println(line.charAt(i));
//            if(line)
//
//        }
//        System.out.println(code.TranslateString("... ___ ...  ... ._ _... ._."));

//        System.out.println((int)'A');
//        System.out.println((int)'a');
//        System.out.println(Character.toUpperCase('a'));
//        System.out.println((int)Character.toUpperCase('A') - 65);
//        System.out.println((int)Character.toUpperCase('y') - 65);
//        System.out.println((int)Character.toUpperCase('z') - 65);



//        System.out.println(code.EncodeMessage("SOS Please help"));
        System.out.println(code.EncodeMessage("Victory"));
        System.out.println(code.EncodeMessage("Project supports Encoding and decoding"));

//        System.out.println(code.TranslateString("..  ._.. ___ ..._ .  __ . ._.. _._ . _.__"));
//         for(int i = 0; i <= 25;i++){
////             System.out.println("Dictionary[" + i +"]" + " = " + "new LookMorse" + "(" + "'"+((char)(17+i + '0')) + "'"+ " , " + " "+ i +")");
//             System.out.println((char)(i + 65 + '0'));
//
//
//         }



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
