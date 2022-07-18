public class LookMorse {
    char data;
    int heapIndex;

    LookMorse(char data,int heapIndex){
        this.data = data;
        this.heapIndex = heapIndex;
    }


    public char getChar(){
        return this.data;
    }
    public int getHeapIndex(){
        return this.heapIndex;
    }


}
