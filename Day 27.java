public static Node createLeftCloneTree(Node node){
    // write your code here
    if(node == null) 
  {
      return null ;
  }
  
  createLeftCloneTree(node.left);
  createLeftCloneTree(node.right);
  
 Node temp = new Node(node.data,node.left,null);
   
   node.left = temp;
  return node;
  
  
    
  }
