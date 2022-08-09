public class Street {
    String name;
    int lenght;
    int mediumWidht;
    private Park [] parkes;
    Home [] homes;

    public Street(String name, int lenght, int mediumWidht) {
        this.name = name;
        this.lenght = lenght;
        this.mediumWidht = mediumWidht;
        parkes = new Park[2];
    }
    public void addPark(Park park){
        for (int i=0; i< parkes.length; i++){
            if (parkes[i] == null){
                parkes[i] = park;
                return;
            }
        }
        parkes[i+1]
    }
    public void addHome(Home home){
        //////
    }
    public int parkCount(){
        int count=0;
        for (int i=0; i<parkes.length; i++){
            if (parkes [i] != null){
                count += 1;
            }
        }

        return count;
    }
    public int parkSquareCount(){
        int result=0;
        for (int i=0; i<parkes.length; i++){
            Park park= parkes [i];
            if (park !=null) {
                result += park.calcParkSquare();
            }
        }
        return result;
    }
}
