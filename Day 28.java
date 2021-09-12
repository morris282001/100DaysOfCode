public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node == null || node.left == node)
    {
        return null;
    }
    
   transBackFromLeftClonedTree(node.right);
  
    transBackFromLeftClonedTree(node.left.left);
    node.left = node.left.left;
    
    return node;
    
   
    
  }
