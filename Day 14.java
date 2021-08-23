
  public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> p1 = nodeToRootPath(node, d1);
    ArrayList<Integer> p2 = nodeToRootPath(node, d2);

    int i = p1.size() - 1;
    int j = p2.size() - 1;

    while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
      i--;
      j--;
    }

    return p1.get(i + 1);
  }

  public static int distanceBetweenNodes(Node node, int d1, int d2){
    
   Node lca = la(node, d1, d2);
   
   ArrayList<Integer> a = nodeToRootPath(lca,d1);
   ArrayList<Integer> b = nodeToRootPath(lca,d2);
   int c = (a.size()-1)+(b.size()-1);
   return c;
  }
 private static Node la(Node node, int d1, int d2) {
    
    
    if(node.data == d1 && node.data == d2)
    {
        return node;
    }
    for(Node child : node.children)
    {
      boolean c1 = find(child,d1);
      if(c1 == true)
      {
          
          boolean c2= find(child,d2);
          
          if(c2 == true)
          {
              
              Node lca = la(child,d1,d2);
              return lca;
          }
          
          
      }
    }
    return node;
    
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
   
