try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e);
} finally {
    System.out.println("Execution Done");
}
