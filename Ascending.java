import java.util.Scanner;
class Ascending{
    int n =10;
    int a[] = new int[n];
    Scanner s = new Scanner(System.in);
 
void enter_Arr()
{ 
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++)
    {
    a[i] = s.nextInt();
    }
}

void sortascen()
{
for(int i=0;i<n-1;i++)
{ 
    for(int j=0;j<n-i-1;j++)
    {
        if(a[j]>a[j+1]){
            int t = a[j];
            a[j] = a[j+1];
            a[j+1] = t;
        }
    }
}
}

void displayascen()
{
    System.out.println("sorted array ascending : ");
    for(int i=0;i<n;i++)
        System.out.println(a[i] + "");
}

void sortdescn()
{
for(int i=0;i<n-1;i++)
{ 
    for(int j=0;j<n-i-1;j++)
    {
        if(a[j]<a[j+1]){
            int t = a[j];
            a[j] = a[j+1];
            a[j+1] = t;
        }
    }
}
}

void displaydescn()
{
    System.out.println("sorted array descending : ");
    for(int i=0;i<n;i++)
        System.out.println(a[i] + "");
}

public static void main(String args[])
{
 Ascending asc = new Ascending();
asc.enter_Arr();
asc.sortascen();
asc.displayascen();
asc.sortdescn();
asc.displaydescn();
}
}