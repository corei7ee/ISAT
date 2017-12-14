/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KotaSuwazono
 */
package TodoView ;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
 
@ManagedBean
public class todoview {
     
    private List<test> todoList;
     
    public List<test> todoList() {
        return todoList;
    }
     
    @PostConstruct
    public void init() {
        todoList = new ArrayList<>();
         
        todoList.add(new test("The Lord of the Rings: The Two Towers", "Peter Jackson", "Fantasy, Epic", 179));
        todoList.add(new test("The Amazing Spider-Man 2", "Marc Webb", "Action", 142));
        todoList.add(new test("Iron Man 3", "Shane Black", "Action", 109));
        todoList.add(new test("Thor: The Dark World", "Alan Taylor", "Action, Fantasy", 112));
        todoList.add(new test("Avatar", "James Cameron", "Science Fiction", 160));
        todoList.add(new test("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Fantasy, Epic", 165));
        todoList.add(new test("Divergent", "Neil Burger", "Action", 140));
        todoList.add(new test("The Hobbit: The Desolation of Smaug", "Peter Jackson", "Fantasy", 161));
        todoList.add(new test("Rio 2", "Carlos Saldanha", "Comedy", 101));
        todoList.add(new test("Captain America: The Winter Soldier", "Joe Russo", "Action", 136));
        todoList.add(new test("Fast Five", "Justin Lin", "Action", 132));
        todoList.add(new test("The Lord of the Rings: The Return of the King", "Peter Jackson", "Fantasy, Epic", 200));
         
    }

    private static class test {

        public test() {
        }

        private test(String the_Lord_of_the_Rings_The_Two_Towers, String peter_Jackson, String fantasy_Epic, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
   
}