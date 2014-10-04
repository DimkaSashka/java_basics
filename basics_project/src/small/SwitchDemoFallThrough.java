package small;

class SwitchDemoFallThrough {
public static void main(String [] args){
java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();

int month = 9;

switch(month){
case 1: futureMonths.add("january");
case 2: futureMonths.add("february");
case 3: futureMonths.add("match");
case 4: futureMonths.add("april");
case 5: futureMonths.add("may");
case 6: futureMonths.add("june");
case 7: futureMonths.add("july");
case 8: futureMonths.add("august");
case 9: futureMonths.add("september");
case 10: futureMonths.add("october");
case 11:futureMonths.add("november");
case 12: futureMonths.add("december");
break;
default:break;

}
if(futureMonths.isEmpty())
{System.out.println("Invalid month number");
}
else {
for (String monthName:futureMonths)
{System.out.println(monthName);
}}
}

}