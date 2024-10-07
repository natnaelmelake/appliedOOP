package assignment6.question3;

public class ParentClass {
    private int id;
    private String name;

    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void showDetails(){
        System.out.println("id is : " + this.id);
        System.out.println("name is : " + this.name);
    }    
}
