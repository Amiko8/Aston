public static void main(String[] args) {
    //ByteArrayInputStream bais = new ByteArrayInputStream("1 2 3 4 5 6 7 8 9 10".getBytes());
    //System.setIn(bais); - для тестов в идее
    ArrayDeque<Integer> numbers = new ArrayDeque<>();
    Scanner reader = new Scanner(System.in);
    String[] strArr = reader.nextLine().split(" ");
    int[] numArr = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
        numArr[i] = Integer.parseInt(strArr[i]);
        if ((i%2)!=0) numbers.addFirst(numArr[i]);
    }

    for (Integer t : numbers) {
               System.out.print(t + " ");
    } {
        if ((i % 2) == 0) {
            numbers.pop();
        } else {
            System.out.print(numbers.pop() + " ");
        }
    }
}