public static boolean find(Node node, int data)
{

if(node == null)
{
return false;
}
else if(node.data == data)
{
return true;
}
boolean c1 = find(node.left,data);
boolean c2 = find(node.right,data);
if(c1 == true)
{
return true;
}
else{
return c2;
}

}

public static ArrayList nodeToRootPath(Node node, int data){

if(node == null)
{
return new ArrayList<>();
}
else if(node.data == data)
{
ArrayList array = new ArrayList<>();
array.add(node.data);
return array;
}
ArrayList a1 = new ArrayList<>();
ArrayList a2 = new ArrayList<>();

a1 = nodeToRootPath(node.left,data);
a2 = nodeToRootPath(node.right,data);

if( a1.size() > 0)
{
a1.add(node.data);
return a1;
}
else if(a2.size()>0)
{
a2.add(node.data);
return a2;
}
return new ArrayList<>();


}
