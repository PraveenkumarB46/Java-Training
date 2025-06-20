// 22. Merge Two Arrays
int[] a2 = {1, 2}, b2 = {3, 4};
int[] merged = new int[a2.length + b2.length];
System.arraycopy(a2, 0, merged, 0, a2.length);
System.arraycopy(b2, 0, merged, a2.length, b2.length);
