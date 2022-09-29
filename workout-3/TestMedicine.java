/*
2. Create a class Medicine to represent a drug manufactured by a pharmaceutical company. 
Provide a function displayLabel() in this class to print Name and address of the company. 
Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the 
displayLabel() function in each of these classes to print additional information suitable to the 
type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in 
case of ointments it could be “for external use only” etc.
Create a class TestMedicine. Write main function to do the following:
Create three medicine object of the type as decided by a randomly generated integer in the 
range 1 to 3.
*/



import java.lang.Math;

//base class
class Medicine {

public void displayLabel(){
System.out.println("  The   MLI  (MedLabIn) \n\tBangalore");

}
}



//class Tablet inheriting Medicine
class Tablet extends Medicine{

// will @override
public void displayLabel(){

System.out.println("\nTablets should be kept in a cool dry place, not to be placed in direct sunlight.");
//displayLabel() for Tablet class, will @override the Medicine method.

}

}



//class Syrup inheriting Medicine
class Syrup extends Medicine{

//will @override
public void displayLabel(){
System.out.println("\nThis syrup is not for children, should be taken as informed by the physician");
}

}



//class Ointment inheriting Medicine
class Ointment extends Medicine{

public void displayLabel(){
System.out.println("\nOintment is for external use only. Once used, keep the seal tightly closed");
}

}



//main funtion class

class TestMedicine{
public static void main(String[] args){

//created base class object
Medicine m = new Medicine();
m.displayLabel();

//created Tablet object t overriding base class's method
Tablet t = new Tablet();
t.displayLabel();

//created Syrup object s overriding base class's method
Syrup s = new Syrup();
s.displayLabel();

//created Ointment object o overriding base class's method
Ointment o = new Ointment();
o.displayLabel();



//Now generating randomly generated integer based objects for each classes.

System.out.println("\nThe randomly generated object\n");

int random = (int)(Math.random()*(3-1+1)+1);

if(random == 1){
Tablet t1 = new Tablet();
t1.displayLabel();
}else if(random == 2){

Syrup s1 = new Syrup();
s1.displayLabel();


}else if(random == 3){
Ointment o1 = new Ointment();
o1.displayLabel();
}


}
}