public class Chess {


    public void buildChessBoard(byte widthChess, byte heightChess) {
        Validation materialToCheck = new Validation();
        if (materialToCheck.validationArgum(widthChess, heightChess)) return;

        StringBuffer buffer = new StringBuffer();//    для минимизации использования памяти будем пользоваться StringBuilder
        // — класс, что представляет изменяемую последовательность символов

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
}