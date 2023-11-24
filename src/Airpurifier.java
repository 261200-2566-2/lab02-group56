import java.util.ArrayList;
public class Airpurifier {
    String model;
    String serialNo;
    Boolean power;
    int aqi;  //ดัชนีคุณภาพอากาศ
    //arraylist for model name
    static ArrayList<String> modelName = new ArrayList<>();
    //arraylist for count
    static ArrayList<Integer> modelCount = new ArrayList<>();
    static String mostPopularModel;


    void turnOn(){
        power = true;
        System.out.println("Status is open");
    }
    void turnOff(){
        power = false;
        System.out.println("Status is close");
    }
    public Airpurifier(String model,String serialNo){
        this.model=model;
        this.serialNo=serialNo;
        this.aqi=aqi;
        int index = modelName.indexOf(model);   //หาindexของmodel ในmodelName(arrlist)
        if(index!=-1){
            modelCount.set(index,modelCount.get(index)+1);  //เปลี่ยนค่า modelcount
        }else{
            modelName.add(model);
            modelCount.add(1);
        }
        //update mostpopular
        if(mostPopularModel==null||
                modelCount.get(modelName.indexOf(model))>modelCount.get(modelName.indexOf(mostPopularModel))){
            mostPopularModel=model;
        }

    }
    public static int getModelCount(String model){
        int index=modelName.indexOf(model);
        return (index!=-1) ? modelCount.get(index) : 0 ;
    }
    public static String mostPopularModel() {
        return mostPopularModel;
    }

    public String getModel(){
        return model;
    }
    public String getSerialNo(){
        return serialNo;
    }
    public void autoOpen(int aqi){
        if(aqi>100){
            System.out.print("Auto Turn on and ");
            turnOn();
        }
    }

}
