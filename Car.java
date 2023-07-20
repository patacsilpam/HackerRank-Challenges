package NestedClass;

class Car{
    public String carName;
    public String carType;
    public Car(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }
    class Engine {
        public String engineType;

        //invoke this method to process a specific task
        /*CODE EXPLAIN: If the car name is equal to Mazda
         it will execute the if else statement of checking the carType  if it equals to Mazda,
         then if it is true assign a value to engineType variable */
        public void setEngineType(){

            if (Car.this.carName.equals("Mazda")){
                if (Car.this.carType.equals("4WD")){
                    this.engineType = "Smaller";
                }
                else{
                    this.engineType = "Bigger";
                }
            }
        }

        public String getEngineType(){
            return engineType;
        }
    }
}
