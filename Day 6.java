public static void levelOrder(Node node){
    // write your code here
    
  
  Queue<Node> q= new ArrayDeque<>();
  q.add(node);
  
  while(q.size()>0)
  {
     node=q.remove();
     System.out.print(node.data +" ");
     
     for(Node child : node.children)
     {
         q.add(child);
     }
  }
  System.out.print(".");
  
   
    
  }
