/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal_1301174027;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERYL
 */
public class TP7_1301174027 {
    public static void main(String[] args) {
        Animal_1301174027 a1 = new Animal_1301174027() {
            @Override
            public void showsName() {
                System.out.println("Bird");
            }

            @Override
            public void move() {
                System.out.println("Flying");
            }
        };
        Animal_1301174027 a2 = new Animal_1301174027() {
            @Override
            public void showsName() {
                System.out.println("Cat");
            }

            @Override
            public void move() {
                System.out.println("Walking");
            }
        };
        Animal_1301174027 a3 = new Animal_1301174027() {
            @Override
            public void showsName() {
                System.out.println("Fish");
            }

            @Override
            public void move() {
                System.out.println("Swiming");
            }
        };
        List<Animal_1301174027> Animal =  new ArrayList<>();
        Animal.add(a1);
        Animal.add(a2);
        Animal.add(a3);
        
        for (int i = 0; i < Animal.size(); i++) {
            Animal.get(i).showsName();
            Animal.get(i).move();
            System.out.println("");
        }
        
    }
}
