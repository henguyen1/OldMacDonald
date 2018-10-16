class Chick implements Animal 
{     
    private String myType;     
    private String mySound; 
    private String myOtherSound;     
    public Chick(String type, String sound,String othersound)   
    {         
        myType = type;         
        mySound = sound;     
        myOtherSound = othersound;
        
    }     

    public Chick()    
    {
        myType = "unknown"; 
        mySound = "unknown";
    }
             
    public String getSound()
    {
       if (Math.random() > .5)
       {
            return mySound;
       }
       else 
       {
            return myOtherSound;
       }
    }     
    public String getType()
    {
        return myType;
    } 
}