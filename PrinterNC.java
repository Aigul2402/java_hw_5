public class PrinterNC {
    public static void main(String[] args) {
        NamesCounter namesCfCounter = new NamesCounter();
        namesCfCounter.addName("Anna");
        namesCfCounter.addName("Anna");
        namesCfCounter.addName("Katy");
        namesCfCounter.addName("Oleg");
        namesCfCounter.addName("Ivan");
        namesCfCounter.addName("Ivan");
        System.out.println(namesCfCounter.getNamesCounter());
        
    }

}
