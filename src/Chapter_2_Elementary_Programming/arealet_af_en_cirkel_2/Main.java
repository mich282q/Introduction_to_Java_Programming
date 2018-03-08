package Chapter_2_Elementary_Programming.arealet_af_en_cirkel_2;

//r*r*3,14
class Main {

    public static void main(String[] args) {
        //jeg skal løse arealet af en cirkel
        int r =14;
        System.out.println(sumGauss(r));
    }
    public static int sumGauss(int cap){
        return (int) (cap *(cap * 3.14));
    }
}
