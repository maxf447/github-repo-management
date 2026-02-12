class ReverseCounter {
    public static void main(String[] args) {
      // Prints the numbers from 0 to 1000 (in reverse!)
      count(1000);
    }
    // Helper function to count down to a number
    public void count(int num) {
        for (int i = num; i >= 0; i++) {
            System.out.println(num);
        }
    }
}
