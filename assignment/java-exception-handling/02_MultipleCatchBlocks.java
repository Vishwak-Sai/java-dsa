class MultipleCatchBlocks {
    public static void main(String[] args) {
        String[] names = { "Ada" };
        try {
            int index = Integer.parseInt("two");
            System.out.println(names[index]);
        } catch (NumberFormatException e) {
            System.out.println("The input was not a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index was invalid.");
        }
    }
}
