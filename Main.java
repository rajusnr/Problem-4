///////////////////////////////////////////////////////////////////
JAVA solution to the given problem statement
///////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String inp=br.readLine();
ArrayList<String> sname=new ArrayList<String>();
ArrayList<Integer> age=new ArrayList<Integer>();
ArrayList<String> branch=new ArrayList<String>();
ArrayList<Integer> year=new ArrayList<Integer<();
ArrayList<Integer> sem=new ArrayList<Integer>();
ArrayList<Double>  prev=new ArrayList<Double>();
int inp1=Integer.parseInt(inp);
int count=0;
HashMap<Integer,String> index=new HashMap<Integer,String>();
HashMap<Double,ArrayList<String> al>  group=new HashMap<Double,ArrayList<String> al>();
if(inp==1)
{
 String[] details=br.readLine().split(" ");
 sname.add(details[0]);
 age.add(Integer.parseInt(details[1]));
 branch.add(details[2]);
 year.add(Integer.parseInt(details[3]));
 sem.add(Integer.parseInt(details[4]));
 prev.add(Double.parseDouble(details[5]));
 index.add(count,details[0]);
}//end of insert logic
if(inp==2)
{
 System.out.println("List Of Students:");
 System.out.println(sname);
}end of display logic
if(inp==3)
{
 for(int i=0;i<prev.size();i++)
   {
      if(!group.containsKey(prev.get(i))) group.put(prev.get(i),sname.get(i));
      else
      {
       group.put(prev.get(i),al.add(sname.get(i))); 
      }
   }
   Map<Entry,group:entrySet> kv;
   Map<Entry,index:entrySet> kv1=index.entrySet();
   for(kv:group.entrySet())
   {
       System.out.println(kv.getKey());
       ArrayList<String> lis=kv.getValue();
       for(int i=0;i<lis.size();i++)
       {
            int v=kv1.getKey(lis.get(i));
            System.out.println(sname.get(v)+" "+age.get(v)+" "+branch.get(v)+" "+year.get(v)+" "+sem.get(v));
       }
   }
}//end of organise logic
}//end of main
}//end of class