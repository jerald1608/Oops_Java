import java.io.*; 
import java.util.*;
interface stackoperation
{
 public void push(int i);
 public void pop();
}
class Astack implements stackoperation
{
int stack[]=new int[5];
int top=-1;
int i;
public void push(int item)
{
if(top>=4)
{
System.out.println("Stack is full");
}
else
{
top=top+1;
stack[top]=item;
System.out.println("Item pushed: "+stack[top]);
}
}
public void pop()
{
if(top<0)
System.out.println("Stack is empty");
else
{
System.out.println("Item popped: "+stack[top]);
top=top-1;
}
}
public void display()
{
if(top<0)
System.out.println("No Element in stack");
else
{
System.out.println("The elements are: ");
for(i=0;i<=top;i++)
System.out.println(stack[i]);
}
}
}
class teststack
{
public static void main(String args[])
{
int ch,c;
int i;
int j=1;
Astack s=new Astack();
Scanner in=new Scanner(System.in);
while(j>0)
{
System.out.println("ARRAY STACK");      
System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
System.out.println("Enter ur choice:");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the value to push:");
i=in.nextInt();
s.push(i);
break;
case 2:
s.pop();
break;
case 3:
s.display();
break;
case 4:
return;
}
}
}
}
