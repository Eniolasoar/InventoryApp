package ng.edu.binghamuni.inventory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name="drink")
public class Drink {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public Drink() {
    }

    @Id
    private Long id;
    private String name;
    private int capacity;
    private String color;
    private String type;
    private int price;
    private String company;
    @OneToMany
    private List<Ingredient> ingredientList;

    public Drink(Long id, String name, int capacity, String color, String type,int price, String company, List<Ingredient> ingredientList) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
        this.price=price;
        this.company = company;
        this.ingredientList = ingredientList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
