public class Super {
    public static void main(String[] args)
    {

    }
}
class Person{
    String name;
    int sapid;
    Person(String name,int sapid)
    {
        this.name = name;
        this.sapid = sapid;
    }
    void  display (){
        System.out.println("name:"+name);
        System.out.println("sapid:"+sapid);
    }
}

class Students extends Person{
    Students(){
        super("Daksh",101);
    }

}
