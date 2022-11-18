public class Order {
    public static final  int MAX_NUMBERS_ORDERED = 10;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public static DigitalVideoDisc[] removeTheElement(DigitalVideoDisc[] arr, int index) {

        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        DigitalVideoDisc[] anotherArray = new DigitalVideoDisc[arr.length - 1];

        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,
                anotherArray, index,
                arr.length - index - 1);

        return anotherArray;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
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
                    if(this.itemOrdered[i].getTitle() == disc.getTitle()) {
                        System.out.println("Cannot add because this Item has already added!!");
                        isValid = false;
                        break;
                    }
                }
                if (isValid){
                    this.itemOrdered[this.qtyOrdered] = disc;
                    this.qtyOrdered++;
                    System.out.println("This disc has been added");
            }
            }
        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        Boolean isValid = false;
        for (int i = 0; i < qtyOrdered; i++){
            if (this.itemOrdered[i].getTitle() == disc.getTitle()){
                this.itemOrdered = removeTheElement(this.itemOrdered, i);
                this.qtyOrdered--;
                System.out.println("Item removed");
                isValid = true;
                break;
            }
        }

        if (!isValid){
            System.out.println("Cannot removed");
        }
    }

    public float total_cost(){
        float total_cost = 0;
        for (int i = 0; i < qtyOrdered; i++){
            total_cost += this.itemOrdered[i].getCost();
        }
        return total_cost;
    }

}
