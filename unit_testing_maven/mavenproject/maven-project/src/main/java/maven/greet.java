package maven;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// import java.time.Month;
import java.util.Arrays;

public class greet
{

    public String says(){
        return "helo";
    } 
    public int sum(int x ,int y){
        return x + y;
    }


    public boolean  iseven(int n){
        return n % 2 ==  0 ;
    }



    public  int[] incrementArray(int[] values){

        int[] newValues= new int[values.length];
        
        for(int i=0 ;i<values.length;i++){

            newValues[i]=values[i]+1;
        }
        return newValues;
    }

    public int  divide(int x,int y){
        if(y==0){
            throw new IllegalArgumentException("divisor couldnt be zero");
        }
        return x / y  ;
    }
   
    public String[] openingday= {"monday","tuesday"};


    public String[] getopeningday(){
        return openingday ;
    }

    public boolean isopen(String weekday){
        if(!weekday.endsWith("day")){
            throw new IllegalArgumentException("weekday should be end with 'day'");
        }
        if (weekday.equals("monday")||weekday.equals("tuesday")){
            return true;
        }
        else{
            return false;
        }
        
    }

    private int haircutprice=30;
    private  calculator calculator=new calculator();


 enum day{
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    sunday
}

    
public day[] openingdays ={day.monday,day.tuesday};


public day[] getopeningdays(){
    return openingdays;

}
public boolean isopen(day weekday){
if(Arrays.asList(openingdays).contains(weekday)){
    return true;
}
else{
    return false;
}
}



    public int gethaircutprice(){
        return haircutprice;
    }

    public int applydiscount(){
        return calculator.divide(haircutprice,2) + 5;   
     }


enum  Month{
JANUARY,
FEBRUARY,
MARCH,
APRIL,
MAY,
JUNE,
JULY,
AUGUST,
SEPTEMBER,
OCTOBER,
NOVEMBER,
DECEMBER

}

public boolean has31day(Month month){
    return Arrays.asList(Month.JANUARY,Month.MARCH,Month.MAY,Month.JULY,Month.AUGUST,Month.OCTOBER,Month.DECEMBER).contains(month);
}


// public static final Collector<datechecker, ?, String> COLLECTOR =Collectors.mapping(Enum::name, Collectors.joining(","));

// @Override
// public String describeConstable() {
// return name();
//   }





}