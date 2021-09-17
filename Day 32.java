
public static int max(Node node) {
    
    if(node == null)
    {
        return 0;
        
    }
    int m1 = max(node.left);
    int m2 = max(node.right);
    int m3 = Math.max(m1,m2);
    int m4= Math.max(m3,node.data);
    return m4;
  }

  
