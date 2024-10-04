package assignment6.interfaceQuestion;

public class Type3 implements ObjectBehaviour{

    private final String details3;
    private final int attribute; 

    public Type3(String details3,int attribute){
        this.details3=details3;
        this.attribute=attribute;
    }

    @Override
    public void performAction() {
       System.out.println("type is executing data.");
    }

    @Override
    public void haltAction() {
    System.out.println("type 3 has stopped executing data.");   
    }

    @Override
    public int getAttribute() {
        return this.attribute;  
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

    public String getDetails3() {
        return details3;
    }
    
}
