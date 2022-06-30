public class MorseHeap {
    MorseNode [] array = new MorseNode[32];
    public MorseHeap(){
        array[0] = null;
        array[1] = null;
        array[2] = new MorseNode('-','T');
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
    }
    public MorseNode getCode(int x){
        if(x  <= 1 || x >31) {
            System.out.println("Not a proper index");
            return null;
        }
        return array[x];
        }

    public String TranslateChar(char x){
        String result="";

        return result;
    }
    }


