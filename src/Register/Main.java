package Register;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Documents documents1 = new FinancialInvoice(11,
                new Date(87,11,13),48,33);
        Documents documents2 = new ContractWorker(14,new Date(96,10,10),
                new Date(122,9,10),"Roma");
        Documents documents3 = new GoodsContract(10,new Date(99,10,10),"Car",20);
        Register register=new Register();
        register.getInfo(documents1);
        register.getInfo(documents2);
        register.getInfo(documents3);

        System.out.println(Arrays.toString(register.getArrayDocuments()));
    }
}
