public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
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
        if(this.qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("This order is full");
        } else {
            if(this.qtyOrdered == 0) {
                this.itemOrdered[this.qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("This disc has been added");
            } else {
                for (int i = 0; i < qtyOrdered;i++){
                    if (this. itemOrdered[i].getTitle() == disc.getTitle()){
                        System.out.println("Cannot add this product because it already added");
                        isValid = false;
                        break;
                    }
                }
                if (isValid == true){
                    this.itemOrdered[this.qtyOrdered] = disc;
                    qtyOrdered++;
                    System.out.println("This disc has been added");
                }
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        Boolean isValid = false;
        for (int i = 0; i < qtyOrdered; i++){
            if (this.itemOrdered[i].getTitle() == disc.getTitle()) {
                this.itemOrdered = removeTheElement(this.itemOrdered, i);
                this.qtyOrdered--;
                System.out.println("This item has been removed");
                isValid = true;
                break;
            }
        }
        if (!isValid){
            System.out.println("This item cannnot be removed");
    }
        }

    public float totalCost(){
        float totalCost = 0;
        for(int i=0;i < qtyOrdered;i++){
            totalCost += this.itemOrdered[i].getCost();
        }
        return totalCost;
    }
}
