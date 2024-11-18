public class Main {
    public static void main(String[] args) {

        int M = 5, N = 5;
        // InInput D
        //(Toad pattern - two phase oscillator)
        //        1, 1
        //        1, 2
        //        1, 3
        //        2, 2
        //        2, 3
        //        2, 4

        int[][] inputGrid = {
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0 },
                { 0, 0, 1, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };


        GridOutput gridOutput = new GridOutput();

        gridOutput.nextGeneration(inputGrid, M, N);

    }
}