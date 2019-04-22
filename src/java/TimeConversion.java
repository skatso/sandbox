class TimeConversion {
    static String timeConversion(String s) {
        String[] arr = s.split(":");
        String hour = arr[0];
        String minAndSec = ":"+arr[1]+":"+arr[2].substring(0,2);
        boolean isAM = arr[arr.length - 1].substring(2).equals("AM");
        boolean is12 = hour.equals("12");
        if(isAM && is12)
            hour = "00";
        else if(!isAM && !is12)
            hour = (Integer.valueOf(arr[0])+12)+"";
        return hour+minAndSec;
    }
}
