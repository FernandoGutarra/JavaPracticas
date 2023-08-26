package Final_practica;
public class Matriz {
    public static void main(String[] args) {
        char[][] matrix = {{'1', 'A', '3'},
                           {'B', 'C', 'D'},
                           {'4', '5', '6'}};
        int row = 0, col = 0;
        char element = matrix[row][col];

        if ((element >= 'A' && element <= 'Z')) {
            System.out.println("La posición [" + row + "][" + col + "] contiene un letra: " + element);
        } else{
            System.out.println("La posición [" + row + "][" + col + "] contiene una numero: " + element);
        }
    }
}

