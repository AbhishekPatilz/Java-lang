public class car {

   

    int no = 3992;

    

    void start(){
        System.out.println("Thar is Started");
    }
    void run(){
        System.out.println("Thar is Ruming");
    }
    void stop(){
        System.out.println("Thar is Stop");
    }


     public static void main(String[] args) {

    car c1= new car();

     System.out.println("Car No."+ c1.no);
    c1.run(); c1.stop();
}
}