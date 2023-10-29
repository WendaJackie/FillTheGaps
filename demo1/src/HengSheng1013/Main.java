package HengSheng1013;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finance_mic,prod_code,trade_date,date_timestamp,preclose_px,open_px,last_px,high_px,low_px,business_count,business_amount,business_balance");
        List<MinuteData> minuteDataList = new ArrayList<>();
        MinuteData currentMinuteData = null;
        while (true) {
//            String parameterNames = sc.nextLine();
//            if(parameterNames.isEmpty()){
//                break;
//            }
//            String data = sc.nextLine();
//            String []paramNames = parameterNames.split(",");
//            String []dataLines = data.split("\n");
            String data = sc.nextLine();
            if (data.isEmpty()) {
                break;
            }
//            String []dataLines = data.split("\n");

            String[] tokens = data.split(",");
            String time = tokens[3];
            double last_px = Double.parseDouble(tokens[6]);
            int business_count = Integer.parseInt(tokens[10]);
            double business_amount = Double.parseDouble(tokens[11]);
            double business_balance = Double.parseDouble(tokens[12]);

            if (isWithTradingHours(time)) {
                if (currentMinuteData == null) {
                    currentMinuteData = new MinuteData();
                    currentMinuteData.open_px = last_px;
                    currentMinuteData.high_px = last_px;
                    currentMinuteData.low_px = last_px;
                    currentMinuteData.business_count = business_count;
                    currentMinuteData.business_amount = business_amount;
                    currentMinuteData.business_balance = business_balance;
                } else {
                    currentMinuteData.close_px = last_px;
                    currentMinuteData.high_px = Math.max(currentMinuteData.high_px, last_px);
                    currentMinuteData.low_px = Math.min(currentMinuteData.low_px, last_px);
                    currentMinuteData.business_count += business_count;
                    currentMinuteData.business_amount += business_amount;
                    currentMinuteData.business_balance += business_balance;
                }
            } else {
                if (currentMinuteData != null) {
                    minuteDataList.add(currentMinuteData);
                    currentMinuteData = null;
                }
            }

        }

//            String token = sc.nextLine();


//        for (String line : lines) {
//            String [] tokens = line.split(",");
//            String time = tokens[3];
//            double last_px = Double.parseDouble(tokens[6]);
//            int business_count = Integer.parseInt(tokens[10]);
//            double business_amount = Double.parseDouble(tokens[11]);
//            double business_balance = Double.parseDouble(tokens[12]);
//
//            if (isWithTradingHours(time)) {
//                if (currentMinuteData == null) {
//                    currentMinuteData = new MinuteData();
//                    currentMinuteData.open_px = last_px;
//                    currentMinuteData.high_px = last_px;
//                    currentMinuteData.low_px = last_px;
//                    currentMinuteData.business_count = business_count;
//                    currentMinuteData.business_amount = business_amount;
//                    currentMinuteData.business_balance = business_balance;
//                } else {
//                    currentMinuteData.close_px = last_px;
//                    currentMinuteData.high_px = Math.max(currentMinuteData.high_px, last_px);
//                    currentMinuteData.low_px = Math.min(currentMinuteData.low_px, last_px);
//                    currentMinuteData.business_count += business_count;
//                    currentMinuteData.business_amount += business_amount;
//                    currentMinuteData.business_balance += business_balance;
//                }
//            } else {
//                if(currentMinuteData != null){
//                    minuteDataList.add(currentMinuteData);
//                    currentMinuteData = null;
//                }
//            }
//        }
        sc.close();
        for (MinuteData minuteData : minuteDataList) {
            System.out.println(minuteData.open_px);
            System.out.println(minuteData.high_px);
            System.out.println(minuteData.low_px);
            System.out.println(minuteData.close_px);
            System.out.println(minuteData.business_count);
            System.out.println(minuteData.business_amount);
            System.out.println(minuteData.business_balance);
        }
    }

    public static boolean isWithTradingHours(String time) {
        int timeStamp = Integer.parseInt(time);
        if ((timeStamp >= 93000000 && timeStamp <= 113000000) ||
                (timeStamp >= 113000000 && timeStamp <= 150000000)) {
            return true;
        } else {
            return false;
        }
    }
}

class MinuteData {
    double open_px;
    double high_px;
    double low_px;
    double close_px;
    int business_count;
    double business_amount;
    double business_balance;
}