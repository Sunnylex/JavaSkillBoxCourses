public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(1234567));
        System.out.println(((int)'k'));
    }

    public static Integer sumDigits(Integer number) {
        //@TODO: write code here
        String str = number.toString();
        int n = number.toString().length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
            //sum += (int)str.charAt(i) - (int)'0';
            //sum += Integer.parseInt(Character.toString(str.charAt(i))); либо так, как лучше не знаю
            //sum += Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        return sum;
    }
}
