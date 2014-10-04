package small;

/*Learning Java */
class TrySum {
public static void main(String args[])
{
int num, i;
num= 200;
System.out.println("This variable num: " + num);
num= num*2;
if(num>=300) System.out.print("Value of variable num*2 ");
System.out.println(num);
System.out.println("Check condition :-) ");
for(i=1; i<=5; i++)
System.out.println("Value of i: " + i);
int x, y;
y = 20;
for (x=0; x<10; x++)
{System.out.println("Value of x " + x);
System.out.println("Value of y " + y);
y=y-2;};

byte day; day=100;
int lightspeed; lightspeed=186000;
long distance;
long seconds;

seconds=day*24*60*60;
distance=lightspeed*seconds;
System.out.println("For "+ day+" days");
System.out.println(" light comes with speed of "+ lightspeed+" km/s");
System.out.println(distance+" kms");
}
}