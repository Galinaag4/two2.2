package HW2;

public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
     int lifeSpan;

     public Flower(String name,String flowerColor,String country,double cost, int lifeSpan){
         if(flowerColor==null||flowerColor.isEmpty()){
             this.flowerColor = "white";
         }else{
             this.flowerColor = flowerColor;};
         this.name=name;
         if(country==null||country.isEmpty()){
             this.country = "Russia";
         }else{
             this.country = country;};
         this.cost=cost;
         if(lifeSpan<=0){
         this.lifeSpan=3;}
         else{
             this.lifeSpan=lifeSpan;
         }
     }

    @Override
    public String toString() {
        return name + flowerColor+" " + country+" " + cost+" " + lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor==null||flowerColor.isEmpty()){
            this.flowerColor = "white";
        }else{
        this.flowerColor = flowerColor;};
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country==null||country.isEmpty()){
        this.country = "Russia";
    }else{
        this.country = country;};
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost<=0){
            this.cost = 1;
        }else{
            this.cost = cost;};
    }
}
