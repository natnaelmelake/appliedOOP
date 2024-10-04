package assignment6.interfaceQuestion;

public class Type2 implements ObjectBehaviour{

    private final String details2;
    private final int attribute; 

    public Type2(String details2,int attribute){
        this.details2=details2;
        this.attribute=attribute;
    }

    

    @Override
    public void performAction() {
    System.out.println("type 2 is analying data.");    
    }

    @Override
    public void haltAction() {
    System.out.println("type 2 stopped analyzing data.");    
    }

    @Override
    public int getAttribute() {
    return this.attribute;   
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();   
    }

    public String getDetails2() {
        return details2;
    }
    
}
