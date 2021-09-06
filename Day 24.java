public static void printKLevelsDown(Node node, int k){
    // write your code here
    Queue<Node> q = new ArrayDeque<>();
    q.add(node);
    if( k == 0)
    {
        System.out.println(node.data);
    }
 
    
    
    else{
       while(k>0)
       {
           Queue<Node> qc = new ArrayDeque<>();
           
           
           while( q.size() > 0)
           {
               node = q.element();
               if(node.left != null)
               {
                   qc.add(node.left);
               }
               if(node.right != null)
               {
                   qc.add(node.right);
               }
               q.remove();
           }
         
          q = qc;
          k--;
       }
       while( q.size() > 0)
       {
           node = q.remove();
           System.out.println(node.data);
       }
  }
  }
