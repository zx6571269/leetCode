package zx.untils;

import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DateUntils {

    private  static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    /**
     *  将 str
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static Date parse(String dateStr) throws ParseException {
        return threadLocal.get().parse(dateStr);
    }

    /**
     *  将 Date 转换为 yyyy-MM-dd
     * @param date
     * @return yyyy-MM-dd
     */

    @NotNull
    public static String formatDay(Date date){
        return threadLocal.get().format(date).substring(0,9);
    }

    /**
     *  将 Date 转换为 yyyy-MM-dd HH:mm:ss
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    @NotNull
    public static  String formartSecond(Date date){
        return threadLocal.get().format(date);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i <  100; i++) {
            service.execute(()->{

                try {
                    System.out.println(parse("2018-01-02 09:45:59"));
                    System.out.println(formatDay(new Date()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            });
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
    }

}
