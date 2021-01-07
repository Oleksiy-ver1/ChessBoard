public class Validation {
    public boolean validationArgum(int widthChess, int heightChess) {
        if (widthChess < 2 || heightChess < 2) {
            System.out.println("доска должна иметь ширину и высоту более 2(двух) клеток");
            if (widthChess != Math.abs(widthChess) || heightChess != Math.abs(heightChess)) {
                System.out.println("Отрицатльные числа! Очень смешно...");
            }
            return true;
        }
        if (widthChess > 100 || heightChess > 100) {
            System.out.println("размеры должны быть в приделах 2 - 100");
            return true;
        }
        return false;
    }

}
