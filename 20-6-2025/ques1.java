int a = 0, b = 1, terms = 10;
for (int i = 0; i < terms; i++) {
    System.out.print(a + " ");
    int next = a + b;
    a = b;
    b = next;
}
