package RGMCode;

public class Main {
    public static void main(String[] args) {

    AnimalService animalService= new AnimalService();
        System.out.println(animalService.listDogs());

        System.out.println("----------------------");

        System.out.println(animalService.listCats());

        System.out.println("----------------------");

        System.out.println(animalService.listMouse());

    }


}