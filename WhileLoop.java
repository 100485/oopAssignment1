public class WhileLoop {

    private final String[] list;

    public WhileLoop(String[] list) {
        this.list = list;
    }

    public void print() {
        int i = 0;

        while(i < list.length) {
            int counter = i + 1;
            System.out.println(counter + ". " + list[i]);
            i++;
        }
    }
}
