class CatchOrder {
    public static void main(String[] args) {
        try {
            int[] values = new int[1];
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specific catch runs first.");
        } catch (Exception e) {
            System.out.println("General catch runs only for other exceptions.");
        }
        // A general Exception catch must come after its subclasses.
    }
}
