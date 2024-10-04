package assignment6.interfaceQuestion;

public class Type1 implements ObjectBehaviour{
    private final String details1;
    private final int attribute; 

    public Type1(String details1,int attribute){
        this.details1=details1;
        this.attribute=attribute;
    }

    @Override
    public void performAction() {
        System.out.println("type 1 is processing data.");
    }

    @Override
    public void haltAction() {
     System.out.println("type 1 stopped processing data.");   
    }

    @Override
    public int getAttribute() {
     return this.attribute;   
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }


    public String getDetails1() {
        return details1;
    }
    


    
}
