public static boolean find(Node node, int data) {
    
    boolean count = false;
    
    for(Node child : node.children)
    {
        count=find(child,data);
        
        if(count == true)
        {
            break;
        }
    }
    if ( count == false)
    {
    for(Node child : node.children)
    {
        if(child.data == data)
        {
            count = true;
        }
        else{
            count = false;
        }
    }
    }
    
    if(count == true)
    {
        return true;
    }
    else {
        return false;
    }
    
  }
