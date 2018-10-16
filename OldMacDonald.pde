
public void setup() 
{     
    Cow c = new Cow("Cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick otherC = new Chick("Chick","cluck","cheep"); 
    System.out.println(otherC.getType() + " goes " + otherC.getSound());  
    Pig p = new Pig("Pig", "oink");
    System.out.println(p.getType() + " goes " + p.getSound());
}