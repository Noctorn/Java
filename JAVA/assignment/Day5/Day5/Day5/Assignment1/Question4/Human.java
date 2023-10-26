package Day5.Assignment1.Question4;

import java.text.DecimalFormat;
// import java.text.NumberFormat;

public class Human {
    private double height;
    private double weight;
    private double bmi_cal;
    Human(){
        height=0.0f;
        weight=0.0f;
    }
    public Human(double height, double weight) {
        height/=100;
        this.height = height;
        this.weight = weight;
        calculate_bmi();
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double d) {
        d=d/100;
        this.height = d;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getBmi() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber = decimalFormat.format(bmi_cal);        
        return formattedNumber;
    }
    void calculate_bmi(){
        this.bmi_cal=this.weight/(this.height*this.height);
    }
}
