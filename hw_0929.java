import java.util.*;

public class hw_0929 {
    public static void main(String[] args) {
        var month = new HashMap<>();
        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");

        System.out.print("請輸入1~12找出對應的月份: ");
        Scanner input = new Scanner(System.in);
        int keyword = input.nextInt();

        if(keyword < 1 || keyword > 12){
            do{
                System.out.println("此數字不在範圍內，請重新輸入。");
                System.out.print("請輸入1~12找出對應的月份: ");
                Scanner retype = new Scanner(System.in);
                keyword = retype.nextInt();
            }while (keyword < 1 || keyword > 12);
        }
        System.out.printf(keyword + "月的英文單字是" + month.get(keyword));
        input.close();
    }
}