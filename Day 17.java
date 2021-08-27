public static boolean IsSymmetric(Node node) {

int j= node.children.size()-1;
int i=0;
boolean count;

while(j>i)
{
for(i=0; i {
count = isMirror(node.children.get(i),node.children.get(j));
if(count == false)
{
return false;
}
j--;
}
}
return true;


}
private static boolean isMirror(Node n1, Node n2)
{
boolean count = false;
if(n1.children.size() != n2.children.size())
{
return false;
}
else{


for(int i=0; i< n1.children.size();i++)
{
count = isMirror(n1.children.get(i),n2.children.get( n2.children.size()-1-i));
if(count == false)
{
return false;
}


}
}

return true;

}
