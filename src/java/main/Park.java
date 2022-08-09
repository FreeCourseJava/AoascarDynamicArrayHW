public class Park {
    private String name;
    private int lenght;
    private int widht;

    public Park(String name, int lenght, int widht) {
        this.name = name;
        this.lenght = lenght;
        this.widht = widht;
    }
    public int calcParkSquare (){

        return lenght*widht;
    }


}
