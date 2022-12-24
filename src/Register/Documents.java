package Register;
import java.util.Date;
public abstract class Documents {
    int number;
    Date dateDoc;

      public Documents(int number, Date dateDoc) {
        this.number = number;
        this.dateDoc = dateDoc;
    }
    public Documents() {
    }
    public void  getInfo(){

    }
}
