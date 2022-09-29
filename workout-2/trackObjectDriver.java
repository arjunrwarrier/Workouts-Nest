/*
7. Create an application program to track and display the number of instances of the class 
created during the program execution.
*/

class trackObject{

static int tracker=0;

trackObject()
{
tracker++;
System.out.println(tracker+" th Object created.");  //will diplay the count of the object at execution time.
}
}



class trackObjectDriver{
public static void main(String[] args){

trackObject ob1= new trackObject();

trackObject ob2= new trackObject();

trackObject ob3= new trackObject();

trackObject ob4= new trackObject();

trackObject obx= new trackObject();

trackObject oby= new trackObject();

}
}





