public class Principal {
    
    public static void main (String []args){
    
    Animales animal1 = new Animales();
    
    animal1.setagresivo(true);
    animal1.setedad(7);
    animal1.setnombre("Firulais");
    animal1.settipo("Tigre");
    
    System.out.println(animal1.getagresivo());
    System.out.println(animal1.getedad());
    System.out.println(animal1.getnombre());
    System.out.println(animal1.gettipo());
        
    }
}
