public class Heart {
    // PROPERTIES
    private String color;
    private String sayings;
    private int size;
    private int calories;
    private int stock;
    private double cost;
    private boolean available;
 
    //Add remaining heart properties here...

    // CONSTRUCTORS
    public Heart() {
        this.color="";
        this.sayings="";
        this.size=1;
        this.calories=0;
        this.stock=0;
        this.cost=0.00;
        this.available=false;
   
    // This is the default contructor
    //Add overloaded Constructor here...

    } 
    public void Hearts(String color, String sayings, int size, int calories, int stock, double cost, boolean available){
    this.color=color;
    this.sayings=sayings;
    this.size=size;
    this.cost=cost;
    this.stock=stock;
    if(this.stock>0){
        this.available=true;
    }
    }

    // ACCESSOR METHODS
    public String getColor() {
        return this.color;
    }
    public String getSayings(){
        return this.sayings;
    }
    public int getSize(){
        return this.size;
    }
    public int getCalories(){
        return this.calories;
    }
    public int getStock(){
        return this.stock;
    }
    public double getCost(){
        return this.cost;
    }
    public boolean getAvailable(){
        return this.available;
    }
    public String getReport(){
        String report="Color: "+ this.color + "\n"+"Sayings: "+ this.sayings + "\n"+"Size: "+ this.size + "\n"+"Calories: "+ this.calories + "\n"+"Stock: "+ this.stock + "\n"+"Cost: "+ this.cost + "\n"+"Available: "+ this.available + "\n"; 
        return report;
    }

    //Add remaining Accessor methods here...

    // MUTATOR METHODS
    public void adjPrice(double percentage){
        this.cost=this.cost+(this.cost*percentage/100);
    }
    public void inStock(int stock){
        this.stock=stock;
        if(this.stock>0){
            this.available=true;

        }
    }
    //Add remaining Mutator methods here...
    // METHODS

}
