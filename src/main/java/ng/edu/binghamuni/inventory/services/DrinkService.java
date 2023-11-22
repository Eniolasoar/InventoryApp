package ng.edu.binghamuni.inventory.services;

import ng.edu.binghamuni.inventory.domain.Drink;

import java.util.List;

public interface DrinkService {
Drink saveDrink(Drink drink);
Drink getDrinkById(long id);
List<Drink> getAllDrinks();
Drink updateDrink(long id);
Drink deleteDrink(long id);
}
