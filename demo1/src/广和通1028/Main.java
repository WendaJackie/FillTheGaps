package 广和通1028;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = 0; i < inputString.length(); i++){
//            char ch = inputString.charAt(i);
//            if(Character.isUpperCase(ch)){
//                stringBuilder.append(ch);
//            }
//        }
//        System.out.println(stringBuilder);
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < inputString.length(); i++){
            char ch = inputString.charAt(i);
            if(Character.isUpperCase(ch)){
                arrayList.add(ch);
            }
        }
//        System.out.println(arrayList);
        for(char array:arrayList){
            System.out.print(array);
        }
    }
}
