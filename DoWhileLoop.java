public class DoWhileLoop {

    private final String[] list;

    public DoWhileLoop(String[] list) {
        this.list = list;
    }

    public void print() {
        int i = 0;

        do {
            int counter = i + 1;
            System.out.println(counter + ". " + list[i]);
            i++;

        } while (i < list.length);
    }

    public static void main(String[] args) {

        String[] classmates = {
            "Arbie",
            "Brenda",
            "Catherine",
            "Fiona",
            "Judith"
        };

        DoWhileLoop doWhileLoopInstance = new DoWhileLoop(classmates);
        WhileLoop whileLoopInstance = new WhileLoop(classmates);

        System.out.println("\ndoWhileLoopInstance:");
        doWhileLoopInstance.print();

        System.out.println("\nwhileLoopInstance:");
        whileLoopInstance.print();
    }
}
