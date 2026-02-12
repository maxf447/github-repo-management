class Counter {
    public static void main(String[] args) {
      // Prints the numbers from 0 to 99
      count(99);
    }
    // Helper function to count up to a number
    public void count(int num) {
        for (int i = 0; i < num + 1; i++) {
            System.out.println(num);
        }
    }
}
