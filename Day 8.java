public static void levelOrderLinewiseZZ(Node node){
    // write your code here
   Stack<Node> s= new Stack<>();
   Stack<Node> s1= new Stack<>();
   Queue<Node> q= new ArrayDeque<>();
   int count=0;
   s.push(node);
    System.out.println(node.data);
while(!s.empty())
{
    if(count %2==0)
    {
        while(!s.empty())
        {
            node= s.pop();
            for(Node child : node.children)
            {
              s1.push(child); 
              
                
            }
        }
        if(s1.size()>0)
        {
            while(!s1.empty())
            {
                s.push(s1.peek());
                System.out.print(s1.peek().data+" ");
                s1.pop();
            }
            System.out.println();
        }
        
    }
    else{
        while(!s.empty())
        {
            node= s.pop();
            for(Node child : node.children)
            {
                q.add(child);
            }
        }
        if(q.size()>0)
        {
            while(q.size()>0)
            {
                s.push(q.element());
                System.out.print(q.element().data+" ");
                q.remove();
            }
            System.out.println();
        }
    }
    count++;
}
   
    
