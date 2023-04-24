public class randomNumbers {
    private static int maxVal = 100;
    private static int a = 17;
    private static int c = 43;
    private static int[] sequence = new int[maxVal];
    private static int seed = 0;
    private static int counter = 0;

    public randomNumbers(){
        for (int s = seed; s < maxVal; s++){
            sequence = generateSequence(s);
        }
    }

    public int  calculateXi(int x){
        return ((x*a) + c) % maxVal;
    }
    public int[] generateSequence(int start){
        int[] result = new int[maxVal];
        System.out.println("Sequence for "+ start);
        result[counter] = calculateXi(start);
        //System.out.println(result[counter]);
       // System.out.print(start + "->");
        while (result[counter] != start){
            result[counter+1] = calculateXi(result[counter]);
            System.out.print(result[counter]+"->");
            //System.out.println(counter);
            counter++;
        }
        System.out.print(start);
        System.out.println("\n");
        counter = 0;
        return new int[]{result[counter]};
    }

}
