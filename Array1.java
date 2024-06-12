//1.copying array using assignment operator 
class Array1 {
    public static void main (String[] args){
        int [] array1 = { 1,2,3,4,5,6};
        int [] array2 = array1; //coping array
        for (int printCopyArray : array2){
            System.out.print(printCopyArray+" , ");
        }
    }
}
