public static void printKNodesFar(Node node, int data, int k) {

path = new ArrayList<>();
find(node,data);
for(int i=0;i {
printKlevelsDown(path.get(i),k-i,i==0?null : path.get(i-1));
}
}
    
    
static ArrayList path;
public static boolean find(Node node,int data)
{
if(node == null)
{
return false;
}

if(node.data == data)
{
path.add(node);
return true;
}
boolean fl = find(node.left,data);
if(fl)
{
path.add(node);
return true;
}
boolean fr = find(node.right,data);
if(fr)
{
path.add(node);
return true;
}
return false;
}
    
    

public static void printKlevelsDown(Node node, int k, Node blocker)
{
if(node == null || k<0 || node == blocker)
{
return;
}
if(k == 0)
{
System.out.println(node.data);
}
printKlevelsDown(node.left, k-1, blocker);
printKlevelsDown(node.right, k-1, blocker);
}
