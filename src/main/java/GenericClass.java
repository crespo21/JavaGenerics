public class GenericClass <T> {
    //T stands for "Type"
    public T typeValue;

    //Generic constructor
    private void setTypeValue(T[] typeValue){
        this.typeValue = (T) typeValue;
    }
    public void getTypeValue(){
    }

    //A generic method which can be used to find
    //all occurrences of a type parameters
    //in a list of variables of that type only.
    public void printArrayContent( T[] storage) {
        for (T t : storage) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        try {
        //Array of numbers
        Integer[] numbers = {102,101,21};
        //Array of names
        String[] names = {"chrysler", "theo", "Venus"};

        //Instantiation of a generic class type Integer
        GenericClass<Integer> integerGenericClass = new GenericClass<>();
          integerGenericClass.setTypeValue(numbers);
          integerGenericClass.getTypeValue();
        //Instantiation of a generic class type String
        GenericClass<String> stringGenericClass= new GenericClass<>();
          stringGenericClass.setTypeValue(names);
          stringGenericClass.getTypeValue();

        //Printing the contents of the numbers Array
        integerGenericClass.printArrayContent(numbers);
        //Printing the contents of the names Array
        stringGenericClass.printArrayContent(names);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}