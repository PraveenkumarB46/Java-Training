BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
writer.write("Hello File");
writer.close();

BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
System.out.println(reader.readLine());
reader.close();
