public static boolean areMirror(Node n1, Node n2) {

boolean count = false;
if(n1.children.size() != n2.children.size())
{
return false;
}
else{


for(int i=0; i< n1.children.size();i++)
{
count = areMirror(n1.children.get(i),n2.children.get( n2.children.size()-1-i));
if(count == false)
{
return false;
}


}
}

return true;
}
