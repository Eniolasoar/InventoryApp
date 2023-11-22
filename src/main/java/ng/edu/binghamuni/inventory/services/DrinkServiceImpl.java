package ng.edu.binghamuni.inventory.services;

import ng.edu.binghamuni.inventory.domain.Drink;
import ng.edu.binghamuni.inventory.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DrinkServiceImpl implements DrinkService{
    @Autowired
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        return null;
    }

    @Override
    public List<Drink> getAllDrinks() {
        return null;
    }

    @Override
    public Drink updateDrink(long id) {
        return null;
    }

    @Override
    public Drink deleteDrink(long id) {
        return null;
    }
}
