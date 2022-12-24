package Register;

import java.util.Date;

public class FinancialInvoice extends Documents {
    int monthlyTotal;
    int departmentCode;

    public FinancialInvoice(int number, Date dateDoc, int monthlyTotal, int departmentCode) {
        super(number, dateDoc);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
    }
    public void getInfo(){
        System.out.println("Номер документа - "+number+", Дата документа - "+dateDoc+
                ", Итоговая сумма - "+monthlyTotal+", Код департамента - "+departmentCode);
    }
}
