public static void iterativePrePostInTraversal(Node node) {
   
    Stack<Pair> s = new Stack<>();
    Pair p = new Pair(node,1);
    s.push(p);
    String pre = "";
    String in = "";
    String post = "";
    
    while(!s.empty())
    {
        Pair top = s.peek();
        if(top.state == 1)
        {
            pre = pre + node.data +" ";
         top.state++;
         Pair pr = new Pair(node.left,1);
         s.push(pr);
        }
        else if(top.state ==2)
        {
           in = in + node.data +" "; 
           top.state++;
           Pair pr = new Pair(node.right,1);
           s.push(pr);
           
        }
        else{
            post = post + node.data+" ";
            s.pop();
        }
    }
  }
