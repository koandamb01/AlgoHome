package tries;

public class Tries {
    public TNode root;

    public Tries(){
        this.root = new TNode();
    }

    public void insertWord(String word){
        // create a current node that point to the root node
        TNode currentTNode = this.root;

        // iterate through the word
        for(int i = 0; i < word.length(); i++){
            // get the character at i
            Character letter = word.charAt(i);

            TNode child = currentTNode.children.get(letter);
            // check if letter exist in node
            if(child == null){
                child = new TNode();
                currentTNode.children.put(letter, child);
            }
            currentTNode = child;
        }
        currentTNode.isCompleted = true;
    }


    // boolean isPrefixValid(String prefix): Returns a boolean whether the prefix is in the trie or not
    public boolean isPrefixValid(String prefix){
        TNode currentTNode = this.root;

        // iterate through the word
        for(int i = 0; i < prefix.length(); i++){
            Character letter = prefix.charAt(i);

            TNode child = currentTNode.children.get(letter);
            // check if letter exist in node
            if(child == null){
                return false;
            }
            currentTNode = child;
        }
        return true;
    }

}
