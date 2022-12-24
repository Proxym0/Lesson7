package Register;

import java.util.Date;

public class ContractWorker extends Documents {
    Date contractEndDate;
    String nameWorker;

    public ContractWorker(int number, Date dateDoc, Date contractEndDate, String nameWorker) {
        super(number, dateDoc);
        this.contractEndDate = contractEndDate;
        this.nameWorker = nameWorker;
    }

    public ContractWorker() {
    }

    public void getInfo(){
        System.out.println("Номер документа - "+number+", Дата документа - "+dateDoc+
                ", Дата окончания контракта - "+contractEndDate+", Имя сотрудника - "+nameWorker);
    }
}
