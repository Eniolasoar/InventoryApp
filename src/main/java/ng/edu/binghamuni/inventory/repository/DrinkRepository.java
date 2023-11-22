package ng.edu.binghamuni.inventory.repository;

import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//CRUD FUNCTIONALITY HANDLED
public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink> findDrinkByPriceGreaterThan(int price);
}
