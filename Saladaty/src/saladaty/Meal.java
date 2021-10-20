
package saladaty;

public class Meal {
    
    // data field (each meal information):
    private int mealId;
    private String  mealName;
    private double mealPrice;
    private String mealDescreption;

    
    // constructors:
    public Meal(int mealId, String mealName, double mealPrice, String mealDescreption) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealDescreption = mealDescreption;
    }

    public Meal(String mealName, double mealPrice) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
    }

    public Meal() {
    }

    public Meal(int mealId, String mealName, double mealPrice) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
    }

    
    // setters and getters:
    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealDescreption() {
        return mealDescreption;
    }

    public void setMealDescreption(String mealDescreption) {
        this.mealDescreption = mealDescreption;
    }
    
    // special set to set whole data fields:
    public void setMeal(String mealName,double mealPrice,String mealDescreption){
        setMealName(mealName);
        setMealPrice(mealPrice);
        setMealDescreption(mealDescreption);
    }
    
    //to string to return each meal information:
    @Override
    public String toString() {
        return  mealName + "\n   Price:" + mealPrice + " SAR \n   Description: \n     "+mealDescreption;
    }
    
    
    
    
}
