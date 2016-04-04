import java.io.Serializable;

public class PlanesData implements Serializable{

    //HEADER-->"YEAR,""QUARTER"",""MONTH"",""DAY_OF_MONTH"",""DAY_OF_WEEK"",""FL_DATE"",""ORIGIN"",""DEST"","
    private String year;
    private int quarter;
    private int month;
    private int dayOfMonth;
    private int dayOfWeek;
    private String flDate;
    private String origin;
    private String dest;

    private PlanesData(String year,int quarter, int month, int dayOfMonth, int dayOfWeek, String flDate,
                       String origin, String dest){
        this.year=year;
        this.quarter=quarter;
        this.month=month;
        this.dayOfMonth=dayOfMonth;
        this.dayOfWeek=dayOfWeek;
        this.flDate=flDate;
        this.origin=origin;
        this.dest=dest;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getFlDate() {
        return flDate;
    }

    public void setFlDate(String flDate) {
        this.flDate = flDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString(){
        return "\nYear=" + getYear() + "::Quarter" + getQuarter() + "::Month=" + getMonth() +
                "::DayOfMonth=" + getDayOfMonth()+"::DayOfWeek"+getDayOfWeek()+"::flDate"+getFlDate()+"::Origin"+
                getOrigin()+"::Dest"+getDest();
    }
}
