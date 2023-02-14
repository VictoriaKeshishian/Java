// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
package Less2;

public class Task1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int num = 5;
        System.out.println(createAlteratingString(c1,c2,num));
    }
    private static String createAlteratingString(char c1, char c2, int num){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if(i%2 == 0) {result.append(c1);}
            else {result.append(c2);}
        }
        return result.toString();

    }
}
