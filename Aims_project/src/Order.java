public class Order {
    public static final  int MAX_NUMBERS_ORDERED = 10;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideodisc(DigitalVideoDisc disc){
        Boolean isValid = true;
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This disc is full");
        } else {
            if (this.qtyOrdered == 0) {
                itemOrdered[this.qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("This disc has been added");
            } else {
                for (int i = 0; i< qtyOrdered;i++){
                    if(this.itemOrdered[i].getTitle() == disc.getTitle() {
                        System.out.println("Cannot add because this Item has already added!!");
                        isValid = false;
                        break;
                    }
                }
                if (isValid){
                    this.itemOrdered[this.qtyOrdered] = disc;
                    this.qtyOrdered++;
                    System.out.println("This disc has been add");
            }
            }
        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){

    }

}
