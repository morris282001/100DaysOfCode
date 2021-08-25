public static boolean areSimilar(Node n1, Node n2) {
// write your code here
boolean count = false;
if(n1.children.size() != n2.children.size())
{
return false;
}
else
{
for(int i=0 ;i< n1.children.size();i++)
{
count = areSimilar(n1.children.get(i),n2.children.get(i));
if(count == false)
{
return false;
}
}
}
return true;

}
