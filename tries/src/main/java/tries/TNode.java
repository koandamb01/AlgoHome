package tries;

import java.util.HashMap;

public class TNode {

    public HashMap<Character, TNode> children;
    public boolean isCompleted;

    public TNode(){
        this.children = new HashMap<Character, TNode>();
        this.isCompleted = false;
    }

}




