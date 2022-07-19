public class MorseHeap {
    MorseNode [] array = new MorseNode[32];
    LookMorse [] Dictionary = new LookMorse[26];
    String charCode = "";

    public MorseHeap(){
//        The actual Morse Heap array
        array[0] = null;
        array[1] = new MorseNode(' ', ' ');
        array[2] = new MorseNode('_','T');
        array[3] = new MorseNode('.','E');
        array[4] = new MorseNode('_','M');
        array[5] = new MorseNode('.','N');
        array[6] = new MorseNode('_','A');
        array[7] = new MorseNode('.','I');
        array[8] = new MorseNode('_','O');
        array[9] = new MorseNode('.','G');
        array[10] = new MorseNode('_','K');
        array[11] = new MorseNode('.','D');
        array[12] = new MorseNode('_','W');
        array[13] = new MorseNode('.','R');
        array[14] = new MorseNode('_','U');
        array[15] = new MorseNode('.','S');
        array[16] = new MorseNode('_','s');
        array[17] = new MorseNode('.','o');
        array[18] = new MorseNode('_','Q');
        array[19] = new MorseNode('.','Z');
        array[20] = new MorseNode('_','Y');
        array[21] = new MorseNode('.','C');
        array[22] = new MorseNode('_','X');
        array[23] = new MorseNode('.','B');
        array[24] = new MorseNode('_','J');
        array[25] = new MorseNode('.','P');
        array[26] = new MorseNode('_','a');
        array[27] = new MorseNode('.','L');
        array[28] = new MorseNode('_','u');
        array[29] = new MorseNode('.','F');
        array[30] = new MorseNode('_','V');
        array[31] = new MorseNode('.','H');

//      Dictionary i.e phone book will help point out where the char exists on the heap so that you can get the string of the
//        desired char it uses a Object LookMorse with char and heapindex
//        By using an array we can do trivial arithmetic to get the desired heapindex in 1 move!
        Dictionary[0] = new LookMorse('A' ,  6);
        Dictionary[1] = new LookMorse('B' ,  23);
        Dictionary[2] = new LookMorse('C' ,  21);
        Dictionary[3] = new LookMorse('D' ,  11);
        Dictionary[4] = new LookMorse('E' ,  3);
        Dictionary[5] = new LookMorse('F' ,  29);
        Dictionary[6] = new LookMorse('G' ,  9);
        Dictionary[7] = new LookMorse('H' ,  31);
        Dictionary[8] = new LookMorse('I' ,  7);
        Dictionary[9] = new LookMorse('J' ,  24);
        Dictionary[10] = new LookMorse('K' ,  10);
        Dictionary[11] = new LookMorse('L' ,  27);
        Dictionary[12] = new LookMorse('M' ,  4);
        Dictionary[13] = new LookMorse('N' ,  5);
        Dictionary[14] = new LookMorse('O' ,  8);
        Dictionary[15] = new LookMorse('P' ,  25);
        Dictionary[16] = new LookMorse('Q' ,  18);
        Dictionary[17] = new LookMorse('R' ,  13);
        Dictionary[18] = new LookMorse('S' ,  15);
        Dictionary[19] = new LookMorse('T' ,  2);
        Dictionary[20] = new LookMorse('U' ,  14);
        Dictionary[21] = new LookMorse('V' ,  30);
        Dictionary[22] = new LookMorse('W' ,  12);
        Dictionary[23] = new LookMorse('X' ,  22);
        Dictionary[24] = new LookMorse('Y' ,  20);
        Dictionary[25] = new LookMorse('Z' ,  19);

    }
    public MorseNode getCode(int x){
        if(x  <= 1 || x > 31) {
            return new MorseNode(' ', ' ');
        }
        return array[x];
        }


//    Assumes that is valid char from 65 to 90  and 97- 122
    public int getHeapIndexChar(char x){
//        convert char to upper case then find where it exists on the heap using getHeapIndex
        return Dictionary[((int)Character.toUpperCase(x)) - 65].getHeapIndex();
    }


//    recusivly get from parent to parent until reach 1 or before it and return the reversed string via tail recursion
//    We do a max of 3 recursive calls since the tree has height of 3
    String EncodeChar(int x){
        if (x <= 1) return "";
        return EncodeChar((int)(x/2)) + array[x].data;
    }

    public String EncodeMessage(String message){
        String result = "";
        for (int i = 0; i <message.length();i++){
            if(message.charAt(i) == ' '){
                result += " ";
            }
            else{
            result += EncodeChar(getHeapIndexChar(message.charAt(i)));
            result += " ";
        }
        }
        return result;
    }

    //    _ is 95 in ascii
//    . is 46 in ascii
//   " " A blank space is 32
//    \n a new line char is 10
//   need to check whether you hit a double space meaning a break e.g. sos help

//    Translate morse code that returns a char

      public String TranslateString(String str){
        int HasDoubleSpace = 1;

        char current;
        int index = 1;
        int i = 0;
        String result = "";
        while(i < str.length()){

            while(i <str.length() && (current = str.charAt(i)) != ' '){
                HasDoubleSpace = 0;
//                System.out.println(current);
                if((int)current == 95 || current == '_'){
                    index = index * 2;
                    i++;
                }
                else{
                    index = (index * 2) + 1;
                    i++;
                }

            }
            if(((++HasDoubleSpace) %2) ==0){
                result += " ";
            }
            i++;
            result += getCode(index).getMeaning();
            index = 1;
      }
        return result;
    }
    }





