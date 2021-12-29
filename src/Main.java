public class Main {

    public static void main(String[] args) {


        double[] array = {34,55,67,44,200,55,84};
        int n = 0;
        double sum = 0.0;

        for(int i = 0; i < array.length ; i++){

            sum += 1 / array[i];

            n += 1;

        }

        double harmonic = n / sum;

        System.out.println(n);
        System.out.println(sum);
        System.out.println("Harmonik Ortalama :" + harmonic);




    }

}
