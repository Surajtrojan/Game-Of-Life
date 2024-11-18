public class GridOutput {

    public void nextGeneration(int grid[][], int M, int N) {
        int[][] future = new int[M][N];

        for (int l = 0; l < M; l++) {
            for (int m = 0; m < N; m++) {
                // finding no of Neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        if ((l + i >= 0 && l + i < M) && (m + j >= 0 && m + j < N))
                            aliveNeighbours += grid[l + i][m + j];

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= grid[l][m];

                // implementing the Rules of Life

                // cell is lonely and dies
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                // cell dies due to over population
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                // a new cell is born
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

                // remains the same
                else
                    future[l][m] = grid[l][m];
            }
        }

        System.out.println("Next Generation");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (future[i][j] == 1)
                    System.out.println(i+" "+j);

            }
        }
    }
}
