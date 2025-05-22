public class CustomEx
{
public void vote(int age) throws VotingException
{
if(age<18)
{
VotingException e=new VotingException("You Cannot Vote");
throw e;
}
else
{
System.out.println("You can Vote");
}
}
public static void main(String a[])
{
CustomEx cu=new CustomEx();
try
{
cu.vote(12);
}
catch(VotingException e)
{
System.out.println(" Consider this error " +e);
}
}
}