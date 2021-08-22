  public static int lca(Node node, int d1, int d2) {
    // write your code here
    
    if(node.data == d1 && node.data == d2)
    {
        return node.data;
    }
    for(Node child : node.children)
    {
      boolean c1 = find(child,d1);
      if(c1 == true)
      {
          
          boolean c2= find(child,d2);
          
          if(c2 == true)
          {
              
              int lca = lca(child,d1,d2);
              return lca;
          }
          
          
      }
    }
    return node.data;
    
  }
   
    private static boolean find(Node node, int data)
    {
        if(node.data == data)
        {
           return true;
        }
        for(Node child : node.children)
        {
            boolean f = find(child,data);
            
            if(f == true)
            {
                return true;
            }
        }
        return false;
        
    }
