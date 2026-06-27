public interface Searchable {

    void search() ;
    default void printSearchMessage() {
        System.out.println("Searching...");
    }
}