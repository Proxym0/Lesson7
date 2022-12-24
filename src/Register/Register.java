package Register;

public class Register extends Documents implements Functional {
   private int[] arrayDocuments=new int[10];
   private int i=0;
    public int[] getArrayDocuments() {
        return arrayDocuments;
    }
    @Override
    public void getInfo(Documents documents) {

        if (i < arrayDocuments.length) {
            arrayDocuments[i] = i;
            i++;
            documents.getInfo();
        }
    }
}
