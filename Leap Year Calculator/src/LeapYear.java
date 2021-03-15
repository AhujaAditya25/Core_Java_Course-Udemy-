public class LeapYear {


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && year % 100 != 0) {
                return true;
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
    public static int getDaysInMonth(int month , int year){
        if (month>=1 && month<13) {
            if (isLeapYear(year)){
                switch (month){
                    case 1 :
                        return 31;
                        break;
                    case 2 :
                        return 29;
                    break;
                    case 3 :
                        return 31;
                    break;
                    case 4 :
                        return 30;
                    break;
                    case 5 :
                        return 31;
                    break;
                    case 6 :
                        return 30;
                    break;
                    case 7 :
                        return 31;
                    break;
                    case 8 :
                        return 31;
                    break;
                    case 9 :
                        return 30;
                    break;
                    case 10 :
                        return 31;
                    break;
                    case 11 :
                        return 30;
                    break;
                    case 12 :
                        return 31;
                    break;
                    default:return -1;

                }
            }
            switch (month){
                case 1 :
                    return 31;
                break;
                case 2 :
                    return 28;
                break;
                case 3 :
                    return 31;
                break;
                case 4 :
                    return 30;
                break;
                case 5 :
                    return 31;
                break;
                case 6 :
                    return 30;
                break;
                case 7 :
                    return 31;
                break;
                case 8 :
                    return 31;
                break;
                case 9 :
                    return 30;
                break;
                case 10 :
                    return 31;
                break;
                case 11 :
                    return 30;
                break;
                case 12 :
                    return 31;
                break;
                default:return -1;

            }
        }
        return -1;
    }
}



//public class LeapYear {
//
//    public static void main(String[] args) {
//
//        int year = 2024;
//        boolean leap = false;
//
//        if(year % 4 == 0)
//        {
//            if( year % 100 == 0)
//            {
//                // year is divisible by 400, hence the year is a leap year
//                if ( year % 400 == 0)
//                    leap = true;
//                else
//                    leap = false;
//            }
//            else
//                leap = true;
//        }
//        else
//            leap = false;
//
//        if(leap)
//            System.out.println(year + " is a leap year.");
//        else
//            System.out.println(year + " is not a leap year.");
//    }
//}