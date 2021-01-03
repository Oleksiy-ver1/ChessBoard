public class Chess {
    static byte widthChess;// заданные размеры ширены
    static byte heightChess;//и высоты
    static boolean checkTrue;
    static boolean validation;

    public Chess(int widthChess, int heightChess) {
        //    для минимизации использования памяти будем пользоваться StringBuilder — класс, что представляет изменяемую последовательность символов
        StringBuffer buffer = new StringBuffer();

        buffer.append(" *".repeat(Math.max(0, widthChess / 2)));

        if (buffer.length() < widthChess) {
            buffer.append(" ");
        }

        String fillingNoEven = new String(buffer);//формироване первой строки(нечетной)
        String fillingEven = new String(buffer.insert(0, "*").delete(buffer.length() - 1, buffer.length()));//формироване второй строки(четной)

        for (int i = 1; i < heightChess + 1; i++) {
            if (i % 2 > 0) {
                System.out.println(fillingNoEven);
            } else {
                System.out.println(fillingEven);
            }
        }
    }

    public static boolean checkArg(int widthChess, int heightChess) {
        checkTrue = true;
        if (widthChess < 2 || heightChess < 2) {
            checkTrue = false;
            System.out.println("доска должна иметь ширину и высоту более 2(двух) клеток");
        }
        if (widthChess > 127 || heightChess > 127) {
            checkTrue = false;
            System.out.println("размеры должны быть в приделах 2 - 127");
        }
        if (widthChess != Math.abs(widthChess) || heightChess != Math.abs(heightChess)) {
            checkTrue = false;
            System.out.println("Отрицатльные числа! Очень смешно...");
        }
        return checkTrue;
    }

    public static void main(String[] args) {
        widthChess = 10;
        heightChess = 9;
        if (validation = checkArg(widthChess, heightChess)) {
            Chess bord = new Chess(widthChess, heightChess);
        }

    }

}



