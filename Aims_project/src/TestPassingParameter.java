public class TestPassingParameter {
    public static void main (String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cindrellaDVD = new DigitalVideoDisc("Cindrella");

        swap(jungleDVD, cindrellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cindrella dvd title: " + cindrellaDVD.getTitle());

        changeTitle(jungleDVD, cindrellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());

    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
