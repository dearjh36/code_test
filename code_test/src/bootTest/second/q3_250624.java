package bootTest.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q3_250624 {
    public static void main(String[] args){

        int[] answer = {};

        String[] wallpaper = {".#...", "..#..", "...#."};

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        int minRow = row;
        int maxRow = -1;

        int minCol = col;
        int maxCol = -1;

        for (int i = 0; i<row; i++){
            char[] line = wallpaper[i].toCharArray();
            for (int j = 0; j< col; j++){
                if (line[j] == '#'){
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        answer = new int[]{minRow, minCol, maxRow-1, maxCol-1};

    }
}
