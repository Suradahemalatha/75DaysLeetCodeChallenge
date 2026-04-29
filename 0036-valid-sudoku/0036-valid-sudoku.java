class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num == '.') continue;

                int val = num - '1'; // map '1'-'9' → 0-8
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][val] || cols[j][val] || boxes[boxIndex][val]) {
                    return false;
                }

                rows[i][val] = true;
                cols[j][val] = true;
                boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}