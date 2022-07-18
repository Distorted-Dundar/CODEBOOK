public class MorseTree {
//    Not needed anymore

    MorseNode root =null;
    MorseTree(){
        root.Right = new MorseNode('.','E');
        root.Left = new MorseNode('_','T');
        root.Left.Left = new MorseNode('.','S');
        root.Left.Left.Left = new MorseNode('.','H');

    }

}
