public class Main {
    public static void main(String[] args) {


        Street nazar=new Street("Nazarbayeva", 3000, 12);
        nazar.addPark(new Park("Gandi", 200, 150));
        nazar.addPark(new Park("Gogol", 125, 250));
        nazar.addPark(new Park("Third", 300,50));

        Street toleBi = new Street("Tole Bi", 4000,15);
        toleBi.addPark(new Park("Gorkiy" , 150, 250));
        toleBi.addPark(new Park("Park KBTU", 250, 100));


        int parkCount= nazar.parkCount();
        System.out.println(nazar.name);
        System.out.println(parkCount);
        System.out.println("park");
        int parkSquareCount= nazar.parkSquareCount();
        System.out.println("Their square ");
        System.out.println(parkSquareCount);
        int toleBiParkCount= toleBi.parkCount();
        System.out.println(toleBi.name);
        System.out.println(toleBiParkCount);
        int toleBiSquareCount=toleBi.parkSquareCount();
        System.out.println(toleBiSquareCount);
    }
}
