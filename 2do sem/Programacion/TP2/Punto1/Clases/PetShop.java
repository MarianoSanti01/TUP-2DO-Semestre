package Clases;

import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal> Animals;

    public void addAnimal(Animal animal){
        Animals.add(animal);
    }
    public void sellAnimal(String name){
        for(int i = 0; i < Animals.size(); i++){
            Animal a1  = Animals.get(i);
            if (a1.getName() == name){
                System.out.println(a1.getName() + "Fue vendido por: " + a1.getPrice());
            }
        }
    }
    public void alimentarAnimal(String name){
        for(int i = 0; i < Animals.size(); i++){
            Animal a1  = Animals.get(i);
            if (a1.getName() == name){
                a1.feed(name);
            }
        }

    }
    public void listAnimals(){
        for(int i = 0; i < Animals.size(); i++){
            Animal a1  = Animals.get(i);
            a1.toString();
        }
    }
}
