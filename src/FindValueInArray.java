import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String students[]= {"Viet","Nam","Hieu","Mung","Duyet","Toan"};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh: ");
        String input_name = input.nextLine();
        boolean check =false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Vi tri "+ input_name +" trong danh sach la: "+ (i+1));
                check=true;
                break;
            }
        }
        if(!check)
            System.out.println("Khong tim thay "+ input_name+ " trong danh sach");
    }
}
