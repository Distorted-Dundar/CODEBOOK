public class MorseNode {
    char data;
    char meaning;
    MorseNode Left,Right;

    MorseNode(char data,char meaning){
        this.data = data;
        this.meaning = meaning;
    }

    public char getData(){
        return this.data;
    }
    public char getMeaning(){
        return this.meaning;
    }



}
