package Register;

import java.util.Date;

public class GoodsContract extends  Documents {
    String type;
    int amount;

    public GoodsContract(int number, Date dateDoc, String type, int amount) {
        super(number, dateDoc);
        this.type = type;
        this.amount = amount;
    }

    public GoodsContract() {
    }

    public void getInfo(){
        System.out.println("Номер документа - "+number+", Дата документа - "+dateDoc+
                ", Тип товаров - "+type+", Количество товаров - "+amount);
    }
}
