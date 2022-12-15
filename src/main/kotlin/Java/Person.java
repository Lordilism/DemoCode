package Java;



public class  Person {
    private String name= "VeVe";
    public Person(String name){
        this.name= name;
        // to implement code when instantiation
    }



    public String getName()
    {
        return this.name;
    }

    public void setName(String name) {
        if (!name.equals(""))
        this.name = name;
    }

    public static void getPersonInfo()
    {

    }

}
