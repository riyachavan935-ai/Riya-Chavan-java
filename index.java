// Courier Logistics - Java Short Code
class Courier {
 public static void main(String[] args){
   int distance = 150; int weight = 2;
   int cost = distance*2 + weight*5;
   if(distance < 100) cost -= 20; // Optimization
   System.out.println("Optimized Cost: Rs."+cost);
   System.out.println("Route: Mumbai -> Pune, Shortest: "+distance+"km");
 }
}
